
public class 투포인터 {
    public static void main(String[] args) {

        //투포인트 - 특정합을 가지는 부분수열의 개수찾기
        //연속된 수의 합이 10인 경우의 수 - 6개
        
        //int[] arr = {5,5,3,2,1,10,10,2,8,2,1}; //6개
        int[] arr = {1,2,3,4,2,5,3,1,2,3}; //2개
        /*
        int 합 = 10;
        int answer = 0;

        for(int i = 0; i < arr.length-1; i++) {
            int sum = 0;
            for(int j = i; j < arr.length; j++) {
                sum+=arr[j];
                if(sum == 10) {
                    answer++;
                    break;
                }
            }
        }
        System.out.println(answer);
        */

        int start = 0;
        int end = 0;
        int 합 = 10; //부분합
        int sum = 0;
        int answer = 0;
        while(start < arr.length) {

            System.out.println(start + "-" + end);
            System.out.println("sum:" + sum);
            //시작의 조건
            if(sum < 합 && end < arr.length) {
                sum += arr[end]; //값을 누적하고
                end++;
            } else {
                sum -= arr[start]; //값을 차감하고
                start++;
            }
            //부분합 개수의 조건
            if(sum == 합) answer++;


        }

        System.out.println(answer);



    }
}