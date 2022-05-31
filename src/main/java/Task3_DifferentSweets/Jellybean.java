package Task3_DifferentSweets;

public class Jellybean extends DifferentSweets {
    private String form;

    public Jellybean(String name, Double weight, Double price, String form) {
        super(name, weight, price);
        this.form = form;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public String toString() {
        return "Мармелад (" +
                super.toString() +
                ", Форма = " + form +
                ")";
    }
}
