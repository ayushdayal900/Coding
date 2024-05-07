package Queue;
import java.util.*;

public class QueueUsing2Stacks {
    static class Queue {

        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        int data;

        // Queue(int data){
        //     this.data = data;
        // }

        // is empty
        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        //add   O(n)
        public static void add(int data){
            // s1 --> s2
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            } 

            // s1 push
            s1.push(data);

            //s2 --> s1
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        //remove
        public static int remove(){
            if(s1.isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return s1.pop();
        }

        //peek
        public static int peek(){
            if(s1.isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }

            return s1.peek();
        }
    
        
    }
    public static void main(String[] args) {

        Queue q = new Queue(); 
        
        q.add(0);       q.add(1);
        q.add(2);       q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
