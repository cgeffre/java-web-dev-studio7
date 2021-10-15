package org.launchcode.studio7;

public abstract class BaseDisc implements OpticalDisc {
    private double storageCapacity;
    private String discType;
    private boolean runsOnPS1;
    private double minRPM;
    private double maxRPM;

    public BaseDisc(String discType, double minRPM, double maxRPM, double storageCapacity, boolean runsOnPS1) {
        this.discType = discType;
        this.minRPM = minRPM;
        this.maxRPM = maxRPM;
        this.storageCapacity = storageCapacity;
        this.runsOnPS1 = runsOnPS1;
    }

    public void spinDisc() {
        System.out.println("This " + getDiscType() + " spins at " + getMinRPM() + " - " + getMaxRPM() + " RPM");
    }

    public void infoAboutDisc() {
        System.out.println("This " + getDiscType() + " stores " + getStorageCapacity() + "MB");
        if (getRunsOnPS1() == true) {
            System.out.println("It will run on a Playstation 1\n");
        }
        else {
            System.out.println("It will not run on a Playstation 1\n");
        }
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public boolean getRunsOnPS1() {
        return runsOnPS1;
    }

    public void setRunsOnPS1(boolean runsOnPS1) {
        this.runsOnPS1 = runsOnPS1;
    }

    public double getMinRPM() {
        return minRPM;
    }

    public void setMinRPM(double minRPM) {
        this.minRPM = minRPM;
    }

    public double getMaxRPM() {
        return maxRPM;
    }

    public void setMaxRPM(double maxRPM) {
        this.maxRPM = maxRPM;
    }
}
