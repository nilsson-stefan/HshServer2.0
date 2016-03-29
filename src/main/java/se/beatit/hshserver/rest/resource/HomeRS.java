package se.beatit.hshserver.rest.resource;

import se.beatit.hshserver.entities.Home;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by stefan on 3/25/16.
 */
@XmlRootElement
public class HomeRS implements Serializable {
    private String name;
    private Map<String, Float> currentTemperatures;
    private Long currentElectricityUsage;
    private Date timestamp = new Date();

    private Map<Date, Long> electricityConsumptionHistory;
    private Map<Date, Float> temperatureHistory;

    public HomeRS() {
    }

    public HomeRS(Home home) {
        name = home.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Float> getCurrentTemperatures() {
        return currentTemperatures;
    }

    public void setCurrentTemperatures(Map<String, Float> currentTemperatures) {
        this.currentTemperatures = currentTemperatures;
    }

    public Long getCurrentElectricityUsage() {
        return currentElectricityUsage;
    }

    public void setCurrentElectricityUsage(Long currentElectricityUsage) {
        this.currentElectricityUsage = currentElectricityUsage;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Map<Date, Long> getElectricityConsumptionHistory() {
        return electricityConsumptionHistory;
    }

    public void setElectricityConsumptionHistory(Map<Date, Long> electricityConsumptionHistory) {
        this.electricityConsumptionHistory = electricityConsumptionHistory;
    }

    public Map<Date, Float> getTemperatureHistory() {
        return temperatureHistory;
    }

    public void setTemperatureHistory(Map<Date, Float> temperatureHistory) {
        this.temperatureHistory = temperatureHistory;
    }
}