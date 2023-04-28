import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)

    {
        int a = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Stack (on LinkedList) - 1\nQueue (on ArrayList) - 2");
        int n = scanner.nextInt();
        switch (n)
        {
            case 1:
                    LinkedListStack<String> LLStack = new LinkedListStack<>();
                    System.out.println("how many pushes?");
                    int case1 = scanner.nextInt();
                    for (int i = 0; i < case1; i++)
                    {
                        LLStack.pushMethod(scanner.next());
                    }
                    while (a == 0) {
                        System.out.println("Stack implementation\nPop - 2\nPeek - 3\nIs Empty - 4\nGet Size - 5");
                        switch (scanner.nextInt()) {
                            case 2:
                                LLStack.popMethod();
                                System.out.println("go back to the selection?\n 0 - yes\n 1 - no");
                                a = scanner.nextInt();
                                break;
                            case 3:
                                LLStack.peekMethod();
                                System.out.println("go back to the selection?\n 0 - yes\n 1 - no");
                                a = scanner.nextInt();
                                break;
                            case 4:
                                LLStack.isEmpty();
                                System.out.println("go back to the selection?\n 0 - yes\n 1 - no");
                                a = scanner.nextInt();
                                break;
                            case 5:
                                LLStack.getSize();
                                System.out.println("go back to the selection?\n 0 - yes\n 1 - no");
                                a = scanner.nextInt();
                                break;
                        }
                    }
            case 2:
                ArrayListQueue<Integer> ALQueue = new ArrayListQueue<>();
                System.out.println("how many queues?");
                int case2 = scanner.nextInt();
                for (int i = 0; i < case2; i++)
                {
                    ALQueue.enqueue(scanner.nextInt());
                }
                while (a == 0)
                {
                    System.out.println("Queue implementation\nDequeue - 2\nPeek - 3\nIs Empty - 4\nGet Size - 5");
                    switch (scanner.nextInt())
                    {
                        case 2:
                            ALQueue.dequeue();
                            System.out.println("go back to the selection?\n 0 - yes\n 1 - no");
                            a = scanner.nextInt();
                            break;
                        case 3:
                            ALQueue.peek();
                            System.out.println("go back to the selection?\n 0 - yes\n 1 - no");
                            a = scanner.nextInt();
                            break;
                        case 4:
                            if (ALQueue.isEmpty())
                            {
                                System.out.println("Empty");
                            } else
                                System.out.println("Not Empty");
                            System.out.println("go back to the selection?\n 0 - yes\n 1 - no");
                            a = scanner.nextInt();
                            break;
                        case 5:
                            ALQueue.getSize();
                            System.out.println("go back to the selection?\n 0 - yes\n 1 - no");
                            a = scanner.nextInt();
                            break;
                    }
                }
        }
    }
}