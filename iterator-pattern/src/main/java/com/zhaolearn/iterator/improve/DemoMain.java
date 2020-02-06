package com.zhaolearn.iterator.improve;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 事例
 *	一个大学，有多个学院，多个学院下又有多个系部。使用迭代器模式是为了不暴露元素的内部结构
 *
 *  1、自己实现的迭代器，实现java.util.Iterator，如果好像我代码那样写，其实可以实现List和数组的，不单独只是University、College可用；
 *  2、University、College实现Container接口，并返回各自对应的迭代器。
 *  3、OutPutImpl聚合大学，并返回打印信息。
 *  4、测试类准备数据并测试
 *
 *
 *
 *
 * @author: HeHaoZhao
 * @date: 2020/2/6 21:27
 */
public class DemoMain {
	public static void main(String[] args) {
		//系部数据
		Department[] departmentsData1 = new Department[]{new Department("Java专业1", " Java专业1 "),new Department("PHP专业1", " PHP专业1 "),new Department("大数据专业1", " 大数据专业1 ")};
		Department[] departmentsData2 = new Department[]{new Department("Java专业2", " Java专业2 "),new Department("PHP专业2", " PHP专业2 "),new Department("大数据专业2", " 大数据专业2 ")};
		Department[] departmentsData3 = new Department[]{new Department("Java专业3", " Java专业3 "),new Department("PHP专业3", " PHP专业3 "),new Department("大数据专业3", " 大数据专业3 ")};
		//学院数据
		List<College> collegesData1=new ArrayList<College>(Arrays.asList(
				new College("大学1学院1", "大学1学院1",departmentsData1),
				new College("大学1学院2", "大学1学院2",departmentsData2),
				new College("大学1学院3", "大学1学院3",departmentsData3)));
		List<College> collegesData2=new ArrayList<College>(Arrays.asList(
				new College("大学2学院1", "大学2学院1",departmentsData1),
				new College("大学2学院2", "大学2学院2",departmentsData2),
				new College("大学2学院3", "大学2学院3",departmentsData3)));
		//大学数据
		List<University> universityList=new ArrayList<University>(Arrays.asList(
				new University("大学1", "大学1",collegesData1),
				new University("大学2", "大学2",collegesData2)
				));

		//使用输出
		OutPutImpl outPutImpl = new OutPutImpl(universityList);
		outPutImpl.printUniversity();
	}
}
