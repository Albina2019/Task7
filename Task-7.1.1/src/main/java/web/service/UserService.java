package web.service;

import web.dto.DTO;
import web.model.User;

import java.util.List;

public interface UserService {
    void createUser(DTO dto);

    void updateUser(User user);

    void removeUserById(long id);

    List<User> getUsers();
}
