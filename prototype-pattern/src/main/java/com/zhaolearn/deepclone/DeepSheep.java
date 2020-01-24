package com.zhaolearn.deepclone;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.io.*;
/**
 * ���ࣺ
 *  ע�⣺1������ʹ��@Dataע�⣬��Ϊ����Get/Set������hashCode��equals��toString��д
 *
 * @author: HeHaoZhao
 * @date: 2020/1/24 22:25
 */
@Getter
@Setter
@ToString
public class DeepSheep implements Serializable, Cloneable {
    private String name; //String ����
    private DeepCattle deepCattle;// ��������
    public DeepSheep() {}
    public DeepSheep(String name, DeepCattle deepCattle) {
        this.name = name;
        this.deepCattle = deepCattle;
    }
    //��� - ��ʽ 1 ʹ��clone ����
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //������ɶԻ�����������(����)��String�Ŀ�¡
        Object deep = super.clone();
        //���������͵����ԣ����е�������
        DeepSheep deepProtoType = (DeepSheep) deep;
        deepProtoType.deepCattle = (DeepCattle) deepCattle.clone();
        return deepProtoType;
    }

    //��� - ��ʽ2 ͨ����������л�ʵ�� (�Ƽ�)
    public Object deepClone() {
        //����������
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //���л�
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); //��ǰ��������Զ������ķ�ʽ���
            //�����л�
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepSheep copyObj = (DeepSheep) ois.readObject();
            return copyObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            //�ر���
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e2) {
                e2.printStackTrace();
				return null;
            }
        }
    }
}
