import ColorContext from "../contextAPI/ContextAPI";


function ColorComponent() {

  // 첫번째 매개값에 현재 컨테스트 API의 값을 전달해줌
  const 함수 = (value) => {
    console.log(value);
    return (
      <div style={{ color: value.color }}>
        context API 값 : {value.color}
      </div>
    )
  }


  return (
    <>
      <ColorContext.Consumer>
        {함수}
      </ColorContext.Consumer>
    </>
  )
}

export default ColorComponent;