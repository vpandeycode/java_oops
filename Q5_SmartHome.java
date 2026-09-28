interface SecuritySystem {
    void monitorSecurity();
}

interface EnergySystem {
    void checkEnergyUsage();
}

class SmartHome implements SecuritySystem, EnergySystem {
    @Override
    public void monitorSecurity() {
        System.out.println("Security is monitored");
    }

    @Override
    public void checkEnergyUsage() {
        System.out.println("Energy check done");
    }
}