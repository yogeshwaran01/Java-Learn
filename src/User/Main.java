package User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Python", "3.9");
        user.setAge(45);
        if (user.isValid()) {
            System.out.println(user.generateUserName());
        }

        user.addTask(createNewTask("Complete Presentation"));


    }

    public static Task createNewTask (String taskName) {
        return new Task(taskName);
    }
}
