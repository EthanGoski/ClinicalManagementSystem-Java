package dentalClinic;

/**
 * Represents a prescription for patients in the dental clinic.
 * 
 * Each prescription has:
 *  - Unique prescription ID
 *  - Patient associated with the prescription
 *  - Medication prescribed
 *  - Dosage of the medication
 *  - Instructions for taking the medication
 *  - Doctor who prescribed the medication
 */
public class Prescription {
    // Unique identifier for the prescription
    private String prescriptionID;
    // Patient associated with the prescription
    private Patient patient;
    // Medication prescribed
    private String medication;
    // Dosage of the medication
    private String dosage;
    // Instructions for taking the medication
    private String instructions;
    // Doctor who prescribed the medication
    private Doctor doctor;

/****************************************************************************\
  /**
 * Constructs a new Prescription instance.
 *
 * @param prescriptionID Unique identifier for the prescription.
 * @param patient Patient associated with the prescription.
 * @param medication Medication prescribed.
 * @param dosage Dosage of the medication.
 * @param instructions Instructions for taking the medication.
 * @param doctor Doctor who prescribed the medication.
 * @throws IllegalArgumentException if any parameter is null or blank.
 */
public Prescription(String prescriptionID, Patient patient, String medication, String dosage, String instructions, Doctor doctor) {
    if (prescriptionID == null || prescriptionID.trim().isEmpty()) {
        throw new IllegalArgumentException("Prescription ID cannot be null or blank");
    }
    if (patient == null) {
        throw new IllegalArgumentException("Patient cannot be null");
    }
    if (medication == null || medication.trim().isEmpty()) {
        throw new IllegalArgumentException("Medication cannot be null or blank");
    }
    if (dosage == null || dosage.trim().isEmpty()) {
        throw new IllegalArgumentException("Dosage cannot be null or blank");
    }
    if (instructions == null || instructions.trim().isEmpty()) {
        throw new IllegalArgumentException("Instructions cannot be null or blank");
    }
    if (doctor == null) {
        throw new IllegalArgumentException("Doctor cannot be null");
    }
    this.prescriptionID = prescriptionID;
    this.patient = patient;
    this.medication = medication;
    this.dosage = dosage;
    this.instructions = instructions;
    this.doctor = doctor;
}

/****************************************************************************\
    /**
     * Returns the unique identifier for the prescription.
     *
     * @return prescriptionID Unique identifier for the prescription.
     */
    public String getPrescriptionID() {
        return prescriptionID;
    }
/****************************************************************************\
    /**
     * Returns the patient associated with the prescription.
     *
     * @return patient Patient associated with the prescription.
     */
    public Patient getPatient() {
        return patient;
    }
/****************************************************************************\
    /**
     * Returns the medication prescribed.
     *
     * @return medication Medication prescribed.
     */
    public String getMedication() {
        return medication;
    }
/****************************************************************************\
    /**
     * Returns the dosage of the medication.
     *
     * @return dosage Dosage of the medication.
     */
    public String getDosage() {
        return dosage;
    }
/****************************************************************************\
    /**
     * Returns the instructions for taking the medication.
     *
     * @return instructions Instructions for taking the medication.
     */
    public String getInstructions() {
        return instructions;
    }
/****************************************************************************\
    /**
     * Returns the doctor who prescribed the medication.
     *
     * @return doctor Doctor who prescribed the medication.
     */
    public Doctor getDoctor() {
        return doctor;
    }
/****************************************************************************\
    /**
     * Returns a string representation of the prescription.
     *
     * @return String A string representation of the prescription including ID, patient, medication, dosage, instructions, and doctor.
     */
    @Override
    public String toString() {
        return "Prescription [ID=" + prescriptionID + ", Patient=" + patient + ", Medication=" + medication + ", Dosage=" + dosage + ", Instructions=" + instructions + ", Doctor=" + doctor + "]";
    }
}
