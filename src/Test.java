import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        Border border =BorderFactory.createLineBorder(Color.GREEN);
        ImageIcon umgc = new ImageIcon("UMGC.png");

        JLabel label = new JLabel("Damn it man ");

        label.setIcon(umgc);
        //label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.RED);
        //label.setFont();
        label.setBorder(border);


        JFrame frame = new JFrame();
       frame.setTitle("converter");
       frame.setSize(420,420);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       //frame.setResizable(false);
       frame.add(label);

       frame.setLayout(null);
       label.setBounds(0,0,250,250);

        ImageIcon panther = new ImageIcon("UMGC.png");
        frame.setIconImage(umgc.getImage());


        frame.getContentPane().setBackground(new Color(3456));


        frame.setVisible(true);
        //frame.pack();

    }
}