package entities.concretes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jobs")
public class job {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String jobName;
	String jobDesc;
	
	public job() {
		
	}

	public job(int id, String jobName, String jobDesc) {
		super();
		this.id = id;
		this.jobName = jobName;
		this.jobDesc = jobDesc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobDesc() {
		return jobDesc;
	}

	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}
	
	

}
