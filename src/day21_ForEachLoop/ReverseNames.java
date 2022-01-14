package day21_ForEachLoop;

public class ReverseNames {

    public static void main(String[] args) {

        String[] name = {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Sinem Kaya", "Begench Begenjov"};

        for (String each : name) {
            String reversed = "";

            for (int i = each.length()-1; i >=0 ; i--) {
                reversed+=each.charAt(i);
            }

            System.out.println(reversed);
        }
        
        
        
    }
}
