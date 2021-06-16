abstract public class HumanBody {
    String bloodGroup;
    double weight;
    double height;

    public double calculateBmi() {
        return weight * height;
    }

    abstract public int heartBeat();

    public int pulse() {
       return heartBeat() * 34;
    }

    public void walk() {
        System.out.println("Walking ");
    }
}

class Male extends HumanBody {

    int hairLength = 3;

    @Override
    public int heartBeat() {
        return (int) (weight * height);
    }

    public void walk() {
        System.out.println("Walk like men");
    }
}

class Female extends HumanBody {

    int hairLength = 3;

    @Override
    public int heartBeat() {
        return (int) (weight * height) / 2;
    }
}

class he extends Male {
    String name;
    int hairLength = super.hairLength * 2;

    public he(String name_ ,String bloodGroup_, double weight_, double height_) {
        bloodGroup = bloodGroup_;
        weight = weight_;
        height = height_;
        name = name_;
    }
}

class she extends Female {
    String name;

    public she(String name_, String bloodGroup_, double weight_, double height_) {
        bloodGroup = bloodGroup_;
        weight = weight_;
        height = height_;
        name = name_;
    }
}

class run{
    public static void main(String[] args) {
        he vijay = new he("Python", "O", 34.5, 143);
        System.out.println(vijay.calculateBmi());
        System.out.println(vijay.pulse());
        System.out.println(vijay.heartBeat());
        System.out.println(vijay.hairLength);

        vijay.walk();

        she priya = new she("Python", "O", 34.5, 143);
        System.out.println(priya.calculateBmi());
        System.out.println(priya.pulse());
        System.out.println(priya.heartBeat());
    }
}