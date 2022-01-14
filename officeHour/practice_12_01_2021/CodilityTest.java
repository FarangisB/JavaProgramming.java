package practice_12_01_2021;

public class CodilityTest {

    public static void main(String[] args) {

        int number = 30;
        String result = "";

        if (number%2==0){
            result += "Codility";
        }
        if (number%3==0){
            result += "Test";
        }
        if (number%5==0){
            result += "Coders";
        }

        System.out.println(result);


    }

}
/*
1-Write an if statement that assigns 5 to x when y is equal to 20
					2-Write an if statement that multiplies payrate by 1.5 if hours is greater than 40
					3-Write an if statement that sets the variable fees to 50 if the boolean variable max is true
				    4-Write an if statement that prints "Ideal Temp" if the temp is between 70 and 80
				    5-Write an if statement that assigns 20 to the variable a if variable b is 50 AND c is greater than 100




				 Task : Write a function:
				       that, given a positive integer N  However, any number divisible by 2, 3 or 5 shouldbe replaced by the word

				    	 Codility -- 2
                         MyInterface     -- 3
                         Coders   -- 5

				    - If a number is divisible by more than one of the numbers:2,3 or 5, it should be replaced by a
				      concatenation of the respective words Codility, MyInterface and Coders in this given order.

				    	EXPECTED

                           numbers divisible by both 2 and 3 should be replacée by CodilityTest

				    			INPUT : 6    OUTPUT :  CodilityTest

				    	   numbers divisible by allthree numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
				    			INPUT : 15    OUTPUT :  CodilityTestCoders

 */