package set1;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int timestr[]=new int[n];
		Scanner sc=new Scanner(System.in);
		
		int load[]=new int[n];
		for(int i=0;i<n;i++) {
			int num=sc.nextInt();
			timestr[i]=num;
		}
		for(int i=0;i<n;i++) {
			int num=sc.nextInt();
			load[i]=num;
		}
		TreeMap<Integer,Integer>mp=new TreeMap<>();
		
		int maxi=0;
		int curr=0;
		int s=4;
		
		
		for(int i=0;i<n;i++)
		{    
			mp.putIfAbsent(timestr[i], load[i]);
		}
		Iterator<Integer>it=mp.keySet().iterator();
		int start=mp.firstKey();
		for(int cur:mp.keySet()) {
		
			curr+=mp.get(cur);
			
			while(cur-start>s) {
				curr-=mp.get(start);
				start=it.next();
			}
			maxi=maxi<curr?curr:maxi;
			//System.out.println(maxi);
			
		}
		
		System.out.println(maxi);
		

	}

}
