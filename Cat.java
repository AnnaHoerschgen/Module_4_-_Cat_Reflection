public class Cat {
    private final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void Meow() {
        System.out.println("meow :3");
    }

    public void pushGlassOffCounter() {
        System.out.println("*bats glass off counter cutely* :3");
    }

    public boolean hasBrainCell() {
        return false;
    }
}