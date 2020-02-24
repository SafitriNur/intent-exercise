package id.ac.polinema.intentexercise;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    String link;
    private TextView nametext;
    private TextView emailtext;
    private TextView passwordtext;
    private TextView password;
    private TextView homepage;
    private TextView about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        nametext = findViewById(R.id.label_fullname);
        emailtext = findViewById(R.id.label_email);
        homepage = findViewById(R.id.label_homepage);
        about = findViewById(R.id.label_about);

        Bundle extras = getIntent().getExtras();
        User use2 = extras.getParcelable("main");

        if (extras != null) {

            nametext.setText(use2.getFullName());
            emailtext.setText(use2.geteMail());
            homepage.setText(use2.getHomePage());
            about.setText(use2.getaBout());
            link = use2.getHomePage();
        }

    }

    public void handleVisit(View view) {
        Intent linkIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + link));
        startActivity(linkIntent);
    }
}
