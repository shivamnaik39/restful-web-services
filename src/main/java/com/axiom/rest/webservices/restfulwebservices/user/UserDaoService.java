package com.axiom.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();
    private static Integer userCount = 0;

    static {
        users.add(new User(++userCount, "Shivam Naik", LocalDate.now().minusYears(23)));
        users.add(new User(++userCount, "Eren Yeager", LocalDate.now().minusYears(17)));
        users.add(new User(++userCount, "Levi Ackerman", LocalDate.now().minusYears(30)));
    }

    public List<User> findAll() {
        return users;
    }

    public User findOne(Integer id) {

        Predicate<? super User> predicate = user -> user.getId().equals(id);

        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public User save(User user) {
        user.setId(++userCount);
        users.add(user);
        return user;
    }

}
