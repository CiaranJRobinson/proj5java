import java.util.Scanner;
import java.util.*;

public class Balanced {
    public boolean balanced(String string) {

        String inputStr;
        int count = 0;
        int j = 0;
        char ch;
        char[] stack = new char[20];

    Scanner scanner = new Scanner(System.in);
    inputStr = scanner.nextLine();

    System.out.print("Enter string to check if it's balanced or not: \n");
    inputStr = scanner.nextLine();
    scanner.close();

    int length = inputStr.length();
        for(int i = 0; i < length; i++) {
            char current = inputStr.charAt(i);
            if(current =='(' || current =='{' || current =='[') {
                stack[j] = current;
                j++;
                count = 1;
        }else if(current == ')') {
            if(count == 1)
                j--;
                ch = stack[j];
            if(stack.length == 0 || ch != '(') {
                System.out.println("\nUnbalanced Parentheses!");
                return false;
            }
        } else if(current == '}') {
            if(count == 1)
                j--;
                ch = stack[j];
            if(stack.length == 0 || ch != '{') {
                System.out.println("\nUnbalanced Parentheses!");
                return false;
            }
        } else if(current == ']') {
            if(count == 1)
                j--;
                ch = stack[j];
            if(stack.length == 0 || ch != '[') {
                System.out.println("\nUnbalanced Parentheses!");
                return false;
            }
        }
    }
        System.out.println("\nBalanced Parentheses.");
return true;}
}
