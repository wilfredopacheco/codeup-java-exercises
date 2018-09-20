import javax.swing.*;

public class MethodsExercises {

    public static void main(String[] args) {

        double firstNum, secondNum, result;

        String input = JOptionPane.showInputDialog("Enter the operation you would like to perform:");
        String plus = "+";
        String neg = "-";
        String div = "/";
        String mul = "*";
        String mod = "%";
        int len = input.length();

        if (input.contains(plus) || input.contains(neg) || input.contains(div) || input.contains(mul) || input.contains(mod)) {
            int operatorIndex;
            int str1, str2;
            if (input.contains("+")) {
                operatorIndex = input.indexOf('+');
                str1 = (operatorIndex-1);
                str2 = (operatorIndex+1) + str1;
                firstNum = getDouble(input, 0, str1);
                secondNum = getDouble(input, str2, len);
                show(input, getAdd(firstNum,secondNum));
            }
            if (input.contains("-")) {
                operatorIndex = input.indexOf('-');
                str1 = (operatorIndex-1);
                str2 = (operatorIndex+1) + str1;
                firstNum = getDouble(input, 0, str1);
                secondNum = getDouble(input, str2, len);
                show(input, getSub(firstNum,secondNum));
            }
            if (input.contains("*")) {
                operatorIndex = input.indexOf('*');
                str1 = (operatorIndex-1);
                str2 = (operatorIndex+1) + str1;
                firstNum = getDouble(input, 0, str1);
                secondNum = getDouble(input, str2, len);
                show(input, getMul(firstNum,secondNum));
            }
            if (input.contains("/")) {
                operatorIndex = input.indexOf('/');
                str1 = (operatorIndex-1);
                str2 = (operatorIndex+1) + str1;
                firstNum = getDouble(input, 0, str1);
                secondNum = getDouble(input, str2, len);
                show(input, getDiv(firstNum,secondNum));
            }
            if (input.contains("%")) {
                operatorIndex = input.indexOf('%');
                str1 = (operatorIndex-1);
                str2 = (operatorIndex+1) + str1;
                firstNum = getDouble(input, 0, str1);
                secondNum = getDouble(input, str2, len);
                show(input, getMod(firstNum,secondNum));
            }
        }
        System.exit(0);
    }
    static void show (String input, double result){
        JOptionPane.showMessageDialog(null,"The answer to " + input + " = " + result);
    }
    static double getDouble(String str, int start, int end){

        String result = str.substring(start,end);
        double val1 = Double.parseDouble(result);
        return val1;
    }
    static double getAdd(double num1, double num2) {

        double result = num1 + num2;
        return result;
    }
    static double getSub(double num1, double num2) {

        double result = num1 - num2;
        return result;
    }
    static double getMul(double num1, double num2) {

        double result = num1 * num2;
        return result;
    }
    static double getDiv(double num1, double num2) {
        double result;
        if (num2 != 0){
            result = num1 / num2;
            return result;
        }
            result = 0;
            return result;
    }
    static double getMod(double num1, double num2) {
        double result = num1 % num2;
        return result;
    }
}

