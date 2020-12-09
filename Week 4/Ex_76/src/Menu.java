import java.util.ArrayList;

public class Menu {

    private final ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    public void addMeal(String meal) {
        if (!meals.contains(meal)) {
            meals.add(meal);
        }
    }

    public void printMeals() {
        for (String m : meals) {
            System.out.println(m);
        }
    }

    public void clearMenu() {
        meals.clear();
    }
}
    