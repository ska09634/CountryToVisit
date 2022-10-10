package edu.uga.cs.countrytovisit;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Overview class that runs the app immediately when the 'Overview' button is pressed.
 */
public class Overview extends AppCompatActivity {
    TextView countryName;
    TextView description;

    /**
     * Creates the app on start up. This is what will be shown on the screen.
     * @param savedInstanceState updates the current state of the application
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);
        countryName = findViewById(R.id.countryName);
        description = findViewById(R.id.description);
        ImageView flag = findViewById(R.id.tourist);
        flag.setImageResource(R.drawable.map);

        switch (MainActivity.text) {
            case "Japan":
                countryName.setText("Japan");
                flag.setImageResource(R.drawable.japan);
                description.setText("Japan is an archipelago nation located in eastern Asia." +
                        "\nPopulation: 125 million" +
                        "\nCapital: Tokyo");
                break;
            case "Germany":
                countryName.setText("Germany");
                flag.setImageResource(R.drawable.germany);
                description.setText("Germany is a country in central Europe bordered by Denmark, Poland, Czechia, Austria, Switzerland, France, Luxembourg, Belgium, and the Netherlands. " +
                        "\nPopulation: 83 million" +
                        "\nCapital: Berlin");
                break;
            case "Egypt":
                countryName.setText("Egypt");
                flag.setImageResource(R.drawable.egypt);
                description.setText("Egypt is a country in northeast Africa bordered by Palestine, Israel, Sudan and Libya." +
                        "\nPopulation: 102 million" +
                        "\nCapital: Cairo");

                break;
            case "Australia":
                countryName.setText("Australia");
                flag.setImageResource(R.drawable.australia);
                description.setText("Australia is a sovereign country consisting of the mainland Australian continent, and it is the largest country in Oceania." +
                        "\nPopulation: 25 million" +
                        "\nCapital: Canberra");

                break;
            case "Brazil":
                countryName.setText("Brazil");
                flag.setImageResource(R.drawable.brazil);
                description.setText("Brazil is the largest country in South America, and it is bordered by Uruguay, Argentina, Paraguay, Bolivia, Peru, Colombia, Venezuela, Guyana, and Suriname." +
                        "\nPopulation: 214 million" +
                        "\nCapital: Brasília");
                break;
        } // switch
    } // create
} // class