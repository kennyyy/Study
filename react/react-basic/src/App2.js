import { Fragment } from "react"
import MyCompnent from "./component/MyCompnent";
import MyCompnent2 from "./component/MyComponent2";
import MyCompnent3 from "./component/MyCompnent3";
import StateComponent from "./component/StateComponent";
import StateComponentQ from "./component/StateComponentQ";

function App2() {

  let name = "홍길동";
  let phone = "010-1234-5678";

  return (
    <Fragment>
      <h3>나의 첫번째 컴포넌트</h3>

      {/* <div>
        자식 컴포넌트<br />
        변수값: {name} <br />
        변수값: {phone} <br />
      </div> */}

      {/* props 키 = { 값 } */}
      <MyCompnent name = "홍길동" phone = {"010-1234-1234"} age={10} />
      <br />
      <MyCompnent name = "이순신" phone = {"010-5678-5678"} age={20}/>
      <br />
      <MyCompnent name = "네임만 줄거다" />
      <br />
      <MyCompnent2 />
      <br />
      <MyCompnent3 age ={10}/>

      <hr />

      <StateComponent />

      <hr />
      <StateComponentQ />





    </Fragment>
  )
}

export default App2