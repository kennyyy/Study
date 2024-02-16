import { Fragment } from "react";
import { Route, Routes } from "react-router-dom";
import Home from "./component/Home";
import User from "./component/User";
import Info from "./component/Info";
import Board from "./component/Board";
import BoardContent from "./component/BoardContent";
import Header from "./header/Header";
import MyPage from "./component/Mypage";

function App() {
  return (
    <Fragment>
      <div>
        {/* 2. routes 컴포넌트 */}
        <Routes>
          {/* <Route path="/" element={<Home />} /> */}
          {/* 쿼리스트링 방식 - 별도의 설정이 필요 x */}
          {/* <Route path="/user" element={<User />} /> */}
          {/* URL파라미터 방식 */}
          {/* <Route path="/info/:a/:b" element={<Info />} /> */}


          {/* 이 헤더가 주소는 변함 없이, info, user, home의 공통 레아웃으로 들어가도록 설정햇 */}
          <Route element={<Header/>} >
            <Route path="/" element= {<Home/>} />
            <Route path="user" element={<User />} />
            <Route path="info/:a/:b" element={<Info />} />
          </Route>

          {/* //////////////////////////////////////////////////// */}

          {/* 각각 페이지별로 다른 화면이 보입니다. */}
          {/* <Route path="/board" element={<Board/>} />
          <Route path="/board/:num" element={<BoardContent/>} /> 
          */}

          {/* 중첩라우터 - 상위 컴포넌트에 Outlet을 사용해서 자식컴포넌트를 그립니다. */}
          <Route path="/board" element={<Board />}>
            <Route path=":num" element={<BoardContent />} />
          </Route>



          {/* navigate컴포넌트 - 권한처리 */}
          <Route path="/mypage" element={<MyPage/> }/>




        </Routes>
      </div>
    </Fragment>
  );
}

export default App;
