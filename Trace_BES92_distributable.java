import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.Self;

@BTrace
public class Trace_BES92_distributable {

	@OnMethod(clazz = "com.bes.enterprise.core.deployment.WebBundleDescriptor", method = "WebBundleDescriptor")
	public static void setCoyoteStatus(@Self Object obj,Boolean isDistributable) {
		BTraceUtils.println("======being WebBundleDescriptor.WebBundleDescriptor======");
		BTraceUtils.jstack();
		BTraceUtils.println(BTraceUtils.concat("WebBundleDescriptor:", BTraceUtils.str(isDistributable)));
		BTraceUtils.println("======end WebBundleDescriptor.WebBundleDescriptor======");

	}
}
