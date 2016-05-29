import java.util.Random;


public class Vault {
	
	int secretCode;
	
	Vault(){
		//secretCode = new Random().nextInt(1000000);
		secretCode = -2;
		System.out.println(secretCode);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	boolean tryCode(int code){
		if(code==secretCode){
			return true;
		}
		else
			return false;
	}

}
