import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) throws Exception {
        CafeUtil cafeApp = new CafeUtil();

        //streak goal
        System.out.println(cafeApp.getStreakGoal(10));

        //total
        System.out.println(cafeApp.getOrderTotal(new double[]{3.55, 5.49, 5.5}));

        //meu
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Latte");
        menu.add("Cold Brew");
        menu.add("Drip");
        menu.add("Cappuccino");
        menu.add("Espresso");
        cafeApp.displayMenu(menu);

        //add customer
        ArrayList<String> customers = new ArrayList<String>();
        customers.add("leah");
        customers.add("coraline");
        customers.add("emanon");
        cafeApp.addCustomers(customers);
    }
}