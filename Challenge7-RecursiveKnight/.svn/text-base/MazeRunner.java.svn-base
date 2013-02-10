//UIUC CS125 FALL 2012 MP. File: MazeRunner.java, CS125 Project: Challenge7-RecursiveKnight, Version: 2012-11-09T13:47:23-0600.853382000
/**
 * 
 * @author aagrawl3
 *
 */
public class MazeRunner {

	private int x, y;

	/** Initializes the MazeRunner with the x,y values */
	public MazeRunner(int x1, int y1) {	
		x=x1;
		y=y1;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}


	/** Moves the runner one unit. No error checking is performed.
	 * 'N':go North (increment y), S:decrement y, E(increment x), W(decrement x)
	 * character values other than N,S,E or W are ignored.
	 */
	void moveOne(char dir) {
		if(dir=='N') y++;
		else if(dir=='S') y--;
		else if(dir=='E') x++;
		else if(dir=='W') x--;
	}
	/** Returns true if this maze runner is on the same (x,y) square
	 * as the parameter. Assumes that the parameter is non-null.
	 */
	public boolean caught(MazeRunner other) {
		if(getX()==other.getX()&&getY()==other.getY())
			return true;
		return false; // TODO: Implement caught
	}

	/**
	 * Uses recursion to find index of the shortest string.
	 * Null strings are treated as infinitely long.
	 * Implementation notes:
	 * The base case if lo == hi.
	 * Use safeStringLength(paths[xxx]) to determine the string length.
	 * Invoke recursion to test the remaining paths (lo +1)
	 */
	static int findShortestString(String[] paths, int lo, int hi) {
		if(lo == hi){
			if(paths[lo]==null)
				return 0;
			return lo;
		}
		int pos = findShortestString(paths,lo+1,hi);
		if(paths[lo]==null) return pos;
		if(safeStringLength(paths[pos])<safeStringLength(paths[lo])) return pos;
		return lo;
		// TODO: findShortestString
	}

	/** Returns the length of the string or Integer.MAX_VALUE
	 * if the string is null.
	 * @param s
	 * @return
	 */
	static int safeStringLength(String s) {
		if(s==null)
			return Integer.MAX_VALUE;
		return s.length();
	}


	/* Returns a string representation of the shortest path between
	 * (x,y) and (tx,ty). e.g. a result of "NNEE"
	 * means to travel from (x,y) -> (tx,ty) go North twice, then East twice.
	 * blocked is a square boolean grid of points that cannot be used.
	 * If(x,y) are invalid coords (outside of the grid array) this method returns null.
	 * If(x,y) is on a blocked square, this method returns null. Otherwise,
	 * If(x,y) are already the same as the target position, returns an empty string.
	 * If there is no path between (x,y) and (tx,ty) the method returns null.
	 * 
	 * Implementation notes:
	 * Use the statements above for the base cases.
	 * For the recursion part:
	 * 1. Set the current position to blocked (so that the recursive method does not
	 * attempt to re-use this square again)
	 * 2. Collect all paths from the NSEW neighbors
	 * 3. Reset the current blocked position to false.
	 * 4. Use findShortestString to determine the shortest path
	 * 5. If its non-null then PREPEND the compass direction of that neighbor's path.
	 * e.g. if the Northern neighbor returned "EWWS" 
	 * the East neighbor returned "NWWWWWWWSEEEESS" and W and S Neighbor return null
	 * then return "N" + "EWWS"
	 * Otherwise, just return null as none of the neighbors found a path.
	 */
	public static String shortestPath(int x, int y, int tX, int tY, boolean blocked[][]) {
		// TODO: BASE CASES HERE
		if(x>=blocked.length||y>=blocked[0].length||x<0||y<0)
			return null;
		if(blocked[x][y]==true)
			return null;
		if(x==tX&&y==tY)
			return"";
		blocked[x][y] = true;
		String[]paths=new String[4];
		paths[0]= shortestPath(x,y+1,tX,tY,blocked);
		paths[1]= shortestPath(x,y-1,tX,tY,blocked);
		paths[2]= shortestPath(x+1,y,tX,tY,blocked);
		paths[3]= shortestPath(x-1,y,tX,tY,blocked);
		if(paths[0]!=null)
			paths[0]="N"+paths[0];
		if(paths[1]!=null)
			paths[1]="S"+paths[1];
		if(paths[2]!=null)
			paths[2]="E"+paths[2];
		if(paths[3]!=null)
			paths[3]="W"+paths[3];
		//String[] paths = { 
			//TODO: COLLECT RECURSIVE RESULTS HERE
		//};
		blocked[x][y] = false;

		// TODO: Use findShortestString on paths
		// TODO: Return correct string with Compass direction prepended (or null)
		return paths[findShortestString(paths,0,3)];
	}

	/** Moves the runner towards the target position, if the
	 * shortest path can be found between the current and target position.
	 * Implementation notes: calls shortestPath, 
	 * if result is not null then send the first char to moveOne()
	 * Hint: watch out for the empty string when target = current position...
	 */
	public void chase(boolean maze[][], int targetX, int targetY) {
		// TODO: Implement chase
		// Use shortestPath, string.charAt,  moveOne
		if(x!=targetX||y!=targetY){
			String path= shortestPath(x,y,targetX,targetY,maze);
			if(path!=null)
				moveOne(path.charAt(0));
		}
	}

}
