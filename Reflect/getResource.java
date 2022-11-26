import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class IoPropertiesTest {
    public static void main(String[] args) throws Exception {
        //获取一个文件的绝对路径！
        String path = Thread.currentThread().getContextClassLoader().getResource("classinfo.properties").getPath();

        FileReader reader = new FileReader(path);
        Properties pro = new Properties();
        pro.load(reader);
        reader.close();

        //通过key获取value
        String className = pro.getProperty("className");
        System.out.println(className);
    }
}
