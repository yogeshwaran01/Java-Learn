package School;

public class Student extends Person implements Human {


    @Override
    public void work() {
        System.out.println(getName() + " is " + getWork() + " for " + getWorkingHours() + " Hrs");
    }
}
