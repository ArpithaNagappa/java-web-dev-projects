import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        ArrayPractice  arrayPractice = new ArrayPractice();
        //arrayPractice.printOddNumbers();
        arrayPractice.spiltGivenString();
        //arrayPractice.spiltGivenStringIntoSentence();
    }

    public void printOddNumbers(){
        int[] intArray = {1, 1, 2, 3, 5, 8};
        for (int arr : intArray) {
            if (arr % 2 != 0) {
                System.out.println(arr);
            }
        }
    }
    public String[] spiltGivenString() {
            String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse";
            String[] splitWords = phrase.split(" ");
            //System.out.println(Arrays.toString(splitWords));
            return splitWords;
        }
        public void spiltGivenStringIntoSentence() {
            String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse";
            String[] sentences = phrase.split("\\.");
            System.out.println(Arrays.toString(sentences));
        }

    }


