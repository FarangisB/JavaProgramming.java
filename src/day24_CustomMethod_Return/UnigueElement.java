package day24_CustomMethod_Return;

public class UnigueElement {

    public static void main(String[] args) {

        uniqueElement(new int[] {10,20,20,30,30});

    }
    

    
//create a method that can display the unique elements of an integer array

        public static void uniqueElement (int [] numbers){

            int result = 0;
            for (int element : numbers) {
                int frequency = 0;

                for (int each:numbers){
                    if (each==element){
                        frequency++;
                    }
                }

                if (frequency==1){
                    System.out.println(element);
                }
            }
}

    

}
