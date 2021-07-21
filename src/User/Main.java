package User;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        User user = new User("Python", "3.9");
        user.setAge(45);
        if (user.isValid()) {
            System.out.println(user.generateUserName());
        }
        Task task =  createNewTask("Complete Presentation");
        user.addTask(task);

        user.doTask(task, 5);

        if (user.isCompleted(task)) {
            System.out.println("Pay 34550");
        } else {
            System.out.println("Fired");
        }

        Manager manager = new Manager("Joker", "to");
        manager.setAge(45);

        Task task1 = new Task("Manage the Project");

        manager.addTask(task1);

        manager.doTask(task1, 2);

        System.out.println(manager.generateUserName() + " completed the task");

    }

    public static Task createNewTask (String taskName) {
        return new Task(taskName);
    }
}
