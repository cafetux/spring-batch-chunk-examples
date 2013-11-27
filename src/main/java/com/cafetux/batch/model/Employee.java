package com.cafetux.batch.model;

/**
 *   an employee
 */
public class Employee {


    private String firstName;
    private String lastName;
    private String sexe;
    private String email;

    public Employee(Person item) {
        this.firstName=item.getFirstName();
        this.lastName=item.getLastName();
        this.sexe=item.getSexe();
        this.email=firstName.concat(".").concat(lastName).concat("@entrepriseDomain.com");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sexe='" + sexe + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
