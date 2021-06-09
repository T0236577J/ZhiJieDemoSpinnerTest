package sg.edu.rp.c346.id20012912.demospinnertest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    Spinner spnYesNo;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnYesNo = findViewById(R.id.spinner);
        tv = findViewById(R.id.textview);

        /*spnYesNo.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                switch(position)
                {
                    case 0:
                        tv.setText("Spinner item Yes selected");
                        break;

                    case 1:
                        tv.setText("spinner item No selected");
                        break;
                }

                //tv.setText("Spinner item" + spnYesNo.getSelectedItem() + "selected");

            }


        });

         */


        spnYesNo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                switch(position)
                {
                    case 0:
                        tv.setText("Spinner item Yes selected");
                        break;

                    case 1:
                        tv.setText("spinner item No selected");
                        break;
                }

                //tv.setText("Spinner item" + spnYesNo.getSelectedItem() + "selected");
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });


    }
}