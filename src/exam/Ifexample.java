package exam;

public class Ifexample {


	public static void main(String[] args) {
		int score = 78;
		char grade;
		
		if(score>=90) {
		  	char grade1 = 'A';
		  	System.out.println(grade1);
			
		}else if(score>=80) {
			char grade2 = 'B';
			System.out.println(grade2);
		}else if(score>=70) {
			char grade3 = 'C';
			System.out.println(grade3);
		}else if(score>=60) {
			char grade4 = 'D';
			System.out.println(grade4);
		}else {
			char grade5 = 'F';
			System.out.println(grade5);
		} 
	}

}
