package com.zhaolearn.memento.improve;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

//守护者对象, 保存游戏角色的状态
public class Caretaker {

	//如果只保存一次状态
	//private Memento  memento;
	//对GameRole 保存多次状态
	//private ArrayList<Memento> mementos;
	//对多个游戏角色保存多个状态
	private HashMap<String, Memento> rolesMementos=new HashMap<>();

	public String addMemento(Memento memento) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String format = LocalDateTime.now().format(dateTimeFormatter);
		System.out.println("当前存档时间："+format);
		rolesMementos.put(format,memento);
		return format;
	}

	//获取到key为format的Originator 的 备忘录对象(即保存状态)
	public Memento getMemento(String format) {
		return rolesMementos.get(format);
	}
}
