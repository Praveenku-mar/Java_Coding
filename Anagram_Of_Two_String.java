import java.util.*;
public class Main
{
    public static boolean isAnagram(String s1, String s2){
        s1 = s1.replaceAll("//s","");
        s2 = s2.replaceAll("//s","");
        if(s1.length() == s2.length()){
            char[] c1 = s1.toLowerCase().toCharArray();
            char[] c2 = s2.toLowerCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            return Arrays.equals(c1,c2);
        }
        return false;
    }
	public static void main(String[] args) {
	    String str1 = "silent";
	    String str2 = "goatof";
		boolean res = isAnagram(str1,str2);
		System.out.println(res);
		}
}
