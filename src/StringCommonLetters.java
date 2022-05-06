
public class StringCommonLetters {

	public static void main(String[] args) {
	       
        String str1 = "abozar";
        String str2 = "raghibdoust";
        
        
        getCommonLetters(str1,str2);
        
    }
	
	 public static void getCommonLetters(String string1,String string2) {
	      
	      String result = ""; // store common letters in the result
	      
	      // rule out odd case
	      if (string1.length() == 0 || string2.length() == 0) return;
	      
	      // find shorter string
	      String shorterString = string1.length() > string2.length() ? string2 : string1;
	      
	      // find longer string
	      String longerString = shorterString.equals(string1) ? string2 : string1;
	      
	      
	      // iterate all characters of shorterString
	      for (int i=0; i < shorterString.length() ; i++ ) {
	        
	        // store chars of shorter as a string
	        String c = Character.toString(shorterString.charAt(i));
	        
	        // use constains to look up if each shorter char is found in longer String
	        if(longerString.contains(c)) result += c;
	        
	        
	      } 
	      
	      System.out.println(result);
	      
	        
	    }
}
