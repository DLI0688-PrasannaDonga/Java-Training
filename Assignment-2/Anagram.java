import java.util.Scanner;
import java.util.*;
import java.lang.*;
public class Anagram
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    String str1=sc.nextLine();
	    String str2=sc.nextLine();
	     str1=str1.toLowerCase();
	     str2=str2.toLowerCase();
	     if(str1.length()!=str2.length()){
	       System.out.println("Not a Anagram"); 
	    }
	    else{
	       
	        char[] string1 =str1.toCharArray();
	        char[] string2 =str2.toCharArray();
	        
	        Arrays.sort(string1);
	        Arrays.sort(string2);
	        
	        if(Arrays.equals(string1,string2)==true){
	        System.out.printf("Both are Anagram");
	        }else{
	            System.out.printf("Both are not Anagram");
	        }
	    }
	    
	    
	}
}
