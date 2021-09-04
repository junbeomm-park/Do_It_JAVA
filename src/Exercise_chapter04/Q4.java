package Exercise_chapter04;

public class Q4 {
	public static void main(String[] args) {
				
		int linecount = 4;
		int spacecount = linecount/2 +1;
		int starcount =1;
		
		for(int i=0; i<linecount ;i++) {
					for(int j =0; j < spacecount; j++) {
						System.out.print(' ');
					}
					for(int j = 0; j<starcount; j++) {
						System.out.print("*");
					}
					for(int j=0; j<spacecount ;j++) {
						System.out.print(' ');
					}
					spacecount-= 1;
					starcount+= 2;
					System.out.println();
		}
			
	}

}
