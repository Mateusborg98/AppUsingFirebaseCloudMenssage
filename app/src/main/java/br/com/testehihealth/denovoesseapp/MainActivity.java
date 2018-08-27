package br.com.testehihealth.denovoesseapp;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            NotificationChannel notificationChannel =
                    new NotificationChannel(Constants.CHANNEL_ID,Constants.CHANNEL_NAME, NotificationManager.IMPORTANCE_HIGH);

                notificationChannel.setDescription(Constants.CHANNEL_DESCRIPTION);
                notificationChannel.enableLights(true);
                notificationChannel.setLightColor(Color.BLUE);
                notificationChannel.enableVibration(true);

                notificationChannel.setVibrationPattern(new long[]{100,200,300,400,500,400,300,200,400});

                notificationManager.createNotificationChannel(notificationChannel);
        }

    }
}
