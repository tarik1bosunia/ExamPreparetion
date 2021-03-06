package tata.day2.inheritace;

public class Aggregation {
}

/*

Aggregation in Java

If a class have an entity reference, it is known as Aggregation. Aggregation represents HAS-A relationship.

Consider a situation, Employee object contains many informations such as id, name, emailId etc.
 It contains one more object named address, which contains its own informations such as city,
  state, country, zipcode etc. as given below.

    class Employee{
    int id;
    String name;
    Address address;//Address is a class
    ...
    }

In such case, Employee has an entity reference address, so relationship is Employee HAS-A address.

Why use Aggregation?

    For Code Reusability.

*/

class Operation{
    int square(int n){
        return n*n;
    }
}

class Circle{
    Operation op;//aggregation
    double pi=3.14;

    double area(int radius){
        op=new Operation();
        int rsquare = op.square(radius);//code reusability (i.e. delegates the method call).
        return pi*rsquare;
    }



    public static void main(String args[]){
        Circle c=new Circle();
        double result=c.area(5);
        System.out.println(result);
    }
}

/*When use Aggregation?

    Code reuse is also best achieved by aggregation when there is no is-a relationship.
    Inheritance should be used only if the relationship is-a is maintained throughout
    the lifetime of the objects involved; otherwise, aggregation is the best choice.

    Understanding meaningful example of Aggregation

    In this example, Employee has an object of Address, address object contains its own
     informations such as city, state, country etc. In such case relationship is Employee HAS-A address.
*/

class Address {
    String city,state,country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

}


class Emp {
    int id;
    String name;
    Address address;

    public Emp(int id, String name,Address address) {
        this.id = id;
        this.name = name;
        this.address=address;
    }

    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }

    public static void main(String[] args) {
        Address address1=new Address("Patgram","HAHA","Bangladesh");
        Address address2=new Address("Rajshahi","TATA","India");

        Emp e=new Emp(111,"Tarik",address1);
        Emp e2=new Emp(112,"Belal",address2);

        e.display();
        e2.display();

    }
}