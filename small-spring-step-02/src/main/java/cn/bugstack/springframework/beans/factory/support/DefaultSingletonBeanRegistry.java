package cn.bugstack.springframework.beans.factory.support;

import cn.bugstack.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 * 公众号：bugstack虫洞栈
 * Create by 小傅哥(fustack)
 *
 * 默认单例注册表
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    // 同工厂类相同，其内部也维护了一个map作为容器
    // 单例容器
    private Map<String, Object> singletonObjects = new HashMap<>();

    /**
     * 获取bean单例
     * @author lichuang3
     * @date 2021/9/27 2021/9/27
     * @param beanName 传入bean的名字
     * @return java.lang.Object 返回的是一个实例对象
     */
    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    /**
     * 添加单例对象
     * protected 一个类的protected方法或成员变量，在包外是不能通过该类对象进行访问的，即便在该类的子类中也不可这么做；
     * @author lichuang3
     * @date 2021/9/27 2021/9/27
     * @param beanName
     * @param singletonObject
     */
    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }

}
