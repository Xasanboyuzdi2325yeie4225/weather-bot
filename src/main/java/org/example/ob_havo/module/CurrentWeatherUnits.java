package org.example.ob_havo.module;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CurrentWeatherUnits{
    public String time;
    public String interval;
    public String temperature;
    public String windspeed;
    public String winddirection;
    public String is_day;
    public String weathercode;
}
