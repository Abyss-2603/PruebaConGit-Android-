package es.iesagora.menus_5;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Menu1Fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu1, container, false);

        Button btnPokemon = view.findViewById(R.id.button);
        Button btnDigimon = view.findViewById(R.id.button2);

        btnPokemon.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), PokemonMainActivity.class);
            startActivity(intent);
        });

        btnDigimon.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), DigimonMainActivity.class);
            startActivity(intent);
        });

        return view;
    }
}
