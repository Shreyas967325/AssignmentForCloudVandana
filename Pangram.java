package Pangram;

import java.util.HashSet;
import java.util.Set;

//C. Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet from a-z)
class Pangram{

	public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        String str1 = " Programmer";
	

        System.out.println(isPangram(str)); 
        System.out.println(isPangram(str1)); 
    }

public static boolean isPangram(String str) {
    Set<Character> set = new HashSet<>();
    for (char ch = 'a'; ch <= 'z'; ch++) {
        set.add(ch);
    }
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (isLetter(ch)) {
            set.remove(Character.toLowerCase(ch));
        }
    }
    return set.isEmpty();
}

public static boolean isLetter(char ch) {
    if (!Character.isLetter(ch)) {
        return false;
    }
    return true;
}
}
