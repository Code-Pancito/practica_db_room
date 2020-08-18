package com.example.practicadbroom

import androidx.room.*

@Dao
interface TaskDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTask(tasks: List<Task>)

    @Update
    fun updateTask(task: Task)

    @Delete
    fun deleteOneTask(task: Task)

    @Query("SELECT * FROM task_table ORDER BY idTask ASC")
    fun getAllTasks(): List<Task>
}