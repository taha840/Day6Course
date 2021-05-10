package entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_employer")
public class EmployerUser {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	int id;
	@Column(name = "website")
	String website;
	@Column(name = "email")
	String email;
	@Column(name = "phone_number")
	String phoneNumber;
	@Column(name = "password")
	String password;
	@Column(name = "company_name")
	String companyName;
	
	public EmployerUser() {
		
	}

	public EmployerUser(int id, String website, String email, String phoneNumber, String password, String companyName) {
		super();
		this.id = id;
		this.website = website;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.companyName = companyName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
	

}
