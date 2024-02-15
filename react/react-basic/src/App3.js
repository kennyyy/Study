import EventComponent from "./component/EventComponent";
import EventComponent2 from "./component/EventComponent2";
import EventComponentQ from "./component/EventComponentQ";
import EventComponentQ2 from "./component/EventComponentQ2";

function App3(){
  return (
    <div>
      <h3>이벤트 활용하기</h3>

      <EventComponent />
      <hr />
      <EventComponentQ />
      
      <hr />
      <EventComponent2 />

      <hr />
      <EventComponentQ2 />
    </div>
  )
}

export default App3;