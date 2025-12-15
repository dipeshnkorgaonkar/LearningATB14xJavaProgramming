package ex_06_Ternary_Operator;

public class Lab_067_TO_Task2 {
    public static void main (String[] args){
    int n1=2;
    int n2=9;
    int n3=-11;

    //LBF
        // Logic Building Formula
        //Step1-> Find the inouts adn outputs data type
        //i/o-> n1,n2,n3 -> int
        // o.p -> int -max number or String we can message with max number

        // Steo 2- Rough Logic, Think about it .
        // n1 > n2 && n1> n3 -> n1
        // n2>n3 && n2> n3

        // Step3 - Dr y run - program
    //String maxnumber= n1>n2? (n2>n3? "n3 is greater then n2":"n2 is greater then n3"):"n2 is greater then n1 and n3";
        int max=(n1>n2)?((n1>n3)? n1:n3):((n2>n3? n2:n3));
        System.out.printf("Maximum number amongs the there is %d",max);
    //System.out.printf(maxnumber);
    }
}
