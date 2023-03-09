/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author Heng Tramit
 */
public class Employee {
    private String id;
    private String name;
    private int age;
    private String gender;
    private String contact;
    private String dept;
    private double salary;
    private String email;

    public Employee(String id, String name, int age, String gender, String contact, String dept, double salary, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contact = contact;
        this.dept = dept;
        this.salary = salary;
        this.email = email;
    }
    
    // getter and setter methods for the attributes
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getContact() {
        return contact;
    }
    
    public void setContact(String contact) {
        this.contact = contact;
    }
    
    public String getDept() {
        return dept;
    }
    
    public void setDept(String dept) {
        this.dept = dept;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String[] getEmployeeData() {
        String[] data = new String[8];
        data[0] = id;
        data[1] = name;
        data[2] = String.valueOf(age);
        data[3] = gender;
        data[4] = contact;
        data[5] = dept;
        data[6] = String.valueOf(salary);
        data[7] = email;
        return data;
    }
    boolean deleteEmployeeFromFile(String employeeID) {
        try {
            // Read the existing data from the file
            File file = new File("employeelist.txt");
            StringBuilder sb;
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line = reader.readLine();
                sb = new StringBuilder();
                // Loop through each line of the file
                while (line != null) {
                    // Split the line into an array of values using ";" as the delimiter
                    String[] values = line.split(";");
                    
                    // If the ID of the current line matches the ID to be deleted, skip it
                    if (values[0].equals(employeeID)) {
                        line = reader.readLine();
                        continue;
                    }
                    
                    // Add the line to the StringBuilder object
                    sb.append(line).append("\n");
                    
                    // Read the next line of the file
                    line = reader.readLine();
                }
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write(sb.toString());
            }

            // Show a message to indicate successful deletion
            JOptionPane.showMessageDialog(null, "Employee with ID " + employeeID + " has been deleted.");
            return true;
        } catch (IOException e) {
            // Show an error message if an exception is caught
            JOptionPane.showMessageDialog(null, "Error deleting employee: " + e.getMessage());
            return false;
        }
    }
    public static ArrayList<Employee> readEmployeeFromFile() {
        ArrayList<Employee> employeeList = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader("employeelist.txt"))) {
            String line;
            while((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                String id = parts[0];
                String name = parts[1];
                int age;
                try {
                    age = Integer.parseInt(parts[2]);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid age value in file: " + parts[2]);
                    continue; // Skip this line and move on to the next one
                }
                String gender = parts[3];
                String contact = parts[4];
                String department = parts[5];
                double salary;
                try {
                    salary = Double.parseDouble(parts[6]);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid salary value in file: " + parts[6]);
                    continue; // Skip this line and move on to the next one
                }
                String email = parts[7];
                Employee e = new Employee(id, name, age, gender, contact, department, salary, email);
                employeeList.add(e);
            }
        }catch(IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading file: " + e.getMessage());
        }
        return employeeList;
    }
    public boolean updateEmployeeToFile(String employeeID, String[] newData) {
    try {
        // Read the existing data from the file
        File file = new File("employeelist.txt");
        StringBuilder sb;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();
            sb = new StringBuilder();
            // Loop through each line of the file
            while (line != null) {
                // Split the line into an array of values using ";" as the delimiter
                String[] values = line.split(";");

                // If the ID of the current line matches the ID to be updated, replace the data
                if (values[0].equals(employeeID)) {
                    sb.append(String.join(";", newData)).append("\n");
                } else {
                    // Add the line to the StringBuilder object
                    sb.append(line).append("\n");
                }

                // Read the next line of the file
                line = reader.readLine();
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(sb.toString());
        }
        // Show a message to indicate successful update
        JOptionPane.showMessageDialog(null, "Employee with ID " + employeeID + " has been updated.");
        return true;
        } catch (IOException e) {
            // Show an error message if an exception is caught
            JOptionPane.showMessageDialog(null, "Error updating employee: " + e.getMessage());
            return false;
        }
    }

    public static void writeEmployeeToFile(ArrayList<Employee> employees) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("employeelist.txt"))) {
            for (Employee e : employees) {
                writer.print(e.getId());
                writer.print(";");
                writer.print(e.getName());
                writer.print(";");
                writer.print(e.getAge());
                writer.print(";");
                writer.print(e.getGender());
                writer.print(";");
                writer.print(e.getContact());
                writer.print(";");
                writer.print(e.getDept());
                writer.print(";");
                writer.print(e.getSalary());
                writer.print(";");
                writer.print(e.getEmail());
                writer.println();
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }


    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", contact=" + contact
                + ", dept=" + dept + ", salary=" + salary + ", email=" + email + "]";
    }
}
