import java.util.*;
import javax.swing.*;

class test{
    public static void main(String[] args)
    {
        Random r = new Random();
        
        int ch = Integer.parseInt(JOptionPane.showInputDialog(null,"1. Guess the Number\n2.Exit\n\n Enter your choice : ","Welcome!",JOptionPane.INFORMATION_MESSAGE));
        
        if(ch==1){
            int n = Integer.parseInt(JOptionPane.showInputDialog("Enter your number : "));
            if(n<0){
                JOptionPane.showMessageDialog(null, "Negative number not allowed","Warning!",JOptionPane.WARNING_MESSAGE);

            }
            int number = r.ints(1,2).findFirst().getAsInt();
            if(number == n){
                JOptionPane.showMessageDialog(null,"You are the Winner","Lucky Day!",JOptionPane.CLOSED_OPTION);
            }
            else{
                JOptionPane.showMessageDialog(null,"Try Again! Loser !","Not Your Luck Day!",JOptionPane.OK_OPTION);
            }
        }
        else if(ch==2){
            JOptionPane.showMessageDialog(null,"Thank You for participating","~Exit~",JOptionPane.CLOSED_OPTION);
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid choice","Oopss...Error", JOptionPane.CANCEL_OPTION);
        }
    }
}