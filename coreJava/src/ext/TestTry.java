package ext;

public class TestTry {

	
	public static void main(String[] args){
		
		System.out.println(math());
		
 	}
	
	public static  int math(){
		int a = 10;
		int b = 0;
		int c =0;
		try{
			return 2;
		}catch(Exception e){
			
		}finally{
			return 3;
		}
	}
}
