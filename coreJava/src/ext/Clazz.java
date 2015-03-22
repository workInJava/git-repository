package ext;

public class Clazz implements Cloneable{
	private String clazzName;
	private int cap;
	
	public Clazz() {
		// TODO Auto-generated constructor stub
	}

	public Clazz(String clazzName, int cap) {
		super();
		this.clazzName = clazzName;
		this.cap = cap;
	}

	public String getClazzName() {
		return clazzName;
	}

	public void setClazzName(String clazzName) {
		this.clazzName = clazzName;
	}

	public int getCap() {
		return cap;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
