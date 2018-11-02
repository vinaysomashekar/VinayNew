package Basics;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String in = "please help";
		
		
		String out ="";
      
		for(int i=in.length()-1;i>=0;i--) {
			
			out = out+in.charAt(i);
		}
		
		System.out.println(out);
		
		System.out.println(in.charAt(5));
		System.out.println(in.indexOf("e", in.indexOf("e")+1));
		System.out.println(in.indexOf("please"));
//		StringBuilder rev = new StringBuilder();
//		
//		rev.append(in);
//		rev = rev.reverse();
//		System.out.println(rev);
//		System.out.println(in.length());
//		
//		for(int i=in.length()-1;i>=0;i--) {
//			out = out+in.charAt(i);
//			
//		}
//		
//		
//		System.out.println("final string is: " +out);
	}

}
