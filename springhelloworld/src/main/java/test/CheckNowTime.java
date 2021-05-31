package test;

import java.util.Date;

public class CheckNowTime {
    public void beforDoHomework(){
        System.out.println("先执行时间校验，看看当前时间是："+new Date(System.currentTimeMillis()));
    }

    public void afterDoHomework(){
        System.out.println("完成后看看当前时间是："+new Date(System.currentTimeMillis()));
    }
}
