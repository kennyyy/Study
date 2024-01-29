import java.util.Arrays;
import java.util.Scanner;

public class 투포인터2 {
    public static void main(String[] args) {

        int[] arr = {1,3,5,7,9,11,13};

        int start = 0;
        int end = arr.length - 1;
        int cnt = 0;
        int M = 10; //부분합

        //양끝포인터는 정렬이 필요하다
        Arrays.sort(arr);

        //양끝에서 출발하여 start가 end보다 크면 멈춘다
        while(end > start) {

            //두 지점 수 합이 M과 같다면 카운트를 올린다. 오른쪽 포인터를 하나 감소한다.
            if( arr[start] + arr[end] == M) {
                cnt++;
                end--;
            //두 지점 수 합이 M보다 크다는 것은 뒤로 더 이동해도 결국 크다는 의미이므로 오른쪽포인터를 하나 감소한다.
            } else if(arr[start] + arr[end] > M){
                end--;
            //반대의 경우에는 왼쪽 포인터를 올린다.
            } else {
                start++;
            }
        }

        System.out.println(cnt);



    }
}
