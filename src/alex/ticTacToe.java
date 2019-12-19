package alex;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ticTacToe implements ActionListener{
    JTextField information1, information2;
    JButton position1, position2, position3, position4, position5, position6, position7, position8, position9, clear;
    boolean xTurn = true;
    boolean win = false;
    int count = 0;
    ArrayList<String> topRow = new ArrayList<>();
    ArrayList<String> midRow = new ArrayList<>();
    ArrayList<String> botRow = new ArrayList<>();
    ArrayList<String> leftCol = new ArrayList<>();
    ArrayList<String> midCol = new ArrayList<>();
    ArrayList<String> rightCol = new ArrayList<>();
    ArrayList<String> crossLeft = new ArrayList<>();
    ArrayList<String> crossRight = new ArrayList<>();
    ticTacToe(){
        JFrame f = new JFrame("Tic Tac Toe");
        information1 = new JTextField("It is X's Turn");
        information1.setBounds(50, 10, 250, 20);
        information1.setEditable(false);
        information2 = new JTextField();
        information2.setBounds(50, 30, 250, 20);
        information2.setEditable(false);
        position1 = new JButton();
        position2 = new JButton();
        position3 = new JButton();
        position4 = new JButton();
        position5 = new JButton();
        position6 = new JButton();
        position7 = new JButton();
        position8 = new JButton();
        position9 = new JButton();
        clear = new JButton("Start Over");
        position1.setFocusPainted(false);
        position2.setFocusPainted(false);
        position3.setFocusPainted(false);
        position4.setFocusPainted(false);
        position5.setFocusPainted(false);
        position6.setFocusPainted(false);
        position7.setFocusPainted(false);
        position8.setFocusPainted(false);
        position9.setFocusPainted(false);
        clear.setFocusPainted(false);
        position1.setBounds(50,50,50,50);
        position2.setBounds(150, 50,50,50);
        position3.setBounds(250, 50, 50,50);
        position4.setBounds(50,150,50,50);
        position5.setBounds(150, 150,50,50);
        position6.setBounds(250, 150, 50,50);
        position7.setBounds(50,250,50,50);
        position8.setBounds(150, 250,50,50);
        position9.setBounds(250, 250, 50,50);
        clear.setBounds(50, 350, 250, 40);
        position1.addActionListener(this);
        position2.addActionListener(this);
        position3.addActionListener(this);
        position4.addActionListener(this);
        position5.addActionListener(this);
        position6.addActionListener(this);
        position7.addActionListener(this);
        position8.addActionListener(this);
        position9.addActionListener(this);
        clear.addActionListener(this);
        f.add(information1);
        f.add(information2);
        f.add(position1);
        f.add(position2);
        f.add(position3);
        f.add(position4);
        f.add(position5);
        f.add(position6);
        f.add(position7);
        f.add(position8);
        f.add(position9);
        f.add(clear);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);

    }


    public void actionPerformed(ActionEvent e){
        if(e.getSource() == position1){
            if (xTurn){
                topRow.add("X");
                leftCol.add("X");
                crossLeft.add("X");
                count++;
                position1.setText("X");
                xTurn = false;
                information1.setText("It is now O's turn.");
                position1.setEnabled(false);
            }
            else {
                topRow.add("O");
                leftCol.add("O");
                crossLeft.add("O");
                count++;
                position1.setText("O");
                xTurn = true;
                information1.setText("It is now X's turn.");
                position1.setEnabled(false);
            }
        }
        else if (e.getSource() == position2){
            if (xTurn){
                topRow.add("X");
                midCol.add("X");
                count++;
                position2.setText("X");
                xTurn = false;
                information1.setText("It is now O's turn.");
                position2.setEnabled(false);
            }
            else {
                topRow.add("O");
                midCol.add("O");
                count++;
                position2.setText("O");
                xTurn = true;
                information1.setText("It is now X's turn.");
                position2.setEnabled(false);
            }
        }
        else if (e.getSource() == position3){
            if (xTurn){
                topRow.add("X");
                rightCol.add("X");
                crossRight.add("X");
                count++;
                position3.setText("X");
                xTurn = false;
                information1.setText("It is now O's turn.");
                position3.setEnabled(false);
            }
            else {
                topRow.add("O");
                rightCol.add("O");
                crossRight.add("O");
                count++;
                position3.setText("O");
                xTurn = true;
                information1.setText("It is now X's turn.");
                position3.setEnabled(false);
            }
        }
        else if (e.getSource() == position4){
            if (xTurn){
                midRow.add("X");
                leftCol.add("X");
                count++;
                position4.setText("X");
                xTurn = false;
                information1.setText("It is now O's turn.");
                position4.setEnabled(false);
            }
            else {
                midRow.add("O");
                leftCol.add("O");
                count++;
                position4.setText("O");
                xTurn = true;
                information1.setText("It is now X's turn.");
                position4.setEnabled(false);
            }
        }
        else if (e.getSource() == position5){
            if (xTurn){
                midRow.add("X");
                midCol.add("X");
                crossLeft.add("X");
                crossRight.add("X");
                count++;
                position5.setText("X");
                xTurn = false;
                information1.setText("It is now O's turn.");
                position5.setEnabled(false);
            }
            else {
                midRow.add("O");
                midCol.add("O");
                crossLeft.add("O");
                crossRight.add("O");
                count++;
                position5.setText("O");
                xTurn = true;
                information1.setText("It is now X's turn.");
                position5.setEnabled(false);
            }
        }
        else if (e.getSource() == position6){
            if (xTurn){
                midRow.add("X");
                rightCol.add("X");
                count++;
                position6.setText("X");
                xTurn = false;
                information1.setText("It is now O's turn.");
                position6.setEnabled(false);
            }
            else {
                midRow.add("O");
                rightCol.add("O");
                count++;
                position6.setText("O");
                xTurn = true;
                information1.setText("It is now X's turn.");
                position6.setEnabled(false);
            }
        }
        else if (e.getSource() == position7){
            if (xTurn){
                botRow.add("X");
                leftCol.add("X");
                crossRight.add("X");
                count++;
                position7.setText("X");
                xTurn = false;
                information1.setText("It is now O's turn.");
                position7.setEnabled(false);
            }
            else {
                botRow.add("O");
                leftCol.add("O");
                crossRight.add("O");
                count++;
                position7.setText("O");
                xTurn = true;
                information1.setText("It is now X's turn.");
                position7.setEnabled(false);
            }
        }
        else if (e.getSource() == position8){
            if (xTurn){
                botRow.add("X");
                midCol.add("X");
                count++;
                position8.setText("X");
                xTurn = false;
                information1.setText("It is now O's turn.");
                position8.setEnabled(false);
            }
            else {
                botRow.add("O");
                midCol.add("O");
                count++;
                position8.setText("O");
                xTurn = true;
                information1.setText("It is now X's turn.");
                position8.setEnabled(false);
            }
        }
        else if (e.getSource() == position9){
            if (xTurn){
                botRow.add("X");
                rightCol.add("X");
                crossLeft.add("X");
                count++;
                position9.setText("X");
                xTurn = false;
                information1.setText("It is now O's turn.");
                position9.setEnabled(false);
            }
            else {
                botRow.add("O");
                rightCol.add("O");
                crossLeft.add("O");
                count++;
                position9.setText("O");
                xTurn = true;
                information1.setText("It is now X's turn.");
                position9.setEnabled(false);
            }
        }
        else if (e.getSource() == clear){
            position1.setEnabled(true);
            position2.setEnabled(true);
            position3.setEnabled(true);
            position4.setEnabled(true);
            position5.setEnabled(true);
            position6.setEnabled(true);
            position7.setEnabled(true);
            position8.setEnabled(true);
            position9.setEnabled(true);
            position1.setText("");
            position2.setText("");
            position3.setText("");
            position4.setText("");
            position5.setText("");
            position6.setText("");
            position7.setText("");
            position8.setText("");
            position9.setText("");
            information1.setText("It is now X's turn.");
            information2.setText("");
            topRow.clear();
            midRow.clear();
            botRow.clear();
            leftCol.clear();
            midCol.clear();
            rightCol.clear();
            crossLeft.clear();
            crossRight.clear();
            win = false;
            xTurn = true;
            count = 0;
        }
        if (topRow.size() == 3){
            if (threeRow(topRow)){
                information2.setText(topRow.get(0) + " is the Winner!");
                complete();
            }
        }
        if (midRow.size() == 3){
            if (threeRow(midRow)){
                information2.setText(midRow.get(0) + " is the Winner!");
                complete();
            }
        }
        if (botRow.size() == 3){
            if (threeRow(botRow)){
                information2.setText(botRow.get(0) + " is the Winner!");
                complete();
            }
        }
        if (leftCol.size() == 3){
            if (threeRow(leftCol)){
                information2.setText(leftCol.get(0) + " is the Winner!");
                complete();
            }
        }
        if (midCol.size() == 3){
            if (threeRow(midCol)){
                information2.setText(midCol.get(0) + " is the Winner!");
                complete();
            }
        }
        if (rightCol.size() == 3){
            if (threeRow(rightCol)){
                information2.setText(rightCol.get(0) + " is the Winner!");
                complete();
            }
        }
        if (crossLeft.size() == 3){
            if (threeRow(crossLeft)){
                information2.setText(crossLeft.get(0) + " is the Winner!");
                complete();
            }
        }
        if (crossRight.size() == 3){
            if (threeRow(crossRight)){
                information2.setText(crossRight.get(0) + " is the Winner!");
                complete();
            }
        }
        if (count == 9 && !win){
            information1.setText("GAME OVER");
            information2.setText("It is a tie game...");
        }
    }

    public boolean threeRow(ArrayList<String> row){
        if (row.get(0).equals("X") && row.get(1).equals("X") && row.get(2).equals("X")){
            return true;
        }
        return row.get(0).equals("O") && row.get(1).equals("O") && row.get(2).equals("O");
    }

    public void complete(){
        information1.setText("GAME OVER");
        position1.setEnabled(false);
        position2.setEnabled(false);
        position3.setEnabled(false);
        position4.setEnabled(false);
        position5.setEnabled(false);
        position6.setEnabled(false);
        position7.setEnabled(false);
        position8.setEnabled(false);
        position9.setEnabled(false);
        win = true;
    }

    public static void main(String[] args){
        new ticTacToe();
    }
}
