import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.OnMethod;

@BTrace
public class TraceTimerInit {

	@OnMethod(clazz="java.util.Timer", method="<init>")
	public static void onThreadStart() {
		BTraceUtils.println("======being======");
		BTraceUtils.jstack();
		BTraceUtils.println("======end======");
	}
}
