public class JamesBond {

	public static void main(String[] args) {
		Vault vault = new Vault();
		crackVault(vault);
		vault = new Vault(-2);
		crackVault(vault);

	}

	private static void crackVault(Vault vault) {
		int codeFound = new JamesBond().tryCode(vault);
		if (codeFound == -1) {
			System.out.println("The secret code could not be cracked");
		} else {
			System.out.println("The secret code is " + codeFound);
		}
	}

	int tryCode(Vault v) {
		for (int i = 0; i < 1000000; i++) {
			// System.out.println("Trying " + i);
			if (v.tryCode(i)) {
				return i;
			}
		}
		return -1;
	}
}
