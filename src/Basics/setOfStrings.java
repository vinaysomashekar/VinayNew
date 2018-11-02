package Basics;

import java.util.HashSet;
import java.util.Set;

public class setOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// O(n*n) method ---- not a recommended solution
		
		String str[] = {"please", "allow","please", "help","arranged","allow"};
		
		Set<String> set = new HashSet<String>();
		
		for(String i: str) {
			if(set.add(i)== false) {
				System.out.println(i);
			}
			
			
		}
}

}
