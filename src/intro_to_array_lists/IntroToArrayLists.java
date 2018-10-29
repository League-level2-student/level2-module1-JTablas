package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		ArrayList<String> st = new ArrayList<String>();
		//   Don't forget to import the ArrayList class
		
		//2. Add five Strings to your list
		st.add("YE");
		st.add("NO");
		st.add("MA");
		st.add("NA");
		st.add("oo");
		//3. Print all the Strings using a standard for-loop
		for(int i =0;i<st.size(); i++){
			String s = st.get(i);
			System.out.println(s);
		}		//4. Print all the Strings using a for-each loop
		for (String s : st) {
			System.out.print(s);
		}
		//5. Print only the even numbered elements in the list.
		
		for (int i = 0; i < st.size(); i++) {
			
			if(i %2==0){
				System.out.println(st.get(i));
			}
		}
		//6. Print all the Strings in reverse order.
		for(int n =st.size()-1; n>=0;n--){
			System.out.println(st.get(n));
			
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i=0; i<st.size(); i++){
		if(st.get(i).contains("e")){
			System.out.println(st.get(i));
		}
		}
		}
	}

