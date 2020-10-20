import java.util.List;

public interface Gestor {

    public void addUser(String idUser, String name);
    public User getUser(String idUser);
    public void addProduct(String name, String description, double prize);

    public List<Product> productsByPrize();
    public void addOrder(Order o);
    public Order getOrder();
    public List<Order> ordersByUser(String idUser);
    public List<Product> productsBySales();
}
