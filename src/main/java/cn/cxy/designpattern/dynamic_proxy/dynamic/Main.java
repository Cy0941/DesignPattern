package cn.cxy.designpattern.dynamic_proxy.dynamic;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/19 23:02 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Tank t = new Tank();
        InvocationHandler handler = new LogHandler(t);
        Vehicle o = (Vehicle)Proxy.newInstance(Vehicle.class, handler);
        o.move();
    }

}
