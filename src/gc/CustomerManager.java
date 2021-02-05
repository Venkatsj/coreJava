package gc;

import java.util.ArrayList;
import java.util.UUID;

public class CustomerManager {

    public static ArrayList<Customer> list = new ArrayList<>();

    public static void addCustomer(){
        UUID id = new UUID(1, 100);
        list.add(new Customer(id.toString()));
    }

    public static int getCount(){
        return list.size();
    }

}
