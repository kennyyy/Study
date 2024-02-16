import { Fragment } from "react";
import { Link, Outlet, useNavigate } from "react-router-dom";

function Header(){
  //navigate훅 => history객체를 대신함
  const nav = useNavigate();
  console.log(nav);

  const goHome = () =>{
    nav('/')
    
  }
  const goBack = () =>{
    nav(-1)
  }

  //이 헤더가 주소는 변함 없이, info, user, home의 공통 레아웃으로 들어가도록 설정햇
  return(
    <Fragment>
      <header style={{marginBottom : "60px"}}>

        <p>제목</p>
        <ul>
          <li><Link to={"/"}>Home</Link></li>
          <li><Link to={"user"}>User</Link></li>
          <li><Link to={"info/1/홍길동"}>Info</Link></li>
        </ul>
        <div>
          <button onClick={goHome}>버튼1(홈으로)</button>
          <button onClick={goBack}>버튼2(뒤로가기)</button>
        </div>
      </header>

      <Outlet/>
    </Fragment>
  )
}



export default Header;