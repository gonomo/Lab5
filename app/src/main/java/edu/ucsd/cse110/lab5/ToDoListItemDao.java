package edu.ucsd.cse110.lab5;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;
@Dao
public interface ToDoListItemDao {
    @Insert
    long insert(ToDoListItem toDoListItem);

    @Query("SELECT * FROM `todo_list_items` WHERE `id`=:id")
    ToDoListItem get(long id);

    @Query("SELECT * FROM `todo_list_items` ORDER BY `order`")
    List<ToDoListItem> getAll();

    @Update
    int update(ToDoListItem toDoListItem);

    @Delete
    int delete(ToDoListItem toDoListItem);
}
