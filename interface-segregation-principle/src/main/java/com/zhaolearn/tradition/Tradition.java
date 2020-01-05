package com.zhaolearn.tradition;

/**
 * Interface1�ӿ�����5����ʵ�ַ�����
 * A������Bʵ�ֵ�1��2��3����
 * C������Dʵ�ֵ�1��4��5����
 * ���B��D��Ҫʵ��Interface1�ķ���
 *
 *
 * ����ʵ����B����Ҫʵ��4��5������D����Ҫʵ��2��3�����������ڽ���һ��Interface1�ӿ��࣬��˵���B,Dʵ��������ʵ�ֵĽӿڣ����Բ������Ͻӿڸ���ԭ��
 */
public class Tradition {
	public static void main(String[] args) {
		A a = new A();
		a.depend1(new B()); // A��ͨ���ӿ�ȥ����B��
		a.depend2(new B());
		a.depend3(new B());
		C c = new C();
		c.depend1(new D()); // C��ͨ���ӿ�ȥ����(ʹ��)D��
		c.depend4(new D());
		c.depend5(new D());
	}
}

//�ӿ�
interface Interface1 {
	void operation1();
	void operation2();
	void operation3();
	void operation4();
	void operation5();
}

class B implements Interface1 {
	public void operation1() {
		System.out.println("B ʵ���� operation1");
	}
	public void operation2() {
		System.out.println("B ʵ���� operation2");
	}
	public void operation3() {
		System.out.println("B ʵ���� operation3");
	}
	public void operation4() {
		System.out.println("B ʵ���� operation4");
	}
	public void operation5() {
		System.out.println("B ʵ���� operation5");
	}
}

class D implements Interface1 {
	public void operation1() {
		System.out.println("D ʵ���� operation1");
	}
	public void operation2() {
		System.out.println("D ʵ���� operation2");
	}
	public void operation3() {
		System.out.println("D ʵ���� operation3");
	}
	public void operation4() {
		System.out.println("D ʵ���� operation4");
	}
	public void operation5() {
		System.out.println("D ʵ���� operation5");
	}
}

class A { //A ��ͨ���ӿ�Interface1 ����(ʹ��) B�࣬����ֻ���õ�1,2,3����
	public void depend1(Interface1 i) {
		i.operation1();
	}
	public void depend2(Interface1 i) {
		i.operation2();
	}
	public void depend3(Interface1 i) {
		i.operation3();
	}
}

class C { //C ��ͨ���ӿ�Interface1 ����(ʹ��) D�࣬����ֻ���õ�1,4,5����
	public void depend1(Interface1 i) {
		i.operation1();
	}
	public void depend4(Interface1 i) {
		i.operation4();
	}
	public void depend5(Interface1 i) {
		i.operation5();
	}
}