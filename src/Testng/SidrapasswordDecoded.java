package Testng;

import org.apache.commons.codec.binary.Base64;

public class SidrapasswordDecoded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String Password = "Khansabaig@1994";
			byte[] encodedString =Base64.encodeBase64(Password.getBytes());
			System.out.println(encodedString);
	}

}
