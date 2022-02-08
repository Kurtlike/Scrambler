import java.util.ArrayList;

public class Scrambler {
    public static ArrayList<Integer> scramb(ArrayList<Integer> binaryCode, ArrayList<Integer> indexes){
        ArrayList<Integer> bin = new ArrayList<>();
        int val = 0;
        for(int i = 0; i < binaryCode.size(); i++){
            val = binaryCode.get(i);
            for(int index : indexes) {
                if (index <= i) {
                    val = xor(val, bin.get(i - index));
                }
            }
            bin.add(val);
        }
        return bin;
    }
    public static int xor(int a, int b){
        if(a == b) return 0;
        return 1;
    }
}
