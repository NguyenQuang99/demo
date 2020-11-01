import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServices implements CustomerService {

    private static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1,new Customer(1,"Miku Ohashi","miku@gmail.com","Nhatban"));
        customers.put(1,new Customer(2,"Honda Nanako","nanako@gmail.com","Tokyo"));
        customers.put(1,new Customer(3,"Tachibana","Tachibana@gmail.com","Haway"));
        customers.put(1,new Customer(4,"Duong Mich","mich@gmail.com","HongKong"));
        customers.put(1,new Customer(5,"Luu Dao","dao@gmail.com","Dailoan"));

    }
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(),customer);

    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id,customer);

    }

    @Override
    public void remove(int id) {
        customers.remove(id);

    }
}
