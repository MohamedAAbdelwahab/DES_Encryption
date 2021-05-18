public class Main {
    public static void main(String []args)
    {

        DES_Ecryption ob=new DES_Ecryption();
        String BinaryKey=ob.hexToBin("133457799BBCDFF1");
        String dummy=ob.GenerateKeyPlus_56Bit(BinaryKey);
        C_D_class [] Ci_Di=new C_D_class[17];
        for(int i=0;i<Ci_Di.length;i++)
        {
            Ci_Di[i]=new C_D_class();
        }
        Ci_Di[0].left=dummy.substring(0, dummy.length()/2);
        Ci_Di[0].right=dummy.substring(dummy.length()/2);

        for(int i=1;i<=16;i++)
        {
            if(i==1 || i==2 || i==9 || i==16)
            {
                Ci_Di[i].left=ob.shiftingKeys(Ci_Di[i-1].left,1);
                Ci_Di[i].right=ob.shiftingKeys(Ci_Di[i-1].right,1);

            }
            else{
                Ci_Di[i].left=ob.shiftingKeys(Ci_Di[i-1].left,2);
                Ci_Di[i].right=ob.shiftingKeys(Ci_Di[i-1].right,2);

            }
        }
        Key []keys=new Key[16];
        for(int i=0;i<keys.length;i++)
        {
            keys[i]=new Key();
            keys[i].key=ob._48bit(Ci_Di[i+1].left+Ci_Di[i+1].right);
        }
        for (Key key : keys) {
            System.out.println(key.key);
        }
    }
}
