package services.Impl;

import domain.Employee;
import lombok.Setter;
import mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import services.IEmployeeService;

import java.util.List;

/**
 * @author lw
 * @version 1.0
 * @description services.Impl
 * @date 2018/6/15
 */
@Service
public class EmpoloyeeService implements IEmployeeService {
    @Autowired
    private EmployeeMapper mapper;
    @Override
    public int deleteByPrimaryKey(Long id) {


        return mapper.deleteByPrimaryKey( id );
    }

    @Override
    public int insert(Employee record) {


        return mapper.insert( record );
    }

    @Override
    public Employee selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey( id );
    }

    @Override
    public List<Employee> selectAll() {


        return mapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Employee record) {
        return mapper.updateByPrimaryKey( record );
    }

}
