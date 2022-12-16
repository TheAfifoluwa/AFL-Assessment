public class Question8 {

    //Create a program that prints out the even numbers in an array
    public void printsEvenNumbers(int[] array){
        for (int value: array){
            if (isEvenNumber(value)){
                System.out.println(value);
            }
        }
    }

    public boolean isEvenNumber(int value){
        return value % 2 == 0;
    }

    public static void main(String[] args) {
        Question8 question8 = new Question8();
        int [] input = {34, 2, 9, 91, 19, 401, 0};
        question8.printsEvenNumbers(input);
    }


}
