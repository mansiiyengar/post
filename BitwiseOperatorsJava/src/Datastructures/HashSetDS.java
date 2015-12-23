package Datastructures;

import java.util.HashSet;
import java.util.Set;

public class HashSetDS {
	public static boolean isUniqueUsingHash(String word) {
	    char[] chars = word.toCharArray();
	    Set<Character> set = new HashSet<Character>();
	    for (char c : chars)
	      if (set.contains(c))
	        return false;
	      else 
	        set.add(c);
	    return true;
	  }
}
