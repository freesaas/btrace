import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.Self;
import com.sun.btrace.annotations.Location;
import com.sun.btrace.annotations.Kind;

@BTrace
public class TraceServletRequestWrapper {

	@OnMethod(clazz = "javax.servlet.ServletResponseWrapper", method = "<init>", location = @Location(Kind.ENTRY))
	public static void onInit(@Self Object obj, javax.servlet.ServletResponse param) {
		BTraceUtils.println("======being init ServletResponseWrapper======");
		BTraceUtils.println(BTraceUtils.concat("ServletResponseWrapper init Response hash:",
		        BTraceUtils.str(BTraceUtils.hash(param))));
		BTraceUtils.println("======end ServletResponseWrapper======");
	}
}
