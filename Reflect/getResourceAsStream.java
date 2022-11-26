import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;

public class IoPropertiesTest {
    public static void main(String[] args) throws Exception {
        //获取一个文件的绝对路径！
        /*
        String path = Thread.currentThread().getContextClassLoader().getResource("classinfo.properties").getPath();
        FileReader reader = new FileReader(path);
         */

        //代替上述两行代码，以流的形式直接返回
        InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("classinfo.properties");

        Properties pro = new Properties();
        pro.load(in);
        in.close();

        //通过key获取value
        String className = pro.getProperty("className");
        System.out.println(className);
    }
}
