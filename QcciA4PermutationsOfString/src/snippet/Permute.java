package snippet;

import java.util.List;

public class Permute {
public static void main(String[] args) {
	StringPermutation sp= new StringPermutation();
	List<String>permuate1=sp.find("abc");
	for(String s1: permuate1){
	System.out.println(s1);
	}
}
}
