package com.example.notesapplication.data_layer

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(exportSchema = true , version = 1 , entities = arrayOf(Note::class))
abstract class NoteDatabase: RoomDatabase() {
    abstract val noteDao:NoteDao
}
