package models;

public class AccountStatus {
	 private int statusId; // primary key
	  private String status; // not null, unique
	
	  public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
