//import logo from './logo.svg';
//import './App.css';

import { Fragment } from "react";

//app함수형 컴포넌트
//app함수형 컴포넌트 return에 담기는 구문을 jsx라고 부릅니다.
//jsx는 자바스크립트에 html를 녹이는 형태
function App1() {

  let name = "홍길동";
  let age = 20;

  return (  
    //<>
    <Fragment>
      <div>
        <h3>제목입니다~</h3>
        {age >= 20 ? "20세 이상합니다" : "20세 미만입니다."}
        {age >= 20 ? <h3>20세 이상합니다</h3> : <b>20세 미만입니다.</b>}
        {name === "이순신" ? name + "님 환영합니다." : null}
        <br />
        <input type="text" />
        <img src="" alt="" />

      

      </div>
      <div className="App">
        <ul style={{backgroundColor : "green", color : "red"}}>
          <li>1. 주석은 alt + shift + a 입니다. {/* 주석 */}</li>
          <li>2. JSX는 반드시 하나의 태그를 return해야합니다.</li>
          <li>3. DIV를 쓰기 싫은 경우는 Frament or <></> 를 쓰면됩니다.</li>
          <li>4. 함수안에서 만들어진 변수는 <h1>{name}</h1>으로 ! 참조할 수 있습니다</li>
          <li>5. if문 대신에 삼항연산자를 사용합니다.</li>
          <li>6. 삼항연산자에서 화면에 보여주고 싶은게 없다면 null을 사용하면 됩니다.</li>
          <li>7. 어떤 경우 에서든 undefind가 반환되면 안됩니다.</li>
          <li>8. class속성 대신 반드시 className속성을 사용해야 합니다.</li>
          <li>9. 홀로 사용하는 태그는 닫는 태그를 반드시 작성해야합니다{/* <input/> <img/> */}</li>
          <li>10. DOM에 직접 스타일링하려면 객체로 묶고 카멜표기법을 사용합니다.</li>
        </ul>
      </div>
    </Fragment>
    /* </> */
  );
}

export default App1;
