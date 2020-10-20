import java.util.LinkedList;
import java.util.List;

public class User {
    private final String idUser;
    private final String name;
    List<Order> orderList;

    public String getIdUser() {
        return idUser;
    }

    public String getName() {
        return name;
    }

    public User(String idUser, String name){
        this.idUser = idUser;
        this.name = name;
        this.orderList = new LinkedList<Order>();
    }

    public void addOrder(Order o){
        this.orderList.add(o);
    }
}
