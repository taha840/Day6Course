package businnes.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import businnes.abstracts.JobService;
import dataAccess.abstracts.jobDao;
@Service
public class JobManager implements JobService{
	private jobDao Dao;
	@Autowired
	public JobManager(jobDao jobDao) {
		super();
		this.Dao = jobDao;
	}



	@Override
	public List<job> getAll() {
		return this.Dao.findAll();
	}

}
