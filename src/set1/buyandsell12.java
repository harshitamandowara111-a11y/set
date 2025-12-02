package set1;
import java.util.*;
public class buyandsell12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the array size");
		int n=sc.nextInt();
          int arr[]=new int[n]; 
          System.out.println("Enter the stock");
          for(int i=0;i<n;i++) {
        	  int num=sc.nextInt();
        	  arr[i]=num;
          }
          int buy=arr[0];
          int profit=0;
          for(int i=1;i<arr.length;i++) {
        	  profit=Math.max(profit, arr[i]-buy);
        	  if(arr[i]<buy) {
        		  buy=arr[i];
        	  }
          }
          System.out.println("the profit is "+profit);
	}

}
