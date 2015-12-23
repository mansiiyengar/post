package Datastructures;

import java.util.Hashtable;
import java.util.Set;

public class HashTableDS {
	/*	
	Method 2 : Using Hash Table — Time Com­plex­ity — O(n)

	Check if both Strings are hav­ing the same length, if not , return false.
	Cre­ate a Hash Table, make char­ac­ter as key and its count as value
	Nav­i­gate the string one tak­ing each char­ac­ter at a time
	check if that char­ac­ter already exist­ing in hash table, if yes then increase its count by 1 and if it doesn’t exist insert into hash table with the count as 1.
	Now nav­i­gate the sec­ond string tak­ing each char­ac­ter at a time
	check if that char­ac­ter exist­ing in hash table, if yes then decrease its count by 1 and if it doesn’t exist then return false.
	At the end nav­i­gate through hash table and check if all the keys has 0 count against it if yes then return true else return false.
*/



		
		public static boolean isPermutation(String s1, String s2){
			if(s1.length()!=s2.length()){
				return false;
			}
			Hashtable ht = new Hashtable<>();
			//put the s1 in the string 
			
			for(int i=0;i<s1.length();i++){
				char c = s1.charAt(i);
				if(ht.containsKey(c)){	
					int val = (int) ht.get(c)+1;
					ht.put(c, val);
				}else{
					ht.put(c, 1);
				}
			}
			//check for the second one in the table
			for(int i=0;i<s2.length();i++){
				char c = s2.charAt(i);
				if(ht.containsKey(c)){
					int val = (int)ht.get(c);
					if(val==0){
						return false;
					}
					val--;
					ht.put(c, val);
				}else{
					return false;
				}
			}
			//final iteration to check if the key value !=0
			Set<Character> keys = (Set<Character>) ht.keySet();
			for( Character k :keys ){
				if((int)ht.get(k)!=0){
					return false;
				}
			}
			return true;
		}
		public static void main(String args[]){
			String s1 = "sumit";
			String s2 = "mtisu";
			
			System.out.println(s1 +" and "+ s2 + " are permutation of each other? " + isPermutation(s1, s2));
			s1 = "xyzab";
			s2 = "bayzxx";
			System.out.println(s1 +" and "+ s2 + " are permutation of each other? " + isPermutation(s1, s2));
		}
}
