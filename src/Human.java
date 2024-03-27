public class Human {


    String name = "Defoult";
    int age = 25;
    int weight = 75;
    String address = null;
    String work = null;

    public Human(int age, int weight, String address, String work) {
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.work = work;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Human(String name, int age, String work) {
        this.name = name;
        this.age = age;
        this.work = work;
    }
}
