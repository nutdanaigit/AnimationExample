package ayp.aug.animationactivity;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.List;

/**
 * Created by Nutdanai on 10/22/2016.
 */

public class AnimaAdapter extends RecyclerView.Adapter<AnimaHolder> {
    private static final String TAG = "AnimaAdapter";
    private Activity mActivity;
    private List<String> mListString;

    public AnimaAdapter(Activity activity,List<String> stringList){
        this.mActivity = activity;
        this.mListString = stringList;
    }


    @Override
    public AnimaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mActivity);
        View v = inflater.inflate(R.layout.list_adapter,parent,false);

        return new AnimaHolder(v,mActivity);
    }

    @Override
    public void onBindViewHolder(AnimaHolder holder, int position) {
            holder.Bind(mListString.get(position));
    }

    @Override
    public int getItemCount() {
        return mListString.size();
    }
}
