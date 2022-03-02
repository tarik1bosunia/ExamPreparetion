package tata.day2.keywords;

public class ThisKeyword {
}

/*Usage of Java this keyword

Here is given the 6 usage of java this keyword.

    this can be used to refer current class instance variable.
    this can be used to invoke current class method (implicitly)
    this() can be used to invoke current class constructor.
    this can be passed as an argument in the method call.
    this can be passed as argument in the constructor call.
    this can be used to return the current class instance from the method.
*/

class Student1 {
    int rollno;
    String name;
    float fee;
    Student1(int rollno, String name, float fee){
        rollno=rollno;
        name=name;
        fee=fee;
    }




    void display(){System.out.println(rollno+" "+name+" "+fee);}
}
class TestThis1{
    public static void main(String args[]){
        Student1 s1=new Student1(111,"ankit",5000.25f);
        Student1 s2=new Student1(112,"sumit",6000.3f);
        s1.display();
        s2.display();
    }
}

/*2) this: to invoke current class method

You may invoke the method of the current class by using the this keyword. If you don't use the this keyword,
compiler automatically adds this keyword while invoking the method. Let's see the example*/


class A{
    void m(){System.out.println("hello m");}
    void n(){
        System.out.println("hello n");
//m();//same as this.m()
        this.m();
    }
}
class TestThis4{
    public static void main(String args[]){
        A a=new A();
        a.n();
    }
}

/*
    3) this() : to invoke current class constructor

    The this() constructor call can be used to invoke the current class constructor.
    It is used to reuse the constructor. In other words, it is used for constructor chaining.
*/

class AA{
    AA(){System.out.println("hello a");}
    AA(int x){
        this(10.25f);
        System.out.println(x);
    }
    AA(float n){
        System.out.println(n);
    }
}
class TestThis5{
    public static void main(String args[]){
        AA aa = new AA(10);
    }
}

class StudentCSE{
    int rollno;
    String name,course;
    float fee;
    StudentCSE(int rollno,String name,String course){
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
    StudentCSE(int rollno,String name,String course,float fee){
       // this(rollno,name,course);//reusing constructor //remove comment and check it is working fine
        this.fee=fee;
    }
    void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}
}
class TestThis7{
    public static void main(String args[]){
        StudentCSE s1=new StudentCSE(111,"ankit","java");
        StudentCSE s2=new StudentCSE(112,"sumit","java",6000f);
        s1.display();
        s2.display();
    }
}

/*
    4) this: to pass as an argument in the method

    The this keyword can also be passed as an argument in the method.
    It is mainly used in the event handling.
*/
class S2{
    void m(S2 obj){
        System.out.println("method is invoked");
    }
    void p(){
        m(this);
    }
    public static void main(String args[]){
        S2 s1 = new S2();
        s1.p();
    }
}

/*
    5) this: to pass as argument in the constructor call

    We can pass the this keyword in the constructor also.
     It is useful if we have to use one object in multiple classes.
*/
class Y{
    X obj;
    Y(X obj){
      this.obj = obj;
    }
    void display(){
        System.out.println(obj.tata);
    }
}

class X{
    int tata = 100;
    X(){
        Y y = new Y(this);
        y.display();
    }

    public static void main(String[] args) {
        X x = new X();
    }
}


/*6) this keyword can be used to return current class instance

We can return this keyword as an statement from the method.
In such case, return type of the method must be the class type (non-primitive).*/

class P{
    P getA(){
        return this;
    }
    void msg(){System.out.println("Hello java");}
}
class Test1{
    public static void main(String args[]){
        new P().getA().msg();
    }
}

/*Proving this keyword

Let's prove that this keyword refers to the current class instance variable.
 In this program, we are printing the reference variable and this, output of both variables are same.*/

class A5{
    void m(){
        System.out.println(this);//prints same reference ID
    }
    public static void main(String args[]){
        A5 obj=new A5();
        System.out.println(obj);//prints the reference ID
        obj.m();
    }
}
