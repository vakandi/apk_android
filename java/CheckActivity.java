import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;

public class CheckActivity extends AppCompatActivity {

    Button checkButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        checkButton = findViewById(R.id.check_button);
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check if files for all tasks exist
                for (int i = 1; i <= 60; i++) {
                    File file = new File("/path/to/task" + i + "/file");
                    if (!file.exists()) {
                        Toast.makeText(CheckActivity.this, "File for task " + i + " does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}

