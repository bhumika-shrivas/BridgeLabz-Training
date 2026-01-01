package com.objectmodelling.associationandcommunicationproblem;

public class HospitalAssociationDemo {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("City Care Hospital");

        Doctor doc1 = new Doctor("Dr. Verma", "Cardiology");
        Doctor doc2 = new Doctor("Dr. Singh", "Orthopedics");

        Patient patient1 = new Patient("Rohan");
        Patient patient2 = new Patient("Anita");

        hospital.addDoctor(doc1);
        hospital.addDoctor(doc2);

        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Consultations (association + communication)
        doc1.consult(patient1);
        doc1.consult(patient2);
        doc2.consult(patient1);

        hospital.showHospitalDetails();
    }
}
