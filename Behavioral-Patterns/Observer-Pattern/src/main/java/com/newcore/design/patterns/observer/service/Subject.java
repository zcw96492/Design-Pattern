package com.newcore.design.patterns.observer.service;

import com.newcore.design.patterns.observer.service.observe.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 科目类(观察者模式核心类)
 * @author zhouchaowei
 */
public class Subject {

    /** 存放观察者们的列表 */
    private final List<Observer> observers = new ArrayList<Observer>();

    /** 状态 */
    private int state;

    public int getState() {
        return state;
    }

    /**
     * 设置状态
     * @param state 状态
     */
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    /**
     * 向观察者列表添加观察者
     * @param observer 观察者
     */
    public void attach(Observer observer){
        observers.add(observer);
    }

    /**
     * 通知其他观察者们
     */
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
