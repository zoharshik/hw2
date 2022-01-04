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
        Car user = (Car) b.getSerializable("car");

        ImageView avatar = findViewById(R.id.avater);
        TextView model = findViewById(R.id.model);
        TextView brand = findViewById(R.id.brand);
        TextView year = findViewById(R.id.year);
        TextView price = findViewById(R.id.price);

        avatar.setImageResource(user.getPhoto());
        model.setText(user.getModel());
        brand.setText(user.getBrand());
        year.setText(user.getYear());
        price.setText(user.getPrice());
    }
}