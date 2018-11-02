

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "civic";
		
		StringBuilder sb = new StringBuilder(s);
		StringBuilder x = sb.reverse();
		
		System.out.println(x);

		if(s.equals(x.toString())) {

			System.out.println("String is a palindrome");
		}
	}
}