
public class RangeList extends IntegerList {
	public RangeList() {
		super();
	}
	
	public RangeList(int lowerBound, int upperBound) throws IllegalArgumentException{
		super();
		add(lowerBound, upperBound);
	}
	
	public void add(int lowerBound, int upperBound) throws IllegalArgumentException{
		if(lowerBound > upperBound) {
			throw new IllegalArgumentException("The upper bound must be greater than or equal to the lower bound.");
		}
		
		if (this.size() == 0) {
			for(int i = lowerBound; i <= upperBound; i++) {
				super.add(i);
			}
			return;
		}
		int curLBound = this.get(0);
		int curUBound = this.get(this.size() -1);
		
		if(lowerBound < curLBound) {
			for(int i = lowerBound; i < curLBound; i++) {
				super.insert(i-lowerBound,i);
			}
		}
		
		if(upperBound > curUBound) {
			for(int i = curUBound + 1; i <= upperBound; i++) {
				super.add(i);
			}
		}
	}
	
	public void remove(int lowerBound, int upperBound) throws IllegalArgumentException, UnsupportedOperationException{
		if(lowerBound > upperBound) {
			throw new IllegalArgumentException("The upper bound must be greater than or equal to the lower bound.");
		}
		
		if(this.size() == 0) {
			throw new UnsupportedOperationException("Cannot remove range from an empty list.");
		}
		
		int curLBound = this.get(0);
		int curUBound = this.get(this.size() - 1);
		
		if(lowerBound < curLBound || upperBound > curUBound) {
			throw new IllegalArgumentException("Lower and/or upper bounds are out of the current list range.");
		}
		
		if(lowerBound != curLBound && upperBound != curUBound) {
			throw new IllegalArgumentException("Cannot remove non-terminal ranges.");
		}
		
		for(int i = lowerBound; i <= upperBound; i++) {
			int ind = this.indexOf(i);
			if(ind != -1) {
				super.remove(ind);
			}
		}
	}
	
	@Override
	public void insert(int index, int integer) throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void add(int integer) throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}
	

}
