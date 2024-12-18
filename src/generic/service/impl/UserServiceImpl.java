package generic.service.impl;

import generic.dao.GeneralService;
import generic.dao.impl.UserDaoImp;
import generic.model.User;
import generic.service.UserService;

import java.util.List;
import java.util.NoSuchElementException;

public class UserServiceImpl implements UserService, GeneralService<User, Long> {
    private final UserDaoImp userDao = new UserDaoImp();

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public User findById(Long id) {
        try {
            if (userDao.findAll().isEmpty()) throw new NoSuchElementException("User not found");

            for (User user : userDao.findAll()) {
                if (user.getId().equals(id)) {
                    return user;
                }
            }
            throw new NoSuchElementException("User not found!");

        } catch (NoSuchElementException e) {
            System.err.println(e.getMessage());
        }
        return null;

    }

        @Override
        public boolean updateById (Long id, User user){
            boolean isSaved = false;
            try {
                isSaved = userDao.updateById(id, user);
            } catch (NoSuchElementException e) {
                System.err.println(e.getMessage());
            }
            return isSaved;
        }

        @Override
        public String deleteById (Long id){
            String isSaved = "Not Saved";
            try {
                isSaved = userDao.deleteById(id);
            } catch (NoSuchElementException e) {
                System.out.println(e.getMessage());
            }
            return isSaved;
        }

        @Override
        public List<User> findAll () {
            return userDao.findAll();
        }

        @Override
        public boolean assignPhoneToUser (Long userId, Integer phoneId){
            boolean success = false;
            try {
                userDao.assignPhoneToUser(userId, phoneId);
                success = true;
            } catch (NoSuchElementException e) {
                System.err.println(e.getMessage());
            }
            return success;
        }
    }
