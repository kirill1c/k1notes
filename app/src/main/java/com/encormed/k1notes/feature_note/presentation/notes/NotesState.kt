package com.encormed.k1notes.feature_note.presentation.notes

import com.encormed.k1notes.feature_note.domain.model.Note
import com.encormed.k1notes.feature_note.domain.util.NoteOrder
import com.encormed.k1notes.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
