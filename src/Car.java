public class Car {
    int modelYear;
    String modelName;

    public Car(int modelYear_, String modelName_) {
        modelYear = modelYear_;
        modelName = modelName_;
    }

    public String render() {
        return modelName + " : " + modelYear;
    }

    private String render_code() {
        return modelName + "code979";
    }

    public static void main(String[] args) {
        Car car = new Car(2012, "Benz");

        System.out.println(car.render());
        System.out.println(car.render_code());
    }
}
