package set1;
import java.util.*;
public class question14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Character,ArrayList<Integer>>mp=new HashMap<>();
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			Character c=sc.next().charAt(0);
			mp.putIfAbsent(c, new ArrayList<>());
			int n=sc.nextInt();
			mp.get(c).add(n);
		}
//		for (Character key : mp.keySet()) {
//		    ArrayList<Integer> values = mp.get(key);
//		    System.out.print(key + " -> ");
//		    for (int val : values) {
//		        System.out.print(val + " ");
//		    }
//		    System.out.println();
//		}
		int count=0;
		int t=3;
		for(Character key:mp.keySet()) {
			ArrayList<Integer>p=mp.get(key);
			count++;
		    for(int i=1;i<p.size();i++) {
		    	if((p.get(i)-p.get(i-1))>t) {
		    		count++;
		    		
		    	}
		    }
			
		}
		
		System.out.println(count);
		
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		int n1=sc.nextInt();
//		int n2=sc.nextInt();
//		Character []userid=new Character[n1];
//		int []time=new int[n2];
//		for(int i=0;i<n1;i++) {
//			Character num=sc.next().charAt(0);
//			userid[i]=num;
//		}
//	
//		for(int i=0;i<n2;i++) {
//			int num=sc.nextInt();
//			time[i]=num;
//		}
//		HashMap<Character, ArrayList<ArrayList<Integer>>>mp=new HashMap<>();
//		for(int i=0;i<userid.length;i++) {
//			if(!mp.containsKey(userid[i]))	{
////				mp[trav]=ArrayList<ArrayList<Integer>>q;
//				
//			mp.put(userid[i], new ArrayList<ArrayList<Integer>>());
//			if(time[i]<=
//		
//			}
//		}
//		
//		
//		 

	}

}
