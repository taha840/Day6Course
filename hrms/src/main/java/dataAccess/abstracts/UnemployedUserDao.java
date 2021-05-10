package dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.concretes.UnemployedUser;

public interface UnemployedUserDao extends JpaRepository<UnemployedUser, Integer>{

}
