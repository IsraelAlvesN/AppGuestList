package devandroid.israel.appguest.view;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import devandroid.israel.appguest.R;
import devandroid.israel.appguest.model.Guest;

public class MainActivity extends AppCompatActivity {

    Guest guest1 = new Guest();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        guest1.setName("Israel");
        guest1.setLastName("Alves");
        guest1.setIsHusbandOrWifeFamily('W');
        guest1.setAlcoholOrnot(true);
        guest1.setnGuest(4);

        Log.i("GuestKey", guest1.toString());


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}