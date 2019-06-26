package extend_animal;

public class Felid extends Animal {
    public Felid(String age, String weight) {
        super(age, weight);
    }

    public void call() {
        System.out.println(this.age +", "+ this.weight +"，"+"喵喵叫!");
    }
}
