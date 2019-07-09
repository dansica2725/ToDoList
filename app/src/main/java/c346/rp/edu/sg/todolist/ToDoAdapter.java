package c346.rp.edu.sg.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ToDoAdapter extends ArrayAdapter {

    Context mContext;
    LayoutInflater inflater;
    int layout_id;
    ArrayList<ToDo> toDoArray = new ArrayList<>();

    public ToDoAdapter(Context context, int layout_id, ArrayList<ToDo> toDoArray) {
        super(context, layout_id, toDoArray);

        this.mContext = context;
        this.layout_id = layout_id;
        this.toDoArray = toDoArray;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = inflater.inflate(layout_id, null);

        TextView item, date;

        item = convertView.findViewById(R.id.itemTv);
        date = convertView.findViewById(R.id.dateTv);

        item.setText(toDoArray.get(position).getItem());
        date.setText(toDoArray.get(position).getDate());

        return convertView;
    }
}
