
public class Order {

    private Client client;
    private Menu menu;
    private double startsAt;
    private int guestNumber;

    public Order(int guestNumber, double startsAt, Menu menu, Client client) {
        this.guestNumber = guestNumber;
        this.startsAt = startsAt;
        this.menu = menu;
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public double getStartsAt() {
        return startsAt;
    }

    public void setStartsAt(double startsAt) {
        this.startsAt = startsAt;
    }

    public int getGuestNumber() {
        return guestNumber;
    }

    public void setGuestNumber(int guestNumber) {
        this.guestNumber = guestNumber;
    }

    @Override
    public String toString() {
        return "Order{" +
                "client=" + client +
                ", menu=" + menu +
                ", startsAt=" + startsAt +
                ", guestNumber=" + guestNumber +
                '}';
    }
}
