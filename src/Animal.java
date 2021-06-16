public class Animal {
    private String name;

    public String giveName(){
        return name;
    }

    public void takeName(String newName) {
        this.name = newName;
    }

    public static void main(String[] args) {
        Animal ani = new Animal();

        System.out.println(ani.giveName());
        String a = io.input("Name of the Animal: ");
        ani.takeName(a);

        System.out.println(ani.giveName());


    }
}
