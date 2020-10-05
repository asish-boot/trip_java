package com.ashish.trip_java.sevice;

import com.ashish.trip_java.domain.AirportInfomation;
import com.ashish.trip_java.domain.AirportRawInfo;
import com.ashish.trip_java.domain.Location;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class AirportService {

    private final WebClient webClient ;

    public AirportService(WebClient webClient) {
        this.webClient = webClient;
    }

    public AirportInfomation search(String term){
       AirportRawInfo information = webClient.get().uri("http://localhost:8080/airports?size=100&term="+term).retrieve().bodyToMono(AirportRawInfo.class).block();
       if(information != null){
           List<Location> locs = information.getEmbedded().getLocations();
           if( locs != null && !locs.isEmpty())
           return new AirportInfomation(locs.get(0).getName(),locs.get(0).getCode());
       }
         return new AirportInfomation("","");
    }
}
