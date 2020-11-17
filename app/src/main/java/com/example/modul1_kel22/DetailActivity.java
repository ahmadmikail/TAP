package com.example.modul1_kel22;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import de.hdodenhof.circleimageview.CircleImageView;

public class DetailActivity extends AppCompatActivity {

    private TextView tvNama, tvLastName, tvEmail;
    private CircleImageView tvPhoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvNama = findViewById(R.id.tv_first_name);
        tvLastName = findViewById(R.id.tv_last_name);
        tvEmail = findViewById(R.id.tv_email);
        tvPhoto = findViewById(R.id.img);

        if (getIntent().hasExtra("name")) {

            String nama = getIntent().getStringExtra("name");
            tvNama.setText("Forename:               " + nama);
        }
        if (getIntent().hasExtra("last_name")) {

            String last_name = getIntent().getStringExtra("last_name");
            tvLastName.setText("Surname:                " + last_name);
        }
        if (getIntent().hasExtra("email")) {

            String email = getIntent().getStringExtra("email");
            tvEmail.setText("Email Address:      " + email);
        }
        if (getIntent().hasExtra("avatar")) {

            String ava = getIntent().getStringExtra("avatar");
            Glide.with(this).load(ava).into(tvPhoto);
        }
    }
}