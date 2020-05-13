package mango.frameanimation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private AnimationDrawable ani;
    private ImageView bat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// this is for only animation below 3 useing animate.xml
//        bat=(ImageView)findViewById(R.id.batID);
//        bat.setBackgroundResource(R.drawable.animate);
//        ani=(AnimationDrawable)bat.getBackground();
//animate.xml
        // for fade in seen
        bat=(ImageView)findViewById(R.id.batID);
       //


    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
this is for only animation below 3 useing animate.xml
       ani.start();
       Handler mahadler=new Handler();
       mahadler.postDelayed(new Runnable() {
           @Override
           public void run() {
               ani.stop();
           }
       },5000);//5 seconda
       return super.onTouchEvent(event);
      //animate.xml

        //this is fade in

//         Handler mahadler=new Handler();
//         mahadler.postDelayed(new Runnable() {
//             @Override
//             public void run() {
//                 Animation startanimation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
//                 bat.startAnimation(startanimation);
//             }
//         },60);//ms
      //  return super.onTouchEvent(event);
        //fade in

    }
}
