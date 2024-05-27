
public class Model {

    private Viewer viewer;
    private String expression;
    private String temp;
    private RPN rpn;
    private boolean isClickedEqual;
    private int countBracketClosed;

    public Model(Viewer viewer) {
        this.viewer = viewer;
        this.rpn = new RPN(this);
        this.expression = "";
        this.temp = "";
        this.isClickedEqual = false;
        this.countBracketClosed = 0;

        this.rpn = new RPN(this);
    }

    public String getExpression() {
        return expression;
    }

    public void doAction(String command) {

        if(isClickedEqual) {
            isClickedEqual = false;
            expression = "";
            temp = "";
        }

        if(command.equals("Zero")) {
            expression += String.valueOf(0);
            temp += String.valueOf(0);
        } else if(command.equals("One")) {
            expression += String.valueOf(1);
            temp += String.valueOf(1);
        } else if(command.equals("Two")) {
            expression += String.valueOf(2);
            temp += String.valueOf(2);
        } else if(command.equals("Three")) {
            expression += String.valueOf(3);
            temp += String.valueOf(3);
        } else if(command.equals("Four")) {
            expression += String.valueOf(4);
            temp += String.valueOf(4);
        } else if(command.equals("Five")) {
            expression += String.valueOf(5);
            temp += String.valueOf(5);
        } else if(command.equals("Six")) {
            expression += String.valueOf(6);
            temp += String.valueOf(6);
        } else if(command.equals("Seven")) {
            expression += String.valueOf(7);
            temp += String.valueOf(7);
        } else if(command.equals("Eight")) {
            expression += String.valueOf(8);
            temp += String.valueOf(8);
        } else if(command.equals("Nine")) {
            expression += String.valueOf(9);
            temp += String.valueOf(9);
        } else if(command.equals("Plus")) {
            try {
                if(expression.charAt(expression.length()-1) == '(' ||
                        expression.charAt(expression.length()-1) == ')'){
                    expression += "";
                } else if (rpn.isSymbol(expression.charAt(expression.length() - 1))) {
                    expression = expression.substring(0, expression.length() - 1) + "+";
                } else {
                    expression += "+";
                }
                temp = "";
            } catch (Exception ignored) {}
        } else if(command.equals("Minus")) {
            try {
                if(expression.charAt(expression.length()-1) == '(' ||
                   expression.charAt(expression.length()-1) == ')'){
                    expression += "";
                } else if (rpn.isSymbol(expression.charAt(expression.length() - 1))) {
                    expression = expression.substring(0, expression.length() - 1) + "-";
                } else {
                    expression += "-";
                }
                temp = "";
            } catch (Exception ignored) {}
        } else if(command.equals("Multiplication")) {
            try {
                if(expression.charAt(expression.length()-1) == '(' ||
                        expression.charAt(expression.length()-1) == ')'){
                    expression += "";
                } else if (rpn.isSymbol(expression.charAt(expression.length() - 1))) {
                    expression = expression.substring(0, expression.length() - 1) + "*";
                } else {
                    expression += "*";
                }
                temp = "";
            } catch (Exception ignored) {}
        } else if(command.equals("Division")) {
            try {
                if(expression.charAt(expression.length()-1) == '(' ||
                        expression.charAt(expression.length()-1) == ')'){
                    expression += "";
                } else if (rpn.isSymbol(expression.charAt(expression.length() - 1))) {
                    expression = expression.substring(0, expression.length() - 1) + "/";
                } else {
                    expression += "/";
                }
                temp = "";
            } catch (Exception ignored) {}
        } else if(command.equals("Equal")) {
            isClickedEqual = true;
            expression += "=";

            double result = rpn.evalAnswer();
            int val = (int) result;
            String answer;
            if(val == result) {
                answer = String.valueOf(val);
            } else {
                answer = String.valueOf(result);
            }

            temp = answer;
            expression += answer;
        } else if(command.equals("Open_Bracket")) {
            countBracketClosed++;
            expression += "(";
            temp = "";
        } else if(command.equals("Close_Bracket")) {
            if(countBracketClosed != 0) {
                expression += ")";
                countBracketClosed--;
            }
            temp = "";
        } else if(command.equals("Dot")) {
            if(expression.isEmpty()) {
                expression += "0.";
                temp += "0.";
            } else if(rpn.isSymbol(expression.charAt(expression.length()-1))) {
                expression += "";
                temp += "";
            } else {
                expression += ".";
                temp += ".";
            }
        } else if(command.equals("Clean")) {
            expression = "";
            temp = "";
        } else if(command.equals("Delete")) {
            expression = (expression.isEmpty()) ? "" : expression.substring(0, expression.length()-1);
            temp = (temp.isEmpty()) ? "" : temp.substring(0, temp.length()-1);
        } 

        viewer.updateResultField(expression);
        viewer.updateAdditionalField(temp);
    }
}