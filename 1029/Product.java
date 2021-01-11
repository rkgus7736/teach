
public class Product {
//	제품번호
	int productNo;
//	제품명
	String productName;
//	가격
	int price;
//	제조사
	String maker;

	// 제품정보 출력하는 메서드
	public void showProductInfo() {
		System.out.println("제품번호 : " + productNo);
		System.out.println("제품명 : " + productName);
		System.out.println("소비자가 : " + price);
		System.out.println("제조사 : " + maker);
	}

	// 초기화
	public void init(int pno, String pname, int money, String pmaker) {
		productNo = pno;
		productName = pname;
		price = money;
		maker = pmaker;
	}
}







