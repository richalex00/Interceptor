package weatherStation;

public class ContextObject {
    WeatherData weatherdata;

    public ContextObject(WeatherData weatherdata) {
        this.weatherdata = weatherdata;
    }

    public float[] updateWeather(){
        float[] meteorologist = new float[3];

        meteorologist[0] = weatherdata.getTemperature();
        meteorologist[1] = weatherdata.getHumidity();
        meteorologist[2] = weatherdata.getPressure();

        return meteorologist;
    }

}
