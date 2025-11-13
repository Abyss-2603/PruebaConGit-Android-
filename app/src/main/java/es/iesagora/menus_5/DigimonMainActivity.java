package es.iesagora.menus_5;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import es.iesagora.menus_5.databinding.ActivityDigimonMainBinding;

public class DigimonMainActivity extends AppCompatActivity {

    private ActivityDigimonMainBinding binding;
    private NavController navController;
    private AppBarConfiguration appBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDigimonMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // 1. Configurar la toolbar
        setSupportActionBar(binding.toolbar);

        // 2. Obtener el NavController
        NavHostFragment navHostFragment =
                (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        navController = navHostFragment.getNavController();

        // 3. Configurar AppBarConfiguration con los fragments del menú inferior
        appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.rookieFragment,
                R.id.championFragment,
                R.id.megaFragment
        ).build();

        // 4. Vincular Toolbar y NavController
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        // 5. Vincular BottomNavigationView con NavController
        NavigationUI.setupWithNavController(binding.bottomNavigationView, navController);
    }

    @Override
    public boolean onSupportNavigateUp() {
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
