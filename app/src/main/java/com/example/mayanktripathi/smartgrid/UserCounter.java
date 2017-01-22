package com.example.mayanktripathi.smartgrid;

import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by mayanktripathi on 21/01/17.
 */

public class UserCounter extends AppCompatActivity {

    private FirebaseDatabase mFireBaseDatabase;


    int count = 0;
    Button counter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_counter);

        mFireBaseDatabase = FirebaseDatabase.getInstance();
        FirebaseApp.initializeApp(this);

        counter = (Button) findViewById(R.id.button4);

        counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if(count>=4)
                {
                    DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();
                    mDatabase.child("counter").setValue(count);
                    NotificationManager manager = (NotificationManager) UserCounter.this.getSystemService(UserCounter.this.NOTIFICATION_SERVICE);
                    Notification n = new Notification.Builder(UserCounter.this).setSmallIcon(R.drawable.alert).setContentTitle("High Usage Alert!").setContentText("Their is a sudden increase in your electricity consumption. Please take preventive measures!").setAutoCancel(true).build();
                    manager.notify(0, n);





                }
            }
        });



    }
}
