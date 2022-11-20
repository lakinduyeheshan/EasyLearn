import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage extends JFrame implements ActionListener  {
        private JButton b1;
        private JFrame j1;
        private JLabel l1;
        WelcomePage(){

            j1= new JFrame();
            j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            j1.getContentPane().setBackground(new Color(0x008080));
            j1.setSize(1400,800);
            j1.setLayout(new BorderLayout());
            j1.setVisible(true);
            j1.setResizable(false);

            l1= new JLabel();
            l1.setText("Welcome to EasyLearn");
            l1.setBounds(250,50,900,100);
            l1.setHorizontalTextPosition(JLabel.CENTER);
            l1.setForeground(new Color(0x20B2A2));
            l1.setFont( new Font("MV Boli" ,Font.PLAIN,50));
            l1.setBackground(new Color(0x008080));
            l1.setOpaque(true);
            l1.setVerticalAlignment(JLabel.CENTER);
            l1.setHorizontalAlignment(JLabel.CENTER);

            b1 = new JButton();
            b1.setBounds(600,500,200,50);
            b1.setHorizontalTextPosition(JButton.CENTER);
            b1.setVerticalTextPosition(JButton.CENTER);
            b1.setText("Start");
            b1.setLayout(null);
            b1.setFocusable(false);
            b1.setForeground(Color.white);
            b1.setBackground(new Color(0x008080));
            b1.addActionListener(this);
//
            j1.add(l1);
            j1.add(b1);



        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==b1){
                j1.dispose();
                SelectSubject selectsub = new SelectSubject();
            }

        }
}


