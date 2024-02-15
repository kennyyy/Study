import { useState } from "react"

function EventComponentQ2(){

  let [form, setForm] = useState({data : "", output : ""});
 

  let handleInput = (e) => {
    setForm({...form, data : e.target.value});
  }


  return (
    <>
      <div>
        <h1>인풋데이터 핸들링(실습)</h1>
        <p>클릭시 데이터는 공백으로 결과는 인풋이 입력한 값으로 처리</p>
        <input type="text" onChange={handleInput} value={form.data}/> 
        <button type="button" onClick={()=>{
          setForm({data : '', output : form.data });
        }}>추가하기</button>

        <h1>결과</h1>
        <p>{form.output}</p>
        
      </div>

    </>
  )
}

export default EventComponentQ2