import java.util.Base64;
//import javax.xml.bind.DatatypeConverter;

public class HexToBase64 {
		
	public static void main(String[] args) {
		String hex = new String("49276d206b696c6c696e6720796f757220627261696e206c696b65206120706f69736f6e6f7573206d757368726f6f6d");
		byte[] decodedHex = new byte[hex.length()/2]; //Making a byte array of length/2 because two hex is converted to one ascii
		int i=0;
		while(i < hex.length())
		{
			decodedHex[i / 2] = (byte)Integer.parseInt(hex.substring(i, i + 2),16);
             i += 2;
		}
		System.out.println("The decoded hex string is: "+new String(decodedHex));
		//String res = DatatypeConverter.printBase64Binary(decodedHex);
		String res = Base64.getEncoder().withoutPadding().encodeToString(decodedHex); //Converting a byte array to base64.
		System.out.println("Base64 encoded string is: "+res);
	}

}
//A different method is also shown which is commented out.