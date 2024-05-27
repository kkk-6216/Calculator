
public class RPN {

    private Model model;

    public RPN(Model model) {
        this.model = model;
    }

    private int getPriority(char ch) {
        if(ch == '*' || ch == '/') return 3;
        else if(ch == '+' || ch == '-') return 2;
        else if(ch == '(') return 1;
        else if(ch == ')') return -1;
        else return 0;
    }

    public boolean isSymbol(char ch) {
        if(ch == '(' || ch == ')' || ch == '+' || ch == '-' || ch == '*' || ch == '/')
            return true;
        return false;
    }

    private Stack<String> getPolandNotation(String expression) {
        Stack<String> resultStack = new Stack<>();
        Stack<String> operations = new Stack<>();

        String temp = "";

        for(int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if(Character.isDigit(ch) || ch == '.') {
                temp += String.valueOf(ch);
                if(i == expression.length()-1 || (!Character.isDigit(expression.charAt(i+1)) && expression.charAt(i+1) != '.')) {
                    resultStack.push(temp);
                    temp = "";
                }
            } else if(isSymbol(ch)) {
                if(getPriority(ch) == 1) {
                    operations.push(String.valueOf(ch));
                } else if(getPriority(ch) == -1) {
                    while(getPriority(operations.lastElement().charAt(0)) != 1) {
                        resultStack.push(operations.pop());
                    }
                    operations.pop();
                } else if(getPriority(ch) > 1) {
                    while(operations.getSize() != 0){
                        if(getPriority(operations.lastElement().charAt(0)) >= getPriority(ch)) {
                            resultStack.push(operations.pop());
                        } else {
                            break;
                        }
                    }
                    operations.push(String.valueOf(ch));
                }
            }
        }

        while(!operations.isEmpty()) {
            resultStack.push(operations.pop());
        }
        return resultStack;
    }

    private String[] expressionToPostfixNotation(String expression) {
        Stack<String> stack = getPolandNotation(expression);
        String[] result = new String[stack.getSize()];

        for(int i = 0; i < result.length; i++) {
            result[i] = stack.pop();
        }

        return result;
    }

    private double resultExpression(String[] elements) {

        Stack<Double> stack = new Stack<>();
        double value;

        for(int i = elements.length-1; i > -1; i--) {
            switch(elements[i]) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    value = stack.pop();
                    stack.push(stack.pop() - value);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    value = stack.pop();
                    stack.push(stack.pop() / value);
                    break;
                default:
                    stack.push(Double.parseDouble(elements[i]));

            }
        }

        return stack.pop();
    }

    public double evalAnswer() {
        String[] res = expressionToPostfixNotation(model.getExpression());
        double result = resultExpression(res);
        return result;
    }

}