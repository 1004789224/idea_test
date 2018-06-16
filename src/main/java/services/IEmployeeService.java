package services;

import domain.Employee;

import java.util.List;

/**
 * @author lw
 * @version 1.0
 * @description services
 * @date 2018/6/15
 */
public interface IEmployeeService {
    int deleteByPrimaryKey(Long id);

    int insert(Employee record);

    Employee selectByPrimaryKey(Long id);

    List<Employee> selectAll();

    int updateByPrimaryKey(Employee record);
}
