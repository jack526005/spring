import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test4 {
    public static void main(String[] args) {
//        生命周期
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application.xml");

        context.close();
    }
}
