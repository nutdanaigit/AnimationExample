package ayp.aug.animationactivity;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by Nutdanai on 10/22/2016.
 */

public class AnimaHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private static final String TAG = "AnimaHolder";
    private TextView mTextView;
    private Activity mActivity;
    private int[] txtBackgroundColor;
    private int randomBackgraoundColor;


    public AnimaHolder(View itemView, Activity activity) {
        super(itemView);
        this.mActivity = activity;
        mTextView = (TextView) itemView.findViewById(R.id.txt_list);

        /**
         * Solution 1 You want to define color by yourself.
         */
//        txtBackgroundColor = mActivity.getResources().getIntArray(R.array.androidcolors);
//        randomBackgraoundColor = txtBackgroundColor[new Random().nextInt(txtBackgroundColor.length)];
//        itemView.setBackgroundColor(randomBackgraoundColor);

        /**
         * Solution 2 You want a Truly random color (Randomly).
         */
        Random rnd = new Random();
        randomBackgraoundColor = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        itemView.setBackgroundColor(randomBackgraoundColor);

    }

    public void Bind(String s){
        mTextView.setText(s);
        mTextView.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

    }
}
