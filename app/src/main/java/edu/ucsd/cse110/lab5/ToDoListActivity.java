package edu.ucsd.cse110.lab5;

import static edu.ucsd.cse110.lab5.R.id.todo_items;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class ToDoListActivity extends AppCompatActivity {
    public RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do_list);

        ToDoListAdapter adapter = new ToDoListAdapter();
        adapter.setHasStableIds(true);

        recyclerView = findViewById(R.id.todo_items);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        adapter.setTodoListItems(ToDoListItem.loadJSON(this, "demo_todos.json"));
        //Log.d("ToDoListActivity", todos.toString());

    }
}