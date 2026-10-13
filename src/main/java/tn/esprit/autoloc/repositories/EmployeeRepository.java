package tn.esprit.autoloc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
