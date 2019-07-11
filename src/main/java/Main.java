public class Main {

    public static void main(String[] args) {

        Mobile mobile = new Mobile("mobile","blue","nokia");
        Iphone iphone = new Iphone("iphoneXS","yellow","apple");
        Andriod andriod = new Andriod("mi","black","andiod");

        System.out.println(mobile.call("hello"));
        System.out.println(iphone.call("hello"));
        System.out.println(andriod.call("hello"));
        System.out.println("=================");

        System.out.println(iphone.toString());
        System.out.println(andriod.toString());

        Person person = new Person("Leo",iphone);
        System.out.println(person.useMobile("hello"));

        Person person2 = new Person("John",andriod);
        System.out.println(person2.useMobile("hello"));
        System.out.println("=================");


        IPhoneRobot iPhoneRobot = new IPhoneRobot();
        System.out.println(iPhoneRobot.useMobile(iphone,"hello"));
        System.out.println("=================");

        person.setMobile(andriod);
        System.out.println(person.useMobile("hello"));

    }


}
