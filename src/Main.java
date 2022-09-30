public class Main {
    public static void main(String[] args) {
        Outer o1 = new Outer(100);
        Outer.Inner in11 = o1.new Inner(10);

        in11.display();
    }
}
