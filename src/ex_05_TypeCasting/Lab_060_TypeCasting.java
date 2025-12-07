package ex_05_TypeCasting;

public class Lab_060_TypeCasting {
    public static void main (String[] args){
        long phone_no=986432413l;
        // shorts= phone_no; // narrowing - implicit
        short s = (short) phone_no; // Narrowing - Explicit
        System.out.println(phone_no);
    }
}
