import { useContext, useRef } from "react";
import UserContext, { UserConsumer } from "../contextAPI/ContextAPI2";

function A() {
  let idRef = useRef(null);
  let nameRef = useRef(null);
  //useContext(createContext객체)
  //provider로 전달되는 context 초기값을 변한
  const {state, action} = useContext(UserContext)

  const handleClick = () =>{
    //idRef.current.value 인풋값
    action.setData({
      id : idRef.current.value,
      name : nameRef.current.value
    });
    idRef.current.value = "";
    nameRef.current.value = "";
  }
  return (
    // 전통적인 사용방법
    // <UserConsumer>
    //   {
    //     (value) => {
    //       return (
    //         <div>
    //           <h3>A컴포넌트</h3>
    //           외부에서 스테이트로 관리되는 값 :{value.state.id} <br />
    //           외부에서 스테이트로 관리되는 값 :{value.state.name} <br />
              
    //           <button onClick={() => value.action.setData({id : '변경!', name : '변경!!!'}) }>값 변경하기</button>
    //         </div>
    //       )
    //     }
    //   }

    // </UserConsumer>


    //useContext훅을 사용한 방법
    <div>
      <h3>A컴포넌트</h3>
      <input type="text" ref={idRef}/>
      <input type="text" ref={nameRef}/>
      <button onClick={handleClick}>값 변경하기</button> <br />
      현재 외부에서 관리되는 state값 : {state.id} <br />
      현재 외부에서 관리되는 state값 : {state.name} <br />
    </div>
  )
}

export default A;