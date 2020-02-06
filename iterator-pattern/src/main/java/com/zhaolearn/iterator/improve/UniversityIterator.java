package com.zhaolearn.iterator.improve;

import java.util.Iterator;
import java.util.List;

public class UniversityIterator<E> implements Iterator<E> {
	// 大学是以List方式存放学院
	private List<E> colleges;
	//索引
	private int index;
	public UniversityIterator(List<E> colleges) {
		this.colleges = colleges;
	}
	//判断list中还有没有下一个元素
	@Override
	public boolean hasNext() {
		//因为int初始为0
		if(index < colleges.size()) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public E next() {
		//因为int初始为0，所以get0是可以的
		return colleges.get(index ++);
	}
	
	//空实现remove
	@Override
	public void remove() {}
}
