package neusoft.dao;

import neusoft.domain.Emp;

import java.sql.SQLException;
import java.util.List;

/**
 * @author ：konan
 * @date ：2020/9/5 15:59
 */
public interface EmpDao {
    List<Emp> findAll() throws SQLException;
    Emp findAllById(Integer id) throws SQLException;
    void save(Emp emp) throws SQLException;
    void update(Emp emp) throws SQLException;
    void delete(Integer id) throws SQLException;
}
