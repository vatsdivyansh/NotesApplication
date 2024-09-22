package com.example.notesapplication.di

import android.app.Application
import androidx.room.Room
import com.example.notesapplication.data_layer.NoteDatabase
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object Module {
    fun provideDatabase(application : Application) : NoteDatabase{
        return Room.databaseBuilder(context = application , NoteDatabase :: class.java , "note_database.sql").build()
    }
}