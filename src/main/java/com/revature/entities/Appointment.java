package com.revature.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "appointments")
public class Appointment {

	@Id
	@Column(updatable = false, name = "appt_id")
	@GeneratedValue(generator = "APPT_ID_SEQ", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "APPT_ID_SEQ", sequenceName = "APPT_ID_SEQ", allocationSize = 1)
	private int apptId;
	@Column(name = "date")
	private String date;
	@Column(name = "time")
	private String time;
	@ManyToOne
	@JoinColumn(name = "doc_id")
	private Doctor docId;
	@ManyToOne
	@JoinColumn(name = "patient_id")
	private Patient patientId;
	@Column(name = "doc_notes")
	private String docNotes;
	

	public Appointment() {
		super();
	}

	public Appointment(String date, String time, Doctor docId, Patient patientId, String docNotes) {
		super();
		this.date = date;
		this.time = time;
		this.docId = docId;
		this.patientId = patientId;
		this.docNotes = docNotes;
	}

	public Appointment(int apptId, String date, String time, Doctor docId, Patient patientId, String docNotes) {
		super();
		this.apptId = apptId;
		this.date = date;
		this.time = time;
		this.docId = docId;
		this.patientId = patientId;
		this.docNotes = docNotes;
	}

	public int getApptId() {
		return apptId;
	}

	public void setApptId(int apptId) {
		this.apptId = apptId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Doctor getDocId() {
		return docId;
	}

	public void setDocId(Doctor docId) {
		this.docId = docId;
	}

	public Patient getPatientId() {
		return patientId;
	}

	public void setPatientId(Patient patientId) {
		this.patientId = patientId;
	}

	public String getDocNotes() {
		return docNotes;
	}

	public void setDocNotes(String docNotes) {
		this.docNotes = docNotes;
	}

	@Override
	public String toString() {
		return "Appointment [apptId=" + apptId + ", date=" + date + ", time=" + time + ", docId=" + docId
				+ ", patientId=" + patientId + ", docNotes=" + docNotes + "]";
	}
	
	
}
