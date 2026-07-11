package exercise1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import exercise1.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}