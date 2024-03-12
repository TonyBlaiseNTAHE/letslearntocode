package models;

import java.util.Scanner;

public class Employee {

    private int id; 
    private String name;
    private String department;
    private String position;
    private int salary;
    private String contactInfo;
    private String address;
    private String superVisor;
    private String workingHours;

    /*public Employee(int id, String name, String department, String position, String salary, String contactInfo, String address, String superVisor, String workingHours) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.position = position;
        this.salary = salary;
        this.contactInfo = contactInfo;
        this.address = address;
        this.superVisor = superVisor;
        this.workingHours = workingHours;
    }*/
    public  void setId(int id) {
        this.id = id;
    }
    public int getId(int id) {
        return this.id;
    }
    public  void setName(String name) {
        this.name = name;
    }
    public String getName(String name) {
        return this.name;
    }
    public  void setPosition(String position) {
        this.position = position;
    }
    public String getPosition(String  position) {
        return this.position;
    }
    public  void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment(String department) {
        return this.department;
    }
    public  void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary(int salary) {
        return this.salary;
    }
    public  void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
    public String getId(String contactInfo) {
        return this.contactInfo;
    }
    public  void setAddress(String address) {
        this.address = address;
    }
    public String getAddress(String address) {
        return this.address;
    }
    public  void setSuperVisor(String superVisor){
        this.superVisor = superVisor;
    }
    public String getSuperVisor(String superVisor) {
        return this.superVisor;
    }
    public  void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }
    public String getWorkingHours(String workingHours) {
        return this.workingHours;
    }
    public void addEmloyee(){

    }
    public void deleteEmployee(){

    }
    public void updateEmloyee(){

    }
    public void getAllEmloyee(){

    }
    public void retrieveEmloyee(){

    }
}