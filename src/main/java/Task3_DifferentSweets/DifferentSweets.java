package Task3_DifferentSweets;

public abstract class DifferentSweets {
    private String name;
    private Double weight;
    private Double price;

    public DifferentSweets(String name, Double weight, Double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Название = " + name +
                ", Вес = " + weight +
                ", Цена = " + price;
    }
}
