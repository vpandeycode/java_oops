class EVVehicle {
    private int registrationNo;
    private String model;
    private int batteryPercentage;
    private static int vehicleCount = 0;
    private final String stationName = "GreenCharge EV Station";

    public EVVehicle(int registrationNo, String model, int batteryPercentage) {
        this.registrationNo = registrationNo;
        this.model = model;
        this.batteryPercentage = batteryPercentage;
        vehicleCount++;
    }

    public int getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(int registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }

    public static int getVehicleCount() {
        return vehicleCount;
    }
}