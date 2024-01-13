package com.example.it21839092.database.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.it21839092.database.entities.Patient

@Dao
interface PatientDao {

    @Insert
    suspend fun insertPatient(patient:Patient)

    @Delete
    suspend fun deletePatient(patient:Patient)

    @Query("SELECT * FROM Patient")
    fun getAllPatients():List<Patient>

}