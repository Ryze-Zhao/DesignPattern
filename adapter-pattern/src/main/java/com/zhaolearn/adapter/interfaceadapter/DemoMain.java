package com.zhaolearn.adapter.interfaceadapter;
/**
 * �ӿ�������
 *
 *
 * ���̣�
 * 1�������Լ��Ľӿڣ�MyInterface���з���1��2��3��4
 * 2����������ֻҪ���ַ����������Ҫ�и���������Ϊ�ӿ���������AbsAdapter��
 *
 * ע��JDK8����ʵ�ӿڿ���ʹ�� default ��ΪĬ�Ϸ������Ӷ����Թ�ܵ�����Ҫ�Ľӿ�
 *
 * @author: HeHaoZhao
 * @date: 2020/1/28 17:45
 */
public class DemoMain {
	public static void main(String[] args) {
		AbsAdapter absAdapter = new AbsAdapter() {
			//ֻ��Ҫȥ�������� ��Ҫʹ�� �ӿڷ���
			@Override
			public void m1() {
				System.out.println("ʹ����m1�ķ���");
			}
		};
		absAdapter.m1();
	}
}
