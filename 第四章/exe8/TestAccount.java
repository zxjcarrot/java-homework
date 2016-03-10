package exe8;

public class TestAccount {

	public static void main(String[] args) {
		Account account = new Account(1122, 20000, 4.5);
		account.withDraw(2500);
		account.deposit(3000);
		account.show();
	}

}
