//add class definitions below this line

class Words {
    private String[] words;
    private int[] count;

    public Words(String[] listOfWords) {
        words = listOfWords;
        count = new int[words.length];
    }

    public void countVowels() {
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            checkWord(i, word);
        }
    }

    private void checkWord(int index, String word) {
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (isVowel(letter)) {
                count[index]++;
            }
        }
    }

    private boolean isVowel(char letter) {
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        for (int i = 0; i < vowels.length; i++) {
            if (letter == vowels[i]) {
                return true;
            }
        }
        return false;
    }

    public void printVowelCount() {
        for (int num : count) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

// add class definitions above this line

// add class definitions below this line

class PrivateExample {
    private int num;

    public PrivateExample(int n) {
        num = n;
    }

    public void publicMethod() {
        privateMethod();
    }

    private void privateMethod() {
        System.out.println("The double of " + num + " is: " + num * 2);
        System.out.println(num + " squared is: " + num * num);
    }
}

// add class definitions above this line

public class PrivateKeyword {
    public static void main(String[] args) {
        // add code below this line

        PrivateExample myExample = new PrivateExample(5);
        myExample.publicMethod();

        // add code above this line

        // add code below this line

        String[] wordList = { "house", "cat", "computer", "Java" };
        Words w = new Words(wordList);
        w.countVowels();
        w.printVowelCount();

        // add code above this line
    }
}
