package interface_selector_mode;

public class SelectChicken implements SelectorMode {
    int sum = 0;
    int cock, hen, chicken;
    @Override
    public void howToSelect(int count) {
        for (cock = 0; cock <= count/5; cock++) {
            for (hen = 0; hen <= count/3; hen++) {
                chicken = count - cock - hen;
                if (5*cock + 3*hen + chicken/3 ==count && chicken%3==0) {
                    sum++;
                    System.out.println("公鸡："+cock+"个，母鸡："+hen+"个，小鸡："+chicken+"个");
                }
            }
        }
        System.out.println("共"+sum+"种");
    }

    public static void main(String[] args) {
        SelectChicken selectChicken = new SelectChicken();
        selectChicken.howToSelect(100);
    }
}
