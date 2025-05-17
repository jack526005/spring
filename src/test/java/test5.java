import first.ArtStudent;
import first.SportStudent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import scecond.ArtTeacher;

public class test5 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
        ArtStudent artStudent = (ArtStudent) context.getBean("artStudent");
        SportStudent sportStudent= (SportStudent) context.getBean("sportStudent");
        artStudent.sayName();
        sportStudent.sayName();
        artStudent.sayId();
        sportStudent.sayId();
    }
}
