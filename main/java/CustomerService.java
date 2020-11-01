import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    void add(Customer customer);

    void save(Customer customer);

    Customer finId(int id);

    void remove(int id);

    void update(int id, Customer customer);
}
