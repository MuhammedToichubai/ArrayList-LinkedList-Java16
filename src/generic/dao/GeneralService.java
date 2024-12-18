package generic.dao;

import java.util.List;

public interface GeneralService<Type, ID> {
    // CRUD
    //save
    void save(Type type);

    // find by id
    Type findById(ID id);

    //update by id
    boolean updateById(ID id, Type type);

    //delete by id
    String deleteById(ID id);

    //find All
    List<Type> findAll();


}
