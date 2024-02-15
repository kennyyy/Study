import { useState } from "react";

function IterationComponent2(){

  const data = [
    {id : 1, topic : "hello"},
    {id : 2, topic : "bye"},
    {id : 3, topic : "안녕!"},
  ]

  const [list, setList] = useState(data); //할일목록
  const [topic, setTopic] = useState(""); //인풋데이터
  //state를 반복으로 돌려서 li로 출력
  let lis =list.map( v => <li key={v.id} onDoubleClick={() => handleRemove(v.id)}>{v.topic}</li> )




  //삭제기능 - 이벤트보다 아래에 함수를 작성하고싶으면 익명함수는 안됨, 그냥 함수선언하면됨
  function handleRemove(id){
    //filter -> 리턴 true인 값으로 필터링
    let newList = list.filter((v,i)=>{
      return v.id !== id
    })
    //console.log(newList);
    setList(newList);

  }

  const handleInput = (e) =>{
    setTopic(e.target.value);
  } 

  const handleClick = (e) =>{
    if(list.length == 0){
      let obj = { id : 1, topic : topic}
      setList(list.concat(obj));
      setTopic("");
      return;
    }
    let obj = { id : list[list.length-1].id + 1, topic : topic}
    //console.log(obj);
    let newList = list.concat(obj);
    setList(newList)
    setTopic("");
  }


  return(
    <div>
      <h3>할일목록 추가 or 삭제하기</h3>

      <input type="text" name="topic" onChange={handleInput} value={topic} placeholder="할일목록을 적으세요" />
      <button type="button" onClick={handleClick}>추가하기</button>

      <ul>
        {lis}
      </ul>
    </div>
  );
}

export default IterationComponent2