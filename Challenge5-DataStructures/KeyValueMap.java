//UIUC CS125 FALL 2012 MP. File: KeyValueMap.java, CS125 Project: Challenge5-DataStructures, Version: 2012-10-12T13:23:47-0500.975574000
/** 
 * @author aagrawl3
 * 
 */
import java.awt.Color;

public class KeyValueMap { // aka Dictionary or Map
	private String keys []=new String [0];
	private Color colors []=new Color [0];
	/**
	 * Adds a key and value. If the key already exists, it replaces the original
	 * entry.
	 */
	public void add(String key, Color value) {
		int a=0;
		if(keys.length==0){
			keys=new String [1];
			colors=new Color [1];
			keys[0]=key;
			colors[0]=value;
		}
		else if(!exists(key)){
			String old[]= new String[keys.length];
			Color oldc[]= new Color[keys.length];
			for(int i=0; i<keys.length; i++){
				old[i]=keys[i];
				oldc[i]=colors[i];
			}
			keys=new String [keys.length+1];
			colors=new Color[colors.length+1];
			for(int i=0; i<old.length; i++){
				keys[i]=old[i];
				colors[i]=oldc[i];
			}
			keys[keys.length-1]=key;
			colors[keys.length-1]=value;
		}
		else{
			for(int i=0; i<keys.length;i++){
				if(keys[i].equals(key)){
					a= i;
					break;
				}
			}
			colors[a]=value;
		}
	}

	/**
	 * Returns particular Color object previously added to this map.
	 */
	public Color find(String key) {
		int a=-1;
		for(int i=0; i<keys.length;i++){
			if(keys[i].equals(key)){
				a= i;
				break;
			}
		}
		if(a==-1)
			return null;
		return colors[a];
	}

	/**
	 * Returns true if the key exists in this map.
	 */
	public boolean exists(String key) {
		for(int i=0; i<keys.length;i++){
			if(keys[i].equals(key)){
				return true;
			}
		}
		return false;
	}

	/**
	 * Removes the key (and the color) from this map.
	 */
	public void remove(String key) {
		int a=-1;
		int b=0;
		for(int i=0; i<keys.length;i++){
			if(keys[i].equals(key)){
				a= i;
				break;
			}
		}
		if(a!=-1){
			String old[]= new String[keys.length];
			Color oldc[]= new Color[keys.length];
			for(int i=0; i<keys.length; i++){
				old[i]=keys[i];
				oldc[i]=colors[i];
			}
			keys=new String [keys.length-1];
			colors=new Color[colors.length-1];
			for(int i=0; i<colors.length; i++){
				if(i==a){
					b=1;
				}
					keys[i]=old[i+b];
					colors[i]=oldc[i+b];
			}
		}
	}

}
