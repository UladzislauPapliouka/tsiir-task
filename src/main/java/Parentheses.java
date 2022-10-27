// План 1 час
// Выполнение
import Stack.Stack;
public class Parentheses {
    public static void main(String[] args){
        Stack<Character> stack = new Stack<Character>();
        String str = "({[]})";
        for(int i = str.length()-1;i>=0;i--){
            stack.add(str.charAt(i));
            if(stack.count >= 2){
                Character char1 = stack.unshift();
                Character char2 = stack.unshift();

                if(char1 =='(' && char2==')') {}
                else if(char1 =='{' && char2=='}') {}
                else if(char1 =='[' && char2==']') {}
                else {
                    stack.add(char2);
                    stack.add(char1);
                }
            }
        }
        System.out.println(stack.isEmpty());
    }
}
