package generic;

public class ExtendsBox <T extends Animal>{
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	public void printInfo() {
		data.printAnimal();
	}
	
}




