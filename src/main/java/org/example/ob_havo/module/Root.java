package org.example.ob_havo.module;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Root{
    public double latitude;
    public double longitude;
    public double generationtime_ms;
    public int utc_offset_seconds;
    public String timezone;
    public String timezone_abbreviation;
    public double elevation;
    public CurrentWeatherUnits current_weather_units;
    public CurrentWeather current_weather;
    public HourlyUnits hourly_units;
    public Hourly hourly;
}