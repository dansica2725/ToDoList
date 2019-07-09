package c346.rp.edu.sg.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView toDoLv;
    ArrayList<ToDo> toDoArray = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toDoLv = findViewById(R.id.toDoLv);

        toDoArray.add(new ToDo("MSA" , "1/7/2019"));
        toDoArray.add(new ToDo("Go for haircut" , "22/9/2019"));

        ToDoAdapter adapter = new ToDoAdapter(MainActivity.this, R.layout.todo_list_view, toDoArray);
        toDoLv.setAdapter(adapter);
    }
}
