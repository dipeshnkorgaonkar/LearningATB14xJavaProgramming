package ex_06_Ternary_Operator;

public class Lab_064_INterview_Ready_Question {
    public static void main (String[] args){
        int age =28;
        // Nested Ternary
        //Result = Condition? expression1 : (Condition 2? expresion2: expression3);

        String result = (age >18)? (age > 25? "You can drink" :"You can go to goa but cannot drink"): "You cannot go to goa";
        System.out.println(result);
    }
}
