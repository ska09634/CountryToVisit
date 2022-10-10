package edu.uga.cs.countrytovisit;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Main class that runs the app immediately once the app is opened.
 */
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    public static String text;
    private Spinner spinner; // spinner information from here https://www.youtube.com/watch?v=PjW-XiQ6usI
    private Button overviewButton;
    private Button detailsButton;

    /**
     * Creates the app on start up. This is what will be shown on the screen.
     * @param savedInstanceState updates the current state of the application
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.countries, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        overviewButton = findViewById(R.id.button);
        detailsButton = findViewById(R.id.button2);
        overviewButton.setOnClickListener(new overviewClickListener());
        detailsButton.setOnClickListener(new detailsClickListener());
    } // create

    /**
     * Private class for when the user clicks on the 'Overview' button.
     * This will open the overview page for the selected country from the spinner.
     */
    private class overviewClickListener implements View.OnClickListener {
        /**
         * When the button is clicked the Overview page of the selected country will run
         * @param v view
         */
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, Overview.class);
            startActivity(intent);
        } // on click
    } // button click listener for overview button

    /**
     * Private class for when the user clicks on the 'Details' button.
     * This will open the overview page for the selected country from the spinner.
     */
    private class detailsClickListener implements View.OnClickListener {
        /**
         * When the button is clicked the Details page of the selected country will run
         * @param v view
         */
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, Details.class);
            startActivity(intent);
        } // on click
    } // button click listener for details button

    /**
     * Runs event when an item is selected from the spinner, in this case it is
     * the country chosen.
     * @param adapterView adapter view
     * @param view view
     * @param i spinner position
     * @param l spinner position
     */
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        text = adapterView.getItemAtPosition(i).toString();
       Toast.makeText(adapterView.getContext(),text,Toast.LENGTH_SHORT).show();
    } // onItemSelected

    // nothing will really happen here because the spinner will always have something selected
    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
    } // onNothingSelected
} // class