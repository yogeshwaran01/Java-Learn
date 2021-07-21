package User;

import java.util.ArrayList;

class User {

    String firstName;
    String lastName;
    int age;
    ArrayList<Task> tasks = new ArrayList<>();
    ArrayList<Task> completedTasks = new ArrayList<>();

    public User (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String generateUserName() {
        return firstName + lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isValid() {
        return this.age > 18;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask (Task task) {
        tasks.remove(task);
        completedTasks.add(task);
    }

    public boolean isCompleted(Task task) {
        return completedTasks.contains(task);
    }

    public void doTask(Task task, int seconds) throws InterruptedException {
        Thread.sleep(seconds* 1000L);
        removeTask(task);
    }

}