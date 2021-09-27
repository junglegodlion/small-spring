package cn.bugstack.springframework.beans.factory.support;

import cn.bugstack.springframework.beans.BeansException;
import cn.bugstack.springframework.beans.factory.BeanFactory;
import cn.bugstack.springframework.beans.factory.config.BeanDefinition;

/**
 * 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 * 公众号：bugstack虫洞栈
 * Create by 小傅哥(fustack)
 *
 * BeanDefinition 注册表接口
 *
 * 这里使用了模板方法，即使用了抽象类
 * 模板方法-适用场景
    ◆一次性实现一个算法的不变的部分,并将可变的行为留给子类来实现
    ◆各子类中公共的行为被提取出来并集中到一个公共父类中,从而避免代码重复
 模板方法-优点
     可以统一收口通用核心方法的调用逻辑和标准定义，
     也就很好的控制了后续的实现者不用关心调用逻辑，
     按照统一方式执行。
     那么类的继承者只需要关心具体方法的逻辑实现即可
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    /**
     * 获取bean是不变的部分
     * @author lichuang3
     * @date 2021/9/27 2021/9/27
     * @param name
     * @return java.lang.Object
     */
    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        // bean不存在，就创建bean实例并返回
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    // 下面交给子类来实现
    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

}
