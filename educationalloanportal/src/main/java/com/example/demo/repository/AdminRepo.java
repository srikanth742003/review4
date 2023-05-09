package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AdminModel;
@Repository
public interface AdminRepo extends JpaRepository<AdminModel, String> {

}
