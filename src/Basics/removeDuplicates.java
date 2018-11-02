package Basics;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicates {

	public static void main(String[] args) {
		
		String str = "ppppplllllleasssseeeee hhhellllpppp mmmmmeeeeeeeeeeee";
		
		Set<Character> set = new HashSet<Character>();
		StringBuffer s = new StringBuffer ();
		
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
			
			if(!set.contains(c)) {
				set.add(c);
				s.append(c);
				
			}
		}
				System.out.println(s);
		
	}
}
