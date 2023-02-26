package weatherStation;

public class ErrorHandlerInterceptor implements Interceptor {
    public void intercept(ContextObject contextObject) {
        float[] arr = contextObject.updateWeather();

        if (arr[0] > 100) {
            System.out.println("ERROR : the interceptor has intercepted an error in the temperature!");
        }
        if (arr[1] > 150) {
            System.out.println("ERROR : the interceptor has intercepted an error in the humidity!");
        }
        if (arr[2] > 2000) {
            System.out.println("ERROR : the interceptor has intercepted an error in the pressure!");
        }
    }
}