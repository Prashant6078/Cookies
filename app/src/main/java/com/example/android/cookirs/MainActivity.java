package com.example.android.cookirs;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cookirs.R;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
        public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.

        ImageView imageView=(ImageView)findViewById(R.id.android_cookie_image_view);
        imageView.setImageURI(Uri.parse("@drawable/before_cookie"));
        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView textView=(TextView)findViewById(R.id.status_text_view);
        textView.setText("I an totally full...!");

    }
}

