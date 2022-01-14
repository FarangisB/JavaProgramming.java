package day12_Scanner.day19_LoopPractices;

public class DuplicateIndex {

    public static void main(String[] args) {

        String str="affhgdtcc";
        String result= "";
        int index =0;

        for (int i = 0; i < str.length(); i++) {
            int each =str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length() ; j++) {
                char each1 = str.charAt(j);
                if (each == each1) {
                    count++;
                    if (count>1) {
                        index = j;
                        break;
                    }
                }
                    }
            if (index!=0){
                break;
            }
        }

        System.out.println(index-1);

    }
}



