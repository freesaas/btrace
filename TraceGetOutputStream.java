import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.Kind;
import com.sun.btrace.annotations.Location;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.Self;

@BTrace
public class TraceGetOutputStream {

	@OnMethod(clazz = "org.apache.coyote.tomcat5.CoyoteResponse", method = "getOutputStream")
	public static void onGetOutputStream(@Self Object obj) {
		BTraceUtils.println("======being GetOutputStream======");
		BTraceUtils.jstack();
		BTraceUtils.println(BTraceUtils.concat("common hash:", BTraceUtils.str(BTraceUtils.identityHashCode(obj))));
		BTraceUtils.println("======end GetOutputStream======");

	}

	@OnMethod(clazz = "org.apache.coyote.tomcat5.CoyoteResponse", method = "getWriter", location = @Location(Kind.THROW))
	public static void onGetWriter(@Self Object obj) {
		BTraceUtils.println("======being onGetWriter======");
		BTraceUtils.jstack();
		BTraceUtils.println(BTraceUtils.concat("error hash:", BTraceUtils.str(BTraceUtils.identityHashCode(obj))));
		BTraceUtils.println("======end onGetWriter======");

	}

	@OnMethod(clazz = "org.apache.coyote.http11.InternalInputBuffer", method = "nextRequest", location = @Location(Kind.ENTRY))
	public static void onNextRequest(@Self Object obj) {
		BTraceUtils.println("======being onNextRequest======");
		int lastValidField = (Integer)BTraceUtils.get(BTraceUtils.field("org.apache.coyote.http11.InternalInputBuffer", "lastValid"), obj);
		int posField = (Integer)BTraceUtils.get(BTraceUtils.field("org.apache.coyote.http11.InternalInputBuffer", "pos"), obj);
		BTraceUtils.jstack();
		BTraceUtils.println(BTraceUtils.concat("lastValidField:", BTraceUtils.str(lastValidField)));
		BTraceUtils.println(BTraceUtils.concat("posField:", BTraceUtils.str(posField)));
		BTraceUtils.println("======end onNextRequest======");

	}
}
