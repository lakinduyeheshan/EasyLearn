import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectSubject extends JFrame implements ActionListener {
    private JButton b2,b21;
    private JFrame j2;
    private JLabel l2,l22;

    SelectSubject(){
        j2= new JFrame();
        j2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j2.getContentPane().setBackground(new Color(0x008080));
        j2.setSize(1400,800);
        j2.setLayout(new BorderLayout());
        j2.setVisible(true);
        j2.setResizable(false);

        l2= new JLabel();
        l2.setText("Select your subject");
        l2.setBounds(250,50,900,100);
        l2.setHorizontalTextPosition(JLabel.CENTER);
        l2.setForeground(new Color(0x20B2A2));
        l2.setFont( new Font("MV Boli" ,Font.PLAIN,50));
        l2.setBackground(new Color(0x008080));
        l2.setOpaque(true);
        l2.setVerticalAlignment(JLabel.CENTER);
        l2.setHorizontalAlignment(JLabel.CENTER);

        l22= new JLabel();
        l22.setText("");
        l22.setBounds(250,900,900,100);
        l22.setHorizontalTextPosition(JLabel.CENTER);
        l22.setForeground(new Color(0x20B2A2));
        l22.setFont( new Font("MV Boli" ,Font.PLAIN,50));
        l22.setBackground(new Color(0x008080));
        l22.setOpaque(true);
        l22.setVerticalAlignment(JLabel.CENTER);
        l22.setHorizontalAlignment(JLabel.CENTER);

        b2 = new JButton();
        b2.setBounds(450,300,200,200);
        b2.setHorizontalTextPosition(JButton.CENTER);
        b2.setVerticalTextPosition(JButton.CENTER);
        b2.setText("Java");
        b2.setLayout(null);
        b2.setFocusable(false);
        b2.setForeground(Color.white);
        b2.setBackground(new Color(225,225,0));
        b2.addActionListener(this);

        b21 = new JButton();
        b21.setBounds(750,300,200,200);
        b21.setHorizontalTextPosition(JButton.CENTER);
        b21.setVerticalTextPosition(JButton.CENTER);
        b21.setText("Physics");
        b21.setLayout(null);
        b21.setFocusable(false);
        b21.setForeground(Color.white);
        b21.setBackground(new Color(225,225,0));
        b21.addActionListener(this);

        j2.add(l2);
        j2.add(b2);
        j2.add(b21);
        j2.add(l22);


    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b2){
            j2.dispose();
            Panel userdata1 = new Panel();
        }

    }
}
