
package democlass;
import java.util.Scanner;

public class Democlass {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your name:");
        String n=input.nextLine();
        System.out.println("enter your position:");
        String pos=input.nextLine();
        
        memberFactory mem =new memberFactory();
        staff st =mem.get_member(pos, n);
        st.getSalary();
        st.getYearsOfWork();
        st.Taxes();
        st.total_salary();
    }
    
}
