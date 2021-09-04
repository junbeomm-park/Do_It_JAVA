package Exercise_chapter04;

public class Q1 {

	public static void main(String[] args) {
			int num1 = 10;
			int num2= 2;
			char operator = '+';
			int result = 0;
			
			if(operator ==  '+') {
				result = num1 + num2;
			}else if(operator == '-') {
					result = num1 - num2;
			}else if (operator == '*') {
					result = num1 * num2;
			}else if ( operator == '/') {
					result = num1 / num2;
					return;
			}
			System.out.println(result);
	}

}
