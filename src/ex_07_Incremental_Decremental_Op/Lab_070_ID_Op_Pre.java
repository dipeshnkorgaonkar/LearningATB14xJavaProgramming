package ex_07_Incremental_Decremental_Op;
public class Lab_070_ID_Op_Pre {
    public static void main (String[] args){
        int a =10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        //a++ -> a=a+1, incremental by 1
        // Line  no | a | Result b
        //4 | 10| NA
        //5 | 11 | 11
        //6 | 11-print | 11
        //7 | 11| 11- print

    }
}
