import IterationComponentQ2 from "./component/IterationComponentQ2";
import HookEffect from "./hook/HookEffect";
import HookRef from "./hook/HookRef";
import './css/App.css';
import myStyle from "./css/App.module.css";

function App(){

  return(
    <div>
      

      <IterationComponentQ2/>
      <hr />
      <HookEffect/>

      <hr />
      <HookRef/>
      <hr />
      <h3 className="myApp">css 파일로 디자인하기</h3>
      <h3 style={{backgroundColor : 'green'}}>style태그에 디자인하기</h3>
      <h3 className={myStyle.app_wrap}>module.css파일로 디자인하기
        <span className={myStyle.app_item}>나는스펜</span>
      </h3>
      <h3 className="title">moudule.css global 키워드 써보기</h3>
      <h3 className="public_style">public폴더에 css만들어 기본디자인하기</h3>
    
    
    
    </div>
  )
}

export default App;