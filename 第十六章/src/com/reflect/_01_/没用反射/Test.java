package com.reflect._01_.没用反射;

/**
 * @author ty.wang
 * @since 2022/10/18 22:46
 */
public class Test {
    public static void main(String[] args) {
        String str = "zfb";
        if ("wx".equals(str)){
            //微信支付
            pay(new Wechat());
        }
        if ("zfb".equals(str)){
            //支付宝支付
            pay(new AliPay());
        }
        if ("bank".equals(str)){
            //支付宝支付
            pay(new BankCard());
        }
    }
    
    public static void pay(Mtwm m){
        m.payOnline();
    }

}
