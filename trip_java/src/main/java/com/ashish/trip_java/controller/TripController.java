package com.ashish.trip_java.controller;

import com.ashish.trip_java.domain.AirportInfomation;
import com.ashish.trip_java.domain.FareInfo;
import com.ashish.trip_java.sevice.AirportService;
import com.ashish.trip_java.sevice.FareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TripController {

    private final AirportService airportService ;

    private final FareService fareService ;

    public TripController(AirportService airportService, FareService fareService) {
        this.airportService = airportService;
        this.fareService = fareService;
    }

    @GetMapping(value = "/trip/airportinfo/{term}" , produces = "application/json")
    public AirportInfomation getAirportInformation(@PathVariable String term) {
        return airportService.search(term) ;
    }

    @GetMapping(value = "/trip/fare/{srcCode}/{destCode}" , produces = "application/json")
    public FareInfo getFare(@PathVariable String srcCode , @PathVariable String destCode) {
        return fareService.getFare(srcCode,destCode) ;
    }


}
