import java.util.ArrayList;

public class Test {
    static char[] convert(ArrayList<Character> characters) {
        char[] chars = new char[characters.size()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = characters.get(i);
        }
        return chars;
    }
    public static void main(String[] args) {
        ArrayList<Character> characters = new ArrayList<Character>();
        characters.add('e');
        characters.add('u');
        char[] chars = convert(characters);
        System.out.println(new String(chars));
    }
}