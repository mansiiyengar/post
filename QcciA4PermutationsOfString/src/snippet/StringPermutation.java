	package snippet;

	import java.util.ArrayList;
	import java.util.List;

	/**
	 * Design an algorithm to print all permutations of a string. For simplicity,
	 * assume all characters are unique.
	 */
	class StringPermutation {

	    List<String> perms = new ArrayList<String>();

	    public  List<String> find(String s) {
	        permute("", s);
	        return perms;
	    }

	    private  void permute(String prefix, String s) {
	        int n = s.length();
	        if (n == 0)
	            perms.add(prefix);
	        else {
	            for (int i = 0; i < n; i++)
	            	//prefix and adding the character at position
	            	//take the 1st character then add it to the remaining positions 
	            	//a +bc and a+cb
	            	//prefix +charat[1]
	            	//prefix =charAt[2] and the remaining is added bys.substring(0, i) + s.substring(i+1, n)
	                permute(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, n));
	        }
	    }
	}