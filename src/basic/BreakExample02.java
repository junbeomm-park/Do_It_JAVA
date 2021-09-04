package basic;

public class BreakExample02 {

	public static void main(String[] args) {
		int num;
		int sum =0;
		for(num = 1; ; num++) {
			sum+= num;
			if(sum>=500)
				break;
			
		}
		System.out.println("sum"+sum);
		System.out.println("num"+num);
	}

}
