package com.PoliticalReddit.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//have to use it becuase we are using hibernete
@Entity
@Table(name="USER")
public class User {

	private String userName;
	// need this because hibernates needs to know whats the primary key
	@Id 
	private String email;
	private String USstate;
	private boolean isLoggedIn;
	private String password;
	private boolean isBanned;
	
	public User(String userName, String email, String uSstate, boolean isLoggedIn, String password, boolean isBanned) {
		super();
		this.userName = userName;
		this.email = email;
		this.USstate = uSstate;
		this.isLoggedIn = isLoggedIn;
		this.password = password;
		this.isBanned = isBanned;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUSstate() {
		return USstate;
	}
	public void setUSstate(String uSstate) {
		USstate = uSstate;
	}
	public boolean isLoggedIn() {
		return isLoggedIn;
	}
	public void setLoggedIn(boolean isLoggedIn) {
		this.isLoggedIn = isLoggedIn;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isBanned() {
		return isBanned;
	}
	public void setBanned(boolean isBanned) {
		this.isBanned = isBanned;
	}
	
	//remember to make post list
	
}
