package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    SearchFacade searchFacade;

    @Test
    public void testSearchFacade() throws SearchException {
        //Given
        Employee employee1 = new Employee("John", "Rambo");
        Employee employee2 = new Employee("Adam", "Sandler");
        Company company1 = new Company("BestCompany");

        company1.getEmployees().add(employee1);
        company1.getEmployees().add(employee2);
        employee1.getCompanies().add(company1);
        employee2.getCompanies().add(company1);

        companyDao.save(company1);

        //When
        List<Employee> employeesByAnyGivenLastNameFragment = searchFacade.retrieveEmployeesByAnyGivenLastNameFragment("o");
        List<Company> companiesByAnyGivenNameFragment = searchFacade.retrieveCompaniesByAnyGivenNameFragment("e");

        //Then
        Assert.assertEquals(1, employeesByAnyGivenLastNameFragment.size());
        Assert.assertEquals(1, companiesByAnyGivenNameFragment.size());

        //CleanUp
        companyDao.delete(company1);

    }
}
