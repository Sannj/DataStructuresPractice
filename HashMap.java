package DataStructuresPractice;

import java.util.Iterator;
import java.util.LinkedList;

public class HashMap<K,V> {
	 
		//ArrayList<HashMapElement> hm = new ArrayList<>();
		LinkedList[] ll = new LinkedList[100];	
		 int hashcode;
		 public int add(K key, V value){
		try{
			 HashMapElement<K, V> newEle1 = new  HashMapElement<>(key,value);
		 hashcode = newEle1.hashCode();
		 
		if(ll[hashcode] == null){
			 LinkedList node = new LinkedList();
			 node.addFirst(newEle1);
			 ll[hashcode] = node;
		 }
		 else{
			 LinkedList node = ll[hashcode];
			 node.addLast(newEle1);
		}
		}
		catch(Exception ex){
			System.out.println("Null");
		}
		 return 1;
		 }
		 
		 
		 public Object get(K key){
			 HashMapElement node2 = new HashMapElement();
			 node2.setKey(key); 
			 int hashcode = node2.hashCode();
			 System.out.println(hashcode+"\n");
			LinkedList node = ll[hashcode];
			Iterator itr = node.iterator();
			while(itr.hasNext()){
				node2 = (HashMapElement) itr.next();
				if(node2.getKey() == key){
					return node2.getValue();
				}
			}
			return null;
			 
		 }
		 
		/* public boolean remove(K key){
			 HashMapElement ele;
			 Iterator itr = hm.iterator();
			 int i =0;
			 while(itr.hasNext()){
				 ele = (HashMapElement) itr.next();
				 if(ele.getKey() == key){
					 hm.remove(i);
					 return true;
				 }
			 i++;
			 }
			 return false;
		 }*/
		 
		 public static void main(String args[]){
			 HashMap<Integer,String> newMap = new HashMap<>();
			 newMap.add(1,"Apple");
			 newMap.add(101,"Mango");
			 newMap.add(13, "Grapes");
			 newMap.add(134, "Strawberry");
			 System.out.println(newMap.get(101).toString());
			 
		 }
		 
		 
	

}
