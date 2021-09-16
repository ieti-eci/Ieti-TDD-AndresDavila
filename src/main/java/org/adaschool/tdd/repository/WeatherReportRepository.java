package org.adaschool.tdd.repository;

import org.adaschool.tdd.repository.document.WeatherReport;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface WeatherReportRepository
    extends MongoRepository<WeatherReport, String>
{
    List<WeatherReport> findNearLocation(Double latGT, Double latLT, Double lngGT, Double lngLT);

    Object findByGeoLocation_LngBetweenAndGeoLocation_LatBetween(double anyDouble, double anyDouble2, double anyDouble3,
                                                                 double anyDouble4);

    Object findByReporter(String anyString);
}
