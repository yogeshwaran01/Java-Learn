package School;

public class Teacher extends Person implements Human{

    @Override
    public void work() {
        System.out.println("Teaching");
    }
}
