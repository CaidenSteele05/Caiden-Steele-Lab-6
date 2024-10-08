
public class UniqueList extends IntegerList{
	public UniqueList() {
		super();
	}
	
	public UniqueList(int capacity) {
		super(capacity);
	}
	
	public void add(int integer) throws IllegalArgumentException{
		for(int i = 0; i < this.size(); i++) {
			if(integer == this.get(i)) {
				throw new IllegalArgumentException("The integer " + this.get(i) + " is already in the list.");
			}
		}
		super.add(integer);
	}
	
	public void insert(int index, int integer) throws IllegalArgumentException {
		for(int i = 0; i < this.size(); i++) {
			if(integer == this.get(i)) {
				throw new IllegalArgumentException("The integer " + this.get(i) + " is already in the list.");
			}
		}
		super.insert(index, integer);
	}
}
