package OOP.Constructor.Constructor;

/**
 * Created by Dmytro on 19.06.2015.
 */
public class Address {
    private String county;
    private String state;
    private String city;

    public Address(String county, String state, String city) {
        this.city = city;
        this.state = state;
        this.county = county;
    }

    public Address() {
    }


}

class AddressBilder {
    private String county;
    private String state;
    private String city;

    Address build() {
        return new Address(county, state, city);
    }

    public AddressBilder county(String county) {
        this.county = county;
        return this;
    }

    public AddressBilder state(String state) {
        this.state = state;
        return this;
    }

    public AddressBilder city(String city) {
        this.city = city;
        return this;
    }
}


class Main0001 {
    public static void main(String[] args) {

  /*      String s = new StringBuilder().append("age=").append(18).toString();
        System.out.println(s);
        new Address();*/

        Address address = new AddressBilder().county("US").city("NY").state("NY").build();
        System.out.println(address);

        AddressBilder addressBilder = new AddressBilder();
    }
}