package org.example.ob_havo.module;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Hourly{
    public ArrayList<String> time;
    public ArrayList<Double> temperature_2m;
    public ArrayList<Integer> relativehumidity_2m;
    public ArrayList<Double> windspeed_10m;
}
