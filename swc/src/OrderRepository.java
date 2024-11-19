import java.util.ArrayList;
import java.util.List;

public class OrderRepository {

    private List<Order> orders = new ArrayList<Order>();

    public OrderRepository() {}

    public OrderRepository(List<Order> orders) {
        this.orders = orders;
    }

    public void save(Order order) {
        if(
                order.getGuestNumber() > 0 &&
                        order.getStartsAt() <= 23 &&
                        order.getStartsAt() >= 0 &&
                        !order.getMenu().getDishes().isEmpty() &&
                        !order.getClient().getName().isBlank() &&
                        !order.getClient().getPhoneNumber().isBlank()
        ) {
            orders.add(order);
            return;
        }
        throw new IllegalArgumentException("Please, enter valid parameters.");
    }

    public Order getByClientsName(String clientsName) {
        for(Order order : orders) {
            if(order.getClient().getName().equals(clientsName)) {
                return order;
            }
        }
        throw new IllegalArgumentException("No such order found.");
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "OrderRepository{" +
                "orders=" + orders +
                '}';
    }
}
