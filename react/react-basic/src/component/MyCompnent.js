import PropTypes from 'prop-types';


// 하위 컴포넌트에서는 첫번째 매개변수로 props를 받을 수 있습니다.
function MyCompnent(/* props */{name, phone, age}){

  //console.log(props);

  // let name = "홍길동"
  // let phone = "010-1234-5678"

  // let name = props.name;
  // let phone = props.phone;
  // let age = props.age;

  //let {name, phone, age} = props;
  
  return(
    <div>
        <strong>자식 컴포넌트</strong><br />
        변수값: {name} <br />
        변수값: {phone} <br />
        변수값: {age} <br />
    </div>
  )

}



//props의 기본값(디폴트) 설정 (대소문자 정확하게 구분함)
//컴포넌트명.defaultProps = {}

MyCompnent.defaultProps = {
  phone : "010-1234-5678",
  age : 20
}


//props의 타입검증
//컴포넌트명.propTypes = {}

MyCompnent.propTypes = {
  name : PropTypes.string.isRequired, //꼭 필수로 주세요.
  age : PropTypes.number,
  phone : PropTypes.string
}




export default MyCompnent;