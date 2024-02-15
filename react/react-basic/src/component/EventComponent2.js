import { useState } from "react"

function EventComponent2(){
  //스테이트를 객체로 관리하기
  let[data, setData] = useState({name : "", topic : ""})


  let handleInput = (e) => {
    //e.target.value - 현재 사용자가 입력한 값
    let value = {...data, [e.target.name] : e.target.value }; //기존값은 복사, 특정 키만 바꾸는 문법
    setData(value);
    console.log(value);
  }


  return (
    <>
      <div>

        <h3>인풋태그 핸들링</h3>
        <input type="text" onChange={handleInput} value={data.topic} name="topic" placeholder="할일"/> 
        <input type="text" onChange={handleInput} value={data.name} name="name" placeholder="이름"/>
        <br />
        <button type="button" onClick={() => setData({name : "", topic : ""})} >클릭!</button>
        할일 : {data.topic} 이름 : {data.name}
      </div>

    </>
  )
}

export default EventComponent2