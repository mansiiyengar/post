/*	A ransom note can be formed by cutting words out of a magazine to form a new
	sentence. How would you figure out if a ransom note (represented as a string) can be formed
	from a given magazine (string)?*/

/*I will create a HashMap of the Ransom money with key = the letter and value= number of time the letter has occured in the Rasom money.
Like in ransom money 255000. HashMap will look like {(2,1);(5,2);(0;3)}. This HashMap will have max size of 10 for each value of 0,1,2,3...9. (here instead of Map we can also use array of size 10);

Now I will I iterate throught the lenght of the Magazine article and for each letter I will look for the same in the HashMap. 
if we find the match we decrement the count of the value of the key, and if the key has value =1 and match is found then we remove the Key from the map(this means that we got all the letter for that key)
we keep on doing the above step till the map is empty.
If the map.isEmpty()==true then return true;(ie it is possible to make the ransom amount)
else if we have reached the end of the magazine article but the map is not empty the retrun false;(we could not complete the ransom amount).*/
package snippet;

import java.util.HashMap;

import java.util.Set;
import java.util.HashSet;
public class Snippet {

public boolean isRansomPossible(String ransom,String article)
{
int ransomLength = ransom.length();
int articleLength = article.length();
HashMap<Character,Integer> map = new HashMap();
for(int i=0;i<ransomLength;i++)
{
	//if the map contains ransom then 
	//if it does not then put it at value 1
	//else put itat value +1
if(!map.containsKey(ransom.charAt(i))){
map.put(ransom.charAt(i),1);}
else{
int value = map.get(ransom.charAt(i));
map.put(ransom.charAt(i),value+1);
}
}
for(int i=0;i<articleLength;i++)
{removeDuplicate(article);
if(map.isEmpty())
return true;
//remove the entire character if its found in the map
if(map.get(article.charAt(i)) != null){
map.remove(article.charAt(i));
}
else
{
int value = map.get(article.charAt(i));
map.put(article.charAt(i),value-1);
}



}
return false;
}


public  String removeDuplicate(String s)
{
    StringBuilder sb = new StringBuilder();
    Set<Character> seen = new HashSet<Character>();

    for(int i = 0; i < s.length(); ++i) {
        char c = s.charAt(i);
        if(!seen.contains(c)) {
            seen.add(c);
            sb.append(c);
        }
    }
    return sb.toString();
}
}
