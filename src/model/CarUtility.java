package model;

public class CarUtility {
    public void carPtrint(CarDTO carDTO) {
        System.out.println(carDTO.carSn + "\t" + carDTO.carName + "\t" + carDTO.carPrice + "\t" + carDTO.carYear + "\t" + carDTO.carType);
    }
}