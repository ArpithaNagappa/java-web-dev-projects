import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PracticeArraylist {
    public static void main(String[] args) {
        //ArrayList<Integer> sumOfNumbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        //Integer SUM = PracticeArraylist.sumEven(sumOfNumbers);
        //System.out.println("The sum is : " + SUM.toString());

        ArrayPractice arrayPractice = new ArrayPractice();
        String[] returnedWords = arrayPractice.spiltGivenString();


        ArrayList<String> wordsToSearch = new ArrayList<>(Arrays.asList(returnedWords));
        System.out.println("What word length are you looking for? " );
        Integer searchLength = PracticeArraylist.getUserInput();
        PracticeArraylist.printWordWithFiveLetters(wordsToSearch , searchLength);
    }

    public static Integer getUserInput(){
        Scanner input = new Scanner(System.in);
         Integer UserInput = input.nextInt();
         input.close();
        return UserInput;
    }
    public static void printWordWithFiveLetters(ArrayList<String> words, Integer searchLength){
        for( int i=0; i < words.size(); i++){
            if(words.get(i).length() == searchLength){
                System.out.println(words.get(i));
            }
        }
    }
    public static int sumEven(ArrayList<Integer> sumOfValues) {
        int sum =0;
        for(int i= 0; i < sumOfValues.size(); i++){
            if (sumOfValues.get(i) % 2 == 0) {
               // System.out.println(sumOfValues.get(i));
            sum = sum + sumOfValues.get(i);
            }
        }
        return sum;

    }
}