package com.example.pagingdemo;

import androidx.lifecycle.LiveData;
import androidx.paging.DataSource;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

/**
 * @author xuyangli
 * @date 2019-11-29 11:08
 */

@Dao
public interface StudentDao {

    @Insert
    void insertStudent(Student... students);

    @Query("DELETE FROM student_table")
    void deleteAllStudent();

    @Query("SELECT * FROM STUDENT_TABLE ORDER BY ID")
    DataSource.Factory<Integer, Student> getAllStudents();


}
