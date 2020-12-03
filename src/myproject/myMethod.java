package myproject;
import java.util.Scanner;
public class myMethod {
	
	public static void a()
	{Scanner b1=new Scanner(System.in);
	for(int k=0;k<100;k++)
	{
		
	
	 System.out.print("("+"1=*," +" 2=-, "+"3=+, "+"4=/"+")=");
	
	
		
	
	
	 if(b1.hasNextInt())
	 {
	int y=b1.nextInt();
	 
		if(y==1)
	      {
	    	  
	      
	      double arr1[]=new double[10];
	      double arr2[]=new double[10];

	         for (int i=1; i<arr1.length; i++){
	             System.out.println();
	             arr1[i]=i;
	             for (int j =1;j<arr2.length;j++){
	                 arr2[j]=j;
	                 double result = arr1[i] * arr2[j];

	                 System.out.print(arr1[i]+"*"+arr2[j]+" = "+result+"\t");
	             }
	         }
	      }

      if(y==2)
      {
    	  
      
      double arr1[]=new double[10];
      double arr2[]=new double[10];

         for (int i=1; i<arr1.length; i++){
             System.out.println();
             arr1[i]=i;
             for (int j =1;j<arr2.length;j++){
                 arr2[j]=j;
                 double result = arr1[i] - arr2[j];

                 System.out.print(arr1[i]+"-"+arr2[j]+" = "+result+"\t");
             }
         }
      }

      
      if(y==3)
      {
    	  
      
      double arr1[]=new double[10];
      double arr2[]=new double[10];

         for (int i=1; i<arr1.length; i++){
             System.out.println();
             arr1[i]=i;
             for (int j =1;j<arr2.length;j++){
                 arr2[j]=j;
                 double result = arr1[i] + arr2[j];

                 System.out.print(arr1[i]+"+"+arr2[j]+" = "+result+"\t");
             }
         }
      }

      if(y==4)
      {
    	  
      
      double arr1[]=new double[10];
      double arr2[]=new double[10];

         for (int i=1; i<arr1.length; i++){
             System.out.println();
             arr1[i]=i;
             for (int j =1;j<arr2.length;j++){
                 arr2[j]=j;
                 double result = arr1[i] / arr2[j];
               double n= Math.round(result*100.0)/100.0;
                 System.out.print(arr1[i]+"/"+arr2[j]+" = "+n+"\t");
             }
         }
      }
      
      if(y>4 || y<1 )
      {
    	  System.out.println("you must choose a number between 1-4");
      }
	}
	
	 else
	 {
		 System.out.println("enter a number");
		 
	 }break;
	}
	}
}
