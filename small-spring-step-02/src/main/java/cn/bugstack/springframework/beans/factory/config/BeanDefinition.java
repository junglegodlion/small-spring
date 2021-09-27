package cn.bugstack.springframework.beans.factory.config;

/**
 * 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 * 公众号：bugstack虫洞栈
 * Create by 小傅哥(fustack)
 * 用于定义 Bean 实例化信息，注册的时候只注册一个类信息
 */
public class BeanDefinition {

    // 注册的时候只注册一个类信息
    private Class beanClass;

    /**
     * 构造器
     * @author lichuang3
     * @date 2021/9/27 2021/9/27
     */
    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    /**
     * 获取bean的类信息
     * @author lichuang3
     * @date 2021/9/27 2021/9/27
     * @return java.lang.Class
     */
    public Class getBeanClass() {
        return beanClass;
    }

    /**
     * 设置bean
     * @author lichuang3
     * @date 2021/9/27 2021/9/27
     * @param beanClass
     */
    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
