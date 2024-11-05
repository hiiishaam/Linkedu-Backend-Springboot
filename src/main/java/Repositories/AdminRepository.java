package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import Models.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long>{

}
