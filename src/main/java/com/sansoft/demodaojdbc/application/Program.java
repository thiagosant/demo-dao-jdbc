package com.sansoft.demodaojdbc.application;

import com.sansoft.demodaojdbc.model.dao.DaoFactory;
import com.sansoft.demodaojdbc.model.dao.SellerDao;
import com.sansoft.demodaojdbc.model.entities.Department;
import com.sansoft.demodaojdbc.model.entities.Seller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Program {

    public static void main(String[] args) {
        SpringApplication.run(Program.class, args);

        Department obj = new Department(1, "Books");
        System.out.println(obj);

        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);

        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println(seller);
    }

}
