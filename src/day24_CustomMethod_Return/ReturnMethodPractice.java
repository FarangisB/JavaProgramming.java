package day24_CustomMethod_Return;

public class ReturnMethodPractice {

    public static void main(String[] args) {


// find max number between 100 &200

        int maxNumber = max(100, 200);
        System.out.println(maxNumber);

// multiply the max number by 2

        int mutiple2ToMaxNumber=maxNumber*2;

        System.out.println(mutiple2ToMaxNumber);


    }

    public static int max (int num1, int num2){
        int result = 0;

        if (num1>num2){
            result=num1;
        }else {
            result=num2;
        }

        return result;
    }


}
