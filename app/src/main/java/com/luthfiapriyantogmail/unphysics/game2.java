package com.luthfiapriyantogmail.unphysics;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class game2 extends ActionBarActivity {
    private TextView option1, option2, choice1, choice2, option3, textview;
    Button imageButton3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        setContentView(R.layout.game2);
        imageButton3 = (Button) findViewById(R.id.button2);
        imageButton3.setVisibility(View.INVISIBLE);
        textview = (TextView) findViewById(R.id.textView10);
        textview.setVisibility(View.INVISIBLE);

        //views to drag
        option1 = (TextView) findViewById(R.id.option_1);

        //views to drop onto
        choice1 = (TextView) findViewById(R.id.choice_1);

        //set touch listeners
        option1.setOnTouchListener(new ChoiceTouchListener());

        //set drag listeners
        choice1.setOnDragListener(new ChoiceDragListener());

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(game2.this, MenuElastis1.class));
            }
        });
    }

    private final class ChoiceTouchListener implements View.OnTouchListener {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                //setup drag
                ClipData data = ClipData.newPlainText("", "");
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
                //start dragging the item touched
                view.startDrag(data, shadowBuilder, view, 0);
                return true;
            } else {
                return false;
            }
        }
    }

    private class ChoiceDragListener implements View.OnDragListener {

        @Override
        public boolean onDrag(View v, DragEvent dragEvent) {
            switch (dragEvent.getAction()) {
                case DragEvent.ACTION_DRAG_STARTED:
                    //no action necessary
                    break;
                case DragEvent.ACTION_DRAG_ENTERED:
                    //no action necessary
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    //no action necessary
                    break;
                case DragEvent.ACTION_DROP:

                    //handle the dragged view being dropped over a drop view
                    View view = (View) dragEvent.getLocalState();

                    //stop displaying the view where it was before it was dragged
                    view.setVisibility(View.INVISIBLE);

                    //view dragged item is being dropped on
                    TextView dropTarget = (TextView) v;

                    //view being dragged and dropped
                    TextView dropped = (TextView) view;

                    //update the text in the target view to reflect the data being dropped
                    dropTarget.setText(dropped.getText());

                    //make it bold to highlight the fact that an item has been dropped
                    dropTarget.setTypeface(Typeface.DEFAULT_BOLD);

                    //if an item has already been dropped here, there will be a tag
                    Object tag = dropTarget.getTag();
                    imageButton3.setVisibility(View.VISIBLE);
                    textview.setVisibility(View.VISIBLE);

                    //if there is already an item here, set it back visible in its original place
                    if (tag != null) {
                        //the tag is the view id already dropped here
                        int existingID = (Integer) tag;
                        //set the original view visible again
                        findViewById(existingID).setVisibility(View.VISIBLE);

                    }

                    //set the tag in the target view being dropped on - to the ID of the view being dropped
                    dropTarget.setTag(dropped.getId());
                    break;

                case DragEvent.ACTION_DRAG_ENDED:
                    break;
            }

            return true;

        }

    }

}
