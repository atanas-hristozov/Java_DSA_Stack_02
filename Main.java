import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        System.out.println(stack.empty());
        stack.push("Minecraft");
        stack.push("DOOM");
        stack.push("DOTA");
        stack.push("Minecraft");
        stack.push("CSGO");
        System.out.println(stack.empty());
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        String myGame = stack.pop();
        System.out.println(myGame);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.search("DOOM"));
    }
}