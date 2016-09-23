package agile.userLogin;

public interface ILoginAdministration {

	User currentUser(String token);

	void rename(String benutzerId, String email, String nickname);

	void changePassword(String benutzerId, String passwort);

	void deleteUser(String benutzerId, String passwort);
}
