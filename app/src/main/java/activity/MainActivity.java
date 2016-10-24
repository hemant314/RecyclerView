package activity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.example.hemanth.recyclerview.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Model.Holder;

import static android.R.attr.data;

/**
 * Created by hemanth on 20/10/16.
 */

public  class MainActivity extends AppCompatActivity implements View.OnClickListener {


    NotificationAdapter notificationAdapter;
    RecyclerView recyclerView;
    Button linVertical,linHorizontal,gVertical,gHorizontal,sVertical;
    boolean isLinVert,isLinHor,isGridVer,isGridHor,isStagVer,isStagHor=true;

    //String data[] =  {"hemanth","Nak","Pammi","barath","hemanth","Nak","Pammi","barath","hemanth","Nak","Pammi","barath","hemanth","Nak","Pammi","barath","hemanth","Nak","Pammi","barath"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Holder dat[] = new Holder[]{
                new Holder(R.drawable.cheetha,"title"),
                new Holder(R.drawable.twitter,"title"),
                new Holder(R.drawable.eagle,"title"),
                new Holder(R.drawable.cheetha,"title"),
                new Holder(R.drawable.twitter,"title"),
                new Holder(R.drawable.eagle,"title"),
                new Holder(R.drawable.cheetha,"title"),
                new Holder(R.drawable.twitter,"title"),
                new Holder(R.drawable.eagle,"title"),
                new Holder(R.drawable.cheetha,"title"),
                new Holder(R.drawable.twitter,"title"),
                new Holder(R.drawable.eagle,"title"),
                new Holder(R.drawable.cheetha,"title"),
                new Holder(R.drawable.twitter,"title"),
                new Holder(R.drawable.eagle,"title"),
                new Holder(R.drawable.cheetha,"title"),
                new Holder(R.drawable.twitter,"title"),
                new Holder(R.drawable.eagle,"title"),
                new Holder(R.drawable.cheetha,"title"),
                new Holder(R.drawable.twitter,"title"),
                new Holder(R.drawable.eagle,"title"),
                new Holder(R.drawable.cheetha,"title"),
                new Holder(R.drawable.twitter,"title"),
                new Holder(R.drawable.eagle,"title"),
                new Holder(R.drawable.cheetha,"title"),
                new Holder(R.drawable.twitter,"title"),
                new Holder(R.drawable.eagle,"title"),

        };

        //initialize recyclerview
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        //fixed size of recyclerview layout
        recyclerView.setHasFixedSize(true);




        linHorizontal = (Button) findViewById(R.id.linearHorizontal);
        linVertical = (Button) findViewById(R.id.linearVertical);
        gVertical = (Button) findViewById(R.id.gridVertical);
        gHorizontal = (Button) findViewById(R.id.gridHorizontal);
        sVertical = (Button) findViewById(R.id.staggeredVertical);

        linHorizontal.setOnClickListener(this);
        linVertical.setOnClickListener(this);
        gVertical.setOnClickListener(this);
        gHorizontal.setOnClickListener(this);
        sVertical.setOnClickListener(this);


        notificationAdapter = new NotificationAdapter(MainActivity.this,recyclerView,dat);
        recyclerView.setAdapter(notificationAdapter);

        recycler();

    }

    private void recycler() {

        //intialize linear layout manager vertically
        LinearLayoutManager linearVertical = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearVertical);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.linearVertical:

                //intialize linear layout manager vertically
                LinearLayoutManager linearVertical = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false);
                recyclerView.setLayoutManager(linearVertical);

                linVertical.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                linVertical.setTextColor(Color.parseColor("#ffffff"));
                linHorizontal.setBackgroundColor(getResources().getColor(R.color.back));
                gVertical.setBackgroundColor(getResources().getColor(R.color.back));
                gHorizontal.setBackgroundColor(getResources().getColor(R.color.back));
                sVertical.setBackgroundColor(getResources().getColor(R.color.back));
                linHorizontal.setTextColor(Color.parseColor("#000000"));
                gVertical.setTextColor(Color.parseColor("#000000"));
                gHorizontal.setTextColor(Color.parseColor("#000000"));
                sVertical.setTextColor(Color.parseColor("#000000"));

                break;

            case R.id.linearHorizontal:

                //initialize linear layout manager horizontally.
                LinearLayoutManager linearHorizontal = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false);
                recyclerView.setLayoutManager(linearHorizontal);

                linHorizontal.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                linHorizontal.setTextColor(Color.parseColor("#ffffff"));
                linVertical.setBackgroundColor(getResources().getColor(R.color.back));
                gVertical.setBackgroundColor(getResources().getColor(R.color.back));
                gHorizontal.setBackgroundColor(getResources().getColor(R.color.back));
                sVertical.setBackgroundColor(getResources().getColor(R.color.back));
                linVertical.setTextColor(Color.parseColor("#000000"));
                gVertical.setTextColor(Color.parseColor("#000000"));
                gHorizontal.setTextColor(Color.parseColor("#000000"));
                sVertical.setTextColor(Color.parseColor("#000000"));


                break;

            case R.id.gridVertical:


                 //for vertical scroll.
                //second parameter is for number of columns.
                GridLayoutManager gridVertical = new GridLayoutManager(MainActivity.this,3,GridLayoutManager.VERTICAL,false);
                recyclerView.setLayoutManager(gridVertical);


                gVertical.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                gVertical.setTextColor(Color.parseColor("#ffffff"));
                linVertical.setBackgroundColor(getResources().getColor(R.color.back));
                linHorizontal.setBackgroundColor(getResources().getColor(R.color.back));
                gHorizontal.setBackgroundColor(getResources().getColor(R.color.back));
                sVertical.setBackgroundColor(getResources().getColor(R.color.back));
                linVertical.setTextColor(Color.parseColor("#000000"));
                linHorizontal.setTextColor(Color.parseColor("#000000"));
                gHorizontal.setTextColor(Color.parseColor("#000000"));
                sVertical.setTextColor(Color.parseColor("#000000"));

                break;

            case R.id.gridHorizontal:

                //here the second parameter is for number of rows.
                //third parameter is for horizontal scroll.
                //fourth paramter is boolean,when it set to false,layout from start to end.
                GridLayoutManager gridHorizontal = new GridLayoutManager(MainActivity.this,2,GridLayoutManager.HORIZONTAL,false);
                recyclerView.setLayoutManager(gridHorizontal);


                gHorizontal.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                gHorizontal.setTextColor(Color.parseColor("#ffffff"));
                linVertical.setBackgroundColor(getResources().getColor(R.color.back));
                linHorizontal.setBackgroundColor(getResources().getColor(R.color.back));
                gVertical.setBackgroundColor(getResources().getColor(R.color.back));
                sVertical.setBackgroundColor(getResources().getColor(R.color.back));
                linVertical.setTextColor(Color.parseColor("#000000"));
                linHorizontal.setTextColor(Color.parseColor("#000000"));
                gVertical.setTextColor(Color.parseColor("#000000"));
                sVertical.setTextColor(Color.parseColor("#000000"));

                break;

            case R.id.staggeredVertical:

                //here first param represents number of columns.
                //second param represents vertical scroll.
                StaggeredGridLayoutManager staggeredGridVertical=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
                recyclerView.setLayoutManager(staggeredGridVertical);


                sVertical.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                sVertical.setTextColor(Color.parseColor("#ffffff"));
                linVertical.setBackgroundColor(getResources().getColor(R.color.back));
                linHorizontal.setBackgroundColor(getResources().getColor(R.color.back));
                gVertical.setBackgroundColor(getResources().getColor(R.color.back));
                gHorizontal.setBackgroundColor(getResources().getColor(R.color.back));
                linVertical.setTextColor(Color.parseColor("#000000"));
                linHorizontal.setTextColor(Color.parseColor("#000000"));
                gVertical.setTextColor(Color.parseColor("#000000"));
                gHorizontal.setTextColor(Color.parseColor("#000000"));



                break;


            default:
                break;

        }



    }


    @Override
    protected void onResume() {
        super.onResume();

        recycler();


    }

    public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.MyViewHolder> {

        RecyclerView recyclerView;
        Context context;
        Holder dataSet[];



        public NotificationAdapter(MainActivity mainActivity, RecyclerView recyclerView, Holder[] nameList) {
            this.context = mainActivity;
            this.recyclerView = recyclerView;
            this.dataSet=nameList;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.notification_item_layout,parent,false);

            return new MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, final int position) {

            Holder hold = dataSet[position];

            holder.title.setText(hold.getName());
            holder.imageView.setImageResource(hold.getImage());

        }

        @Override
        public int getItemCount() {
            return dataSet.length;
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {

            TextView title;
            ImageView imageView;

            public MyViewHolder(View itemView) {
                super(itemView);
                title = (TextView) itemView.findViewById(R.id.title);
                imageView = (ImageView) itemView.findViewById(R.id.card_image);


            }
        }
    }

}
