package ex_03_Literals;

public class Lab34_Char_literal {
    public static void main(String[] args) {
        char c ='A';
        char b= '&';
        char v=')';

        // Escape Sequence
        char new_line='\n';
        char tab_line='\t';
        char carriage_return ='\r';
        char back_space= '\b';

        System.out.println("DipeshKorgonkar");
        System.out.println("Dipesh"+carriage_return+"Korgonkar");
        System.out.println("Dipesh\nKorgonkar");
        System.out.println("Dipesh"+back_space+"Korgonkar");


        char a = 'A';

        // ASCII, (Limited numbers) - A -> 65

        char ruppee = '₹';
        System.out.println(ruppee);

        char my_laugh_smily = '\u1f60';
        System.out.println(my_laugh_smily);

        char c11 = '\u1F60';

    }
}
