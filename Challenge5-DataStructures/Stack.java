//UIUC CS125 FALL 2012 MP. File: Stack.java, CS125 Project: Challenge5-DataStructures, Version: 2012-10-12T13:23:47-0500.975574000
/**
 * 
 * @author aagrawl3
 *
 */
public class Stack {
	private String stacks[]=new String[0];
	/** Adds a value to the top of the stack.*/
	public void push(String value){
		if(stacks.length==0){
			stacks=new String[1];
			stacks[0]=value;
		}
		else{
			String old[]=new String[stacks.length];
			for(int i=0; i<old.length; i++){
				old[i]=stacks[i];
			}
			stacks=new String[stacks.length+1];
			stacks[0]=value;
			for(int i=0; i<old.length; i++){
				stacks[i+1]=old[i];
			}
		}
	}
	
	/** Removes the topmost string. If the stack is empty, returns null. */
	public String pop() {
		if(stacks.length==0)return null;
		String old[]=new String[stacks.length];
		for(int i=0; i<old.length; i++){
			old[i]=stacks[i];
		}
		stacks=new String[stacks.length-1];
		for(int i=0; i<stacks.length; i++){
			stacks[i]=old[i+1];
		}
		return old[0];
	}
	
	/** Returns the topmost string but does not remove it. If the stack is empty, returns null. */
	public String peek() {
		if(stacks.length==0)return null;
		return stacks[0];
	}
	
	/** Returns true iff the stack is empty */
	public boolean isEmpty() {
		if(stacks.length==0)return true;
		return false;
	}

	/** Returns the number of items in the stack. */
	public int length() {
		return stacks.length;
	}
	
	/** Returns a string representation of the stack. Each string is separated by a newline. Returns an empty string if the stack is empty. */
	public String toString() {
		String total="";
		for(int i=stacks.length-1; i>-1; i--){
			total=total+(stacks[i]+"\n");
		}
		return total;
	}
}
