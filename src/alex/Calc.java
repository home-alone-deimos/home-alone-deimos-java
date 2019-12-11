package alex;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calc implements ActionListener{
    JTextField first, second, result;
    JButton add, subtract, multiply, divide, clear;
    Calc() {

        JFrame f = new JFrame("Button Example");
        add = new JButton("+");
        subtract = new JButton("-");
        multiply = new JButton("*");
        divide = new JButton("/");
        clear = new JButton("C");
        first = new JTextField();
        second = new JTextField();
        result = new JTextField();
        first.setBounds(50, 50, 150, 20);
        second.setBounds(50, 100, 150, 20);
        result.setBounds(50, 150, 150, 20);
        result.setEditable(false);
        add.setBounds(50, 200, 35, 40);
        subtract.setBounds(100, 200, 35, 40);
        multiply.setBounds(150, 200, 35, 40);
        divide.setBounds(200, 200, 35, 40);
        clear.setBounds(50, 250, 150, 40);
        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        clear.addActionListener(this);
        f.add(add);
        f.add(subtract);
        f.add(multiply);
        f.add(divide);
        f.add(first);
        f.add(second);
        f.add(result);
        f.add(clear);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String s1 = first.getText();
        String s2 = second.getText();
        double s3 = 0;
        if(e.getSource() == add){
            s3 = Double.parseDouble(s1) + Double.parseDouble(s2);
        }
        else if (e.getSource() == subtract){
            s3 = Double.parseDouble(s1) - Double.parseDouble(s2);
        }
        else if (e.getSource() == multiply){
            s3 = Double.parseDouble(s1) * Double.parseDouble(s2);
        }
        else if (e.getSource() == divide){
            s3 = Double.parseDouble(s1) / Double.parseDouble(s2);
        }
        result.setText(String.valueOf(s3));
        if (e.getSource() == clear){
            first.setText("");
            second.setText("");
            result.setText("");
        }
    }

    public static void main(String[] args) {
        new Calc();
    }
}

