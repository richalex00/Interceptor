package weatherStation;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(10000, 10000, 10000f);

        Dispatcher dispatcher = new Dispatcher();
        ErrorHandlerInterceptor errorHandling = new ErrorHandlerInterceptor();
        ContextObject contextObject = new ContextObject(weatherData);

        dispatcher.add(errorHandling);
        dispatcher.dispatch(contextObject);
    }
}
