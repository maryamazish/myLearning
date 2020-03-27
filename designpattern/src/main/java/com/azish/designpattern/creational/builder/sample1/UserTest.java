package com.azish.designpattern.creational.builder.sample1;

public class UserTest {
    //All final attributes
    private String firstName; // required
    private String lastName; // required
    private int age; // optional
    private String phone; // optional
    private String address; // optional

    private UserTest(UserTestBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "UserTest{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class UserTestBuilder {
        private final String firstName;
        private final String lastName;
        private int age;
        private String phone;
        private String address;

        public UserTestBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserTestBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserTestBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserTestBuilder address(String address) {
            this.address = address;
            return this;
        }

        public UserTest buildUserTest() {
            return new UserTest(this);
        }
    }
}