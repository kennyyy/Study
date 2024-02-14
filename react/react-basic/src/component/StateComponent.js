import { useState } from "react";

function StateComponent() {
  //함수형 컴포넌트에서 userState() 훅을 사용합니다
  // const arr = useState("초기값")
  // console.log(arr);
  // let data = arr[0]; //data
  // let setData = arr[1]; //function

  let [data, setData] = useState("초기값");
  let [color, setColor] = useState("red");


  console.log(1111111111111);
  let change = function () {
    setData("뭐야잇!");
   //console.log(data); // setData함수는 비동기적인 실행
  }


  // let unChange = () => {
  //   setData("뿡");
  // }
  let unChange = () => setData("뿡");

 

  return (
    <div>
      <h3 style={{color : color}}>스테이트 사용하기</h3>

      <button type="button" onClick={change}>버튼</button>
      <button type="button" onClick={() => setData("뿡")}>뿡</button>


      <button type="button" onClick={() => setColor("blue")}>푸른색</button>

      {data}
    </div>
  )
}


export default StateComponent;