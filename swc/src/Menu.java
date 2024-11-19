import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<String> dishes = new ArrayList<>();

    public Menu(List<String> dishes) {
        this.dishes = dishes;
    }

    public List<String> getDishes() {
        return dishes;
    }

    public void setDishes(List<String> dishes) {
        this.dishes = dishes;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "dishes=" + dishes +
                '}';
    }
}
