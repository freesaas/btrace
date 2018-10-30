import java.lang.reflect.Field;

import com.sun.btrace.BTraceUtils;
import com.sun.btrace.BTraceUtils.Reflective;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.Kind;
import com.sun.btrace.annotations.Location;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.Self;

@BTrace
public class TraceDirectBuffer {
	
	private String max;
	private static Field maxMemoryField = Reflective.field("java.nio.Bits", "maxMemory");
	private static Field reservedMemoryField = Reflective.field("java.nio.Bits", "maxMemory");
	static{
		
	}

	@OnMethod(clazz="java.nio.Bits", method="tryReserveMemory")
	public static void getTryReserveMemory(@Self Object self) {
		Reflective.get(maxMemoryField, self);
		BTraceUtils.println("entry=======testInsertBatchFlowTask============");
		BTraceUtils.jstack();
	}
}
