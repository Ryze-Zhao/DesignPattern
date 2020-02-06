package com.zhaolearn.iterator.improve;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Iterator;
import java.util.List;

/**
 * 大学
 * @author: HeHaoZhao
 * @date: 2020/2/6 20:48
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class University implements Container {
	private String name;
	private String des;
	private List<College> colleges;

	@Override
	public Iterator createIterator() {
		return new UniversityIterator(colleges);
	}
}
