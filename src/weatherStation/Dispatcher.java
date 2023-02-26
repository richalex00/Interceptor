package weatherStation;

import java.util.ArrayList;

public class Dispatcher {
    ArrayList<Interceptor> concreteInterceptors = new ArrayList<Interceptor>();

    public void add(Interceptor interceptor) {
        concreteInterceptors.add(interceptor);
    }

    public void dispatch(ContextObject contextObject) {
        for (Interceptor temp : concreteInterceptors) {
            temp.intercept(contextObject);
        }
    }
}
