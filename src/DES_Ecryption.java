import java.math.BigInteger;
import java.util.ArrayList;

public class DES_Ecryption {


    public String hexToBin(String hex){
        hex = hex.replaceAll("0", "0000");
        hex = hex.replaceAll("1", "0001");
        hex = hex.replaceAll("2", "0010");
        hex = hex.replaceAll("3", "0011");
        hex = hex.replaceAll("4", "0100");
        hex = hex.replaceAll("5", "0101");
        hex = hex.replaceAll("6", "0110");
        hex = hex.replaceAll("7", "0111");
        hex = hex.replaceAll("8", "1000");
        hex = hex.replaceAll("9", "1001");
        hex = hex.replaceAll("A", "1010");
        hex = hex.replaceAll("B", "1011");
        hex = hex.replaceAll("C", "1100");
        hex = hex.replaceAll("D", "1101");
        hex = hex.replaceAll("E", "1110");
        hex = hex.replaceAll("F", "1111");
        return hex;
    }


    public String GenerateKeyPlus_56Bit(String s)
    {
          StringBuilder Keyplus= new StringBuilder();
        int[] pc1Matrix = new int[]{57, 49, 41, 33, 25, 17, 9,
                    1, 58, 50, 42, 34, 26, 18,
                    10, 2, 59, 51, 43, 35, 27,
                    19, 11, 3, 60, 52, 44, 36,
                    63, 55, 47, 39, 31, 23, 15,
                    7, 62, 54, 46, 38, 30, 22,
                    14, 6, 61, 53, 45, 37, 29,
                    21, 13, 5, 28, 20, 12, 4};
        for (int index : pc1Matrix) {
            Keyplus.append(s.charAt(index-1));
        }

        return Keyplus.toString();
    }
    public String _48bit(String s)
    {
        StringBuilder Keyplus= new StringBuilder();
        int[] pc2Matrix =new int []{
        14,17,11,24,1,5,
                3,28,15,6,21,10,
                23,19,12,4,26,8,
                16,7,27,20,13,2,
                41,52,31,37,47,55,
                30,40,51,45,33,48,
                44,49,39,56,34,53,
                46,42,50,36,29,32
    };
        for (int index : pc2Matrix) {
            Keyplus.append(s.charAt(index-1));
        }
        return Keyplus.toString();
    }

      public   String shiftingKeys(String tobeShifted,int shiftedby)
    {
        return (tobeShifted.substring(shiftedby)+ tobeShifted.substring(0,shiftedby));
    }
}
