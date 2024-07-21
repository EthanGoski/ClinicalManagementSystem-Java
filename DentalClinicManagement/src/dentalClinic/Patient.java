package dentalClinic;

/**
 * Represents a patient in the dental clinic.
 * 
 * Each patient has:
 *  - Name
 *  - Unique patient ID
 *  - Contact information
 */
public class Patient {
    // Name of the patient
    private String name;
    // Unique identifier for the patient
    private String patientID;
    // Contact information for the patient
    private String contactInfo;

/****************************************************************************\
  /**
 * Constructs a new Patient instance.
 *
 * @param name Name of the patient.
 * @param patientID Unique identifier for the patient.
 * @param contactInfo Contact information for the patient.
 * @throws IllegalArgumentException if any parameter is null or blank.
 */
public Patient(String name, String patientID, String contactInfo) {
    if (name == null || name.trim().isEmpty()) {
        throw new IllegalArgumentException("Name cannot be null or blank");
    }
    if (patientID == null || patientID.trim().isEmpty()) {
        throw new IllegalArgumentException("Patient ID cannot be null or blank");
    }
    if (contactInfo == null || contactInfo.trim().isEmpty()) {
        throw new IllegalArgumentException("Contact info cannot be null or blank");
    }
    this.name = name;
    this.patientID = patientID;
    this.contactInfo = contactInfo;
}

/****************************************************************************\
    /**
     * Returns the name of the patient.
     *
     * @return name Name of the patient.
     */
    public String getName() {
        return name;
    }
/****************************************************************************\
    /**
     * Returns the unique identifier for the patient.
     *
     * @return patientID Unique identifier for the patient.
     */
    public String getPatientID() {
        return patientID;
    }
/****************************************************************************\
    /**
     * Returns the contact information for the patient.
     *
     * @return contactInfo Contact information for the patient.
     */
    public String getContactInfo() {
        return contactInfo;
    }
/****************************************************************************\
    /**
     * Sets the name of the patient.
     *
     * @param name New name of the patient.
     */
    public void setName(String name) {
        this.name = name;
    }
/****************************************************************************\
    /**
     * Sets the contact information for the patient.
     *
     * @param contactInfo New contact information for the patient.
     */
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
/****************************************************************************\
    /**
     * Returns a string representation of the patient.
     *
     * @return String A string representation of the patient including name, ID, and contact information.
     */
    @Override
    public String toString() {
        return "Patient [Name=" + name + ", ID=" + patientID + ", Contact=" + contactInfo + "]";
    }
}
