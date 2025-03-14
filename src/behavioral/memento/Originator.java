package behavioral.memento;

// Originator: Class for which we want to save the state
public class Originator {
    private String name;
    private int age;
    private String gender;

    public Originator(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Memento save() {
        return new Memento(name, age, gender);
    }

    public void restore(Memento memento) {
        this.name = memento.getName();
        this.age = memento.getAge();
        this.gender = memento.getGender();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Gender: " + gender;
    }
}
