public class Main {
    public static void main(String[] args) {
        Stack <Integer> stc=new Stack<>(5);

        stc.empty();
        stc.push(1);
        stc.pop();
        stc.push(2);
        stc.push(3);
        stc.push(4);
        stc.push(5);
        stc.print();
        stc.push(6);
        stc.pop();
        stc.search(2);
        stc.search(3);

    }

}
