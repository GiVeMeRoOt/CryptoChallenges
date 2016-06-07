import java.math.BigInteger;
public class FixedXor {

	public static void main(String[] args) {
		String input1 = "1c0111001f010100061a024b53535009181c";
		String input2 = "686974207468652062756c6c277320657965";
		byte[] decodedHex1 = new byte[input1.length()/2];
		byte[] decodedHex2 = new byte[input2.length()/2];
		byte[] decodedHex3 = new byte[input2.length()/2];
		int i=0;
		while(i < input1.length())
		{
			decodedHex1[i / 2] = (byte)Integer.parseInt(input1.substring(i, i + 2),16);
			decodedHex2[i / 2] = (byte)Integer.parseInt(input2.substring(i, i + 2),16);
			decodedHex3[i / 2] = (byte)(decodedHex1[i/2]^decodedHex2[i/2]);//Xor cannot be performed on strings directly.
			i += 2;
		}
		String result = new BigInteger(1, decodedHex3).toString(16);
		System.out.println("\nThe final result is: "+result);
		System.out.println("The corresponding ascii string is: "+new String(decodedHex3));
	}
}
