package githubdeneme;

public class Arrayss {

	public static void main(String[] args) {
	    
		
			int [] array= {31,27,64,18,95,14,98,70,60,37};
			for(int i: array) 
			{
			System.out.print(i + "    ");
			}
			System.out.println();
			
			int j;
			for(int i=0,j1=array.length-1; i<=4; i++,j1--)
			{
				int temp=array[j1];
				array[j1]=array[i];
				array[i]=temp;
			}
			for (int i:array) {
				System.out.println(i + " ");
			}
		}
}