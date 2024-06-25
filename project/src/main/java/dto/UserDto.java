package dto;

import java.io.Serializable;


public class UserDto implements Serializable{
	private String UserName;
	private String Name;
	private String Password;
	private String CheckPass;
	
	public UserDto() {
		// TODO Auto-generated constructor stub
	}
	
	public UserDto(String userName, String name, String password, String checkPass) {
		super();
		UserName = userName;
		Name = name;
		Password = password;
		CheckPass = checkPass;
	}

	public UserDto(String userName, String name, String password) {
		super();
		UserName = userName;
		Name = name;
		Password = password;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getCheckPass() {
		return CheckPass;
	}

	public void setCheckPass(String checkPass) {
		CheckPass = checkPass;
	}
	

}
