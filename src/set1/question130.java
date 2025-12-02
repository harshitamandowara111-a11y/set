package set1;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class question130 {

	public static void main(String[] args) {
		 String[]datasets = {"lgzpc", "lchxlo", "xrwzg"};
		 int n=datasets.length;
		 List<String> ans = new ArrayList<>();
		 Pattern p = Pattern.compile("[aeiou]");
		 for(String i:datasets) {
			 
                     Matcher m = p.matcher(i);
			        int count = 0;
			        while (m.find()) {
			            count++;
			        }
			        if(count%2==0) {
			        	ans.add("Chris");
			        }
			        else {
			        	ans.add("Alex");
			        }

		 }
		 System.out.println(ans);
		// TODO Auto-generated method stub

	}

}
