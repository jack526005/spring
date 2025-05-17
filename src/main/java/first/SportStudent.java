package first;

public class SportStudent extends Student{
    private String name;
    private String id;

    public void setName(String name) {
        this.name = name;
    }
    public void sport(){
        System.out.println("我爱运动");
    }
    public void sayName(){
        System.out.println("我的名字是"+name);
    }
    public void setId(String id) {
        this.id = id;
    }
    public void sayId(){
        System.out.println(id);
    }
}
