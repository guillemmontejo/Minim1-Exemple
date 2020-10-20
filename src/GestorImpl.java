import java.util.*;

public class GestorImpl implements Gestor{

    List<Product> products;
    Queue<Order> orders;
    HashMap<String,User> users;

    public GestorImpl(){
        this.users = new HashMap<String, User>();
        this.products = new ArrayList<Product>();
        //this.orders = new Queue<Order>(15);
    }

    @Override
    public void addUser(String idUser, String name) {
        this.users.put(idUser, new User(idUser, name));
    }

    public User getUser(String idUser){
        User user = this.users.get(idUser);
        return user;
    }

    @Override
    public void addProduct(String name, String description, double prize) {
        this.products.add(new Product(name, description,prize));
    }

    @Override
    public List<Product> productsByPrize() {
        Collections.sort(this.products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int)(o1.getPrize()-o2.getPrize());
            }
        });

        return this.products;
    }

    /**
     * Order:
     * - 3 cafè amb llet
     * - 1 donut
     * - 1 xoco
     * - user: "Guille"
     * @param o
     */

    @Override
    public void addOrder(Order o) {
        this.orders.add(o);
    }

    @Override
    public Order getOrder() {
        Order o = this.orders.peek();
        process(o);
        //User user = o.getUser();
        //user.addOrder(o);
        return o;
    }

    private void process(Order o) {
        int q;
        /*
        for (Item i: o.items()){
            q = i.q;
            product = i.p;

            product.numVendes(q);
        }

         */
    }

    @Override
    public List<Order> ordersByUser(String idUser) {
        return null;
    }

    @Override
    public List<Product> productsBySales() {
        Collections.sort(this.products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int)(o1.getNumSales()-o2.getNumSales());
            }
        });

        return this.products;
    }

    public static void main(String[] args) {
        Gestor g = new GestorImpl();
        g.addUser("39401125D", "Guille");
        User u = g.getUser("39401125D");
        System.out.println(u.getName());

        g.addProduct("cafe", "aa", 1.5);
        g.addProduct("bocata pernil", "aa", 5.5);
        g.addProduct("bocata pernil dolç", "aa", 2.45);
        g.addProduct("donut", "aa", 0.5);
        g.addProduct("bocata llom formatge", "aa", 8.5);

        List<Product> llista = g.productsByPrize();
        for(Product p: llista){
            System.out.println(p);
        }
    }
}
