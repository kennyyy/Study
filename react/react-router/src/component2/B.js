import { useContext } from "react";
import UserContext from "../contextAPI/ContextAPI2";
import C from "./C";

function B() {
  const {state, action} = useContext(UserContext);
  return (

    <div>
      <h3>B컴포넌트</h3>
      B컴포넌트에서 바꾼값 : {state.id} <br />
      B컴포넌트에서 바꾼값 : {state.name} <br />
      <C/>
    </div>
  )
}

export default B;