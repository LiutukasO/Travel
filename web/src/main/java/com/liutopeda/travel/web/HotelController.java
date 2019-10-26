package com.liutopeda.travel.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.liutopeda.travel.domain.Hotel;
import com.liutopeda.travel.persistence.HotelRepository;

import java.util.List;

@RestController
public class HotelController {
    private HotelRepository hotelRepository;

    public HotelController(HotelRepository hotelRepository){
        this.hotelRepository = hotelRepository;
    }

    @GetMapping("/hotels")
    public List<Hotel> getHotels(){
        List<Hotel> hotels = this.hotelRepository.findAll();

        return hotels;
    }
}