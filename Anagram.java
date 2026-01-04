public class Anagram {
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";

        if (s1.length() != s2.length()) {
            System.out.println("Not anagram");
            return;
        }

        int[] arr = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                System.out.println("Not anagram");
                return;
            }
        }

        System.out.println("Anagram");
    }
}
