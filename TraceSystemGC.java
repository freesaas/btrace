import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.OnMethod;

@BTrace
public class TraceSystemGC {

    @OnMethod(clazz = "java.lang.System", method = "gc" )
    public static void startMethod(){
        BTraceUtils.println("****************************************");
        BTraceUtils.jstack();
        BTraceUtils.println("****************************************");
    }
}
