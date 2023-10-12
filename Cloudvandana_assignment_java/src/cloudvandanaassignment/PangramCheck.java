package cloudvandanaassignment;

public class PangramCheck {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        System.out.println("Input sentence: " + input);
        boolean isPangram = checkIfPangram(input);
        System.out.println("Is a pangram: " + isPangram);
    }

    public static boolean checkIfPangram(String input) {
        // Convert the input to lowercase to ignore case
        input = input.toLowerCase();

        // Create a boolean array to mark the presence of each alphabet
        boolean[] alphabetPresent = new boolean[26];

        // Traverse through the input and mark the presence of each alphabet
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = c - 'a';
                alphabetPresent[index] = true;
            }
        }

        // Check if all alphabets are present
        for (boolean present : alphabetPresent) {
            if (!present)
                return false;
        }

        return true;
    }
}
