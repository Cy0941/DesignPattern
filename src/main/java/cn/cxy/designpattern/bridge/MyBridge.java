package cn.cxy.designpattern.bridge;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/26 18:17 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class MyBridge extends Bridge {
    public void method(){
        getSourceable().method();
    }
}
