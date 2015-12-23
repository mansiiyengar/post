
public class BitwiseJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=60;
		System.out.println(A + "  "+Integer.toBinaryString(A));
		
		//leftshift
		
		//every integersmax value is :max = 2147483647  1111111111111111111111111111111
		//on a bitrotation : 1 moves intothe sign bit position giving us a -2
		//-2  11111111111111111111111111111110
		//min = -2147483648  10000000000000000000000000000000
		//on one bit rotation 0 as 1 goes into sign bit
		//positive have sign bit as 0 and -ve havesign bit as 1
		int k=A << 2;
		System.out.println(k+ "  "+Integer.toBinaryString(k));
	
	int max= Integer.MAX_VALUE;
	System.out.println("max = "+max+ "  "+Integer.toBinaryString(max));
	k=max << 1;
	System.out.println(k+ "  "+Integer.toBinaryString(k));
	
	

	
	int min= Integer.MIN_VALUE;
	System.out.println("min = "+min+ "  "+Integer.toBinaryString(min));
	k=min << 1;
	System.out.println(k+ "  "+Integer.toBinaryString(k));
	
	}

}
