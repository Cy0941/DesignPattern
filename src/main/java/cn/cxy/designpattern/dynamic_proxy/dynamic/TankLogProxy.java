package cn.cxy.designpattern.dynamic_proxy.dynamic;


/**
 * Function: 静态代理
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/19 22:01 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */

@Deprecated
public class TankLogProxy implements Vehicle {

    Vehicle t;

    public TankLogProxy(Vehicle t) {
        this.t = t;
    }

    @Override
    public void move() {
        System.out.println("Log start...");
        t.move();
        System.out.println("Log end...");
    }
}
