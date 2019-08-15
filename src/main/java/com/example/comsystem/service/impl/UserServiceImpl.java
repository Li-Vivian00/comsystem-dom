package com.example.comsystem.service.impl;

import com.example.comsystem.dao.UserDao;
import com.example.comsystem.entity.User;
import com.example.comsystem.repository.UserRepository;
import com.example.comsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    UserDao userDao;
    @Override
    public List<User> searchUser() {
        return userRepository.findAll();
    }

    @Override
    public User searchById(String i) {
        Optional<User> result = userRepository.findById(i);
        return result.get();
    }

    @Override
    public List<User> searchByName(String item, String name) {

        return userDao.searchByName(item, name);
    }

    @Override
    public String userLoginService(User user) {
        String loginid = user.getLoginid();
        String password = user.getPassword();
        List<User> listUser = userRepository.findByUserLoginid(loginid);
        User result = userRepository.userLoginRep(loginid, password);
        if (listUser.size() < 0) {
            return "-1";
        }
        else if (result == null) {
            return "0";
        }
        else {
            return "success";
        }
    }


}
