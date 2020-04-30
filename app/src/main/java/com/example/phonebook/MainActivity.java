package com.example.phonebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText name, surname, phone;
        Button submit;

        name = (EditText) findViewById(R.id.editTextName);
        surname = (EditText) findViewById(R.id.editTextSurname);
        phone = (EditText) findViewById(R.id.editTextPhone);
        submit = (Button) findViewById(R.id.btnsubmit);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text ="Successfully submit";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context,text,duration);
                toast.show();

            /*
                Toast.makeText(getApplicationContext(), "Name :  " + name.getText().toString() + " \n" + "Surname :  " + surname.getText().toString()
                        + " \n" + "Phone :  " + phone.getText().toString(), Toast.LENGTH_LONG).show();
                        */
            }
        });

    }
}
