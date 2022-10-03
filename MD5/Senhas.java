import java.security.*;
import java.util.Scanner;
import java.math.*;

public class Senhas {
	  public static void main (String[] args) throws Exception {
		  String senha;
		  Scanner sr = new Scanner(System.in);
		  senha=sr.nextLine();
		  MessageDigest cripto=MessageDigest.getInstance("MD5");
		  cripto.update(senha.getBytes(),0,senha.length());
		  System.out.println(new BigInteger(1,cripto.digest()).toString(16));
	  }
}
