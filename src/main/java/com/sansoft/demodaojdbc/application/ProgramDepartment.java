package com.sansoft.demodaojdbc.application;

import com.sansoft.demodaojdbc.db.DB;
import com.sansoft.demodaojdbc.model.dao.DaoFactory;
import com.sansoft.demodaojdbc.model.dao.DepartmentDao;
import com.sansoft.demodaojdbc.model.entities.Department;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class ProgramDepartment {
    public static void main(String[] args) {
        SpringApplication.run(ProgramSeller.class, args);

        Scanner input = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department findById ===");
        Department department = departmentDao.findById(3);
        System.out.println(department);

        System.out.println("\n=== TEST 2: department findAll ===");
        List<Department> list = departmentDao.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: department insert ===");
        Department newDepartment = new Department(null, "Food");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());


        System.out.println("\n=== TEST 4: department update ===");
        department = departmentDao.findById(3);
        department.setName("Pharmacy");
        departmentDao.update(department);
        System.out.println("Update completed!");

        System.out.println("\n=== TEST 5: department delete ===");
        System.out.println("Enter id for delete test: ");
        int id = input.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed!");

        DB.closeConnection();
        input.close();
    }

}
