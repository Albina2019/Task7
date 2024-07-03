package web.dao;

import web.dto.DTO;
import web.model.User;

import java.util.List;

public interface UserDao {
    void createUser(User user);

    void updateUser(User user);

    void removeUserById(long id);

    List<User> getUsers();
}
