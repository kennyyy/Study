import { Link } from "react-router-dom";

function Home(){
  return(
    <div>
      <h3>홈...</h3>
      <ul>
        <li><Link to="/user">유저페이지 이동(to = "라우터경로")</Link></li>

        <li><Link to="/user?name=홍길동&age=20">유저페이지 이동(쿼리스트링)</Link></li>

        <li><Link to="/info/1/홍">인포페이지 이동</Link></li>
        <li><Link to="/info/2/길">인포페이지 이동</Link></li>
        <li><Link to="/info/3/동">인포페이지 이동</Link></li>

        <li><Link to="/board">board페이지 이동</Link></li>
        <li><Link to="/mypage">mypage로 이동</Link></li>
      </ul>
    </div>
  )
}

export default Home;