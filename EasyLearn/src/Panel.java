import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JFrame implements ActionListener{
    String[] question = {
            "Who invented Java Programming?",
            "which company made Java? ",
            "Which of the following is not a Java features?",
            "Which component is used to compile, debug and execute the java programs?",
            "What is the extension of java code files?",


    };
    String[][] options = {
            {"Guido van Rossum","James Gosling","Dennis Ritchie","Bjarne Stroustrup"},
            {"Microsoft","Apple","Sun Microsystems","IBM"},
            {"simple","object-oriented","secure","Use of point"},
            {"JVM","JIT","JDK","JRE"},
            {".js",".txt",".class",".java"},


    };

    char[] answers = {
            'B',
            'C',
            'D',
            'C',
            'D'

    };
    char guess;
    char answer;
    int index;
    int correct_guesses = 0 ;
    int total_question=question.length;
    int result;
    int second=10;

    JFrame j4 = new JFrame();

    JTextField t4 = new JTextField();
    JTextArea ta4 =new JTextArea();

    JButton btnA = new JButton();
    JButton btnB = new JButton();
    JButton btnC = new JButton();
    JButton btnD = new JButton();

    JLabel ansLabel_A =  new JLabel();
    JLabel ansLabel_B =  new JLabel();
    JLabel ansLabel_C =  new JLabel();
    JLabel ansLabel_D =  new JLabel();

    JLabel time_label = new JLabel();
    JLabel second_left = new JLabel();
    JTextField number_right =new JTextField();
    JTextField percentage = new JTextField();

    JLabel l41,l42;


    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            second--;
            second_left.setText(String.valueOf(second));
            if(second<=0){
                displayAnswer();
            }

        }
    });



    public Panel(){

        j4.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        j4.setSize(1400,800);
        j4.setVisible(true);
        j4.getContentPane().setBackground(new Color(0x9888));
        j4.setResizable(false);

        t4.setBounds(0,0,1400,50);
        t4.setBackground(new Color(25,25,25));
        t4.setForeground(new Color(255,255,0));
        t4.setFont(new Font ("Ink Free",Font.BOLD,30));
        t4.setBorder(BorderFactory.createBevelBorder(1));
        t4.setHorizontalAlignment(JTextField.CENTER);
        t4.setEditable(false);

        ta4.setBounds(0,50,1400,50);
        ta4.setLineWrap(true);
        ta4.setWrapStyleWord(true);
        ta4.setBackground(new Color(25,25,25));
        ta4.setForeground(new Color(255,225,0));
        ta4.setFont(new Font ("MV Boli",Font.BOLD,30));
        ta4.setBorder(BorderFactory.createBevelBorder(1));
        ta4.setEditable(false);

        btnA.setBounds(400,200,100,50);
        btnA.setFont(new Font("MV Boli",Font.BOLD,20));
        btnA.setFocusable(false);
        btnA.setText("A");
        btnA.addActionListener(this);

        btnB.setBounds(400,300,100,50);
        btnB.setFont(new Font("MV Boli",Font.BOLD,20));
        btnB.setFocusable(false);
        btnB.setText("B");
        btnB.addActionListener(this);

        btnC.setBounds(400,400,100,50);
        btnC.setFont(new Font("MV Boli",Font.BOLD,20));
        btnC.setFocusable(false);
        btnC.setText("C");
        btnC.addActionListener(this);

        btnD.setBounds(400,500,100,50);
        btnD.setFont(new Font("MV Boli",Font.BOLD,20));
        btnD.setFocusable(false);
        btnD.setText("D");
        btnD.addActionListener(this);

        ansLabel_A.setBounds(600,200,500,50);
        ansLabel_A.setBackground(new Color(0x008080));
        ansLabel_A.setForeground(new Color((0x00000)));
        ansLabel_A.setFont(new Font("MV Boli",Font.BOLD,20));

        ansLabel_B.setBounds(600,300,500,50);
        ansLabel_B.setBackground(new Color(0x008080));
        ansLabel_B.setForeground(new Color((0x00000)));
        ansLabel_B.setFont(new Font("MV Boli",Font.BOLD,20));

        ansLabel_C.setBounds(600,400,500,50);
        ansLabel_C.setBackground(new Color(0x008080));
        ansLabel_C.setForeground(new Color((0x00000)));
        ansLabel_C.setFont(new Font("MV Boli",Font.BOLD,20));

        ansLabel_D.setBounds(600,500,500,50);
        ansLabel_D.setBackground(new Color(0x008080));
        ansLabel_D.setForeground(new Color((0x00000)));
        ansLabel_D.setFont(new Font("MV Boli",Font.BOLD,20));

        second_left.setBounds(800,650,200,100);
        second_left.setBackground(Color.black);
        second_left.setForeground(Color.YELLOW);
        second_left.setFont(new Font("Ink Free",Font.BOLD,50));
        second_left.setHorizontalAlignment(JTextField.CENTER);
        second_left.setText(String.valueOf(second));

        time_label.setBounds(750,650,200,100);
        time_label.setBackground(Color.black);
        time_label.setForeground(Color.orange);
        time_label.setFont(new Font("MV Boli",Font.BOLD,20));
        time_label.setHorizontalAlignment(JTextField.CENTER);
        time_label.setText("Time:");

        number_right.setBounds(200,225,900,100);
        number_right.setForeground(new Color(225,225,0));
        number_right.setBackground(new Color(0,0,0));
        number_right.setFont(new Font("MV Boli",Font.BOLD,50));
        number_right.setHorizontalAlignment((JTextField.CENTER));
        number_right.setBorder(BorderFactory.createBevelBorder(1));
        number_right.setEditable(false);

        l41= new JLabel();
        l41.setText("");
        l41.setBounds(250,900,900,100);
        l41.setHorizontalTextPosition(JLabel.CENTER);
        l41.setForeground(new Color(0x20B2A2));
        l41.setFont( new Font("MV Boli" ,Font.PLAIN,50));
        l41.setBackground(new Color(0x008080));
        l41.setOpaque(true);
        l41.setVerticalAlignment(JLabel.CENTER);
        l41.setHorizontalAlignment(JLabel.CENTER);

        l42= new JLabel();
        l42.setText("");
        l42.setBounds(250,900,900,100);
        l42.setHorizontalTextPosition(JLabel.CENTER);
        l42.setForeground(new Color(0x20B2A2));
        l42.setFont( new Font("MV Boli" ,Font.PLAIN,50));
        l42.setBackground(new Color(0x008080));
        l42.setOpaque(true);
        l42.setVerticalAlignment(JLabel.CENTER);
        l42.setHorizontalAlignment(JLabel.CENTER);


        j4.add(t4);
        j4.add(ta4);
        j4.add(btnA);
        j4.add(btnB);
        j4.add(btnC);
        j4.add(btnD);
        j4.add(ansLabel_A);
        j4.add(ansLabel_B);
        j4.add(ansLabel_C);
        j4.add(ansLabel_D);
        j4.add(second_left);
        j4.add(time_label);
        j4.add(l42);


        nextQuestion();






    }

    public void nextQuestion(){
        if(index>=total_question){
            results();
        }
        else{
            t4.setText("Question " +(index+1));
            ta4.setText(question[index]);
            ansLabel_A.setText(options[index][0]);
            ansLabel_B.setText(options[index][1]);
            ansLabel_C.setText(options[index][2]);
            ansLabel_D.setText(options[index][3]);
            timer.start();
        }

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        btnA.setEnabled(false);
        btnB.setEnabled(false);
        btnC.setEnabled(false);
        btnD.setEnabled(false);
        if(e.getSource()==btnA){
            answer= 'A';
            if(answer==answers[index]){
                correct_guesses++;

            }

        }
        if(e.getSource()==btnB){
            answer= 'B';
            if(answer==answers[index]){
                correct_guesses++;
            }
        }
        if(e.getSource()==btnC){
            answer= 'C';
            if(answer==answers[index]){
                correct_guesses++;
            }
        }
        if(e.getSource()==btnD){
            answer= 'D';
            if(answer==answers[index]){
                correct_guesses++;
            }
        }
        displayAnswer();

    }
    public void displayAnswer(){

        timer.stop();

        btnA.setEnabled(false);
        btnB.setEnabled(false);
        btnC.setEnabled(false);
        btnD.setEnabled(false);

        if(answers[index]!= 'A'){
            ansLabel_A.setForeground(new Color(225,0,0));
        }
        if(answers[index]!= 'B') {
            ansLabel_B.setForeground(new Color(225, 0, 0));
        }
        if(answers[index]!= 'C') {
            ansLabel_C.setForeground(new Color(225, 0, 0));
        }
        if(answers[index]!= 'D') {
            ansLabel_D.setForeground(new Color(225, 0, 0));
        }
        Timer pause = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ansLabel_A.setForeground(new Color(25,220,0));
                ansLabel_B.setForeground(new Color(25,220,0));
                ansLabel_C.setForeground(new Color(25,220,0));
                ansLabel_D.setForeground(new Color(25,220,0));

                answer=' ';
                second=10;
                second_left.setText(String.valueOf(second));
                btnA.setEnabled(true);
                btnB.setEnabled(true);
                btnC.setEnabled(true);
                btnD.setEnabled(true);
                index++;
                nextQuestion();


            }
        });
        pause.setRepeats(false);
        pause.start();

    }


    public void results(){
        btnA.setEnabled(false);
        btnB.setEnabled(false);
        btnC.setEnabled(false);
        btnD.setEnabled(false);


        result = (int)(correct_guesses/(double)total_question)*100;
        t4.setText("Results");
        ta4.setText("");
        ansLabel_A.setText("");
        ansLabel_B.setText("");
        ansLabel_C.setText("");
        ansLabel_D.setText("");

        number_right.setText("Your Result is :"+ "("+correct_guesses+"/"+total_question+")");
        j4.add(number_right);
        j4.add(l41);





    }





}