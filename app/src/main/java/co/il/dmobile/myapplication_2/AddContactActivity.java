package co.il.dmobile.myapplication_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name = findViewById(R.id.model);
                EditText email = findViewById(R.id.brand);
                Car car = new Car(R.drawable.avatar7,name.getText().toString(),email.getText().toString());

                Intent i = new Intent();
                i.putExtra("car",car);
                setResult(1,i);
                finish();



            }
        });

    }
}