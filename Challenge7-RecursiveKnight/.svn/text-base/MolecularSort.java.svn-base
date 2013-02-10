//UIUC CS125 FALL 2012 MP. File: MolecularSort.java, CS125 Project: Challenge7-RecursiveKnight, Version: 2012-11-09T13:47:23-0600.853382000
/**
 * 
 * @author aagrawl3
 *
 */
public class MolecularSort {

	/** Sorts each xyz coordinate using it's Z value (coord[i][2] <= coord[j][2] for i<j). */
	static void sortCoordsByZ(double[][] coords) {
		recursiveSort(coords,0,coords.length-1);
		// TODO: Implement this wrapper method.
		//All the work is performed by recursiveSort
	}

	/**
	 * recursively sorts coordinates entries by their z value. Entries between
	 * lo and hi inclusive are considered.
	 */
	static void recursiveSort(double[][] coords, int lo, int hi) {
		if(lo!=hi){
			swap(coords,lo,findIndexOfZMinimum(coords, lo, hi));
			recursiveSort(coords,lo+1,hi);
		}
		// TODO: write the four lines of a recursive selection sort here.
		
	}

	/**
	 * returns the index of the entry with the lowest Z value. Entries between
	 * lo and hi inclusive are considered.
	 */
	static int findIndexOfZMinimum(double[][] coords, int lo, int hi) {
		if(lo == hi)return lo;
		int pos = findIndexOfZMinimum(coords,lo+1,hi);
		if(coords[pos][2] < coords[lo][2]) return pos;
		return lo; // TODO: Replace this with your three lines of recursive code
	}
	

	/* Swaps the (x,y and z) values of the i-th and j-th coordinates.*/
	static void swap(double[][] coords, int i, int j) {
		double temp1=coords[i][0];
		double temp2=coords[i][1];
		double temp3=coords[i][2];
		coords[i][0]=coords[j][0];
		coords[i][1]=coords[j][1];
		coords[i][2]=coords[j][2];
		coords[j][0]=temp1;
		coords[j][1]=temp2;
		coords[j][2]=temp3;
		// TODO: write your swap implementation here
	}
}
