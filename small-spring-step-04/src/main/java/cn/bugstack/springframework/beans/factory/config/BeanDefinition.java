package cn.bugstack.springframework.beans.factory.config;

import cn.bugstack.springframework.beans.PropertyValues;

/**
 * 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 * 公众号：bugstack虫洞栈
 * Create by 小傅哥(fustack)
 *
 * 在 Bean 注册的过程中是需要传递 Bean 的信息
 * 为了把属性一定交给 Bean 定义，所以这里填充了 PropertyValues 属性，
 * 同时把两个构造函数做了一些简单的优化，
 * 避免后面 for 循环时还得判断属性填充是否为空
 */
public class BeanDefinition {

    private Class beanClass;

    // BeanDefinition中添加了属性信息
    private PropertyValues propertyValues;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
        this.propertyValues = new PropertyValues();
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}
