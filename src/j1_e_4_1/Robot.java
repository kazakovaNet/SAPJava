package j1_e_4_1;

class Robot {
    String name;
    int yearOfInspection;

    Robot(String name, int yearOfManufacture) {
        this.name = name;
        yearOfInspection = yearOfManufacture + 2;
    }

    void inspection(int yearOfInspection) {
        resetInspectionYear(2018);
    }

    int resetInspectionYear(int yearOfInspection) {
        return yearOfInspection + 2;
    }

    String showDetails() {
        return "Name: " + name + " / next inspection: " + yearOfInspection;
    }
}
