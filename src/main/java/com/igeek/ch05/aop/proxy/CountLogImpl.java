package com.igeek.ch05.aop.proxy;

/**
 * 计算器的实现类：增加需求1-日志：在程序执行期间追踪正在发生的活动
 * 缺点：
 * 1.大量的冗余代码（非业务逻辑的代码）
 * 2.维护拓展困难
 */
public class CountLogImpl implements ICount {

    @Override
    public int add(int a, int b) {
        System.out.println("日志追踪：the method add begin with ["+a+" , "+ b +"]");
        int result = a+b;
        System.out.println("日志追踪：the method add end with "+result);
        return result;
    }

    @Override
    public int sub(int a, int b) {
        System.out.println("日志追踪：the method sub begin with ["+a+" , "+ b +"]");
        int result = a-b;
        System.out.println("日志追踪：the method sub end with "+result);
        return result;
    }

    @Override
    public int mul(int a, int b) {
        System.out.println("日志追踪：the method mul begin with ["+a+" , "+ b +"]");
        int result = a*b;
        System.out.println("日志追踪：the method mul end with "+result);
        return result;
    }

    @Override
    public int div(int a, int b) {
        System.out.println("日志追踪：the method div begin with ["+a+" , "+ b +"]");
        int result = a/b;
        System.out.println("日志追踪：the method div end with "+result);
        return result;
    }
}
