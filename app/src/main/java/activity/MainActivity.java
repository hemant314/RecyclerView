package activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public  class MainActivity extends AppCompatActivity {


    NotificationAdapter notificationAdapter;
    RecyclerView recyclerView;

    //String data[] =  {"hemanth","Nak","Pammi","barath","hemanth","Nak","Pammi","barath","hemanth","Nak","Pammi","barath","hemanth","Nak","Pammi","barath","hemanth","Nak","Pammi","barath"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Holder dat[] = new Holder[]{
                new Holder(R.drawable.back,"title"),
                new Holder(R.drawable.image_one,"title"),
                new Holder(R.drawable.image_two,"title"),
                new Holder(R.drawable.image_one,"title"),
                new Holder(R.drawable.image_two,"title"),
                new Holder(R.drawable.back,"title"),
                new Holder(R.drawable.image_two,"title"),
                new Holder(R.drawable.image_two,"title"),
                new Holder(R.drawable.back,"title"),
                new Holder(R.drawable.image_one,"title"),
                new Holder(R.drawable.back,"title"),
                new Holder(R.drawable.back,"title"),
                new Holder(R.drawable.image_one,"title"),
                new Holder(R.drawable.image_two,"title"),
                new Holder(R.drawable.back,"title"),
                new Holder(R.drawable.back,"title"),
                new Holder(R.drawable.image_two,"title"),
                new Holder(R.drawable.back,"title"),

        };

         //initialize recyclerview
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        //fixed size of recyclerview layout
        recyclerView.setHasFixedSize(true);

        //initialize linear layout manager horizontally
        LinearLayoutManager linearHorizontal = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearHorizontal);

        //intialize linear layout manager vertically
        LinearLayoutManager linearVertical = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearVertical);

        //here the second parameter is for number of rows.
        //third parameter is for horizontal scroll.
        //fourth paramter is boolean,when it set to false,layout from start to end
        GridLayoutManager gridHorizontal = new GridLayoutManager(this,3,GridLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(gridHorizontal);


        //for vertical scroll
        GridLayoutManager gridVertical = new GridLayoutManager(this,3,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridVertical);


        //here first param represents number of rows
        //second param represents horizontal scroll
        StaggeredGridLayoutManager staggeredGridHorizontal=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(staggeredGridHorizontal);



        //second param represents vertical scroll
        StaggeredGridLayoutManager staggeredGridVertical=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridVertical);

        notificationAdapter = new NotificationAdapter(MainActivity.this,recyclerView,dat);
        recyclerView.setAdapter(notificationAdapter);

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
