package actions;

import java.util.HashSet;
import java.util.Set;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "REVERSE";
		StringBuffer snew = new StringBuffer();
		
//		StringBuilder sb = new StringBuilder(s);
//		System.out.println(sb.reverse());
		
		Set<Character> hm = new HashSet<Character>();
		for(int i=0;i<s.length();i++) {
			char a = s.charAt(i);
		
			if(!hm.contains(a)) {
				hm.add(a);
				snew.append(a);
			}
			
		}
		System.out.print(snew);
	}

}
