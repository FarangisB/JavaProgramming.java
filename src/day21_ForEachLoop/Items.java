package day21_ForEachLoop;

public class Items {

    public static void main(String[] args) {

        // Given the following arrays:

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        //                    0         1           2       3           4       5
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        //                   0           1      2          3           4        5
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
        //                  0            1       2          3         4         5

/*1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID
*/

        // since they have the same index number we can create 1 for loop

        for (int i = 0; i < items.length; i++) {
            String item = items[i];
            double price = prices[i];
            int id = itemIDs[i];

            System.out.println(item+" - "+id+" - $"+price);

            if (item.equals("iPad")){
                System.out.println("Item list contains iPad");
            }
        }



    }
}
