package com.example.template;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/**
 * שיעור 6: טיפול באירועים (Event Handling)
 * ============================================
 * המשימה שלך: השלם את הקוד בכל מקום שכתוב TODO
 *
 * מה האפליקציה צריכה לעשות:
 *  1. המשתמש מזין שם בשדה הטקסט
 *  2. לחיצה על "ברוך הבא" מציגה: "שלום, [שם]! ברוך הבא לאפליקציה!"
 *  3. לחיצה על "נקה" מאפסת את כל השדות
 */
public class MainActivity extends AppCompatActivity {

    // ======== הצהרת משתנים ========
    // TODO שלב א: הצהר כאן על ארבעה משתנים מסוג:
    //   EditText, Button, Button, TextView
    // דוגמה: private EditText editTextName;

    // כתוב כאן את ההצהרות שלך:


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // מטפל ב-edge-to-edge (אל תמחק את הקוד הזה)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // ======== שלב ב: חיבור Views ========
        // TODO: חבר כל View לפי ה-ID שהגדרת ב-activity_main.xml
        // דוגמה: editTextName = findViewById(R.id.editTextName);

        // כתוב כאן את ה-findViewById שלך:


        // ======== שלב ג: כפתור "ברוך הבא" ========
        // TODO: הגדר OnClickListener על כפתור "ברוך הבא"
        //   כשלוחצים:
        //   1. קרא את השם מה-EditText (השתמש ב- .getText().toString() )
        //   2. בנה הודעת ברכה: "שלום, " + name + "! ברוך הבא לאפליקציה!"
        //   3. הצג את ההודעה ב-TextView

        // כתוב כאן:


        // ======== שלב ד: כפתור "נקה" ========
        // TODO: הגדר OnClickListener על כפתור "נקה"
        //   כשלוחצים:
        //   1. נקה את ה-EditText (השתמש ב- .setText("") )
        //   2. נקה את ה-TextView

        // כתוב כאן:

    }
}
