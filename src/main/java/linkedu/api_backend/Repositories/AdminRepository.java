package linkedu.api_backend.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import linkedu.api_backend.Models.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long>{

}
