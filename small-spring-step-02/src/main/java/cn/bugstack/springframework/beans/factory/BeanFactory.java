package cn.bugstack.springframework.beans.factory;

import cn.bugstack.springframework.beans.BeansException;

/**
 * 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 * 公众号：bugstack虫洞栈
 * Create by 小傅哥(fustack)
 */
public interface BeanFactory {

    /**
     * 提供 Bean 的获取方法
     * @author lichuang3
     * @date 2021/9/27 2021/9/27
     * @param name
     * @return java.lang.Object
     */
    Object getBean(String name) throws BeansException;

}
