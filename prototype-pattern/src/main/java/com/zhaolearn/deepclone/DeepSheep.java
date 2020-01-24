package com.zhaolearn.deepclone;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.io.*;
/**
 * 羊类：
 *  注意：1、不能使用@Data注解，因为除了Get/Set，还有hashCode、equals、toString重写
 *
 * @author: HeHaoZhao
 * @date: 2020/1/24 22:25
 */
@Getter
@Setter
@ToString
public class DeepSheep implements Serializable, Cloneable {
    private String name; //String 属性
    private DeepCattle deepCattle;// 引用类型
    public DeepSheep() {}
    public DeepSheep(String name, DeepCattle deepCattle) {
        this.name = name;
        this.deepCattle = deepCattle;
    }
    //深拷贝 - 方式 1 使用clone 方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //这里完成对基本数据类型(属性)和String的克隆
        Object deep = super.clone();
        //对引用类型的属性，进行单独处理
        DeepSheep deepProtoType = (DeepSheep) deep;
        deepProtoType.deepCattle = (DeepCattle) deepCattle.clone();
        return deepProtoType;
    }

    //深拷贝 - 方式2 通过对象的序列化实现 (推荐)
    public Object deepClone() {
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); //当前这个对象以对象流的方式输出
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepSheep copyObj = (DeepSheep) ois.readObject();
            return copyObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            //关闭流
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
