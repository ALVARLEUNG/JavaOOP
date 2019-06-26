package extend_animal;

public class Animal {
    public String age;
    public String weight;

    public Animal(String age, String weight) {
        this.age = age;
        this.weight = weight;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void eat() {
        System.out.println("吃东西！");
    }

    public void run() {
        System.out.println("奔跑！");
    }
}
