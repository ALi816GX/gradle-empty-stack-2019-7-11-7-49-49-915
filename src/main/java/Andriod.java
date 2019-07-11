public class Andriod  extends Mobile {


    public Andriod(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public String call(String input) {
        return super.name+"'s Message : " + input;
    }

    @Override
    public String toString() {
        return "Andriod{" +
                "name:'" + name + '\'' +
                ", color:'" + color + '\'' +
                ", brand:'" + brand + '\'' +
                '}';
    }

}
