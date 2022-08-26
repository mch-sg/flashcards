
import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Flashcards {
	
  public static void main(String[] args) {
   JFrame f = new JFrame("Flashcards turn");
   //set size and location of frame
   f.setSize(400, 310);
   f.setLocation(100, 150);
   //make sure it quits when x is clicked
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   //set look and feel
   JFrame.setDefaultLookAndFeelDecorated(true);
   JLabel labelM = new JLabel("Hvad er den kemiske formel for sølvnitrat?"); // Not Only of Sight, but of: 
   labelM.setBounds(50, 50, 500, 30);
   JTextField motto1 = new JTextField();
   //set size of the text box
   motto1.setBounds(50, 100, 200, 30);
   //add elements to the frames
   f.add(labelM);
   f.add(motto1);
   f.setLayout(null);
   f.setVisible(true);
  
   
   // button to check the answer
   JButton b = new JButton("Flip card");
   b.setBounds(50, 150, 100, 30);
   b.setBackground(new Color(238,238,238,255)); // 59, 89, 182
   b.setForeground(Color.BLACK);
   b.setFont(new Font("Tahoma", Font.BOLD, 12));
     b.addActionListener(new ActionListener(){
     @Override public void actionPerformed(ActionEvent ae){
       //  System.out.println("Click Detected by Anon Class");

         JTextArea textArea = new JTextArea("AgNO3"); // "The text added here is just for demo. "+ "\nThis demonstrates the usage of JTextArea in Java. "
         int begn = 0;
         int end = 0;
         textArea.replaceRange(null, begn, end);
         f.add(textArea);
     //    f.setSize(390,300);
         textArea.setBounds(50, 200, 500, 30); // 50, 50, 500, 30)
         f.setVisible(true);
         textArea.setBackground(new Color(238,238,238,255));
       }
     });
     // make button transparent 
     /*  b.setOpaque(false);
       b.setContentAreaFilled(false);
       b.setBorderPainted(false); */ 
     // add button to frame
     f.add(b); 
     
  //   testButton.addActionListener(e -> System.out.println("Click Detected by Lambda Listener"));
   
    


  }

  

}
  