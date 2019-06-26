package extend_animal;

public class Tiger extends Felid {
    public Tiger(String age, String weight) {
        super(age, weight);
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger("3岁", "50kg");
        tiger.call();
    }

}
