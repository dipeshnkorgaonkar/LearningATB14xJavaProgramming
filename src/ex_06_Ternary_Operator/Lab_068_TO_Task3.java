package ex_06_Ternary_Operator;

public class Lab_068_TO_Task3 {
    public static void main (String[] args){
        String user_io=args[0];
        System.out.println(user_io);
        System.out.println(user_io instanceof String);
//    int age =10;
//    String Real_Age_classification= age>= 18? (age>=60? "Person is a adult and is a senior citizen":"Person is a adult"):"Person is a minor";
//        System.out.println(Real_Age_classification);

        int age = Integer.parseInt(user_io);

        String result= (age<18)? "Minor":(age<=60)? "Adult" : "Sr. Citizen";
        System.out.println(result);
    }
}
