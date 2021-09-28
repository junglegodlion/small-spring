package cn.bugstack.springframework.test.bean;

/**
 * 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 * 公众号：bugstack虫洞栈
 * Create by 小傅哥(fustack)
 */
public class UserService {

    public void queryUserInfo(){
        System.out.println("查询用户信息");
    }

    /**
     * 如果我们去实例化一个含有构造函数的对象那么就要抛异常了。
     * 发生这一现象的主要原因就是因为 beanDefinition.getBeanClass().newInstance();
     * 实例化方式并没有考虑构造函数的入参，所以就这个坑就在这等着你了
     * @author lichuang3
     * @date 2021/9/28 2021/9/28
     * @param null 
     * @return null
     */
//    private String name;
//
//    public UserService(String name) {
//        this.name = name;
//    }

}
