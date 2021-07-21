package User;

public class Manager extends User{

    public Manager(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String generateUserName() {
        return super.generateUserName() + "man";
    }

}
