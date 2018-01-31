
//This is an alternative way to construct complex objects and should be used only
// when you want to build different immutable objects using same object building process.



package main.java.Builder;

//Class is made final

import java.util.Objects;

public final class User {

    //All fields are made final and private

    private final String name;
    private final int age;
    private final String address;
    private final double salary;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Double.compare(user.salary, salary) == 0 &&
                Objects.equals(name, user.name) &&
                Objects.equals(address, user.address);
    }


    private User(UserBuilder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
        this.salary = builder.salary;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }
//Inner class for doing the building process
    public static class UserBuilder{

        private final String name; //mandatory
        private final int age; //mandatory
        private  String address; //optional
        private  double salary; //optional

    //mandatory fields are instantiated in constructor
        public UserBuilder(String name, int age){
            this.name = name;
            this.age = age;
        }

        public UserBuilder address (String address){
            this.address = address;
            return  this;
        }

        public UserBuilder salary(double salary){
            this.salary = salary;
            return  this;
        }

        public User build(){
            User user = new User(this);
            return user;
        }
    }
}
