package iterators;

import java.util.ArrayList;

public class UserIterator<T> implements Iterable<T>{
	private ArrayList<T> itemList;
	private int position;
	
	public UserIterator(ArrayList<T> itemList) {
		this.itemList = itemList;
		this.position = 0;
	}
	
	@Override
	public boolean hasNext() {
		if(position < itemList.size()) {
			return true;
		}else return false;
	}

	@Override
	public T getNext() {
		// TODO Auto-generated method stub
		if(hasNext()) {
			return itemList.get(position++);
		}
		return null;
	}
	
}
