
public class ArrayTestObj {

	public static void main(String[] args) {
		Person[] arr = new Person[5];
		arr[0] = new Person("홍씨", 20);
		arr[1] = new Person("김씨", 30);
		arr[2] = new Person("박씨", 40);
		arr[3] = new Person("이씨", 50);
		arr[4] = new Person("구씨", 60);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			arr[i].printInfo();
		}
	}

}





