package pnj.latihan.latihanprojectti6.page.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import pnj.latihan.latihanprojectti6.R;

public class HalamanDuaFragment extends Fragment {

    TextView textData;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.halaman_dua_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textData = view.findViewById(R.id.textData);
        Bundle bundle = getArguments();
        textData.setText(bundle.getString("data_kirim", ""));

    }

    public static HalamanDuaFragment newInstence(String dataKirim) {

        HalamanDuaFragment halamanDuaFragment = new HalamanDuaFragment();
        Bundle args = new Bundle();
        args.putString("data_kirim", dataKirim);
        halamanDuaFragment.setArguments(args);
        return halamanDuaFragment;

    }
}
