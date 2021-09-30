package cn.bugstack.springframework.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 * 公众号：bugstack虫洞栈
 * Create by 小傅哥(fustack)
 * (属性集合)
 */
public class PropertyValues {

    // list用于存在属性集合
    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    /**
     * 向集合中填写属性
     * @author lichuang3
     * @date 2021/9/30 2021/9/30
     * @param pv
     */
    public void addPropertyValue(PropertyValue pv) {
        this.propertyValueList.add(pv);
    }

    /**
     * 获取所有属性值
     * @author lichuang3
     * @date 2021/9/30 2021/9/30
     */
    public PropertyValue[] getPropertyValues() {
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }

    /**
     * 获取单个属性值
     * @author lichuang3
     * @date 2021/9/30 2021/9/30
     * @param propertyName
     */
    public PropertyValue getPropertyValue(String propertyName) {
        for (PropertyValue pv : this.propertyValueList) {
            if (pv.getName().equals(propertyName)) {
                return pv;
            }
        }
        return null;
    }

}
