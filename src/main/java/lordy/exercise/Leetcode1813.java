package lordy.exercise;

public class Leetcode1813 {

    public boolean areSentencesSimilar(String sentence1, String sentence2){
        String[] char1 = sentence1.split(" ");
        String[] char2 = sentence2.split(" ");

        int i = 0, j = 0;
        while (i < char1.length && i < char2.length && char1[i].equals(char2[i])){
            i++;
        }
        while (j < char1.length - i && j < char2.length - i && char1[char1.length - j - 1].equals(char2[char2.length - j - 1])){
            j++;
        }
        return i + j == Math.min(char1.length, char2.length);
    }

    public static void main(String[] args) {
        Leetcode1813 l = new Leetcode1813();
        String sentence1 = "My name is Haley";
        String sentence2 = "My Haley";

        l.areSentencesSimilar(sentence1, sentence2);
    }
}
