package Datastructures;

import java.util.HashMap;
import java.util.Map;

public class HashMapDS {
	/*Create a Hashmap with the characters of the first string as keys and
	the number of occurances as value; then go through 
	the second string and for each character, look up the hash table
	and decrement the number if it is greater than zero. 
	If you don't find an entry or if it is already 0, 
	the strings are not a permutation of each other. 
	Obviously, the string must have the same length.
*/
	public boolean isPermutationOfOther(String str, String other){
	    if(str == null || other == null)
	        return false;
	    if(str.length() != other.length())
	        return false;

	    Map<Character, Integer> characterCount = new HashMap<Character, Integer>();
	    for (int i = 0; i < str.length(); i++) {
	        char c = str.charAt(i);
	        int count = 1;
	        if(characterCount.containsKey(c)){
	            int k = characterCount.get(c);
	            count = count+k;
	        }

	        characterCount.put(c, count);

	    }

	    for (int i = 0; i < other.length(); i++) {
	        char c = other.charAt(i);
	        if(!characterCount.containsKey(c)){
	            return false;
	        }

	        int count = characterCount.get(c);
	        if(count == 1){
	            characterCount.remove(c);
	        }else{
	            characterCount.put(c, --count);
	        }
	    }

	    return characterCount.isEmpty();
	}
}
