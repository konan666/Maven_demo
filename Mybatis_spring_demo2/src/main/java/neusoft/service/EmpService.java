package neusoft.service;

import neusoft.domain.Emp;

import java.sql.SQLException;
import java.util.List;

/**
 * @author ：konan
 * @date ：2020/9/5 16:08
 */
public interface EmpService {
    List<Emp> findAll() throws SQLException;
    Emp findAllById(Integer id) throws SQLException;
    void save(Emp emp) throws SQLException;
    void update(Emp emp) throws SQLException;
    void delete(Integer id) throws SQLException;
}
