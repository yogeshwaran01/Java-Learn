package School;

public abstract class Person {

    String name;
    String work;
    int workingHours;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public String getWork() {
        return work;
    }
}
