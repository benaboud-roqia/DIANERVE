package com.example.dianerve;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class welcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        // Initialisation du bouton "Suivant"
        Button btnNext = findViewById(R.id.btnNext);

        // Définir un OnClickListener pour le bouton
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Action à effectuer lorsque le bouton est cliqué
                Toast.makeText(welcomeActivity.this, "Vous avez cliqué sur Suivant!", Toast.LENGTH_SHORT).show();
                // Tu peux ajouter des actions supplémentaires ici, comme naviguer vers une autre activité si besoin
            }
        });
    }
}
