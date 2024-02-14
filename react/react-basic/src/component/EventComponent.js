import { useState } from "react"

function EventComponent(){

  const [topic, setTopic] = useState('');
  const [name, setName] = useState('');

  let handleTopic = (e) => { //이벤트 함수 첫번째 매개변수는 event 객체
    console.log(e.target);
    console.log(e.target.value);
    setTopic(e.target.value);
  }

  let handleName = (e) => setName(e.target.value);

  let handleChange = () => {
    alert(`${name} 님의 할일 ${topic}`);
    setTopic("");
    setName("");  
  }


  let handlePress = (e) => {
    if(e.key == "Enter"){ //사용자가 엔터를 눌렀음
      handleChange();
    }
  }

  return (
    <>
      <div>

        <h3>인풋태그 핸들링</h3>
        <input type="text" onChange={handleTopic} value={topic} placeholder="할일"/> 
        <input type="text" onChange={handleName} onKeyUp={handlePress} value={name} placeholder="이름"/>
        <br />
        <button type="button" onClick={handleChange}>클릭!</button>
        인풋의 결과 : {topic}
      </div>

    </>
  )
}

export default EventComponent