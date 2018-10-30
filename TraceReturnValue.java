import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.Kind;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.Return;
import com.sun.btrace.annotations.Self;
import com.sun.btrace.annotations.Location;;

@BTrace
public class TraceReturnValue {
	
	@OnMethod(clazz="com.bes.enterprise.container.common.GenericAdminAuthenticator",
			method="handleFileRealm", location=@Location(Kind.ENTRY))
	public static void testInsertBatchFlowTask(@Self Object obj, String user, String pwd) {
		BTraceUtils.println("entry=======testInsertBatchFlowTask============");
		BTraceUtils.jstack();
	}
	
	@OnMethod(clazz="org.apache.coyote.tomcat5.CoyoteRequest",
			method="setCharacterEncoding", location=@Location(Kind.RETURN))
	public static void testSetCharacterEncoding(String parm) {
		BTraceUtils.println("entry=======testSetCharacterEncoding============" + parm);
		BTraceUtils.jstack();
		BTraceUtils.println("entry=======testSetCharacterEncoding=======end=====");
	}
	
	
	@OnMethod(clazz="com.nl.accounting.batchManage.global.action.impl.BatchManageActionImpl",
			method="getTaskDesc", location=@Location(Kind.RETURN))
	public static void testReturn(@Return String ret) {
		BTraceUtils.println("return===================:" + ret);
	}

	@OnMethod(clazz="com.nl.accounting.batchManage.global.action.impl.BatchManageActionImpl",
			method="getSelectCity", location=@Location(Kind.RETURN))
	public static void testGetSelectCity(@Return int ret) {
		BTraceUtils.println("return=========getSelectCity==========:" + ret);
		BTraceUtils.jstack();
	}
	
	@OnMethod(clazz="com.nl.accounting.batchManage.global.action.impl.BatchManageActionImpl",
			method="setTaskDesc", location=@Location(Kind.RETURN))
	public static void testParam(String parm) {
		BTraceUtils.println("param====================:" + parm);
	}

}
