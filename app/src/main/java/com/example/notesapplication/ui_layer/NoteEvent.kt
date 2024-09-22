package com.example.notesapplication.ui_layer

import com.example.notesapplication.data_layer.Note

sealed interface NoteEvent {
    object SortNotes : NoteEvent
    data class DeleteNote(val  note: Note): NoteEvent
    data class SaveNote(val title: String, val description: String) : NoteEvent


}