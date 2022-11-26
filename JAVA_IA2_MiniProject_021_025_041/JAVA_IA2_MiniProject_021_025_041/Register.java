import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.event.*;

public class Register extends JFrame {
    String accname;
    int accno;
    long accbalance;
    String[] inputSequence = new String[3];

    public Register() {
        super("Registration");
        for (int i = 0; i <= 3; i++) {
            inputSequence[i] = "";
        }
        setResizable(false);
        setLocationRelativeTo(null);
        buildRegApp();
        // pack();
        setSize(600, 350);
        setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void buildRegApp() {

        // basic constructor setup
        JLabel dname = new JLabel("Please Enter your name:", JLabel.LEFT);
        JTextField ename = new JTextField(20);
        JLabel dpin = new JLabel("Please set up your pin number: ", JLabel.LEFT);
        JTextField epin = new JTextField(4);
        JLabel dbalance = new JLabel("Please enter balance in your account: ", JLabel.LEFT);
        JTextField ebalance = new JTextField(6);
        JButton reg = new JButton("Register");

        ename.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                // char[] nameEntry = nameEntry.getInputSequence();
                // String nameStore = new String(nameEntry);
            }
        });

    }

    public static void main(String args[]) throws FileNotFoundException {
        try {
            FileOutputStream accdata = new FileOutputStream("Accounts.dat", true);
            DataOutputStream accentry = new DataOutputStream(accdata);
        } catch (Exception e) {
            String a = "Accounts file could not be created.";
        }
    }

}
