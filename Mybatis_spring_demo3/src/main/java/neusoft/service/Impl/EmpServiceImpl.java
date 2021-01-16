package neusoft.service.Impl;

import neusoft.dao.EmpDao;
import neusoft.domain.Emp;
import neusoft.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * @author ：konan
 * @date ：2020/9/5 16:08
 */
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    EmpDao dao;
    @Override
    public List<Emp> findAll() throws SQLException {
        return dao.findAll();
    }

    @Override
    public Emp findAllById(Integer id) throws SQLException {
        return dao.findAllById(id);
    }

    @Override
    public void save(Emp emp) throws SQLException {
   dao.save(emp);
    }

    @Override
    public void update(Emp emp) throws SQLException {
   dao.update(emp);
    }

    @Override
    public void delete(Integer id) throws SQLException {
dao.delete(id);
    }
}
