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
                while (a == 0)
                {
                    System.out.println("Stack implementation\nPush - 1\nPop - 2\nPeek - 3\nIs Empty - 4\nGet Size - 5");
                    LinkedListStack LLStack = new LinkedListStack();
                    switch (scanner.nextInt()) {
                        case 1:
                            System.out.println("how many pushes?");
                            for (int i = 0; i < scanner.nextInt(); i++)
                            {
                                LLStack.pushMethod(scanner.next());
                            }
                            System.out.println("go back to the selection?\n 0 - yes\n 1 - no");
                            a = scanner.nextInt();
                            break;
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
                while (a == 0)
                {
                    System.out.println("Stack implementation\nPush - 1\nPop - 2\nPeek - 3\nIs Empty - 4\nGet Size - 5");
                    switch (scanner.nextInt()) {
                        case 1:
                    }
                }
        }
    }
}