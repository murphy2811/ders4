package githubdeneme;
import java.lang.reflect.Array;

public class Arrayss 
{
    public static void modifyArray(int[] array2)
    {
    	for(int counter = 0;counter<array2.length;counter++)
    	{
    		array2[counter]*=2;
    	}
    }
    public static void modifyElement(int element)
    {
    	element*=2;
    	System.out.printf("Value of element int modifyElement: %d%n",element);
    }
	public static void main(String[] args) 
	{
		/*int [] array = {31,27,64,18,95,14,90,70,60,37};
		System.out.printf("%s%8s%n","Index","value");
        for(int counter = 0;counter<array.length;counter++)
        {
        	System.out.printf("%5d%8d%n",counter,array[counter]);
        }
	*/
		
		/*
		for(int counter = 0;counter<array.length;counter++)
	    {
	        System.out.printf("%8d",array[counter]);
	    }
		
		for(int counter = 9;counter>=0;counter--)
	    {
	        System.out.printf("%4d",array[counter]);
	    }
		
		*/
	    /*
		for(int i: array)
	    {
	    	System.out.println(i+" ");
	    }
	    for(int i = 0,j=array.length-1;i<=4;i++,j--)
	    {
	      int temp = array[j];
	      array[j] = array[i];
	      array[i] = temp;
	    }
	    for(int i: array)
	    {
	    	System.out.println(i+" ");
	    	
	    	
	    }
	    */
	   /*int [] array = {31,27,64,18,95,14,90,70,60,37};
	   int total=0;
	   for(int counter=0;counter<array.length;counter--)
	   {
		   total+=array[counter];
	   }
	   */
	  int[ ] array ={1,2,3,4,5};
	  modifyElement(array[3]);
	  {
		  System.out.printf("array3 after modifyElement: %d%n",array[3]);
	  }
	  
	  System.out.printf("Effects of passing reference to entire array:%n"+"The values of the original array are:%n");	  
	  for(int value : array)
	  {
		  System.out.printf(" %d ",value);
	  }
		
	  modifyArray(array);
	  {
		System.out.println("%n%n The values of the modifed array are:%n");
	  }
	
	
	
	
	
	
	
	
	
	}
    
}