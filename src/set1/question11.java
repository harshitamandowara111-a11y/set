package set1;

import java.util.ArrayList;
import java.util.Scanner;

public class question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
       int start[]=new int[5];
       int end[]=new int[5];
       for(int i=0;i<5;i++) {
    	   int num=sc.nextInt();
    	   start[i]=num;
       }
       for(int i=0;i<5;i++) {
    	   int num=sc.nextInt();
    	   end[i]=num;
       }
       int k=1,mini=start[0],maxi=end[0];
       ArrayList<Integer>result=new ArrayList<>();
       for(int i=1;i<5;i++) {
    
    	   if(end[i-1]<end[i]) {
    		   if(start[k]<end[i]) {
    			   maxi=end[i];
    		   }
    		   else {
    			   result.add(start[k]);
    			   mini=start[k];
    			   maxi=end[i];
    		   }
    		   
    	   }
    	   else {
    		 maxi=(end[i]<maxi)?maxi:end[i];
    	   }
       }
       
	}

}
