import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        if(args.length == 0){
            System.err.println("Данные то введи");
            System.exit(1);
        }
        ArrayList<Integer> outBin = Scrambler.scramb(Parser.parseBinaryString(args[0]), Parser.parseBinaryString(Arrays.copyOfRange(args,1,args.length)));
        for(int i = 0; i < outBin.size(); i ++){
            System.out.print(outBin.get(i));
            if(i % 7 == 0 && i != 0) System.out.print(" ");
        }
    }

}
