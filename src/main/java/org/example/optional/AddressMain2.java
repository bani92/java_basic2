package org.example.optional;

import org.example.optional.model.Address;
import org.example.optional.model.User;

import java.util.Optional;

public class AddressMain2 {

    public static void main(String[] args) {
        User user1 = new User("user1", null);
        User user2 = new User("user2", new Address("hello street"));

        printSteet(user1);
        printSteet(user2);
    }

    private static void printSteet(User user) {
        Optional<String> userStreet = getUserStreet(user);
        userStreet.ifPresentOrElse(
                System.out::println, // 값이 있을때
                () -> System.out.println("Unknown") // 값이 없을때
        );

    }

    static Optional<String> getUserStreet(User user) {
        return Optional.ofNullable(user) // user가 null일수 있으므로
                .map(User::getAddress) // user.getAddress() 처리
                .map(Address::getStreet); // address.getStreet() 처리
        // map 체이닝 중간에 null이면 Optional.empty() 반환
    }
}
