package Basics;

public class largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int temp;
		int sr[] = {52,62,92,55,100};
		//int max=sr[0];
		int smallest = sr[0];
		int largetst = sr[0];
		
		for(int i=1; i< sr.length; i++)
		{
			if(sr[i] > largetst)
				largetst = sr[i];
			else if (sr[i] < smallest)
				smallest = sr[i];
			
		}
		
		System.out.println("Largest Number is : " + largetst);
		System.out.println("Smallest Number is : " + smallest);
	}}