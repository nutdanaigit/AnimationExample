package ayp.aug.animationactivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.jar.Pack200;

/**
 * Created by Nutdanai on 10/22/2016.
 */

public class AnimaFragment extends Fragment {
    private static final String TAG = "AnimaFragment";
    private List<String> mList;
    private RecyclerView mRecyclerView;


    public static AnimaFragment newInstance() {

        Bundle args = new Bundle();

        AnimaFragment fragment = new AnimaFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (mList == null) {
            mList = new ArrayList<>();
        }
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_anima, container, false);
        mRecyclerView = (RecyclerView) v.findViewById(R.id.list_recycler);

        for (int i = 0; i <= 50; i++) {
            Random r = new Random();
            int temp = r.nextInt(100);
            mList.add(Integer.toString(temp));
        }

        Log.d(TAG, "onCreateView: " + mList);

        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(),3));
        mRecyclerView.setAdapter(new AnimaAdapter(getActivity(), mList));

        return v;
    }
}
