package com.example.practicadbroom

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "task_table")
data class Task(@PrimaryKey(autoGenerate = true) val idTask: Int,
                val task: String,
                val creationDate: String,
                val finishDate: String )