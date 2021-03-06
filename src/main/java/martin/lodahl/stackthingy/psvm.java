package martin.lodahl.stackthingy;

import java.util.Scanner;
import jdk.nashorn.internal.runtime.ParserException;

public class psvm {

    /*  public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push(2);
        System.out.println(stack.isEmpty());
        stack.push(4);
        stack.push("Hej");
        for (int i = 0; i < 3; i++) {
            System.out.println(stack.pop());
        }
        System.out.println(stack.isEmpty());
        for (int i = 0; i < 11; i++) {
            stack.push(i);
        }
    }
    public static void main(String[] args) {
        Long[] numbers = {1l,2l,3l,5l,6l,9l};
        NumberPath np = null;
        for (int i = numbers.length-1; i > -1; i--) {
            np = new NumberPath(numbers[i], np);            
        }
        System.out.println(np.toString());
    }*/
    public static void main(String[] args) throws ParserException {
        Scanner in = new Scanner(System.in);
        //boolean isAction;
        StackPath sp = new StackPath();
        while (true) {
            String consoleInput = in.nextLine();
            if (consoleInput.equals("END")) {
                break;
            }
            String[] rawArguments = consoleInput.split(" ");
            useCalls(rawArguments, 0, sp);
            /*for (int i = 0; i < rawArguments.length; i++) {
                String rawArgument = rawArguments[i];
                isAction = false;
                switch (rawArgument) {
                    case "/":
                        sp.push(sp.pop() / sp.pop());
                        isAction = true;
                        break;
                    case "*":
                        sp.push(sp.pop() * sp.pop());
                        isAction = true;
                        break;
                    case "+":
                        sp.push(sp.pop() + sp.pop());
                        isAction = true;
                        break;
                    case "-":
                        sp.push(sp.pop() - sp.pop());
                        isAction = true;
                        break;
                }
                if (!isAction) {
                    Integer j = Integer.parseInt(rawArgument);
                    sp.push(j);
                }
            }*/
            /*Integer[] numbersToWrite = sp.peekAll();
            for (int i = 0; i < numbersToWrite.length; i++) {
                System.out.println(numbersToWrite[i]);
            } */
            NumberPath<Integer> np = sp.peekOne();
            printNodes(np); 
        }
    }

    private static void printNodes(NumberPath<Integer> np) {
        if (np ==  null) {return;}
        System.out.println(np.getFirst());
        printNodes(np.getRest());
    }
    
    private static void useCalls(String[] rawArguments, int i, StackPath sp){
        if(rawArguments.length == i){return;}  
        String rawArgument = rawArguments[i];
               boolean isAction = false;
                switch (rawArgument) {
                    case "/":
                        sp.push(sp.pop() / sp.pop());
                        isAction = true;
                        break;
                    case "*":
                        sp.push(sp.pop() * sp.pop());
                        isAction = true;
                        break;
                    case "+":
                        sp.push(sp.pop() + sp.pop());
                        isAction = true;
                        break;
                    case "-":
                        sp.push(sp.pop() - sp.pop());
                        isAction = true;
                        break;
                }
                if (!isAction) {
                    Integer j = Integer.parseInt(rawArgument);
                    sp.push(j);
                }
                useCalls(rawArguments, i+1, sp);
    }
}