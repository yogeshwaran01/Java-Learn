package User;

import java.util.ArrayList;

class User {

    String firstName;
    String lastName;
    int age;
    ArrayList<Task> tasks = new ArrayList<>();

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

}