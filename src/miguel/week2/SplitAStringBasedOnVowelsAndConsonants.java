package miguel.week2;

public class SplitAStringBasedOnVowelsAndConsonants {

    public static String split(String str) {
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();

        for (int i = 0; i < str.length(); i++) { // iterate through string
            char c = str.charAt(i);
            switch (Character.toLowerCase(c)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowels.append(c);
                    break;
                default:
                    consonants.append(c);
                    break;
            }
        }
        return vowels.append(consonants.toString()).toString();
    }

    public static void main(String[] args) {
        String test1 = "abcde";
        String test2 = "Hello!";
        String test3 = "What's the time?";

        System.out.println(split(test1));
        System.out.println(split(test2));
        System.out.println(split(test3));
    }
}
