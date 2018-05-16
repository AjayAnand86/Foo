package com.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.NumberFormat;

public class Test implements Serializable{
	private Square  square = new Square();
	
	public static void main(String args[]){
		Test f= new Test();
		try{
		FileOutputStream fs = new FileOutputStream("Forest.ser");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(f);
		os.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}