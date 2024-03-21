package ProjectBag;

import java.util.ArrayList;
import java.util.Iterator;


public class Bag<T> implements Container<T>{

	ArrayList<T> MyArray = new ArrayList<T>();
	
	@Override
	public Iterator<T> iterator() {
		ArrayList<T> Array = new ArrayList<T>();
		Array = MyArray;
		return Array.iterator();
	}

	@Override
	public boolean isEmpty() {
		if (MyArray.size()==0)
			return true;
		else
			return false;
	}

	@Override
	public int size() {
		return MyArray.size();
	}

	@Override
	public void add(T item) {
		MyArray.add(item);
	}
	
}
