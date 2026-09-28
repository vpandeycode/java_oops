class ParkingArea extends Thread {
    static int availableSlots = 5;
    String vehicleNo;

    ParkingArea(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    static synchronized void parkVehicle(String vehicleNo) {
        if (availableSlots > 0) {
            System.out.println(vehicleNo + " parked. Available slots: " + availableSlots);
            availableSlots--;
        } else {
            System.out.println(vehicleNo + " could not park. No slots available!");
        }
    }

    @Override
    public void run() {
        parkVehicle(vehicleNo);
    }
}