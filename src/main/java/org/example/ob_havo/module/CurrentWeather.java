package org.example.ob_havo.module;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CurrentWeather{
    public String time;
    public int interval;
    public double temperature;
    public double windspeed;
    public int winddirection;
    public int is_day;
    public int weathercode;
}