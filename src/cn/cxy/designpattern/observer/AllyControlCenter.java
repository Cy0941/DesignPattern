package cn.cxy.designpattern.observer;

import java.util.ArrayList;

/**
 * Function: 目标（主题） - 被观察的对象
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/22 18:36 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public abstract class AllyControlCenter {

    protected String allyName; //战队名称
    protected ArrayList<Observer> players = new ArrayList<Observer>(); //定义一个集合用于存储战队成员

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    public String getAllyName() {
        return this.allyName;
    }

    //注册方法
    public void join(Observer obs) {
        System.out.println(obs.getName() + "加入" + this.allyName + "战队！");
        players.add(obs);
    }

    //注销方法
    public void quit(Observer obs) {
        System.out.println(obs.getName() + "退出" + this.allyName + "战队！");
        players.remove(obs);
    }

    //声明抽象通知方法
    public abstract void notifyObserver(String name);

}
