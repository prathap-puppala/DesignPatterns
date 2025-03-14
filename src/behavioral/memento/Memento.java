package behavioral.memento;

// Memento: Class where we save the state
public class Memento {
    private String name;
    private int age;
    private String gender;

    public Memento(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
