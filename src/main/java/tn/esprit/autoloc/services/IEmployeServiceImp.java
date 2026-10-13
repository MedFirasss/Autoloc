
package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Employee;
import tn.esprit.autoloc.entities.Employee;
import tn.esprit.autoloc.repositories.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.repositories.EmployeeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class IEmployeServiceImp implements IEmployeeService {

    private final EmployeeRepository employeRepository;

    @Override
    public Employee ajouterEmploye(Employee employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employee modifierEmploye(Employee employe) {
        return employeRepository.save(employe);
    }

    @Override
    public List<Employee> consulterEmploye() {
        return employeRepository.findAll();
    }

    @Override
    public Employee  consulterEmployeById(Long idEmploye) {
        return employeRepository.findById(idEmploye).orElse(null);
    }

    @Override
    public void supprimerEmployeById(Long idEmploye) {
        employeRepository.deleteById(idEmploye);
    }
}
