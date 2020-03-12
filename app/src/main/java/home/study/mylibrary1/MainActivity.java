package home.study.mylibrary1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import home.study.toasterlibrary.ToasterMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToasterMessage.toastMessage(this,"hello you");
    }
}
