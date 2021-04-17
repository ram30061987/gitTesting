package totheNew;

public class StringAnagramMain {
	 
	 public static void main(String[] args) {
	  
	  String word="java2blog";
	  String anagram="aj2vabgol";
	  
	  System.out.println("java2blog and aj2vabgol are anagrams :"+ isAnagramUsingStringMethods(word, anagram));
	 
	 }
	 
	 public static boolean isAnagramUsingStringMethods(String word,String anagram)
	 {
	  if(word.length()!=anagram.length())
	   return false;
	  for (int i = 0; i < word.length(); i++) {
	   char c=word.charAt(i);
	   int index=anagram.indexOf(c);
	   System.out.println(""+c+" indexx "+index);
	   // If index of any character is -1, then two strings are not anagrams
	   // If index of character is not equal to -1, then remove the chacter from the String
	   if(index !=-1)
	   {
		   System.out.println("11 index "+index+" "+anagram.substring(0,index));
		   System.out.println("22 index+1 "+(index+1)+" "+anagram.substring(index+1,anagram.length()));

	    anagram=anagram.substring(0,index)+anagram.substring(index+1,anagram.length());
	   }
	   else
	    return false;
	  }
	  return anagram.isEmpty();
	 }
	 
	}