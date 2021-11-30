package co.il.dmobile.myapplication_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<User> users = new ArrayList<User>();
        users.add(new User(R.drawable.avatar1,"Contact 1","contact1@post.idc.ac.il"));
        users.add(new User(R.drawable.avatar2,"Contact 2","contact2@post.idc.ac.il"));
        users.add(new User(R.drawable.avatar3,"Contact 3","contact3@post.idc.ac.il"));
        users.add(new User(R.drawable.avatar4,"Contact 4","contact4@post.idc.ac.il"));
        users.add(new User(R.drawable.avatar5,"Contact 5","contact5@post.idc.ac.il"));
        users.add(new User(R.drawable.avatar6,"Contact 6","contact6@post.idc.ac.il"));
        users.add(new User(R.drawable.avatar7,"Contact 7","contact7@post.idc.ac.il"));
        users.add(new User(R.drawable.avatar8,"Contact 8","contact8@post.idc.ac.il"));

        RecyclerView recycler = findViewById(R.id.recycler);
        recycler.setHasFixedSize(false);

        RecyclerView.LayoutManager manager = new GridLayoutManager(getApplicationContext(),1);
        recycler.setLayoutManager(manager);

        UserAdapter adapter = new UserAdapter(users);
        recycler.setAdapter(adapter);

    }
}