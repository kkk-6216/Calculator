
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{

    private Model model;

    public Controller(Viewer viewer) {
        this.model = new Model(viewer);
    } 

    public void actionPerformed(ActionEvent e) {
        String buttonCommand = e.getActionCommand();
        String command;
        if(buttonCommand.equals("0")){
            command = "Zero";
        } else if(buttonCommand.equals("1")) {
            command = "One";
        } else if(buttonCommand.equals("2")) {
            command = "Two";
        } else if(buttonCommand.equals("3")) {
            command = "Three";
        } else if(buttonCommand.equals("4")) {
            command = "Four";
        } else if(buttonCommand.equals("5")) {
            command = "Five";
        } else if(buttonCommand.equals("6")) {
            command = "Six";
        } else if(buttonCommand.equals("7")) {
            command = "Seven";
        } else if(buttonCommand.equals("8")) {
            command = "Eight";
        } else if(buttonCommand.equals("9")) {
            command = "Nine";
        } else if(buttonCommand.equals("+")) {
            command = "Plus";
        } else if(buttonCommand.equals("-")) {
            command = "Minus";
        } else if(buttonCommand.equals("x")) {
            command = "Multiplication";
        } else if(buttonCommand.equals("/")) {
            command = "Division";
        } else if(buttonCommand.equals("=")) {
            command = "Equal";
        } else if(buttonCommand.equals(".")) {
            command = "Dot";
        } else if(buttonCommand.equals("(")) {
            command = "Open_Bracket";
        } else if(buttonCommand.equals(")")) {
            command = "Close_Bracket";
        } else if(buttonCommand.equals("C")) {
            command = "Clean";
        } else if(buttonCommand.equals("Del")) {
            command = "Delete";
        } else {
            command = "";
        }

        model.doAction(command);
        
    }
}