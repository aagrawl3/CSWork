//UIUC CS125 FALL 2012 MP. File: GeocacheList.java, CS125 Project: Challenge5-DataStructures, Version: 2012-10-12T13:23:47-0500.975574000
/**
 * Complete the following GeocacheList, to ensure all unit tests pass.
 * There are several errors in the code below
 *
 * Hint: Get the Geocache class working and passing its tests first.
 * @author aagrawl3
 * 
 */
public class GeocacheList {
	private Geocache[] data = new Geocache[0];
	private int size = 0;

	public Geocache getGeocache(int i) {
		return data[i];
	}

	public int getSize() {
		return size;
	}

	public GeocacheList() {
	}
	
	public Geocache[] getGeocache(){
		return data;
	}

	public GeocacheList(GeocacheList other, boolean deepCopy) {
		if(deepCopy){
			data = new Geocache[other.getGeocache().length];
			for(int i=0; i<data.length; i++){
				data[i]= new Geocache(other.getGeocache(i));
			}
		}
		else{
			data=other.getGeocache();
		}
		size = other.getSize();	
		
	}

	public void add(Geocache p) {
		size++;
		if (size > data.length) {
			Geocache[] old = new Geocache[data.length];
			for (int i = 0; i < old.length; i++)
				old[i] = data[i];
			data = new Geocache[size * 2];
			for (int i = 0; i < old.length; i++)
				data[i] = old[i];
		}
		data[size-1] = p;
	}

	public void removeFromTop() {
		Geocache[] old = new Geocache[data.length];
		data = new Geocache[data.length-1];
		for (int i = 0; i < data.length; i++)
			data[i] = old[i+1];
		size--;
	}

	public String toString() {
		StringBuffer s = new StringBuffer("GeocacheList:");
		for (int i = 0; i < size; i++) {
			if (i > 0)
				s.append(',');
			s.append(data[i]);
		}
		return s.toString();
}	}
