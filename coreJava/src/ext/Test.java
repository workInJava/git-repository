package ext;



public class Test {
	public static void main(String[] args) {
	//	Test t = new Test();
		int[] arr = {1,3,4,5,6};
	//	System.out.println(t.get(arr, 2));
		
		
		TestInner n = new TestInner();
			
			Inner n1 = n.method();
			n1.method();
			
	}
	
	public String get(int[] datas,int index) {
		if(index >= 0 && index < datas.length){
			return String.valueOf(datas[index]);	
		}else{
			return "数组下标越界!";
		}
	}
}
