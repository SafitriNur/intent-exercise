package id.ac.polinema.intentexercise;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    private EditText fullname;
    private EditText text_email;
    private EditText text_password;
    private EditText text_confirm_password;
    private EditText text_homepage;
    private EditText text_about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        fullname = findViewById(R.id.text_fullname);
        text_email = findViewById(R.id.text_email);
        text_password = findViewById(R.id.text_password);
        text_confirm_password = findViewById(R.id.text_confirm_password);
        text_homepage = findViewById(R.id.text_homepage);
        text_about = findViewById(R.id.text_about);

    }

    public void handleOK(View view) {
        String fname = fullname.getText().toString();
        String email = text_email.getText().toString();
        String password = text_password.getText().toString();
        String cpassword = text_confirm_password.getText().toString();
        String homepage = text_homepage.getText().toString();
        String about = text_about.getText().toString();

        if (!(fullname).equals("") && !(email).equals("") && !(password).equals("") && !(cpassword).equals("") && !(homepage).equals("") && !(about).equals("")) {
            if ((password.equals(cpassword))) {
                User use = new User(fname, email, password, cpassword, homepage, about);
                Intent intent = new Intent(this, ProfileActivity.class);
                intent.putExtra("main", use);
                startActivity(intent);
            } else {
                Toast.makeText(this, "Password and Confirm password must same!", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Please insert all data!", Toast.LENGTH_SHORT).show();
        }


    }
}
