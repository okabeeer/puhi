package com.example.myapplication;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class NotificationHelper {

    private static final String CHANNEL_ID = "alarm_notification_channel";

    /**
     * Creates a notification channel (required for Android 8+).
     *
     * @param context The application context.
     */
    public static void createNotificationChannel(Context context) {
        CharSequence name = "Alarm Notification";
        String description = "Channel for Alarm notifications";
        int importance = NotificationManager.IMPORTANCE_HIGH;
        NotificationChannel channel = new NotificationChannel(CHANNEL_ID, name, importance);
        channel.setDescription(description);

        NotificationManager notificationManager = context.getSystemService(NotificationManager.class);
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(channel);
        }
    }

    /**
     * Shows a notification.
     *
     * @param context The application context.
     * @param title   The title of the notification.
     * @param content The content text of the notification.
     */
    public static void showNotification(Context context, String title, String content) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_alarm) // Make sure to have an icon named ic_alarm in drawable
                .setContentTitle(title)
                .setContentText(content)
                .setPriority(NotificationCompat.PRIORITY_HIGH) // High priority for important notifications
                .setAutoCancel(true); // Notification will disappear when tapped

        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);

        // Display the notification with a unique ID (e.g., 1)
        notificationManager.notify(1, builder.build());
    }
}
