
import javax.swing.*;
import java.awt.*;

public class Viewer extends JFrame {

    private Controller controller;
    private JTextField resultField;
    private JTextField additionalField;
    

    public Viewer() {
        this.controller = new Controller(this);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        setBounds(dimension.width / 2 - 250, dimension.height / 2 - 250, 405, 515);
        setResizable(false);
        setTitle("RPN Calculator");
        setBackground(Color.WHITE);

        // textField
        this.resultField = new JTextField();
        resultField.setEditable(false);
        resultField.setFont(new Font(resultField.getFont().getName(), Font.PLAIN, 20));
        resultField.setBounds(20, 20, 350, 40);
	resultField.setForeground(Color.decode("#31678A"));

        this.additionalField = new JTextField();
        additionalField.setEditable(false);
        additionalField.setFont(new Font(additionalField.getFont().getName(), Font.PLAIN, 35));
        additionalField.setBounds(20, 75, 350, 70);
	additionalField.setForeground(Color.decode("#31678A"));

        // panel
        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);
        jPanel.add(resultField);
        jPanel.add(additionalField);
        jPanel.setBackground(Color.decode("#ffffff"));

        // buttons
        Font buttonFont = new Font("Arial", Font.PLAIN, 24);

        JButton buttonC = new JButton("C");
        buttonC.setBounds(20, 165, 80, 50);
        buttonC.setFont(buttonFont);
        buttonC.setBackground(Color.decode("#F3686B"));
        buttonC.setFocusPainted(false);
        buttonC.setForeground(Color.decode("#ffffff"));
        buttonC.setBorderPainted(false);
        buttonC.addActionListener(controller);
        jPanel.add(buttonC);

        JButton buttonOpenBracket = new JButton("(");
        buttonOpenBracket.setBounds(110, 165, 80, 50);
        buttonOpenBracket.setFont(buttonFont);
        buttonOpenBracket.setBackground(Color.decode("#46A0EE"));
        buttonOpenBracket.setFocusPainted(false);
        buttonOpenBracket.setForeground(Color.decode("#ffffff"));
        buttonOpenBracket.setBorderPainted(false);
        buttonOpenBracket.addActionListener(controller);
        jPanel.add(buttonOpenBracket);

        JButton buttonCloseBracket = new JButton(")");
        buttonCloseBracket.setBounds(200, 165, 80, 50);
        buttonCloseBracket.setFont(buttonFont);
        buttonCloseBracket.setBackground(Color.decode("#46A0EE"));
        buttonCloseBracket.setFocusPainted(false);
        buttonCloseBracket.setForeground(Color.decode("#ffffff"));
        buttonCloseBracket.setBorderPainted(false);
        buttonCloseBracket.addActionListener(controller);
        jPanel.add(buttonCloseBracket);


        JButton buttonDivision = new JButton("/");
        buttonDivision.setBounds(290, 165, 80, 50);
        buttonDivision.setFont(buttonFont);
        buttonDivision.setBackground(Color.decode("#F1A633"));
        buttonDivision.setFocusPainted(false);
        buttonDivision.setForeground(Color.decode("#ffffff"));
        buttonDivision.setBorderPainted(false);
        buttonDivision.addActionListener(controller);
        jPanel.add(buttonDivision);

        // ----------------------------------------------

        JButton buttonSeven = new JButton("7");
        buttonSeven.setBounds(20, 225, 80, 50);
        buttonSeven.setFont(buttonFont);
        buttonSeven.setBackground(Color.decode("#46A0EE"));
        buttonSeven.setFocusPainted(false);
        buttonSeven.setForeground(Color.decode("#ffffff"));
        buttonSeven.setBorderPainted(false);
        buttonSeven.addActionListener(controller);
        jPanel.add(buttonSeven);

        JButton buttonEight = new JButton("8");
        buttonEight.setBounds(110, 225, 80, 50);
        buttonEight.setFont(buttonFont);
        buttonEight.setBackground(Color.decode("#46A0EE"));
        buttonEight.setFocusPainted(false);
        buttonEight.setForeground(Color.decode("#ffffff"));
        buttonEight.setBorderPainted(false);
        buttonEight.addActionListener(controller);
        jPanel.add(buttonEight);

        JButton buttonNine = new JButton("9");
        buttonNine.setBounds(200, 225, 80, 50);
        buttonNine.setFont(buttonFont);
        buttonNine.setBackground(Color.decode("#46A0EE"));
        buttonNine.setFocusPainted(false);
        buttonNine.setForeground(Color.decode("#ffffff"));
        buttonNine.setBorderPainted(false);
        buttonNine.addActionListener(controller);
        jPanel.add(buttonNine);

        JButton buttonMultiplication = new JButton("x");
        buttonMultiplication.setBounds(290, 225, 80, 50);
        buttonMultiplication.setFont(buttonFont);
        buttonMultiplication.setBackground(Color.decode("#F1A633"));
        buttonMultiplication.setFocusPainted(false);
        buttonMultiplication.setForeground(Color.decode("#ffffff"));
        buttonMultiplication.setBorderPainted(false);
        buttonMultiplication.addActionListener(controller);
        jPanel.add(buttonMultiplication);
        
        //------------------------------------------------

        JButton buttonFour = new JButton("4");
        buttonFour.setBounds(20, 285, 80, 50);
        buttonFour.setFont(buttonFont);
        buttonFour.setBackground(Color.decode("#46A0EE"));
        buttonFour.setFocusPainted(false);
        buttonFour.setForeground(Color.decode("#ffffff"));
        buttonFour.setBorderPainted(false);
        buttonFour.addActionListener(controller);
        jPanel.add(buttonFour);

