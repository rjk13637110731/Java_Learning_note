import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] args) {
        //资源绑定器只能绑定xxx.properties文件，并且该文件必须在类路径下。文件扩展名也必须是properties
        //并且在写路径的时候，路径后面的扩展名.properties不能写。
        ResourceBundle bundle = ResourceBundle.getBundle("classinfo");

        String className = bundle.getString("className");
        System.out.println(className);
    }
}
