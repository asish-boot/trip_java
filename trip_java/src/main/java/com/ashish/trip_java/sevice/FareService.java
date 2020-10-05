package com.ashish.trip_java.sevice;

import com.ashish.trip_java.domain.FareInfo;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class FareService {

    private final WebClient webClient ;

    public FareService(WebClient webClient) {
        this.webClient = webClient;
    }

    public FareInfo getFare(String source , String destination){
        String url = String.format("http://localhost:8080/fares/%s/%s", source, destination );
        FareInfo response = webClient.get().uri(url ).retrieve().bodyToMono(FareInfo.class).block();
        if(response == null){
            return new FareInfo();
        }
        return response ;
    }


}
