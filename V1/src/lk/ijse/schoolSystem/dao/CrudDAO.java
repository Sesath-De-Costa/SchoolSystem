package lk.ijse.schoolSystem.dao;

import lk.ijse.schoolSystem.entity.SuperEntity;
import org.hibernate.Session;

import java.util.List;

public interface CrudDAO<T extends SuperEntity, ID> extends SuperDAO {

    public void setSession(Session session) throws Exception;

    public boolean save(T t) throws Exception;

    public boolean Delete(ID id) throws Exception;

    public boolean Update(T t) throws Exception;

    public T get(ID id) throws Exception;

    public List<T> getAll() throws Exception;
}
