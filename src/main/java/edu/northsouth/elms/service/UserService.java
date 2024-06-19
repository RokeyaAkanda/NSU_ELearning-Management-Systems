package edu.northsouth.elms.service;

import edu.northsouth.elms.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
