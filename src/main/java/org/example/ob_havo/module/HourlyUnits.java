package org.example.ob_havo.module;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class HourlyUnits{
    public String time;
    public String temperature_2m;
    public String relativehumidity_2m;
    public String windspeed_10m;
}
