package interface_selector_mode;

public class SelectVehicle implements SelectorMode {
    @Override
    public void howToSelect(int count) {
        System.out.println("可以选择：");
        if (count <1000) {
            if (count<300) {
                System.out.println("走路！");
            }
            if (count>=300 && count<400) {
                System.out.println("大巴！");
            }
            if (count>=400 && count<500) {
                System.out.println("大巴或火车！");
            }
            if (count>=500 && count<1000) {
                System.out.println("大巴、火车、自驾！");
            }
        }else {
            System.out.println("随便选！");
        }
    }
    public static void main(String[] args) {
        SelectVehicle selectVehicle = new SelectVehicle();
        selectVehicle.howToSelect(500);
    }
}
