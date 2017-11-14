package cc.somkiat.basicunittesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private DatePicker birthday;
    private EditText email;

    private Button save;
    private Button revert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.name = findViewById(R.id.userNameInput);
        this.birthday = findViewById(R.id.dateOfBirthInput);
        this.email = findViewById(R.id.emailInput);

        this.save = findViewById(R.id.saveButton);
        this.revert = findViewById(R.id.revertButton);
    }

    public void onSaveClick(View view) {

    }

    public void onRevertClick(View view) {

    }

}
