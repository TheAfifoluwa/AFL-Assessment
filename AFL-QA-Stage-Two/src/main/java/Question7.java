public class Question7 {

    //Create a program that prints out the odd numbers in an array
    public void printsOddNumbers(int[] array){
        for (int value: array){
            if (isOddNumber(value)){
                System.out.println(value);
            }
        }
    }

    public boolean isOddNumber(int value){
        return value % 2 != 0;
    }

    public static void main(String[] args) {
        Question7 question7 = new Question7();
        int [] input = {34, 2, 9, 91, 19, 401, 0};
        question7.printsOddNumbers(input);
    }


}
