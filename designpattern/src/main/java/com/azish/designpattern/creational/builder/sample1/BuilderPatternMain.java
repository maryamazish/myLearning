//https://howtodoinjava.com/design-patterns/creational/builder-pattern-in-java/

package com.azish.designpattern.creational.builder.sample1;

public class BuilderPatternMain {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Lokesh", "Gupta")
                .age(30)
                .phone("1234567")
                .address("Fake address 1234")
                .build();


        System.out.println(user1);

        User user2 = new User.UserBuilder("Jack", "Reacher")
                .age(40)
                .phone("5655")
                //no address
                .build();

        User user22 =  new User.UserBuilder("Lokesh", "Gupta")
                .age(30)
                .phone("1234567")
                .address("Fake address 1234")
                .build();

        System.out.println(user2);

        User user3 = new User.UserBuilder("Super", "Man")
                //No age
                //No phone
                //no address
                .build();

        System.out.println(user3);

        UserTest userTest = new UserTest.UserTestBuilder("d","f").buildUserTest();

//        UserTest userTest = new UserTestBuilder("Maryam","Azish").phone("1111").createUserTest();
//        System.out.println(userTest);

    }
}
