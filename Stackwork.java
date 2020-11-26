import java.util.Stack;

public class Stackwork {
    public static void stackPush(Stack stc,int item)
    {
        stc.push(item);
        System.out.println("Pushed item: "+item);
    }
    public static void stackPop(Stack stc)
    {
        System.out.println("Popped item: "+(Integer) stc.pop());

    }
    public static void stackPeek(Stack stc)
    {
        Integer item = (Integer) stc.peek();
        System.out.println("Stack top item: " + item);
    }
    public static void stackSearch(Stack stc, int item)
    {
        Integer pos = (Integer) stc.search(item);

        if(pos == -1){
            System.out.println("Item "+ item +" is not found ");
        }
        else{
            System.out.println("Item "+ item +" is found at: " + pos);
        }
    }

    public static void stackEmpty(Stack stc){
        System.out.println("Stack is empty: "+stc.empty());
    }

}
