import java.util.*;

public class collector {

    // Array List

    static void arrayList() {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("bmw");
        cars.add("honda");
        cars.add("benz");

        System.out.println(cars);

        System.out.println(cars.get(2));

        cars.set(0, "audi");
        System.out.println("size: " + cars.size());
        System.out.println(cars);
        cars.remove("benz");
        cars.remove(0);
        System.out.println(cars);
    }


    // Linked List

    static void linkedList() {
        LinkedList<Integer> codes = new LinkedList<>();
        codes.addFirst(23);
        codes.addLast(45);

        System.out.println(codes);
    }

    // Hash Map

    public static void hashMap() {
        HashMap<String, Boolean> data = new HashMap<>();

        data.put("isVerified", true);
        data.put("isChecked", false);

        System.out.println(data);
        System.out.println(data.get("isChecked"));
    }

    // Hash Set

    static void hashSet() {
        HashSet<ArrayList<String>> devs = new HashSet<>();
        ArrayList<String> frontend = new ArrayList<>(Arrays.asList("html", "css", "js"));
        ArrayList<String> backend = new ArrayList<>(Arrays.asList("python", "postgres", "nginx"));

        devs.add(backend);
        devs.add(frontend);

        System.out.println(devs);
    }

    // Iterator

    static void inter() {
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("python", "java", "kotlin"));

        languages.addAll(Arrays.asList("html", "css", "js"));

        Iterator<String> it = languages.iterator();

        while (it.hasNext()) {
            System.out.println(it.next().length() + " = " + it.next());
        }

    }

    public static void main(String[] args) {
        arrayList();
        linkedList();
        hashMap();
        hashSet();
        inter();
    }



}
