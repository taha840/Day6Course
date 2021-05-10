package dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.concretes.job;

public interface jobDao extends JpaRepository<job, Integer>{

}
