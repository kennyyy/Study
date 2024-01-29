package static_.buildPattern;

public class BuildTest {

	public static void main(String[] args) {
		//��ü�� ���
		PersonBuild p1 = PersonBuild.builder().setAge(20).build();
		System.out.println(p1.toString());
		
		//��ü�� ���
		PersonBuild p2 = PersonBuild.builder()
									.setAge(30)
									.setName("ȫ�浿")
									.build();
		System.out.println(p2.toString());
		
		//��������
		p2.setAge(50).setName("ȫ����");
		System.out.println(p2.toString());
		
		
		
		
		
	}
}
