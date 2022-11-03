import Transport.Car;

public class Main {
    public static void main(String[] args) {


        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "в России", "АКПП", "хэтчбэк", "а555тл333", 6, false);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный ", 2020, "в Германии", "АКПП", "седан", "л478гн963", 6, true);
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "в Германии", "МКПП", "хэтчбэк", "к777нг444", 5, true); //подчеркивает
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "в Южной Корее", "МКПП", "седан", "а333чс5555", 6, false);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "в Южной Корее", "АКПП", "хэтчбэк", "и223до789", 4, true);


        printInfo(lada);
        printInfo(audi);
        printInfo(bmw);
        printInfo(kia);
        printInfo(hyundai);

    }


private static void printInfo(Car car){
    System.out.println(
            car.getBrand() + " " + car.getModel() +
                    " , год выпуска: " + car.getProductionYear() +
                    " , страна сборки: " + car.getProductionCountry()+
                    " , цвет кузова: " + car.getColor()+
                    " , объем двигателя : " + car.getEngineVolume()+
                    " , коробка передач: " + car.getTransmission()+
                    " , тип кузова: " + car.getBodyType()+
                    " , рег.номер: " + car.getRegistrationNumber()+
                    " , количество мест: " + car.getNumberOfSeats()+
                    ", " + ((car.isSummerTires()) ? "летняя" : "зимняя") + "резина" +
                    ", " + (car.getKey().isWithoutKeyAccess() ? "безключевой доступ" : "ключевой доступ") +
                    ", " + ((car.getKey().isRemoteRunEngine()) ? "удаленный запуск" : "ключевой запуск") +
                    ", номер страховки " + car.getInsurance().getNumber()+
                    ", стоимость страховки " + car.getInsurance().getCost()+
                    ", срок действия страхвки " + car.getInsurance().getExpireDate()

    );
}

    }




