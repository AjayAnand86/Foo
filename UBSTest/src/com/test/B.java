package com.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;



public class B implements Serializable{
	private Square  square = new Square();
	
	public static void main(String args[]){
		B f= new B();
		try{
		FileOutputStream fs = new FileOutputStream("Forest.ser");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(f);os.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}

class Square {
}
