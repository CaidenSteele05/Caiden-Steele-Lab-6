
public class SortedList extends IntegerList{
	public SortedList() {
		super();
	}
	
	public SortedList(int capacity) {
		super(capacity);
	}
	
	public void add(int integer) {
		int index = 0;
        while (index < this.size() && integer > super.get(index)) {
            index++;
        }
        super.insert(index, integer);
	}
	
	public void insert(int index, int integer) throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}
}
