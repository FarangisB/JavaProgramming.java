package day09_IfAndElseAndMultiBranch;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 1000,
                b = 5,
                c = 2000;

        boolean aIsMidian = (a>b && a<c) || (a<b && a>c),
        bIsMedian = (b>a && b<c) || (b<a && b>c),
        cIsMedian = (c>b && c<a) || (c<b && c>a); // or cIsMedian = !aIsMedian && !bIsMedian = it means If Not a is median and Not b is median

        if(aIsMidian){ //if a is the median
            System.out.println(bIsMedian);
        }
        if(bIsMedian){ //if b is the median
            System.out.println(b+" is the median number");
        }
        if(cIsMedian){ //if c is the median
            System.out.println(c+" is the median number");
        }




    }


}
/*
Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
 */