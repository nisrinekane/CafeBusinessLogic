import java.util.ArrayList;

public class CafeUtil {

    // get streak goal
    String getStreakGoal(int numWeeks) {
        int result = 0;
        for (int i = 0; i < numWeeks; i++) {
            result += i;
        }
        return String.format("streak goal is %d", result);
    }

    // order total
    String getOrderTotal(double[] prices) {
        double total = 0;
        for (double price: prices) {
            total += price;
        }
        return String.format("total is %.2f", total);
    }

    void displayMenu(ArrayList<String> menuItems) {
        int index = 1;
        for(String item : menuItems) {
            System.out.println(index++ + ": " + item);
        }
    }

    void addCustomers(ArrayList<String> customers){
//        System.out.println("Please enter your name:");
//        String customerName = System.console().readLine();
//        System.out.println("Hello, " + customerName);
//        System.out.println("There are " + customers.size() + " people in front of you");
//        customers.add(customerName);
//        System.out.println(customers);
        String customerName = "";
        boolean isDone = false;
        while (isDone == false) {
            System.out.println("Please enter your name, press q when you're finished: ");
            customerName = System.console().readLine();
            if (customerName.equals("q")) {
                isDone= true;
            }
            int waitList = customers.size();
            System.out.println("There are " + (waitList - 1) + " people in front of you");
            System.out.println(customers);
            customers.add(customerName);
        }

    }
}