package cn.cxy.designpattern.test.factory;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/26 14:46 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mail sender");
    }
}
