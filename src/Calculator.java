import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class Calculator {
    private JPanel calculator;
    private JTextField display;
    private JButton button2;
    private JButton button4;
    private JButton a7Button1;
    private JButton a4Button1;
    private JButton a1Button1;
    private JButton a0Button;
    private JButton button11;
    private JButton a8Button1;
    private JButton a5Button1;
    private JButton a2Button1;
    private JButton a2Button;
    private JButton a9Button1;
    private JButton a6Button1;
    private JButton a3Button1;
    private JButton ACButton;
    private JButton DELButton;
    private JButton button1;
    private JButton button3;

    double num1,num2,answer;
    String result;
    public Calculator() {
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
            }
        });
        a7Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + a7Button1.getText());
            }
        });
        a8Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + a8Button1.getText());
            }
        });
        a9Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + a9Button1.getText());
            }
        });
        a4Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + a4Button1.getText());
            }
        });
        a5Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + a5Button1.getText());
            }
        });
        a6Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + a6Button1.getText());
            }
        });
        a1Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + a1Button1.getText());
            }
        });
        a2Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + a2Button1.getText());
            }
        });
        a3Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + a3Button1.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + a0Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!display.getText().contains(".")) {
                    display.setText(display.getText() + a2Button.getText());
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(display.getText());
                result = "+";
                display.setText("");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(display.getText());
                result = "-";
                display.setText("");
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(display.getText());
                result = "*";
                display.setText("");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(display.getText());
                result = "/";
                display.setText(" ");
            }
        });
        DELButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String del = null;
                if(display.getText().length()>0){
                    StringBuilder str = new StringBuilder(display.getText());
                    str.deleteCharAt(display.getText().length()-1);
                    del =  String.valueOf(str);
                    display.setText(del);
                }
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2 = Double.parseDouble(display.getText());

                switch (result){
                    case "+":
                        answer =num1 + num2;
                        display.setText(String.valueOf(answer));
                        break;

                    case "*":
                        answer = num1 *num2;
                        display.setText(String.valueOf(answer));
                        break;
                    case "/":
                        if(num2==0){
                            display.setText("maths error");
                        }else{
                        answer = num1/num2;
                        display.setText(String.valueOf(answer));
                        }
                        break;
                    case "-":
                        answer = num1 - num2;
                        display.setText(String.valueOf(answer));
                        break;
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
