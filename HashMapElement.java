package DataStructuresPractice;

public class HashMapElement<K, V> {

	K key;
	V value;
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
	
	public HashMapElement(){
		
	}
	public HashMapElement(K key, V value){
		this.key = key;
		this.value = value;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result %= 100;
	//	result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}
	
	public V get(K key){
		return value;
	}
}
