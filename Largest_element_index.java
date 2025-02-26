package arrays;

import java.util.Scanner;

public class Largest_element_index {
	 public static int max(int[] a) {
		 int max=a[0],index=0;
         for(int i=0;i<a.length;i++) {
        	 if(a[i]>max) {   //checking larger value
        		 max=a[i];
        		  index=i;     
        	 }
        	 
         }
         return index;
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
	     int n=scan.nextInt();
	     int[] a=new int[n];
	     for(int i=0;i<a.length;i++) {
	    	 a[i]=scan.nextInt();
	    	  }
	     int res=max(a);
	     System.out.println(res);
	}

}
