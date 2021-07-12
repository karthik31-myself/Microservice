package com.example.AdminSys.repository;

import com.example.AdminSys.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Long> {

   Admin findAdminById(Long id);

   Admin findAdminByEid(Long id);

   //Admin findAdminById(String empid);
}
