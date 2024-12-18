package generic.dao.impl;

import generic.dao.GeneralService;
import generic.dao.PhoneDao;
import generic.database.Db;
import generic.model.Phone;

import java.util.List;

public class PhoneDaoImpl implements PhoneDao, GeneralService<Phone, Integer> {

    @Override
    public void save(Phone phone) {
        Db.phones.add(phone);
    }

    @Override
    public Phone findById(Integer integer) {
        return null;
    }

    @Override
    public boolean updateById(Integer integer, Phone phone) {
        return false;
    }

    @Override
    public String deleteById(Integer integer) {
        return "";
    }

    @Override
    public List<Phone> findAll() {
        return List.of();
    }
}
