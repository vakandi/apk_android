import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.termux.app.TermuxActivity;

import java.io.IOException;

public class TaskListActivity extends AppCompatActivity {

    Button task1Button;
    Button task2Button;
    Button task3Button;
    Button task4Button;
    Button task5Button;
    Button task6Button;
    Button task7Button;
    Button task8Button;
    Button task9Button;
    Button task10Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);

        task1Button = findViewById(R.id.task1_button);
        task1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Run shell script for task 1
                try {
                    Process process = Runtime.getRuntime().exec("termux-task1-script.sh");
                    process.waitFor();
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        task2Button = findViewById(R.id.task2_button);
        task2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Run shell script for task 2
                try {
                    Process process = Runtime.getRuntime().exec("termux-task2-script.sh");
                    process.waitFor();
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // And so on for task3Button, task4Button, etc.
    }
}