        JButton buttonFive = new JButton("5");
        buttonFive.setBounds(110, 285, 80, 50);
        buttonFive.setFont(buttonFont);
        buttonFive.setBackground(Color.decode("#46A0EE"));
        buttonFive.setFocusPainted(false);
        buttonFive.setForeground(Color.decode("#ffffff"));
        buttonFive.setBorderPainted(false);
        buttonFive.addActionListener(controller);
        jPanel.add(buttonFive);

        JButton buttonSix = new JButton("6");
        buttonSix.setBounds(200, 285, 80, 50);
        buttonSix.setFont(buttonFont);
        buttonSix.setBackground(Color.decode("#46A0EE"));
        buttonSix.setFocusPainted(false);
        buttonSix.setForeground(Color.decode("#ffffff"));
        buttonSix.setBorderPainted(false);
        buttonSix.addActionListener(controller);
        jPanel.add(buttonSix);

        JButton buttonMinus = new JButton("-");
        buttonMinus.setBounds(290, 285, 80, 50);
        buttonMinus.setFont(buttonFont);
        buttonMinus.setBackground(Color.decode("#F1A633"));
        buttonMinus.setFocusPainted(false);
        buttonMinus.setForeground(Color.decode("#ffffff"));
        buttonMinus.setBorderPainted(false);
        buttonMinus.addActionListener(controller);
        jPanel.add(buttonMinus);

        //------------------------------------------------

        JButton buttonOne = new JButton("1");
        buttonOne.setBounds(20, 345, 80, 50);
        buttonOne.setFont(buttonFont);
        buttonOne.setBackground(Color.decode("#46A0EE"));
        buttonOne.setFocusPainted(false);
        buttonOne.setForeground(Color.decode("#ffffff"));
        buttonOne.setBorderPainted(false);
        buttonOne.addActionListener(controller);
        jPanel.add(buttonOne);

        JButton buttonTwo = new JButton("2");
        buttonTwo.setBounds(110, 345, 80, 50);
        buttonTwo.setFont(buttonFont);
        buttonTwo.setBackground(Color.decode("#46A0EE"));
        buttonTwo.setFocusPainted(false);
        buttonTwo.setForeground(Color.decode("#ffffff"));
        buttonTwo.setBorderPainted(false);
        buttonTwo.addActionListener(controller);
        jPanel.add(buttonTwo);

        JButton buttonThree = new JButton("3");
        buttonThree.setBounds(200, 345, 80, 50);
        buttonThree.setFont(buttonFont);
        buttonThree.setBackground(Color.decode("#46A0EE"));
        buttonThree.setFocusPainted(false);
        buttonThree.setForeground(Color.decode("#ffffff"));
        buttonThree.setBorderPainted(false);
        buttonThree.addActionListener(controller);
        jPanel.add(buttonThree);

        JButton buttonPlus = new JButton("+");
        buttonPlus.setBounds(290, 345, 80, 50);
        buttonPlus.setFont(buttonFont);
        buttonPlus.setBackground(Color.decode("#F1A633"));
        buttonPlus.setFocusPainted(false);
        buttonPlus.setForeground(Color.decode("#ffffff"));
        buttonPlus.setBorderPainted(false);
        buttonPlus.addActionListener(controller);
        jPanel.add(buttonPlus);

        //------------------------------------------------

        JButton buttonDel = new JButton("Del");
        buttonDel.setBounds(20, 405, 80, 50);
        buttonDel.setFont(buttonFont);
        buttonDel.setBackground(Color.decode("#F3686B"));
        buttonDel.setFocusPainted(false);
        buttonDel.setForeground(Color.decode("#ffffff"));
        buttonDel.setBorderPainted(false);
        buttonDel.addActionListener(controller);
        jPanel.add(buttonDel);

        JButton buttonZero = new JButton("0");
        buttonZero.setBounds(110, 405, 80, 50);
        buttonZero.setFont(buttonFont);
        buttonZero.setBackground(Color.decode("#46A0EE"));
        buttonZero.setFocusPainted(false);
        buttonZero.setForeground(Color.decode("#ffffff"));
        buttonZero.setBorderPainted(false);
        buttonZero.addActionListener(controller);
        jPanel.add(buttonZero);

        JButton buttonDot = new JButton(".");
        buttonDot.setBounds(200, 405, 80, 50);
        buttonDot.setFont(buttonFont);
        buttonDot.setBackground(Color.decode("#46A0EE"));
        buttonDot.setFocusPainted(false);
        buttonDot.setForeground(Color.decode("#ffffff"));
        buttonDot.setBorderPainted(false);
        buttonDot.addActionListener(controller);
        jPanel.add(buttonDot);

        JButton buttonEqual = new JButton("=");
        buttonEqual.setBounds(290, 405, 80, 50);
        buttonEqual.setFont(buttonFont);
        buttonEqual.setBackground(Color.decode("#27CF55"));
        buttonEqual.setFocusPainted(false);
        buttonEqual.setForeground(Color.decode("#ffffff"));
        buttonEqual.setBorderPainted(false);
        buttonEqual.addActionListener(controller);
        jPanel.add(buttonEqual);

        add(jPanel);
    }

    public void updateResultField(String value) {
        resultField.setText(value);
    }

    public void updateAdditionalField(String value) {
        additionalField.setText(value);
    }

}