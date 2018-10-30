import com.sun.btrace.AnyType;
import com.sun.btrace.BTraceUtils;
import com.sun.btrace.BTraceUtils.Threads;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.Self;
import com.sun.btrace.annotations.Location;
import com.sun.btrace.annotations.Kind;

@BTrace
public class TraceOnRedirectUpdateSessionResponseWrapper {

	@OnMethod(clazz = "org.apache.struts2.dispatcher.ng.PrepareOperations", method = "createActionContext", location = @Location(Kind.ENTRY))
	public static void onCreateActionContext(@Self Object obj, AnyType[] params) {
		BTraceUtils.println("======being createActionContext======");
		BTraceUtils.println(BTraceUtils.concat(
		        BTraceUtils.concat("createActionContext Response hash:", BTraceUtils.str(BTraceUtils.identityHashCode(params[1]))),
		        BTraceUtils.concat("current thread:", Threads.name(BTraceUtils.currentThread()))));

		BTraceUtils.println("======end createActionContext======");
	}
}
