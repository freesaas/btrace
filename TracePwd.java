import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.Kind;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.Self;
import com.sun.btrace.annotations.Location;;

@BTrace
public class TracePwd {
	
	@OnMethod(clazz="com.bes.enterprise.container.common.GenericAdminAuthenticator",
			method="handleFileRealm", location=@Location(Kind.ENTRY))
	public static void testInsertBatchFlowTask(@Self Object obj, String user, String pwd) {
		BTraceUtils.println("entry=======handleFileRealm============");
		BTraceUtils.println("entry=======usr============");
		BTraceUtils.println(user);
		BTraceUtils.println("entry=======pwd============");
		BTraceUtils.println(pwd);
		BTraceUtils.println("entry=======over============");
	}
	

}
