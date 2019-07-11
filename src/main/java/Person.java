public class Person {

    private String name;

    private Mobile mobile;

    public Person() {

    }

    public Person(String name, Mobile mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public String useMobile(String input){

        String content = this.mobile.call(input);
        if(content.length() > 30){
            return this.mobile.getName()+"'s Message:cannot be sent";
        }
        return this.mobile.call(input);

    }
}
