package com.encormed.k1notes.feature_note.domain.use_case

import com.encormed.k1notes.feature_note.domain.model.InvalidNoteException
import com.encormed.k1notes.feature_note.domain.model.Note
import com.encormed.k1notes.feature_note.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note){
        if(note.title.isBlank()){
            throw InvalidNoteException("Заголовок не может быть пустым.")
        }
        if(note.content.isBlank()){
            throw InvalidNoteException("Содержимое не может быть пустым.")
        }
        repository.insertNote(note)
    }
}