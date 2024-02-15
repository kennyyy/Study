import { useEffect, useState } from "react"


function HookEffect(){

  let [name, setName] = useState("");
  let [age, setAge] = useState(0);

  console.log(1);

  //userEffect(실행시킬콜백, 배열?) - 클래스형컴포넌트의 compoentDidMount() 대체함
  //렌더링 이후에 실행됨
  // useEffect(()=> {
  //   console.log(`렌더링 이후에 실행됨 ${name}`);
  // })

  //useEffect(실행시킬콜백, [])
  //첫번째 렌더링에만 실행됨
  // useEffect(() => {
  //   console.log("첫번째 렌더링에만 실행됨");
  // }, [])

  //useEffect(실행시킬콜백, [스테이트값])
  //특정값 [값]이 업데이트 될때마다 실행됨 - 클래스형컴포넌트의 componentDidUpdate() 대체함
  // useEffect(() => {
    
  //   console.log("특정값이 업데이트 될때마다 실행됨");

  //   //userEffect안에서 객체타입 state를 setState하는 경우 무한루프에 빠질 수 있습니다. 주의

  // }, [name])


  //useEffect(실행시킬콜백 (return을 주는경우) )
  useEffect(()=>{
    console.log("mount이후에 실행됩니다.");
    
    return ()=>{
      console.log("unmount될 때 실행됩니다.");
    }
  },[age])


  //추가 - useEffect 여러개 만들수도 있습니다.
  useEffect(() => {
    console.log("두번째 effect함수 실행됨");
  })



  console.log(2);
  return(
    <div>
      이름 : <input type="text" name="name" onChange={(e)=> setName(e.target.value)} value={name}/> <br />
      나이 : <input type="text" name="name"onChange={(e)=> setAge(e.target.value)} value={age}/> <br />
      이름 : {name}, 나이 : {age}
    </div>
  )
}

export default HookEffect