package com.angel.design.pattern.creational.prototype;

/**
 * 原型模式
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化克隆模板");
        for (int i = 0; i < 10; i++) {
            Mail mailClone = (Mail) mail.clone();
            mailClone.setName("name"+i);
            mailClone.setEmailAddress(i+"@gmail.com");
            mailClone.setContent("我是内容"+i);
            MailUtil.sendMail(mailClone);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
