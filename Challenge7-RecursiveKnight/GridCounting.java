//UIUC CS125 FALL 2012 MP. File: GridCounting.java, CS125 Project: Challenge7-RecursiveKnight, Version: 2012-11-09T13:47:23-0600.853382000
/**
 * 
 * @author aagrawl3
 *
 */
public class GridCounting {
	/** Returns the total number of possible routes (paths) from
	 * (x,y) to (tx,ty).
	 * There are only three valid kinds of moves:
	 *  Increment x by one.
	 *  Increment x by two.
	 *  Increment y by one.
	 *  
	 *  Hint: You'll need to test two base cases.
	 */
	public static int count(int x,int y, int tx, int ty) {
		if(x==tx&&y==ty)
			return 1;
		if (x>tx||y>ty)
			return 0;
		return count(x+1,y,tx,ty)+count(x+2,y,tx,ty)+count(x,y+1,tx,ty);
	}
}
