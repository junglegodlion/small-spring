package cn.bugstack.springframework.beans.factory;

import cn.bugstack.springframework.beans.BeansException;

/**
 * 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 * 公众号：bugstack虫洞栈
 * Create by 小傅哥(fustack)
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    /**
     * 新增 getBean 接口 用于传入构造器的参数
     *
     * BeanFactory 中我们重载了一个含有入参信息 args 的 getBean 方法，这样就可以方便的传递入参给构造函数实例化了。
     * @author lichuang3
     * @date 2021/9/28 2021/9/28
     * @param name
     * @return java.lang.Object
     */
    Object getBean(String name, Object... args) throws BeansException;

}
