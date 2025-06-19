package com.example.pmas.patientmedicineappointmentsystem.service;

import com.example.pmas.patientmedicineappointmentsystem.dto.AppointmentDto;
import com.example.pmas.patientmedicineappointmentsystem.dto.DoctorDto;
import com.example.pmas.patientmedicineappointmentsystem.dto.SlotDto;
import com.example.pmas.patientmedicineappointmentsystem.dto.save.SaveAppointmentDto;

import java.util.List;

public interface AppointmentService {
    List<AppointmentDto> getAllAppointments();

    AppointmentDto getAppointmentById(Long id);

    AppointmentDto createAppointment(SaveAppointmentDto saveAppointmentDto);

    String deleteAppointment(Long id);

    boolean existsByDoctorId(Long doctorId);

    void deleteAllAppointmentByDoctorId(Long doctorId);

    boolean existsByPatientId(Long id);

    void deleteAllAppointmentByPatientId(Long id);

    List<List<AppointmentDto>> getAllAppointmentByUsername(String name);

    List<DoctorDto> getDoctorsBySpeciality(String specialty);

    List<String> getAllDoctorSpecialties();
    List<SlotDto> getAvailableSlots(Long doctorId, String date);

    Long getPatientIdByUsername(String name);
}
