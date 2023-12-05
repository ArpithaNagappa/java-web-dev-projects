import java.util.HashMap;

public class CountingCharacter {
    public static void main(String[] args) {
    CountingCharacter  countingCharacter = new CountingCharacter();
        countingCharacter.countCharacters("myString");
    }

    public void countCharacters(String wordToCount){
        String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = myString.toCharArray();
        //System.out.println(charactersInString[1]);
        HashMap<Character, Integer> myCharCount = new HashMap<>();
        for(char theCharacter : charactersInString){
           // System.out.println(theCharacter);

            if(myCharCount.containsKey(theCharacter) == false){
                myCharCount.put(theCharacter ,1);
            }
            else{
              Integer theValue = myCharCount.get(theCharacter);
              theValue = theValue + 1;
              myCharCount.put(theCharacter,theValue);
            }
        }
        System.out.println(myCharCount);


    }
}
