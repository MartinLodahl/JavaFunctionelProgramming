
package martin.lodahl.stackthingy;

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
    }*/
    public static void main(String[] args) {
        Long[] numbers = {1l,2l,3l,5l,6l,9l};
        NumberPath np = null;
        for (int i = numbers.length-1; i > -1; i--) {
            np = new NumberPath(numbers[i], np);            
        }
        System.out.println(np.toString());
    }
}
