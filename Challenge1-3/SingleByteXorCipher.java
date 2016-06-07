public class SingleByteXorCipher {
	public static void main(String[] args) {
		String input = "1b37373331363f78151b7f2b783431333d78397828372d363c78373e783a393b3736";
		byte[] decodedHex = new byte[input.length()/2];
		byte[] output = new byte[input.length()/2];
		for(byte j=0 ;j<=127;j++)
		{
			int i=0;
			while(i < input.length())
			{
				decodedHex[i / 2] = (byte)Integer.parseInt(input.substring(i, i + 2),16);
	            output[i/2] = (byte)(decodedHex[i/2] ^ j); 
				i += 2;
			}
			System.out.println(j+"->Output: "+new String(output));
		}
	}

}