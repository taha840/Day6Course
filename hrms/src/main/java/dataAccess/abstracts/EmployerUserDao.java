package dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.concretes.EmployerUser;

public interface EmployerUserDao extends JpaRepository<EmployerUser, Integer>{

}
