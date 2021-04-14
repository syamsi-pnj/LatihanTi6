package pnj.latihan.latihanprojectti6.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import com.squareup.picasso.Picasso;

import pnj.latihan.latihanprojectti6.R;
import pnj.latihan.latihanprojectti6.data.BeritaModel;

public class AdapterBerita extends ArrayAdapter<BeritaModel> {
    Context context;
    int resource;

    public AdapterBerita(@NonNull Context context, int resource) {
        super(context, resource);
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Holder holder;
        BeritaModel data = getItem(position);

        if(convertView==null) {
            holder = new Holder();
            convertView = LayoutInflater.from(context).inflate(resource,parent,false);
            holder.gambar = convertView.findViewById(R.id.imageView);
            holder.txt_title = convertView.findViewById(R.id.txt_title);
            holder.txt_tanggal = convertView.findViewById(R.id.txt_tanggal);
            holder.txt_desc = convertView.findViewById(R.id.txt_desc);

            convertView.setTag(holder);
        }else {
            holder = (Holder) convertView.getTag();
        }

        holder.txt_title.setText(data.getJudul());
        holder.txt_tanggal.setText(data.getTanggal());
        holder.txt_desc.setText(data.getDeskripsi());


        Picasso.get().load(data.getGambar()).into(holder.gambar);

        return convertView;
    }

    class Holder {
        ImageView gambar;
        TextView txt_title,txt_tanggal, txt_desc;
    }
}
