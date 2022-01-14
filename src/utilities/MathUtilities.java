package utilities;

public class MathUtilities {
    

    //1. Create a method that can return the sum of two integers
    public static int sum(int num1, int num2){
        int sum = num1+num2;
        return sum;
    }
    
    //2. Create a method that can return the sum of two decimal numbers
    public static double sum(double num1, double num2){
        double sum = num1+num2;
        return sum;
    }

    //3. Create a method that can return the subtraction of two integers
    public static int subtraction(int num1, int num2){
        int difference = num1-num2;
        return difference;
    }

    //4. Create a method that can return the subtraction of two decimals
    public static double subtraction(double num1, double num2){
        double difference = num1-num2;
        return difference;
    }

    //5. Creat a method that can return the multiplication of two integers
    public static int multiplication(int num1, int num2){
        int result = num1*num2;
        return result;
    }
    
    //6. Create a method that can return the multiplication of two decimals
    public static double multiplication(double num1, double num2){
        double result = num1*num2;
        return result;
    }

    //7. Create a method that passes two double parameters and return the division result
    public static double division(double num1, double num2){
        double result = num1/num2;
        return result;
    }

    //8. Create a method that can check if an integer is even number
    public static boolean isEven(int num){
        boolean evenNumber = false;
        if (num%2==0){
            evenNumber=true;
        }
        return evenNumber;
    }
    
    //9. Create a method that can check if an integer is odd number
    public static boolean isOdd(int num){
        boolean oddNumber = false;
        if (num%2==0){
            oddNumber=true;
        }
        return oddNumber;
    }

    //10. Create a method that can return the maximum number between two integers
    public static int maxNumber(int num1, int num2){
        int max = 0;
        if (num1>num2){
            max=num1;
        }else if(num2>num1){
            max=num2;
        }
        return max;
    }
    
    //11. Create a method that can return the maximum number between two decimal numbers
    public static double maxNumber(double num1, double num2){
        double max = 0;
        if (num1>num2){
            max=num1;
        }else if(num2>num1){
            max=num2;
        }
        return max;
    }

    //12. Create a method that can return the minimum number between two integers
    public static int minNumber(int num1, int num2){
        int min = 0;
        if (num1<num2){
            min=num1;
        }else if(num2<num1){
            min=num2;
        }
        return min;
    }
    
    //13. Create a method that can return the minimum number between two decimal numbers
    public static double minNumber(double num1, double num2){
        double min = 0;
        if (num1<num2){
            min=num1;
        }else if(num2<num1){
            min=num2;
        }
        return min;
    }
    
    //14. Create a method that can return the square of an integer
    public static int square(int num){
        int result = num*num;
        return result;
    }
    
    //15. Create a method that can return the square of a double
    public static double square(double num){
        double result = num*num;
        return result;
    }

    //16. Create a method that can return the cube of an integer
    public static int cube(int num){
        int result = num*num*num;
        return result;
    }
    
    //17. Create a method that can return the cube of a double
    public static double cube(double num){
        double result = num*num*num;
        return result;
    }


}
