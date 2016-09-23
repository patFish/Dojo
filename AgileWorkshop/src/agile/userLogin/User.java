package agile.userLogin;

import java.time.LocalTime;

public class User {

	String id;
	String eMail;
	String nickName;
	LocalTime registryDate;
	LocalTime lastLogin;
	LocalTime lastChangeOfUserPrefernces;

	public User() {
		this.registryDate = LocalTime.now();
	}

	public void setId(String userId) {
		this.id = userId;
	}

	public String getEmail() {
		return eMail;
	}

	void setEmail(String eMail) {
		this.eMail = eMail;
	}

	public String getNickName() {
		return nickName;
	}

	void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public LocalTime getRegistryDate() {
		return registryDate;
	}

	private void setRegistryDate(LocalTime registryDate) {
		this.registryDate = registryDate;
	}

	public LocalTime getLastLogin() {
		return lastLogin;
	}

	private void setLastLogin(LocalTime lastLogin) {
		this.lastLogin = lastLogin;
	}

	public LocalTime getLastChangeOfUserPrefernces() {
		return lastChangeOfUserPrefernces;
	}

	private void setLastChangeOfUserPrefernces(LocalTime lastChangeOfUserPrefernces) {
		this.lastChangeOfUserPrefernces = lastChangeOfUserPrefernces;
	}

	public String getId() {
		return id;
	}

}
