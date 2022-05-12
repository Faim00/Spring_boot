package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {

	@Id
	private int pid;
	@Column(name="project_name")
	private String projectName;
	
	@ManyToMany(mappedBy = "project")
	private List<Employees> emp;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Employees> getEmp() {
		return emp;
	}

	public void setEmp(List<Employees> emp) {
		this.emp = emp;
	}
	
	
}
