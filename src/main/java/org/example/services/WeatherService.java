package org.example.services;

import org.example.models.LatLon;
import org.example.models.WeatherObject;
import org.springframework.web.client.RestTemplate;

public class WeatherService {
    private RestTemplate template = new RestTemplate();
    private final String API_URL = "http://api.openweathermap.org/geo/1.0/zip";
    private final String API_KEY = "95b38a15a365ad53200a24d381962f21";

    public LatLon getLatLon (String zipcode){
        String url = API_URL + "?zip=" + zipcode + "&appid=" + API_KEY;
        return template.getForObject(url,LatLon.class);
    }
    public WeatherObject getWeather(LatLon latLon){
        String url = "https://api.openweathermap.org/data/2.5/weather?lat=" + latLon.getLat() +
               "&lon=" + latLon.getLon() + "&appid=" + API_KEY + "&units=imperial";

        return template.getForObject(url, WeatherObject.class);
    }
}
