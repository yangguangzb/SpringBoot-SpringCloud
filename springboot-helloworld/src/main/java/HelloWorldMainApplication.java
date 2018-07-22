import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author zb
 * @Date 2018/7/22
 */

/**
 * 标注一个主程序类，说明这是一个SpringBoot应用
 */
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args) {

        //启动Spring应用
        SpringApplication.run(HelloWorldMainApplication.class, args);

    }

}
