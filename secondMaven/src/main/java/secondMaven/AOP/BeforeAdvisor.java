package secondMaven.AOP;
import java.lang.reflect.Method;  
public class BeforeAdvisor implements MethodBeforeAdvice{  
    public void before(Method method, Object[] args, Object target)throws Throwable {  
        System.out.println("additional concern before actual logic");  
    }

}  