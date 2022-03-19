import java.util.LinkedList;
import java.util.Queue;
public class q {
        public static void main(String[] args)
        {
            Queue<Integer> qu = new LinkedList<>();

            for (int i = 0; i < 5; i++)
                qu.add(i);

            System.out.println("Elements of queue : " + qu);
            System.out.println(qu);

            int head = qu.peek();
            System.out.println("head of queue : " + head);

            int size = qu.size();
            System.out.println("Size of queue : " + size);
        }
    }

