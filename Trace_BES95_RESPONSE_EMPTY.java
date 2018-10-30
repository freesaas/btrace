import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.Self;

@BTrace
public class Trace_BES95_RESPONSE_EMPTY {

	@OnMethod(clazz = "org.apache.coyote.Response", method = "setStatus")
	public static void setCoyoteStatus(@Self Object obj,int status) {
		BTraceUtils.println("======being setStatuscoyote.Response======");
		BTraceUtils.jstack();
		BTraceUtils.println(BTraceUtils.concat("status:", BTraceUtils.str(status)));
		BTraceUtils.println("======end setStatuscoyote.Response======");

	}
	
	@OnMethod(clazz = "org.apache.catalina.connector.Response", method = "setStatus")
	public static void setCRStatus(@Self Object obj,int status,String message) {
		BTraceUtils.println("======being setStatus-connector.Response======");
		BTraceUtils.jstack();
		BTraceUtils.println(BTraceUtils.concat("status:", BTraceUtils.str(status)));
		BTraceUtils.println("======end setStatus-connector.Response======");

	}
	
	@OnMethod(clazz = "org.apache.catalina.connector.Response", method = "sendError")
	public static void setCRError(@Self Object obj,int status,String message) {
		BTraceUtils.println("======being sendError======");
		BTraceUtils.jstack();
		BTraceUtils.println(BTraceUtils.concat("status:", BTraceUtils.str(status)));
		BTraceUtils.println("======end sendError======");

	}

	@OnMethod(clazz = "org.apache.tomcat.util.http.Parameters", method = "processParameters")
	public static void processParameters(@Self Object obj) {
		BTraceUtils.println("======being processParameters======");
		BTraceUtils.jstack();
		BTraceUtils.println("======end processParameters======");
	}

}
