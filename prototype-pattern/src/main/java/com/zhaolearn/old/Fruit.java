package com.zhaolearn.old;

public abstract class Fruit implements Cloneable {
    private String id;
    protected String variety;//这个可以不用也行
    public abstract void tellMeName();
    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public String getId() {return id;}
    public void setId(String id) { this.id = id; }
    public String getVariety() { return variety;}
}
