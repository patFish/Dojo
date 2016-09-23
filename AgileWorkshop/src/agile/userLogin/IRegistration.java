package agile.userLogin;

public interface IRegistration {
	void register(String email, String password, String nickname);

	void validate(String registerNumber);
}
