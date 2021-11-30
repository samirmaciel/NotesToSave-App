package com.samirmaciel.notestosave.feature_note.presentation.util

sealed class Screen(val route: String){

    object NotesScreen: Screen("notes_Screen")
    object AddEditNotesScreen: Screen("add_edit_note_screen")
}
