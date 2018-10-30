import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.Self;
import com.sun.btrace.annotations.Location;
import com.sun.btrace.annotations.Kind;

@BTrace
public class TraceServletContextAction {

	@OnMethod(clazz = "org.apache.struts2.ServletActionContext", method = "setResponse", location = @Location(Kind.ENTRY))
	public static void onSetResponse(@Self Object obj, javax.servlet.http.HttpServletResponse param) {
		BTraceUtils.println("======being ServletActionContext setResponse======");
		BTraceUtils.println(BTraceUtils.concat("ServletActionContext setResponse Response hash:",
		        BTraceUtils.str(BTraceUtils.identityHashCode(param))));
		
		BTraceUtils.println("======end ServletResponseWrapper======");
	}
}
