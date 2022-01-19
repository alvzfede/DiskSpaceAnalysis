package com.main.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args){
		List<Integer> list=Stream.of(62,64,77,75,71,60,79,75).collect(Collectors.toList());
		List<Integer> list2=Stream.of(8,2,4,6).collect(Collectors.toList());
		System.out.println("doProcess1:" + doProcess(4, list));
		System.out.println("doProcess2:" + doProcess(2, list2));
	}
	
	private static int doProcess(int x, List<Integer> space){
		List<Integer> listMin = new ArrayList<>();
		for(int i=0;i<=space.size()-x;i++){
			List<Integer> segments = new ArrayList<>();
			for(int j=i;segments.size()<x;j++){
				segments.add(space.get(j));
			}
			listMin.add(Collections.min(segments));
			
		}
		return Collections.max(listMin);
		
	}
	
	
}
