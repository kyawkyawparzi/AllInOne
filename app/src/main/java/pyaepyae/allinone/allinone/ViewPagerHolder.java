package pyaepyae.allinone.allinone;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ViewPagerHolder extends Fragment {
ViewPager viewPager;
TabLayout tabLayout;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view_pager_holder, container, false);
    }

    @Override
    public void onViewCreated( View view, Bundle savedInstanceState) {
        viewPager = view.findViewById(R.id.viewpager_main);
        tabLayout = view.findViewById(R.id.tab);
        FragmentManager fragmanager = getActivity().getSupportFragmentManager();
        FragmentCtrlViewPager ctrladapter=new FragmentCtrlViewPager(fragmanager);
        viewPager.setAdapter(ctrladapter);
        tabLayout.setupWithViewPager(viewPager);
        super.onViewCreated(view, savedInstanceState);
    }
}