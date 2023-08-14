
class FindVowels {

    public static void main(String[] args) {
        String str = "hello world";
        int vowelCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("The string contains " + vowelCount + " vowels.");
    }
}
