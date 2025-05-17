import first.ArtStudent;
import first.SportStudent;
import first.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
        Student student1= (Student) context.getBean("student");
        ArtStudent art= (ArtStudent) context.getBean("artStudent");//使用别名
        SportStudent sport= (SportStudent) context.getBean("sport");
        Student student2= (Student) context.getBean("student");

        student1.hello();
        sport.sport();
        art.art();
        System.out.println(student2==student1);

    }
}
