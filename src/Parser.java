import java.util.ArrayList;
import java.util.Arrays;

public class Parser {
    public static ArrayList<Integer> parseBinaryString(String bin){
        ArrayList<Integer> binaryArr = new ArrayList<>();
        int i = 0;
        int val = 0;
        while (i < bin.length()){
            try {
                val = Integer.parseInt(bin.substring(i, i+1));
                if (!(val == 0 || val == 1)){
                    System.err.println("На вход подаем только последовательность из 0 и 1");
                    System.exit(2);
                }
            }catch (NumberFormatException e){
                System.err.println(e.getMessage());
                System.exit(2);
            }
            i++;
            binaryArr.add(val);
        }
        return  binaryArr;
    }
    public static ArrayList<Integer> parseBinaryString(String[] indexes){
        ArrayList<Integer> indexesArr = new ArrayList<>();
        int val = 0;
        for(String s:indexes){
            try {
                val = Integer.parseInt(s);
            }catch (NumberFormatException e){
                System.err.println(e.getMessage());
                System.exit(2);
            }
            indexesArr.add(val);
        }
        return indexesArr;
    }
}
