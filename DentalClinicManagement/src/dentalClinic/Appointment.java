package dentalClinic;

import java.util.Objects;

/**
 * Represents an appointment in the dental clinic.
 * 
 * Each appointment is associated with a specific PATIENT and DOCTOR, 
 * along with a: 
 * 	Unique ID
 * 	Date
 * 	Time
 */
public class Appointment {
    // Unique identifier for the appointment
    private String appointmentID;
    // Date of the appointment in (YYYY-MM-DD) format
    private String date;
    // Time of the appointment in (HH:MM AM/PM) format
    private String time;
    // Patient associated with the appointment
    private Patient patient;
    // Doctor associated with the appointment
    private Doctor doctor;

/****************************************************************************\

   /**
 * Constructs a new Appointment instance.
 *
 * @param appointmentID Unique identifier for the appointment.
 * @param date Date of the appointment.
 * @param time Time of the appointment.
 * @param patient Patient associated with the appointment.
 * @param doctor Doctor associated with the appointment.
 * @throws IllegalArgumentException if any parameter is null or blank.
 */
public Appointment(String appointmentID, String date, String time, Patient patient, Doctor doctor) {
    if (appointmentID == null || appointmentID.trim().isEmpty()) {
        throw new IllegalArgumentException("Appointment ID cannot be null or blank");
    }
    if (date == null || date.trim().isEmpty()) {
        throw new IllegalArgumentException("Date cannot be null or blank");
    }
    if (time == null || time.trim().isEmpty()) {
        throw new IllegalArgumentException("Time cannot be null or blank");
    }
    if (patient == null) {
        throw new IllegalArgumentException("Patient cannot be null");
    }
    if (doctor == null) {
        throw new IllegalArgumentException("Doctor cannot be null");
    }
    this.appointmentID = appointmentID;
    this.date = date;
    this.time = time;
    this.patient = patient;
    this.doctor = doctor;
}

/****************************************************************************\

    /**
     * Returns the unique identifier for the appointment.
     *
     * @return appointmentID Unique identifier for the appointment.
     */
    public String getAppointmentID() {
        return appointmentID;
    }

/****************************************************************************\

    /**
     * Returns the date of the appointment.
     *
     * @return date Date of the appointment.
     */
    public String getDate() {
        return date;
    }

/****************************************************************************\

    /**
     * Sets the date of the appointment.
     *
     * @param date New date of the appointment.
     */
    public void setDate(String date) {
        this.date = date;
    }

/****************************************************************************\

    /**
     * Returns the time of the appointment.
     *
     * @return time Time of the appointment.
     */
    public String getTime() {
        return time;
    }

/****************************************************************************\

    /**
     * Sets the time of the appointment.
     *
     * @param time New time of the appointment.
     */
    public void setTime(String time) {
        this.time = time;
    }

/****************************************************************************\
    
    /**
     * Returns the patient associated with the appointment.
     *
     * @return patient Patient associated with the appointment.
     */
    public Patient getPatient() {
        return patient;
    }

/****************************************************************************\

    /**
     * Sets a new patient for the appointment.
     *
     * @param patient New patient for the appointment.
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

/****************************************************************************\
    
    /**
     * Returns the doctor associated with the appointment.
     *
     * @return doctor Doctor associated with the appointment.
     */
    public Doctor getDoctor() {
        return doctor;
    }

/****************************************************************************\

    /**
     * Sets a new doctor for the appointment.
     *
     * @param doctor New doctor for the appointment.
     */
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

/****************************************************************************\

    /**
     * Returns a string representation of the appointment.
     *
     * @return String A string representation of the appointment including ID, date, time, patient name, and doctor username.
     */
    @Override
    public String toString() {
        return "Appointment [ID=" + appointmentID + ", Date=" + date + ", Time=" + time + ", Patient=" + patient.getName() + ", Doctor=" + doctor.getUsername() + "]";
    }

/****************************************************************************\

    /**
     * Checks if this appointment is equal to another object.
     * Two appointments are considered equal if they have the same ID, date, time, patient, and doctor.
     *
     * @param o The object to compare with.
     * @return boolean True if the appointments are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointment that = (Appointment) o;
        return Objects.equals(appointmentID, that.appointmentID) &&
               Objects.equals(date, that.date) &&
               Objects.equals(time, that.time) &&
               Objects.equals(patient, that.patient) &&
               Objects.equals(doctor, that.doctor);
    }

/****************************************************************************\
    
    /**
     * Returns a hash code value for the appointment.
     *
     * @return int A hash code value for the appointment.
     */
    @Override
    public int hashCode() {
        return Objects.hash(appointmentID, date, time, patient, doctor);
    }
}
