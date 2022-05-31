package Task3_DifferentSweets;

public class Candy extends DifferentSweets {
    private String packaging;

    public Candy(String name, Double weight, Double price, String packaging) {
        super(name, weight, price);
        this.packaging = packaging;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    @Override
    public String toString() {
        return "Конфета (" +
                super.toString() +
                ", Упаковка = " + packaging +
                ")";
    }
}
