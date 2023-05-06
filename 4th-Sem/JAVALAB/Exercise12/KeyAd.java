import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class KeyAd extends KeyAdapter{
     JTextArea t ;
     JFrame f;
     JLabel l1 ,l2;
      KeyAd(){
        f = new JFrame();
        f.setSize(300,300);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     t = new JTextArea();
     l1 = new JLabel("No of Vowels: ");
     l1.setBounds(20, 200, 250, 100);
     l2 = new JLabel("No of Consonents: ");
     l2.setBounds(140, 200, 250, 100);
     t.setBounds (10, 10, 200, 200);  
     f.add(t);
     f.add(l1);
     f.add(l2);
     t.addKeyListener(this);
      }

      public static void main(String[] args) {
        new KeyAd();
      }


      @Override
      public void keyPressed(KeyEvent e) {
        
      }

      @Override
      public void keyReleased(KeyEvent e) {
        String s = t.getText();
        int vowelCount = 0;
        int consonentCount = 0;
        for(char c:s.toCharArray()){
            if(Character.toLowerCase(c)=='a' || Character.toLowerCase(c)=='e' || Character.toLowerCase(c)=='i' || Character.toLowerCase(c)=='o' || Character.toLowerCase(c)=='u'){
   vowelCount = vowelCount +1;
            }
            else{
                consonentCount = consonentCount +1;
            }
        }
      l1.setText("No of Vowels: "+Integer.toString(vowelCount));
    l2.setText("No of Consonents: "+ Integer.toString(consonentCount));



      }

      @Override
      public void keyTyped(KeyEvent e) {
          
      }
    }

