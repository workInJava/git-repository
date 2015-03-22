package ext;

public class Student implements Cloneable{
	private int id;
	private String name;
	private Clazz clazz;
	private static int b = 10;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Student(int id, String name, Clazz clazz) {
		super();
		this.id = id;
		this.name = name;
		this.clazz = clazz;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Clazz getClazz() {
		return clazz;
	}
	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public synchronized void fixName(String name,int y){
		this.setName(name);
		try {
			Thread.sleep(60);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b = b- y;
		System.out.println(b);
		System.out.println(getName());
	}
	
}
