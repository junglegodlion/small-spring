package cn.bugstack.springframework.beans.factory.support;

import cn.bugstack.springframework.beans.BeansException;
import cn.bugstack.springframework.beans.factory.config.BeanDefinition;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

import java.lang.reflect.Constructor;

/**
 * Cglib 实例化
 * @author lichuang3
 * @date 2021/9/28 2021/9/28
 */
public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy {

    /**
     * 其实 Cglib 创建有构造函数的 Bean 也非常方便，在这里我们更加简化的处理了，
     * 如果你阅读 Spring 源码还会看到 CallbackFilter 等实现，
     * 不过我们目前的方式并不会影响创建。
     * @author lichuang3
     * @date 2021/9/28 2021/9/28
     * @param beanDefinition
     * @param beanName
     * @param ctor
     * @param args
     * @return java.lang.Object
     */
    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(beanDefinition.getBeanClass());
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        if (null == ctor) return enhancer.create();
        return enhancer.create(ctor.getParameterTypes(), args);
    }

}
