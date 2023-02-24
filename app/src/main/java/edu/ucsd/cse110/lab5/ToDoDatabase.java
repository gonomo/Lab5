package edu.ucsd.cse110.lab5;

import androidx.room.Database;
import androidx.room.RoomDatabase;
@Database(entities = {ToDoListItem.class}, version = 1)
public abstract class ToDoDatabase extends RoomDatabase {
    public abstract ToDoListItemDao toDoListItemDao();
}
