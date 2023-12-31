package com.example.wenotehub.data.local


import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.wenotehub.data.model.NoteEntity

@Database(entities = [NoteEntity::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun noteDao(): NoteDao


}