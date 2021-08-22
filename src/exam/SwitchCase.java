package exam;

public class SwitchCase {
	public static void main (String[] args) {
		
	

	int floar = 5;
	String name;
	
	switch(floar) {
	
	case 1 : name = "약국 " ;
	break;
	
	case 2 : name = "정형외과 ";
	break;
	
	case 3 : name = "피부과 ";
   break;
   
	case 4 : name = "치과 ";
    break;
    
    default : name = "헬스 클럽";
    

}
	System.out.println(floar +"층 "+name+"입니다 ");
}
}
