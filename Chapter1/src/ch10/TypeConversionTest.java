package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {
		byte bNum = 125;
		int iNum = bNum;
		
		System.out.println(iNum);

		int iNum2 = 255;
		byte bNum2 = (byte)iNum2;
		
		System.out.println(bNum2);
		
	}

}
