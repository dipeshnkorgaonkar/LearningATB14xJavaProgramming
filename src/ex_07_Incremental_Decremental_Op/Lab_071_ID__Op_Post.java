package ex_07_Incremental_Decremental_Op;

public class Lab_071_ID__Op_Post {
    public static void main (String[] args){
//        int a =10;
//        System.out.println(++a);
        // POST increment = Print first and then increment.
        int a_post = 10;
        int b = a_post++;
        System.out.println(a_post);
        System.out.println(b);

        //ERT (exp and result)
        // Line  no | a | Result (b)
        //8 | 10| NA
        //9 | 10 | 10
        //10 | 11 | 10
        //11 | 11 | 10
    }
}
