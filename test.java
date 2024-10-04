import java.util.*;
import javax.swing.*;

class test{
    public static void main(String[] args)
    {
        Random r = new Random();

        int s = JOptionPane.showConfirmDialog(null,"     WELCOME PLAYER!   \n    Do you want to play ?!","Game Stop", JOptionPane.YES_NO_CANCEL_OPTION);

        if(s==0){
            while(true){
                int ch = Integer.parseInt(JOptionPane.showInputDialog(null,"1. Guess the Number\n2.Exit\n\n Enter your choice : ","|| Main menu ||",JOptionPane.INFORMATION_MESSAGE));

                if(ch==1){
                    int n = Integer.parseInt(JOptionPane.showInputDialog("Enter a number from 1 to 10: "));
                    if(n<0){
                        JOptionPane.showMessageDialog(null, "Negative number not allowed","Warning!",JOptionPane.WARNING_MESSAGE);

                    }
                    int number = r.ints(1,2).findFirst().getAsInt();
                    if(number == n){
                        JOptionPane.showMessageDialog(null," You are the Winner "," ~Lucky Day!~ ",JOptionPane.CLOSED_OPTION);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Try Again! Loser !","Not Your Luck Day!",JOptionPane.OK_OPTION);
                    }
                }
                else if(ch==2){
                    int a = JOptionPane.showConfirmDialog(null,"Do you want to quit:","~Quit~",JOptionPane.YES_NO_CANCEL_OPTION);
                    if(a==0){
                        JOptionPane.showMessageDialog(null, "Player Exit...","Exit",JOptionPane.CLOSED_OPTION);
                        break;
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid choice","Oopss...Error", JOptionPane.CANCEL_OPTION);
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Player Exit...","Exit",JOptionPane.CLOSED_OPTION);
        }
    }
}