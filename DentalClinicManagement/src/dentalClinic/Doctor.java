package dentalClinic;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a doctor and their role in the dental clinic.
 * 
 * Inherits from the User class.
 * Manages:
 *  - Daily appointments
 *  - Prescriptions
 */
public class Doctor extends User {
    // List of daily appointments for the doctor
    private List<Appointment> dailyAppointments;
    // List of prescriptions written by the doctor
    private List<Prescription> prescriptions;

/****************************************************************************\
    /**
     * Constructs a new Doctor instance.
     *
     * @param username Username of the doctor.
     * @param password Password of the doctor.
     */
    public Doctor(String username, String password) {
        if(username == null || username.trim().isEmpty()){
            throw new IllegalArgumentException("Username cannot be null or blank");
        }
        if(password == null || password.trim().isEmpty()){
            throw new IllegalArgumentException("Password cannot be null or blank");
        }
        
        super(username, password);
        this.dailyAppointments = new ArrayList<>();
        this.prescriptions = new ArrayList<>();
    }
/****************************************************************************\
    /**
     * Prints the list of daily appointments to the console.
     * Each appointment is printed on a new line.
     */
    public void viewDailyAppointments() {
        System.out.println("Appointments for today:");
        for (Appointment appointment : dailyAppointments) {
            System.out.println(appointment);
        }
    }
/****************************************************************************\
    /**
     * Adds a new prescription to the list of prescriptions.
     *
     * @param prescription Prescription to be added.
     */
    public void addPrescription(Prescription prescription) {
        prescriptions.add(prescription);
    }
/****************************************************************************\
    /**
     * Returns the list of daily appointments for the doctor.
     *
     * @return List of daily appointments.
     */
    public List<Appointment> getDailyAppointments() {
        return dailyAppointments;
    }
/****************************************************************************\
    /**
     * Returns the list of prescriptions written by the doctor.
     *
     * @return List of prescriptions.
     */
    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }
}
