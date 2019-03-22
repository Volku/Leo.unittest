package volk.leo.unittest.BeanMock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import volk.leo.unittest.Employee.Employee;
import volk.leo.unittest.Employee.EmployeeRepository;
import volk.leo.unittest.BeanMock.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee getEmployeeByName(String name) {
        return employeeRepository.findByName(name);
    }
}