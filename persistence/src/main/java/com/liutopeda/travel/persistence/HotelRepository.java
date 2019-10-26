package com.liutopeda.travel.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.liutopeda.travel.domain.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
}