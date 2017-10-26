
import java.lang.reflect.Field;
public class Main {
    
    //declare native method
	public native int add(int a, int b);

	static {
        try {
            //set native c++ lib path
            System.setProperty("java.library.path", System.getProperty("java.library.path") + ":/Users/dapan/Desktop/JniTest/jnilib");
            Field fieldSysPath = ClassLoader.class.getDeclaredField("sys_paths");
            fieldSysPath.setAccessible(true);
            fieldSysPath.set(null, null);
            
            //set native c++ lib
            System.loadLibrary("JNIADD");
        } catch(Exception e) {
            //print Error
            e.printStackTrace();
        }
		
	}
	public static void main(String[] args) {
		
		Main main = new Main();
		int c = main.add(2, 3);
		System.out.println(c);
	}

}
