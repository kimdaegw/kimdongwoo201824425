public class Beverage {
    private String type;
    private String name;

    public Beverage(String name,String type){
        this.name = name; this.type=type;
    }

    public String getBeverageName(){
        return name;
    }

    public String getBeverageType(){
        return type;
    }

    @Override
    public String toString(){
        return String.format("[%s, %s]\n", getBeverageName(), getBeverageType());
    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Beverage))
            return false;
        return name.equals(((Beverage) o).name)&&type.equals(((Beverage) o).type);
    }
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + name.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }
}
