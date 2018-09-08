package com.example.administrator.hellosally;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener()
        {
                public void onClick(View view)
                {
                    Log.i("Sally", "Button clicked");
                    ( (TextView) findViewById(R.id.text1) ).setTextColor(getResources().getColor(R.color.colorOrange));
                }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.colorDarkGreen));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                // grab the text the user inputted
                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();
                // put the text into our textView once the 'change text' button is clicked
                if(TextUtils.isEmpty(newText)) ((TextView) findViewById(R.id.text1)).setText("Goodbye!");
                else ((TextView) findViewById(R.id.text1)).setText(newText);
            }
        });

        // tap background to reset
        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                ((TextView) findViewById(R.id.text1)).setTextColor(getResources().getColor(R.color.colorLGray));
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                ((TextView) findViewById(R.id.text1)).setText("Hello from Sally!");
            }
        });




    }

}
