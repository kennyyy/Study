import { useState } from "react"

function EventComponentQ(){
  
  const [select, setSelect] = useState("");

  let handleChange = (e) => {
    setSelect(e.target.value);
    console.log(e.target);
  }
 

  return (
    <>
      <div>
        <h1>셀렉트 태그 핸들링(실습)</h1>
        <p>셀렉트 태그가 체인지 될 때 선택한 결과를 아래에 출력</p>
        <select onChange={handleChange} value={select}>
          <option>피자</option>
          <option>치킨</option>
          <option>햄버거</option>
        </select>

        <h1>선택한 결과</h1>
        <h4>{select}</h4>
        <h4>메뉴를 선택하세요.</h4>

      </div>
    </>
  )
}

export default EventComponentQ