package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NamedNativeQueries({
        @NamedNativeQuery(
                name = "Company.findByThreeCharsPrefix",
                query = "SELECT * FROM COMPANY" +
                        " WHERE SUBSTRING(COMPANY_NAME, 1, 3) = :PREFIX",
                resultClass = Company.class
        ),
        @NamedNativeQuery(
                name = "Company.retrievedCompaniesByAnyGivenNameFragment",
                query = "SELECT * FROM companies" +
                        " WHERE COMPANY_NAME LIKE :NAMEFRAGMENT",
                resultClass = Company.class
        )
})
@Entity
public class Company {
    @Id
    @GeneratedValue
    @Column(name = "COMPANY_ID")
    private Long id;
    @NotNull
    @Column(name = "COMPANY_NAME")
    private String name;
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    private List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private void setId(Long id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}