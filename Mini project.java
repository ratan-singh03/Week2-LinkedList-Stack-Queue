import java.util.Stack;

public class MiniProject {

    static Stack<String> undo = new Stack<>();
    static Stack<String> redo = new Stack<>();

    public static void main(String[] args) {

        perform("Hello");
        perform("Hello World");

        undo();
        redo();
    }

    static void perform(String text) {
        undo.push(text);
        redo.clear();
        System.out.println("Current Text: " + text);
    }

    static void undo() {

        if (!undo.isEmpty()) {

            String current = undo.pop();
            redo.push(current);

            if (!undo.isEmpty())
                System.out.println("Undo: " + undo.peek());
            else
                System.out.println("Undo: Empty");
        }
    }

    static void redo() {

        if (!redo.isEmpty()) {

            String text = redo.pop();
            undo.push(text);

            System.out.println("Redo: " + text);
        }
    }
}