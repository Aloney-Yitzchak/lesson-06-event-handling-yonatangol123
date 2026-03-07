package com.example.eventhandlingapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * שיעור 6: טיפול באירועים (Event Handling)
 *
 * משימה: השלם את הקוד בכל מקום שכתוב TODO
 */
public class MainActivity extends AppCompatActivity {

    // הצהרת משתנים (field declarations)
    private EditText editTextName;
    private Button btnGreet;
    private Button btnClear;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ======== שלב א: חיבור Views ========
        // TODO: חבר כל View לפי ה-ID שהגדרת ב-XML
        // דוגמה: editTextName = findViewById(R.id.editTextName);

        editTextName = /* TODO */ null;
        btnGreet     = /* TODO */ null;
        btnClear     = /* TODO */ null;
        textViewResult = /* TODO */ null;


        // ======== שלב ב: כפתור "ברוך הבא" ========
        // TODO: הגדר OnClickListener שעושה את הדברים הבאים:
        //   1. קורא את הטקסט מה-EditText
        //   2. בונה הודעת ברכה: "שלום, [שם]! ברוך הבא לאפליקציה!"
        //   3. מציג את ההודעה ב-textViewResult

        btnGreet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: כתוב את הקוד כאן

            }
        });


        // ======== שלב ג: כפתור "נקה" ========
        // TODO: הגדר OnClickListener שמנקה:
        //   1. את תוכן ה-EditText
        //   2. את תוכן ה-textViewResult

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: כתוב את הקוד כאן

            }
        });
    }
}
