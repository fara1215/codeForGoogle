package google2;

public class Math {

	
	public int add(int a, int b) {
		return a+b;
		
	}
	public int countA (String a) {
		int count =0;
		int len= a.length();
		for (int i=0; i<len; i++) {
			if (a.charAt(i) == 'a' || a.charAt(i)=='A') {
				count++;
			}
		}
		return count;
	}
}
