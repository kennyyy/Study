import { useState } from "react";

function IterationComponentQ2() {
  //1. select 태그안에 들어가는 option을 반복으로 그립니다.
  const selelct = ['HTML', 'Javascript', 'Java', 'Oracle', 'CSS', 'Mysql']

  //2. 데이터도 반복으로 그립니다. (state)
  const data = [
    { id: 1, type: 'Java', teacher: '이순신' },
    { id: 2, type: 'Java', teacher: '홍길자' },
    { id: 3, type: 'Javascript', teacher: '홍길동' },
    { id: 4, type: 'Oracle', teacher: '이순신' },
    { id: 5, type: 'Mysql', teacher: '이순신' },
    { id: 6, type: 'CSS', teacher: '박찬호' },
    { id: 7, type: 'HTML', teacher: 'coding404' },
  ];
  //3. select태그에서 체인지가 일어나면 state에서 필터링을 하면됩니다.


  //4. 검색기능 - 인풋태그 값을 가지고 state에서 필터링

  let [tagData, setTagData] = useState(data);
  let [input, setInput] = useState("");


  let handleChange = (e) => {
    let selectType = data.filter((v) => {
      return e.target.value === v.type;
    })
    setTagData(selectType);
  }


  let searchData = (e) => {
    let searchObj = data.filter((v) => {
      return v.type.toUpperCase() === input.toUpperCase() || v.teacher.toUpperCase() === input.toUpperCase()
    })
    setTagData(searchObj);
  }


  return (
    <>
      <input type="text" onChange={ e => setInput(e.target.value) } value={input} />
      <button type="button" onClick={searchData}>검색</button><br />
      <select onChange={handleChange}>
        {selelct.map((v) => {
          return (
            <option>{v}</option>
          )
        })}
      </select>

      {tagData.map((v) => {
        return <p>{v.type} - {v.teacher}</p>
      })}
    </>
  )
}

export default IterationComponentQ2