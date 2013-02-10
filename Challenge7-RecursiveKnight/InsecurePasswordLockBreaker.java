//UIUC CS125 FALL 2012 MP. File: InsecurePasswordLockBreaker.java, CS125 Project: Challenge7-RecursiveKnight, Version: 2012-11-09T13:47:23-0600.853382000
/**
 * 
 * @author aagrawl3
 *
 */
public class InsecurePasswordLockBreaker {

	public static char[] breakLock(InsecurePasswordLock lock) {
		char[] key = new char[30];
		for(int i=31; i<51; i++){
			if(lock.open(key)!=-1)
				break;
			else key=new char[i];
		}
		for(int i=0;i<key.length;i++)
			for(int j=0;j<26;j++){
			key[i] = (char) ('A' +j);
			if(lock.open(key)!=i)
				break;
			}
		// write code here to determine the secret password
		// to unlock the given lock object.
		// Hint: Read the source code of InsecurePasswordLock
		// The lock has a weakness....
		// Understand it and you can write an algorith to quickly find the
		// secret password
		// (A brute force guess of a 40 character password would take a long
		// time...
		// as there are 26^40 combinations
		// Your method should find it in a few seconds.

		// Beginner: You should complete this code in less than an hour

		// Advanced: Can you complete this method in 8 lines
		// (excluding the top and bottom given
		// lines and after autoformating your code)
		
		// Crazy: I can write a complete albeit-inefficient solution using single while loop
		// expression: while (____){/*NoCodeHere*/}
		return key;
	}

	public static void main(String[] args) {
		InsecurePasswordLock lock = new InsecurePasswordLock();
		char[] key = breakLock(lock);
		System.out.println(key);
		System.out.println(lock.isUnlocked());
	}
}
