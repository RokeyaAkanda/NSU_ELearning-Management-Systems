package edu.northsouth.elms.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
