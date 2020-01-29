package com.zhaolearn.bridge.improve;

/**
 * DemoMain���Ž�ģʽ�ĵ�����
 * �����ࣨPhone����ά����Implementor���ӿڣ�Brand������ҪΪ��ʵ���ࣨHuaWei��XiaoMi�������ǾۺϹ�ϵ��Phone�ۺ���Brand�����������ࣨPhone����Ϊ�Ž���
 * FoldedPhone��UpRightPhone��Ϊ�����ࣨPhone���ĳ���������
 * Brand����Ϊʵ����Ľӿ�
 * FoldedPhone��UpRightPhone����Ϊ�ľ���ʵ����
 *
 * @author: HeHaoZhao
 * @date: 2020/1/29 14:33
 */
public class DemoMain {
    public static void main(String[] args) {
        //��ȡ�۵�ʽ�ֻ� (��ʽ + Ʒ�� )
        Phone phone1 = new FoldedPhone(new XiaoMi());
        phone1.open();
        phone1.call();
        phone1.close();
        System.out.println("=======================");
        Phone phone2 = new FoldedPhone(new HuaWei());
        phone2.open();
        phone2.call();
        phone2.close();
        System.out.println("=======================");
        UpRightPhone phone3 = new UpRightPhone(new XiaoMi());
        phone3.open();
        phone3.call();
        phone3.close();
        System.out.println("=======================");
        UpRightPhone phone4 = new UpRightPhone(new HuaWei());
        phone4.open();
        phone4.call();
        phone4.close();
    }
}
