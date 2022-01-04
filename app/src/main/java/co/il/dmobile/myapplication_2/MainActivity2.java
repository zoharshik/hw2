package co.il.dmobile.myapplication_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle b = getIntent().getExtras();
        User user = (User) b.getSerializable("user");

        ImageView avatar = findViewById(R.id.avater);
        TextView name = findViewById(R.id.model);
        TextView email = findViewById(R.id.brand);

        avatar.setImageResource(user.getImage());
        name.setText(user.getName());
        email.setText(user.getEmail());
    }
}