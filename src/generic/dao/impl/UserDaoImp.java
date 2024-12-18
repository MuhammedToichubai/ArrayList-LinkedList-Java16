package generic.dao.impl;

import generic.dao.GeneralService;
import generic.dao.UserDao;
import generic.database.Db;
import generic.model.Phone;
import generic.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class UserDaoImp implements UserDao, GeneralService<User, Long> {

    @Override
    public void save(User user) {
        Db.users.add(user);
    }

    @Override
    public User findById(Long id) {
        for (User user : findAll()) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        throw new NoSuchElementException("User with id: " + id + " not found!");
    }

    @Override
    public boolean updateById(Long id, User user) {
        User curentUser = findById(id);
        curentUser.setUsername(user.getUsername());
        curentUser.setPassword(user.getPassword());
        curentUser.setINN(user.getINN());
        Db.users.add(curentUser);
        return true;
    }

    @Override
    public String deleteById(Long id) {
        Db.users.remove(findById(id));
        return "Successfully deleted user with id: " + id;
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(Db.users);
    }

    @Override
    public void assignPhoneToUser(Long userId, Integer phoneId) {
        if (Db.phones.isEmpty() && Db.users.isEmpty()) throw new NoSuchElementException("Data is empty!");
        User user = findById(userId);
        Phone foundPhone = null;

        for (Phone phone : Db.phones) {
            if (phone.getId().equals(phoneId)){
                foundPhone = phone;
            }
        }
        if (foundPhone == null) throw new NoSuchElementException(String.format("Phone with id: %d not found!", phoneId));
        user.setPhone(foundPhone);

    }
}
