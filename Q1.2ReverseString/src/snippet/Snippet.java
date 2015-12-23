package snippet;

public class Snippet {
	public static String reverseIt(String source) {
	    int i, len = source.length();
	    StringBuilder dest = new StringBuilder(len);
	
	    for (i = (len - 1); i >= 0; i--){
	        dest.append(source.charAt(i));
	    }
	
	    return dest.toString();
	}
	
	public static String reverseIt1 (String source) {
		String string="whatever";
		String reverse = new StringBuffer(string).reverse().toString();
		return (reverse);	
	}
	public static String reverseIt2 (String input) {
	 
	    char[] temparray= input.toCharArray();
	    int left,right=0;
	    right=temparray.length-1;
	    for (left=0; left < right ; left++ ,right--)
	    {
	     // Swap values of left and right 
	     char temp = temparray[left];
	     temparray[left] = temparray[right];
	     temparray[right]=temp;
	    }
	return temparray.toString();
	}
	
}

