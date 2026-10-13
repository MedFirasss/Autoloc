package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Employee;

import java.util.List;

public interface IEmployeeService {
    Employee ajouterEmploye(Employee employe);
    Employee modifierEmploye(Employee employe);
    List<Employee> consulterEmploye();
    Employee consulterEmployeById(Long idEmploye);
    void supprimerEmployeById(Long idEmploye);
}
