import { useRef } from "react";

function HookRef(){
  //특정태그에 이름달기 -> 제어할 태그에 ref속성에 넣어주면 됩니다.
  let inputRef = useRef(null);

  let handleClick = () =>{
    //요기서는 input의 value값을 얻어야할것같아

    console.log(inputRef.current.value);
    console.log(inputRef.current.type);
    inputRef.current.value = "";
    inputRef.current.focus();
  }

  return (
    <div>
      
      할일 : <input type="text" ref={inputRef}/>
      <button type="button" onClick={handleClick}>useRef사용하기</button>
      
      
    </div>
  )
}

export default HookRef;