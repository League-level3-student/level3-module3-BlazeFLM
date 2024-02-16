package _01_StringBuilder;


public class _03_StringBuilder {
    
    public static String append(String str, char[] characters) {
    	StringBuilder b = new StringBuilder(str);
    	b.append(characters);
        return b.toString();
    }
    
    public static String reverse(String str) {
    	StringBuilder b = new StringBuilder(str);
    	b.reverse();
        return b.toString();
    }
    
    public static String insert(String str, int index, char newChar) {
    	StringBuilder b = new StringBuilder(str);
    	b.insert(index, newChar);
        return b.toString();
    }
    
    public static String delete(String str, int startIndex, int endIndex) {
    	StringBuilder b = new StringBuilder(str);
    	b.delete(startIndex, endIndex);
        return b.toString();
    }
}