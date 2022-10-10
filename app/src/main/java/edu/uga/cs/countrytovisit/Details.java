package edu.uga.cs.countrytovisit;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Overview class that runs the app immediately when the 'Overview' button is pressed.
 */
public class Details extends AppCompatActivity {
    TextView countryName;
    TextView description;

    /**
     * Creates the app on start up. This is what will be shown on the screen.
     * @param savedInstanceState updates the current state of the application
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        countryName = findViewById(R.id.countryName);
        description = findViewById(R.id.description);
        ImageView flag = findViewById(R.id.tourist);
        flag.setImageResource(R.drawable.map);

        switch (MainActivity.text) {
            case "Japan":
                countryName.setText("Japan");
                flag.setImageResource(R.drawable.fuji);
                description.setText("Places to visit: Mount Fuji, Tokyo Tower, Shrine Island" +
                        "\nCurrency: Yen (1 JPY = 0.007 USD)" +
                        "\nModes of Transportation: Bullet Trains, Taxi, Subways");
                break;
            case "Germany":
                countryName.setText("Germany");
                flag.setImageResource(R.drawable.brandenburg);
                description.setText("Places to visit: Brandenburg Gate, Neuschwanstein Castle, Berlin Cathedral" +
                        "\nCurrency: Euro (1 EUR = ~1 USD)" +
                        "\nModes of Transportation: S-Bahn, Cycling, Trams");
                break;
            case "Egypt":
                countryName.setText("Egypt");
                flag.setImageResource(R.drawable.sphinx);
                description.setText("Places to visit: The Sphinx, Abu Simbel Temples, Valley of the Kings" +
                        "\nCurrency: Pound (1 EGP = 0.051 USD)" +
                        "\nModes of Transportation: Tuk Tuk, River Buses, Airplanes");
                break;
            case "Australia":
                countryName.setText("Australia");
                flag.setImageResource(R.drawable.opera);
                description.setText("Places to visit: Great Barrier Reef, Sydney Opera House, Uluru" +
                        "\nCurrency: Dollar (1 AUD = 0.67 USD)" +
                        "\nModes of Transportation: Ferries, Trams, Buses");
                break;
            case "Brazil":
                countryName.setText("Brazil");
                flag.setImageResource(R.drawable.christ);
                description.setText("Places to visit: Christ the Redeemer, Copacabana Beach, Sugarloaf Mountain" +
                        "\nCurrency: Real (1 BRL = 0.19 USD)" +
                        "\nModes of Transportation: Buses, Cycling, Cars");
                break;
        } // switch
    } // create
} // class