package api.collection.queue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//우선순위큐
		
		PriorityQueue<Integer> que = new PriorityQueue<Integer>();
		que.offer(3);
		que.offer(4);
		que.offer(3);
		que.offer(1);
		que.offer(2);
		
		System.out.println(que.poll());//1
		System.out.println(que.poll());//2
		System.out.println(que.poll());//3
		System.out.println(que.poll());//3
		System.out.println(que.poll());//4
		
		//객체를 Que에 넣는 작업
		//객체를 Que에 넣을 때는 우선순위를 지정하는 방법이 정의되어야 합니다.
		
		PriorityQueue<Person> q = new PriorityQueue<Person>();
		
		q.offer(new Person("홍길동", 20));
		q.offer(new Person("홍길자", 30));
		q.offer(new Person("이순신", 40));
		q.offer(new Person("피순신", 50));
		
		System.out.println(q.poll().toString());
		System.out.println(q.poll().toString());
		System.out.println(q.poll().toString());
		System.out.println(q.poll().toString());
		
		Comparable com = new Comparable<String>() {

			@Override
			public int compareTo(String o) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
	}

}
