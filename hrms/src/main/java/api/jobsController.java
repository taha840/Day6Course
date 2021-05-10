package api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import businnes.abstracts.JobService;
import entities.concretes.job;
@RestController
@RequestMapping("/api/jobs")
public class jobsController {
	private JobService jobsService;
	@Autowired
	public jobsController(businnes.abstracts.JobService jobService) {
		super();
		jobsService = jobService;
	}
	@GetMapping("/getall")
	public List<job> getAll(){
		return this.jobsService.getAll();
	}

}
