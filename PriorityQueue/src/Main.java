import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args)
    {
        Queue<Integer> priorityQueue=new PriorityQueue<>();

        priorityQueue.add(30);
        priorityQueue.add(20);
        priorityQueue.add(10);
        priorityQueue.add(8);
        priorityQueue.add(6);
        priorityQueue.add(4);

        System.out.println("PriorityQueue"+priorityQueue);
        //result is priorityQueue[4, 8, 6, 30, 10, 20]
        // start item from lowest to heigher

        int removeElelemnt=priorityQueue.poll();

        System.out.println("RemovedElement"+removeElelemnt);
        //RemovedElement4
        System.out.println("PriorityQueue="+priorityQueue);
        //result is PriorityQueue=[6, 8, 20, 30, 10]

        int removeElelemnt1=priorityQueue.poll();
        System.out.println("RemovedElement="+removeElelemnt1);
        //RemovedElement=6
        System.out.println("PriorityQueue"+priorityQueue);
        //result is PriorityQueue[8, 20, 30, 10]

        // if priorityQueue is emply then it will show null point exception

        while(!priorityQueue.isEmpty())
        {
            int head=priorityQueue.peek();
            System.out.println("Heal element "+head);
            System.out.println("Priorty Queue"+priorityQueue);
            break;
        }

        while(!priorityQueue.isEmpty())
        {
            //int poll=priorityQueue.poll();
            System.out.println(priorityQueue.poll());

        }

    }
}