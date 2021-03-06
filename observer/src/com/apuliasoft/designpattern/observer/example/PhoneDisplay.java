package com.apuliasoft.designpattern.observer.explanation;

public class PhoneDisplay implements IObserver {

    private WeatherStation weatherStation;

    public PhoneDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    public void update() {
        System.out.println("Phone:" + weatherStation.getTemperature());
    }
}