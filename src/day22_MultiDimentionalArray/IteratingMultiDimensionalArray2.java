package day22_MultiDimentionalArray;

public class IteratingMultiDimensionalArray2 {

    public static void main(String[] args) {

        //index of elements:    0 1 2    0 1 2 3    0 1 2     0   1  2
        int [][] arr2D = {{1,2,3}, {4,5,6,7}, {8,9,10}, {11,12,13}};
        // index of arrays:  0           1         2         3

        for (int i = arr2D.length-1 ; i >=0 ; i--) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println("___________________________________");

        for (int i = 0; i < arr2D.length; i++) { // i is for index numbers started from 0
            for (int j = arr2D[i].length-1; j >=0 ; j--) {
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
            
        }

        System.out.println("_______________________________");
        /*
        task 3:
 *          13 12 11  
 *          10 9 8
 *          7 6 5 4
 *          3 2 1
         */
        for (int i = arr2D.length-1; i >=0 ; i--) {
            for (int j = arr2D[i].length-1; j >=0 ; j--) {
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }
        
        


    }
}
/**
 * task 1;
 *          11 12 13
 *          8 9 10
 *          4 5 6 7
 *          1 2 3
 *
 * task 2:
 *          3 2 1
 *          7 6 5 4
 *          10 9 8
 *          13 12 11
 *          
 * task 3:
 *          13 12 11  
 *          10 9 8
 *          7 6 5 4
 *          3 2 1
 *          
 * task 4:
 *          
 *          

 */