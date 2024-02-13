
//export -> 내보내기
export const name = "홍길동";
export const age = 20;
export const getInfo = () => {
    console.log(name, age);
}

//여러값 한번에 객체형태로 내보내기
let sum = 0;
let add = (a) => {
    sum += a;
}

export {sum, add};

