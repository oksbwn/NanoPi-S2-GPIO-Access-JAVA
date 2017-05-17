package gpioAccess_NanoPi;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte range=(byte) 0x01;

		String s2 = String.format("%8s", Integer.toBinaryString(range & 0xFF)).replace(' ', '0');
		System.out.println(s2); 
		range=(byte) (range << 3);
		byte temp=(byte) (range & 0x0C);

		s2 = String.format("%8s", Integer.toBinaryString(temp & 0xFF)).replace(' ', '0');
		System.out.println(s2); 
		
	}

}
