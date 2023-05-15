package tech.llt.springframework.entity;

public class User {
    /**
     * 用户名字
     */
    private String name;
    /**
     * 用户年龄
     */
    private int age;

    /**
     * 初始化
     */
    public User(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
