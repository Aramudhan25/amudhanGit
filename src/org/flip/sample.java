package org.flip;

import java.util.*;
import java.util.Map.Entry;

public class sample {
	public static void main(String[] args) {
		Map<Integer,Pojo> li = new HashMap<>();
		Pojo b = new Pojo();
		b.setRoolNo(25);
		b.setPhoneNO(456172828);
		b.setName("amu");
		Pojo c = new Pojo();
		c.setRoolNo(24);
		c.setPhoneNO(3456732);
		c.setName("abi");
		li.put(4, c);
		li.put(5, c);
		Set<Entry<Integer,Pojo>>entrySet=li.entrySet();
		
	     for (Entry<Integer,Pojo> x : entrySet) {
			
		
		System.out.println(x.getValue().getRoolNo());
		System.out.println(x.getValue().getPhoneNO());
		System.out.println(x.getValue().getName());
		
	}
		
	}
	
	}


