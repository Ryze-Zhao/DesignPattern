package com.zhaolearn.iterator.improve;


import lombok.AllArgsConstructor;

import java.util.Iterator;
import java.util.List;

@AllArgsConstructor
public class OutPutImpl {
	//大学集合
	private List<University> universities;
	//遍历所有大学,然后调用printCollege 输出各个学院
	public void printUniversity(){
		Iterator<University> iterator = universities.iterator();
		while(iterator.hasNext()) {
			University university = iterator.next();
			System.out.println("***** "+university.getName() +"*****" );
			printCollege(university.createIterator());
			System.out.println("-----------------分割线----------------");
		}
	}
	//遍历所有学院,然后调用printDepartment 输出各个学院的系
	private void printCollege(Iterator iterator) {
		//从collegeList 取出所有学院, Java 中的 List 已经实现Iterator
		while(iterator.hasNext()) {
			//取出一个学院
			College college = (College)iterator.next();
			System.out.println("=== "+college.getName() +"=====" );
			printDepartment(college.createIterator()); //得到对应迭代器
		}
	}
	//输出 学院输出 系
	private void printDepartment(Iterator iterator) {
		while(iterator.hasNext()) {
			Department d = (Department)iterator.next();
			System.out.println(d.getName());
		}
	}
}
