package in.co.ManyToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {

	@Id
	private int projectId;

	@Column(name = "Project_name")
	private String projectname;

	@ManyToMany(mappedBy = "projects")
	private List<Employee> emp;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int projectId, String projectname, List<Employee> emp) {
		super();
		this.projectId = projectId;
		this.projectname = projectname;
		this.emp = emp;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

}
