package edu.class1;

import java.util.HashMap;
import java.util.Map;


public class Test {
	public static void main(String[] args){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		long startTime = System.currentTimeMillis();
		for(int i=0;i<10000;i++){
			map.put(i, i);
		}
		System.out.println(System.currentTimeMillis() - startTime);
		
		Map<Integer, Integer> anotherMap = new HashMap<Integer, Integer>(10000);
		long anotherTime = System.currentTimeMillis();
		for(int i=0;i<10000;i++){
			anotherMap.put(i, i);
		}
		System.out.println(System.currentTimeMillis() - anotherTime);
		
		
	}
}
