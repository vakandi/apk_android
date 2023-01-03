import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    Button notificationsButton;
    Button soundsButton;
    Button designButton;
    Button manageCategoriesButton;
    Button manageTasksButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        notificationsButton = findViewById(R.id.notifications_button);
        notificationsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open notifications settings
            }
        });

        soundsButton = findViewById(R.id.sounds_button);
        soundsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open sounds settings
            }
        });

        designButton = findViewById(R.id.design_button);
        designButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open design settings
            }
        });

        manageCategoriesButton = findViewById(R.id.manage_categories_button);
        manageCategoriesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open manage categories settings
            }
        });

        manageTasksButton = findViewById(R.id.manage_tasks_button);
        manageTasksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open manage tasks settings
            }
        });
    }
}

