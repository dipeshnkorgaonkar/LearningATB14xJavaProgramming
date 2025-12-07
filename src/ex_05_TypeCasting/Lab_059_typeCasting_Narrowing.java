package ex_05_TypeCasting;

public class Lab_059_typeCasting_Narrowing {
    public static void main(String[] args){
        int val = 300;
        // $$00000000000000000000000100101100$$
        // byte b= val; //Narrowing - Implicit Casting- not valid
        byte b = (byte) val;
        System.out.println(b);

        // **00101100**
        //value is
        //
         // 0+0+32+0+8+4+0+0 = **44**
    }
}
