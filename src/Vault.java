import java.util.Random;


public class Vault {
	
	private int secretCode;
	
	Vault(){
		secretCode = new Random().nextInt(1000000);
		//secretCode = -2;
		System.out.println(secretCode);
	}
	
	Vault(int code){
		secretCode = code;
		System.out.println(secretCode);
	}
	
	boolean tryCode(int code){
		if(code==secretCode){
			return true;
		}
		else
			return false;
	}

}
