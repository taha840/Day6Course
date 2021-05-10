package dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.concretes.SystemUser;

public interface SystemUserDao extends JpaRepository<SystemUser, Integer>{

}
