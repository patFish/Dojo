package agile.userLogin;

public interface ILogin {
	String login(String anmeldename, String passwort);

	boolean isLoginValid(String token);

	void resetPasswordWish(String email);

	void resetPasswort(String email);
}
