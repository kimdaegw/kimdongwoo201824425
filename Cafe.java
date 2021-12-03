import java.util.HashMap;
import java.util.Iterator;

public class Cafe {
    private String name;
    private GenericList<Beverage> students = new GenericList<Beverage>();
    private HashMap<String, Beverage> menus = new HashMap<>();

    public Cafe(String name){
        this.name = name;
    }

    public Beverage findBeverage(String name, String type) {
        return menus.get(name);
    }

    public void addBeverage(Beverage newBeverage) {
        menus.put(newBeverage.getBeverageName(), newBeverage);
    }

    public void removeAllBeverage() {
        menus.clear();
    }
    @Override
    public String toString() {
        String msg = " Cafe Name: " + name + " Beverage Count: " + menus.size() + "\n";
        Iterator<Beverage> values = menus.values().iterator();
        while (values.hasNext()) {
            msg += "\t" + values.next() + "\n";
        }
        return msg;
    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cafe))
            return false;
        return name.equals(((Cafe) o).name);
    }
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + name.hashCode();
        return result;
    }
}

