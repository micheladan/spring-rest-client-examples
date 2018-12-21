package guru.springframework.api.domain.services;

import guru.springframework.api.domain.User;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);
}