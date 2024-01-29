package api.ramda.basic;

public class Person {

	public void greeting(Say01 say) {
		say.talking();
	}
	
	public String greeting(Say02 say) {
		String result = say.talking();
		return result;
	}
	
	public int greeting(Say03 say) {
		int result = say.talking("hello", 10);
		return result;
	}
}
