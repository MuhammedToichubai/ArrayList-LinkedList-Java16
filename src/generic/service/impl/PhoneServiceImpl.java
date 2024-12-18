package generic.service.impl;

import generic.dao.GeneralService;
import generic.dao.impl.PhoneDaoImpl;
import generic.model.Phone;
import generic.service.PhoneService;

import java.util.List;

public class PhoneServiceImpl implements PhoneService, GeneralService<Phone, Integer> {
    private PhoneDaoImpl phoneDao = new PhoneDaoImpl();
    @Override
    public void save(Phone phone) {
        phoneDao.save(phone);
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
