/**
 * Created by DominikH on 24.04.2017.
 */
package com.example.iot.data.repository;

import com.example.iot.data.entity.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, Long> {
}
