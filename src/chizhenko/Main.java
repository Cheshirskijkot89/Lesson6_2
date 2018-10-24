package chizhenko;

public class Main {

	public static void main(String[] args) {

		String varStr = "varStr";
		int varInt = 55;
		double varDouble = 12.345;
		
		System.out.println(ReturnString(varStr, varInt, varDouble));
			
	}
	
	static String ReturnString(String vStr, int vInt, double vDouble) {
		
		double sum = vDouble + vInt;
		
		return vStr + Double.toString(sum);
	}

}
