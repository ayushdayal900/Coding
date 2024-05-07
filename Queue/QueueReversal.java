package Queue;
import java.util.*;

public class QueueReversal {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();

        q.add(0);       q.add(1);
        q.add(2);       q.add(3);
        q.add(4);       q.add(5);

        while(!q.isEmpty()){
            s.push(q.remove());
        }

        while(!s.isEmpty()){
            System.out.print(s.peek());
            s.pop();
        }
    }
    
}
