import static com.sun.btrace.BTraceUtils.*;

import java.lang.reflect.Field;

import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.Self;
import com.sun.btrace.annotations.Location;
import com.sun.btrace.annotations.Kind;

@BTrace
public class TraceBaseEntry {

	private static Field response = field(
	        classForName("com.neusoft.unieap.techcomp.ria.action.BaseEntry", contextClassLoader()), "response");

	@OnMethod(clazz = "com.neusoft.unieap.techcomp.ria.action.BaseEntry", method = "setServletResponse", location = @Location(Kind.RETURN))
	public static void onSetServletResponse(@Self Object obj, javax.servlet.http.HttpServletResponse param) {
		println("======being setServletResponse======");
		jstack();
		println("======trace end setServletResponse======");
		Object res = get(response, obj);get
		println(concat("Original Response:", str(res)));
		println(concat("After Response:", str(param)));
		println("======end setServletResponse======");
	}
}
