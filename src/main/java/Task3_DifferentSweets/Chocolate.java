package Task3_DifferentSweets;

public class Chocolate extends DifferentSweets {
    private String type;

    public Chocolate(String name, Double weight, Double price, String type) {
        super(name, weight, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Шоколадка (" +
                super.toString() +
                ", Тип шоколада = " + type +
                ")";
    }
}
