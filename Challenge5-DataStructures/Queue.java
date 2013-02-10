//UIUC CS125 FALL 2012 MP. File: Queue.java, CS125 Project: Challenge5-DataStructures, Version: 2012-10-12T13:23:47-0500.975574000
/**
 * 
 * @author aagrawl3
 *
 */
public class Queue {
	private double que[]=new double[0];
	/** Adds the value to the front of the queue.
	 * Note the queue automatically resizes as more items are added. */
	public void add(double value) {
		if(que.length==0){
			que=new double[1];
			que[0]=value;
		}
		else{
			double old[]=new double[que.length];
			for(int i=0; i<old.length; i++){
				old[i]=que[i];
			}
			que=new double[que.length+1];
			que[0]=value;
			for(int i=0; i<old.length; i++){
				que[i+1]=old[i];
			}
		}
	}
	/** Removes the value from the end of the queue. If the queue is empty, returns 0 */
	public double remove() {
		if(que.length==0){
			return (double)0;
		}
		double old[]=new double[que.length];
		for(int i=0; i<old.length; i++){
			old[i]=que[i];
		}
		que=new double[que.length-1];
		for(int i=0; i<que.length; i++){
			que[i]=old[i];
		}
		return old[old.length-1];
	}
	
	/** Returns the number of items in the queue. */
	public int length() {
		return que.length;
	}
	
	/** Returns true iff the queue is empty */
	public boolean isEmpty() {
		if(que.length==0)
			return true;
		return false;
	}
	
	/** Returns a comma separated string representation of the queue. */
	public String toString() {
		String total="";
		for(int i=que.length-1; i>0; i--){
			total=total+(que[i]+",");
		}
		if(que.length!=0)
			total=total+que[0];
		return total;
	}
}
