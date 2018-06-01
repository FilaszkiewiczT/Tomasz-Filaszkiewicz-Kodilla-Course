package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.facade.SearchException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFacade {

    private CompanyDao companyDao;
    private EmployeeDao employeeDao;


    public List<Company> retrieveCompaniesByAnyGivenNameFragment(final String nameFragment) throws SearchException {

        if (nameFragment.length() < 1) {
            throw new SearchException(SearchException.ERR_ZEROLETERS_STRING);
        }
        return companyDao.retrievedCompaniesByAnyGivenNameFragment("%" + nameFragment + "%");
    }

    public List<Employee> retrieveEmployeesByAnyGivenLastNameFragment(final String lastNameFragment) throws SearchException {
        if (lastNameFragment.length() < 1) {
            throw new SearchException(SearchException.ERR_ZEROLETERS_STRING);
        }
        return employeeDao.retrievedEmployeesByAnyGivenLastNameFragment("%" + lastNameFragment + "%");
    }
}
