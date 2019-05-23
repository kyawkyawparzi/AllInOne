package pyaepyae.allinone.allinone;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class CustomAdapterPhContacts extends RecyclerView.Adapter<CustomAdapterPhContacts.MyViewHolder>{

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView name,phno;
        ImageView imageView,imageView1,imageView2;


        int[] pic;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.txt_name);
            phno=itemView.findViewById(R.id.txt_phno);
            imageView=itemView.findViewById(R.id.image_view);
            imageView1=itemView.findViewById(R.id.image_view1);
            imageView2=itemView.findViewById(R.id.image_view2);
            imageView1.setOnClickListener(this);
            imageView2.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.image_view1:
                    //Toast.makeText(this,"Clicked Phone Icon",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.image_view2:
                    //Toast.makeText(this,"Clicked Message Icon",Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }

    private List<GetSetPhContacts> contacts;
    public CustomAdapterPhContacts(List<GetSetPhContacts> contacts){
        this.contacts=contacts;
    }
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.phone_contact,viewGroup,false);
        MyViewHolder myview=new MyViewHolder(itemView);
        return myview;
    }

    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {
        final GetSetPhContacts cont=contacts.get(position);
        myViewHolder.imageView.setImageResource(cont.getPic());
        //Log.i("work",cont.getPic()+"");
        myViewHolder.name.setText(cont.getName());
        myViewHolder.phno.setText(cont.getPhno());

        myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "You Clicked"+cont.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    public int getItemCount() {
        //Log.i("SIZE",contacts.size()+"");
        return contacts.size();
    }
}
