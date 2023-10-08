package main.java.com.demo.dp.structural.dao.example;

import java.util.Optional;

public class UserApplication {
    private static DAO<User> userDao;

    public static void main(String[] args) {
        userDao = new UserDAO();

        User user1 = getUser(0);
        userDao.update(user1, new String[]{"aahihi", "ahihi@domain.com"});

        User user4 = new User("User4", "user4@yahoo.com");
        userDao.save(user4);

        User user3 = getUser(2);
        userDao.delete(user3);

        userDao.getAll().forEach(user -> System.out.println(user.getName() + " - " + user.getEmail()));
    }

    private static User getUser(long id) {
        Optional<User> user = userDao.get(id);
        return user.orElseGet(() -> new User("non-existing user", "no-email"));
    }
}
