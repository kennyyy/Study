import { Fragment, useState } from "react"

function StateComponentQ(){
  let [count, setCount] = useState(0);

  

  return(
    <Fragment>
      <h1>실습</h1>
      <h1>카운트 : {count}</h1>
    {/* setState의 매개변수에 콜백함수를 넣어주면, 
    콜백의 첫번째 매개변수에, 이전 state값을 받을 수 있습니다. */}
      {/* <button type="button" onClick={() => setCount(++count)}>증가</button> */}
      <button type="button" onClick={() => setCount( (prev) => prev + 1 )}>증가</button>
      <button type="button" onClick={() => setCount(count--)}>감소</button>
      <button type="button" onClick={() => setCount(0)}>초기화</button>
    </Fragment>
  )
}

export default StateComponentQ