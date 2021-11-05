package GroupHw;

public class GroupHw1 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array of integer values. 
		 * Print the sum of all numbers.
		 */


		int[][] num = { { 1, 2, 3, 4 }, 
				{ 10, 20, 30, 40 }, 
				{ 100, 200, 300, 400 }, 
				{ 1000, 2000, 3000, 4000 }
				};

		int sum =0;
		for(int i=0;	i<num.length;	i++) {
			
			for(int j=0;	j<num[i].length;	j++) {
				
				sum=sum+num[i][j];
			}
		}
		System.out.println("The Sum of these numbers is   " + sum);
		}
	}


