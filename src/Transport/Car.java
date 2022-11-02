package Transport;

public class Car {
    private final String brand; //подчеркивает
    private final String model; //подчеркивает
    private double engineVolume;
    private String color;
    private final Integer productionYear; //подчеркивает
    private final String productionCountry; //подчеркивает
    private String transmission;
    private final String bodyType; //подчеркивает
    private String registrationNumber;
    private final int numberOfSeats; //подчеркивает
    private boolean summerTires;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null) {
            this.registrationNumber = "х000хх000";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public boolean isSummerTires() {
        return summerTires;
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }


    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, String transmission, String bodyType, String registrationNumber, int numberOfSeats, boolean summerTires) {
        if (brand == null) {
            this.brand = "default ";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default ";
        } else {
            this.model = model;
        }
        if (productionCountry == null) {
            this.productionCountry = "default ";
        } else {
            this.productionCountry = productionCountry;
        }
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color == null) {
            this.color = "белый ";
        } else {
            this.color = color;
        }
        if (productionYear >= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }

        if (transmission == null) {
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null) {
            this.bodyType = "седан";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber == null) {
            this.registrationNumber = "х000хх000";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (numberOfSeats == 0) {
            this.numberOfSeats = 5;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        if (summerTires == true) {
            this.summerTires = true;
        } else {
            this.summerTires = summerTires;
        }
        public void changeTyres () { //подчеркивает
            summerTires = !summerTires;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;  //подчеркивает
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false; //подчеркивает
        }
        System.out.println(brand + " " + model + ", " + productionYear + " год выпуска, " + "сборка  " + productionCountry + ", " + color + " цвета, " + "объем двигателя" + " коробка передач" + transmission + " тип кузова " + bodyType + " регистрационный номер " + registrationNumber + " количество мест " + numberOfSeats + " резина" + summerTires);


    }
}

