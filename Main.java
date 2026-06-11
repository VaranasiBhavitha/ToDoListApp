import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Task> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== TO-DO LIST =====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Complete Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter task: ");
                    String taskName = sc.nextLine();
                    tasks.add(new Task(taskName));
                    System.out.println("Task Added!");
                    break;

                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No Tasks Available.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter task number: ");
                    int complete = sc.nextInt();
                    if (complete > 0 && complete <= tasks.size()) {
                        tasks.get(complete - 1).markCompleted();
                        System.out.println("Task Completed!");
                    } else {
                        System.out.println("Invalid Task Number!");
                    }
                    break;

                case 4:
                    System.out.print("Enter task number: ");
                    int delete = sc.nextInt();
                    if (delete > 0 && delete <= tasks.size()) {
                        tasks.remove(delete - 1);
                        System.out.println("Task Deleted!");
                    } else {
                        System.out.println("Invalid Task Number!");
                    }
                    break;

                case 5:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
