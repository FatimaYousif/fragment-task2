package com.example.fragment_task2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class adapter extends RecyclerView.Adapter<adapter.MyViewHolder> {

        String data1[];
        Context context;

//constructor
public adapter(Context context,String[] s1)
        {        this.data1=s1;
                this.context=context;
        }

//overridden methods

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater;
        inflater = LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.row, parent, false);
        return new MyViewHolder(view);
        }

    @Override
    public void onBindViewHolder(adapter.MyViewHolder holder, int position) {
        holder.myText1.setText(data1[position]);

        holder.myText1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(context, Activity2.class);
                context.startActivity(i);
            }
        });


        }

@Override
public int getItemCount() {
        return data1.length;
        }


public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView myText1;

    CardView cardView;
    public MyViewHolder(View itemView) {
        super(itemView);
        myText1=itemView.findViewById(R.id.myTextView1);
       cardView=itemView.findViewById(R.id.cardView);

//       itemView.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View v) {
//               Toast.makeText(, "working", Toast.LENGTH_LONG).show();
//           }
//       });
    }


}
}

