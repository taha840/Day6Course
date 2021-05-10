package entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_unemployed")
public class UnemployedUser {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	@Column(name = "id")
	int id;
	@Column(name = "first_name")
	String firstname;
	@Column(name = "last_name")
	String lastname;
	@Column(name = "national_identity")
	String nationalIdentity;
	@Column(name = "email")
	String email;
	@Column(name = "password")
	String password;
	@Column(name = "birth_date")
	Date birthDate;
	
	public UnemployedUser() {
		
	}

	public UnemployedUser(int id, String firstname, String lastname, String nationalIdentity, String email,
			String password, Date birthDate) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.nationalIdentity = nationalIdentity;
		this.email = email;
		this.password = password;
		this.birthDate = birthDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	

}
