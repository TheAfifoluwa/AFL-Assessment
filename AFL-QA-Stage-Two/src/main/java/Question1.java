import java.util.Scanner;

public class Question1 {
    //Create a two-string variable, concatenate the two variables and print out the result
    public void concat(String one, String two){
        System.out.println(one + two);
    }

    public static void main(String[] args) {
         Question1 question = new Question1();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first string and hit enter");
        String one = scanner.nextLine();

        System.out.println("Please enter the second string and hit enter");
        String two = scanner.nextLine();

        question.concat(one, two);

    }

}
