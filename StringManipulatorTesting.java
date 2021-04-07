public class StringManipulatorTesting {
    public static void main(String[] args) {
        StringManipulator resultstring = new StringManipulator();
        String str = resultstring.trimAndConcat("    Hello     ","     World    ");
        System.out.println(str); 

        StringManipulator indexchar = new StringManipulator();
        char letter = 'o';
        Integer a = indexchar.getIndexOrNull("Coding", letter);
        Integer b = indexchar.getIndexOrNull("Hello World", letter);
        Integer e = indexchar.getIndexOrNull("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(e); // null

        StringManipulator indexsubString = new StringManipulator();
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer c = indexsubString.getIndexOrNull(word, subString);
        Integer d = indexsubString.getIndexOrNull(word, notSubString);
        System.out.println(c); // 2
        System.out.println(d); // null

        StringManipulator combineString = new StringManipulator();
        String word1 = combineString.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word1); // eworld
    }
}