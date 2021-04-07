public class StringManipulator {
    //  #1
    public String trimAndConcat(String a, String b) {
        // trim off the white spaces around the strings, and concatenate them together
        // pre-built String method called "trim"
        String newString = a.trim() + b.trim();
        return newString;


    }

    public Integer getIndexOrNull(String str, char c) {
        // Get the index of the character and return either the index or null. 
        // If the character appears multiple times, return the first index. 
        // Feel free to use the "indexOf" method of the String class.
        Integer value = str.indexOf(c);
        return value;
        

    }

    public Integer getIndexOrNull(String a, String b){
        // Get the index of the start of the substring and return either the index or null.
        // Feel free to use the "indexOf" method of the String class.
        Integer value = a.indexOf(b);
        return value;

        
    }

    public String concatSubstring(String a, int x, int y, String b) {
        // Get a substring using a starting and ending index, and concatenate that with the second string input to our method. 
        // Feel free to use the "substring" method of the String class.
        String str = a.substring(x, y);
        String resultStr = str + b;
        return resultStr;

        
    } 

}
