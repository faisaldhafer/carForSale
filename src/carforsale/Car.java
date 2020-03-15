
package carforsale;

import java.io.Serializable;

/**
 *
 * @author NAME: FAISAL ALZAHRANI ID:35110059
 */
public class Car implements Serializable {

private String carId;
private String carType;
private String carMaker;
private String carModel;
private double minPrice;
private double maxPrice;
private String style;
private String driveType;
private String manufacturingYear;
private String engineSize;

    public Car() {
    }

    public Car(String carId, String carType,String carMaker, String carModel, double minPrice, double maxPrice, String style, String driveType, String manufacturingYear, String engineSize) {
        this.carId = carId;
        this.carType = carType;
        this.carMaker = carMaker;
        this.carModel = carModel;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.style = style;
        this.driveType = driveType;
        this.manufacturingYear = manufacturingYear;
        this.engineSize = engineSize;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarType() {
        return carType;
    }

    public String getCarMaker() {
        return carMaker;
    }

    public void setCarMaker(String carMaker) {
        this.carMaker = carMaker;
    }

    
    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getDriveType() {
        return driveType;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    public String getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(String manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public String getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }

    @Override
    public String toString() {
        return "Car{" + "\nCar ID=" + carId + "\nCar Type=" + carType + "\nCar Maker=" + carMaker + "\nCar Model=" + carModel + "\nMinimun Price=" + minPrice + "\nMaximum Price=" + maxPrice + "\nStyle=" + style + "\nDrive Type=" + driveType + "\nManufacturing Year=" + manufacturingYear + "\nEngine Size=" + engineSize + '}';
    }

    



}
