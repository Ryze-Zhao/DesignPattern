package com.zhaolearn.iterator.improve;

import java.util.Iterator;

public class CollegeIterator<E> implements Iterator<E> {
	//这里我们需要Department 是以怎样的方式存放=>数组
	private E[] departments;
	//遍历的位置
	private int position = 0;

	public CollegeIterator(E[] departments) {
		this.departments = departments;
	}

	//判断是否还有下一个元素
	@Override
	public boolean hasNext() {
		if(position >= departments.length || departments[position] == null) {
			return false;
		}else {
		
			return true;
		}
	}

	@Override
	public E next() {
		E department = departments[position];
		position += 1;
		return department;
	}
	
	//删除的方法，默认空实现
	@Override
	public void remove() {}
}
