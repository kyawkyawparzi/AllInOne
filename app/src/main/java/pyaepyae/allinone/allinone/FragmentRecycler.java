package pyaepyae.allinone.allinone;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FragmentRecycler extends Fragment {
    RecyclerView rv;
    private List<GetSetPhContacts> phlist = new ArrayList<>();
    private CustomAdapterPhContacts phonelist;
    public FragmentRecycler() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_recycler, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        phonelist=new CustomAdapterPhContacts(phlist);
        rv=view.findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getActivity());
        rv.setLayoutManager(layoutManager);
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.setAdapter(phonelist);

        preparePhoneData();
    }

    private void preparePhoneData() {
        /*GetSetPhContacts ph=new GetSetPhContacts("Pyae Mon","09250534492");
        phlist.add(ph);
        ph=new GetSetPhContacts("Pyae Pyae","09250534499");
        phlist.add(ph);
        ph=new GetSetPhContacts("Pyae Mon","09797865802");
        phlist.add(ph);
        ph=new GetSetPhContacts("Ma Kit","09876545678");
        phlist.add(ph);
        ph=new GetSetPhContacts("Kyaw Kyaw","0987654654");
        phlist.add(ph);
        ph=new GetSetPhContacts("Plaoivne","09876543434");
        phlist.add(ph);
        ph=new GetSetPhContacts("Htet Htet","09876645445");
        phlist.add(ph);
        ph=new GetSetPhContacts("Thiri Thu","08976754553");
        phlist.add(ph);
        phonelist.notifyDataSetChanged();*/
        int[] pic={R.drawable.person,R.drawable.phone,R.drawable.message,R.drawable.person};
        String[] name={"Mg Mg","Kyaw Kyaw","Jin Jin","Pyae Pyae"};
        String[] number={"09776567878","09876547543","0987654546","0898754645"};
        GetSetPhContacts ph;
        for (int i = 0;i<name.length;i++){
             ph=new GetSetPhContacts(pic[i],name[i],number[i]);
            phlist.add(ph);
        }


        phonelist.notifyDataSetChanged();
    }
}