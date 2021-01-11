package generic;
//타입을 두개 원하는걸로 쓸수 있음
public class TwoGenericBox<K,V> {
	private K data1;
	private V data2;
	public K getData1() {
		return data1;
	}
	public void setData1(K data1) {
		this.data1 = data1;
	}
	public V getData2() {
		return data2;
	}
	public void setData2(V data2) {
		this.data2 = data2;
	}
	
	
}
