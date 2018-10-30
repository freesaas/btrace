import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.Self;

@BTrace
public class Trace_BES95_JDBC_CLOSE_CON {

	@OnMethod(clazz = "oracle.jdbc.driver.PhysicalConnection", method = "close")
	public static void close(@Self Object obj) {
		BTraceUtils.println("======being PhysicalConnection.close======");
		BTraceUtils.jstack();
		BTraceUtils.println("======end PhysicalConnection.close======");
	}

}
