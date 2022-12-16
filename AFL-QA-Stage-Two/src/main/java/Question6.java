import java.util.Arrays;
import java.util.stream.Collectors;

public class Question6 {

    //Write a function that removes repeated characters from a string
    public String removeDuplicates(String input){
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if(!result.contains(String.valueOf(input.charAt(i)))) {
                result += String.valueOf(input.charAt(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Question6 question6 = new Question6();
        String input = "aaabbbbcdeeewwhfeeyy";
        String testResult= question6.removeDuplicates(input);
        System.out.println(testResult);

    }
}