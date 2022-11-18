package model;

public class User {

	private int eid;
	private String ename, doj, yoe, designation;
	
	public User(){}

	public User(String ename, String doj, String yoe, String designation) {
		super();
		this.ename = ename;
		this.doj = doj;
		this.yoe = yoe;
		this.designation = designation;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getYoe() {
		return yoe;
	}

	public void setYoe(String yoe) {
		this.yoe = yoe;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	
	
}
