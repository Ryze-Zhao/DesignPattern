package com.zhaolearn.memento;

/**
 * Hello world!
 *
 */
public class Originator {
    private String status;
    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return status;
    }
    public Memento saveStatusToMemento(){
        return new Memento(status);
    }
    public void getStatusFromMemento(Memento Memento){
        status = Memento.getStatus();
    }
}
