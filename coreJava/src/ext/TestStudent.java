package ext;

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student(1000, "����");
		Clazz c = new Clazz("�д�1��", 40);
		// ��ͬѧ�Ͱ༶��������
		s1.setClazz(c);
		
		try {
			Student s2 = (Student) s1.clone();
			System.out.println(s2.getClazz().getCap());
			s1.getClazz().setCap(30);
			System.out.println(s2.getClazz().getCap());
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
