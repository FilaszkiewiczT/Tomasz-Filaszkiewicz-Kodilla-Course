package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        Long softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        Long dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        Long greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(null, softwareMachineId);
        Assert.assertNotEquals(null, dataMaestersId);
        Assert.assertNotEquals(null, greyMatterId);

        //CleanUp
        companyDao.delete(softwareMachineId);
        companyDao.delete(dataMaestersId);
        companyDao.delete(greyMatterId);
    }

    @Test
    public void testFindByLastname() {
        //given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        //when
        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);
        List<Employee> employees = employeeDao.findByLastname("Smith");

        //then
        Assert.assertEquals(1, employees.size());
        Assert.assertEquals("Smith", employees.get(0).getLastname());

        //cleanup
        employeeDao.delete(johnSmith);
        employeeDao.delete(stephanieClarckson);
        employeeDao.delete(lindaKovalsky);
    }

    @Test
    public void testFindByThreeCharsPrefix() {
        //given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        //when
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);
        List<Company> companies = companyDao.findByThreeCharsPrefix("Sof");

        //then
        Assert.assertEquals(1, companies.size());
        Assert.assertEquals("Software Machine", companies.get(0).getName());

        //cleanup
        companyDao.delete(softwareMachine);
        companyDao.delete(dataMaesters);
        companyDao.delete(greyMatter);

    }

}