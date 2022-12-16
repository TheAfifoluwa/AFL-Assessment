import java.util.Scanner;

public class Question4 {
    // Writing a well-documented code creates a function that calculates simple interest.
    /**
     * Method to compute simple interest taking the parameters below.
     *
     * @param rate
     * @param principal
     * @param time
     * @return simple interest
     */
    public float simpleInterest(float rate, float principal, float time){
        return (rate * principal * time)/100;
    }

    public static void main(String[] args) {
        Question4 question4 = new Question4();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the principal value");
        float principal = scanner.nextFloat();

        System.out.println("Please enter the rate");
        float rate = scanner.nextFloat();

        System.out.println("Please enter the time");
        float time = scanner.nextFloat();

        float interest= question4.simpleInterest(rate,principal,time);
        System.out.println("Your simple interest is " + interest);

    }


}
