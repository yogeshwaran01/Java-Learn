abstract class Maker {
    String name_;
    String school_;

    abstract String render();

    public String renderEncode() {
        return "#" + render();
    }
}

class Student extends Maker {
    Teacher teacher_;

    public Student(String name, String school, Teacher teacher) {
        name_ = name;
        school_ = school;
        teacher_ = teacher;
    }

    @Override
    String render() {
        return name_ + " at " + school_ + " and " + teacher_.name_ + " is the teacher of him";
    }
}

class Teacher extends Maker {

    public Teacher(String name, String school) {
        name_ = name;
        school_ = school;
    }

    @Override
    String render() {
        return name_ + " at " + school_;
    }
}

class Runner {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("china", "china hrs school");
        Student student = new Student("Covid", "china hrs school", teacher);

        System.out.println(teacher.renderEncode());
        System.out.println(student.renderEncode());

    }
}

