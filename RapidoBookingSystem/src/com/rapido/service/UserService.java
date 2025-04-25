package com.rapido.service;
import com.rapido.model.User;
import java.util.ArrayList;
import java.util.List;

    public class UserService {
        private List<User> users = new ArrayList<>();

        public User register(String name, String phone, String password) {
            User user = new User(users.size() + 1, name, phone, password);
            users.add(user);
            return user;
        }

        public User login(String phone, String password) {
            for (User user : users) {
                if (user.getPhone().equals(phone) && user.getPassword().equals(password)) {
                    return user;
                }
            }
            return null;
        }
    }
}
