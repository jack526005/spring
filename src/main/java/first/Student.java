package first;

import scecond.Teacher;

import java.util.List;

public class Student {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }
    private Teacher teacher;
//setter依赖注入
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public void study(){
        teacher.teach();
    }

    public void hello(){
        System.out.println("hello,word");

    }
//    依赖注入传入一个固定值
String name;
    public void setName(String name) {
        this.name = name;
    }
    public void sayName(){
        System.out.println(name);
    }
    public void showList(){
        System.out.println(list);
    }
    public void init(){
        System.out.println("我是对象初始化时要做的事情!");

    }
    public void destroy(){
        System.out.println("我是对象销毁时要做的事情！");
    }


}
