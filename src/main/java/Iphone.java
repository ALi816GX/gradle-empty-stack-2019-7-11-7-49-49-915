public class Iphone extends Mobile {

    public Iphone(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public String call(String input) {
        return super.name+"'s Message : " + input;
    }


    @Override
    public String toString() {
        return "Iphone{" +
                "name:'" + name + '\'' +
                ", color:'" + color + '\'' +
                ", brand:'" + brand + '\'' +
                "} " + super.toString();
    }
}
