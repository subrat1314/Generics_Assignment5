package java_Assignments;

public class PairMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pair<String,String>p=new Pair<String,String>();
		
		p.setKey("1");
		p.setValue("Physics");
		System.out.println(p.getKey()+":"+p.getValue());
		Pair<String,java.util.Date> p1= new Pair<String,java.util.Date>();
		p1.setKey("Today is");
		p1.setValue(new java.util.Date());
		System.out.println(p1.getKey()+":"+p1.getValue());
	}

}

class Pair<K, V> 
{
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
}
