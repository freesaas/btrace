import com.sun.btrace.AnyType;
import com.sun.btrace.BTraceUtils;
import com.sun.btrace.BTraceUtils.Reflective;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.Return;
import com.sun.btrace.annotations.Self;
import com.sun.btrace.annotations.Location;
import com.sun.btrace.annotations.Kind;

@BTrace
public class TraceDispatcher {

	@OnMethod(clazz = "java.util.HashMap", method = "put", location = @Location(Kind.RETURN))
	public static void onPutMap(@Self Object obj, String key, String value, @Return AnyType result) {
		BTraceUtils.println("======being put======");
		if(BTraceUtils. == 2){
			if (BTraceUtils.compare("com.opensymphony.xwork2.dispatcher.HttpServletResponse", pa[0])) {
				BTraceUtils.jstack();
				BTraceUtils.println(BTraceUtils.concat("Struts Response:",
				        BTraceUtils.str(Reflective.name(BTraceUtils.classOf(pa[1])))));
			}
		}
		BTraceUtils.println("======trace end put======");
	}

}
