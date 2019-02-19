package com.learn.khf.stc.cardstack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wenchao.cardstack.CardStack;

public class MainActivity extends AppCompatActivity implements CardStack.CardEventListener {

    private CardAdapter cardAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initializeImages();

        CardStack cardStack = (CardStack)findViewById(R.id.cardStack);
        cardStack.setContentResource(R.layout.cart_layout);
      //  cardStack.setStackMargin(20);
        cardStack.setAdapter(cardAdapter);


        cardStack.setListener(this);




    }





    private void initializeImages() {
        cardAdapter = new CardAdapter(getApplicationContext(),0);
        cardAdapter.add(R.drawable.img421);
        cardAdapter.add(R.drawable.marvel);
        cardAdapter.add(R.drawable.th);
        cardAdapter.add(R.drawable.abu);

    }

    @Override
    public boolean swipeEnd(int i, float v) {

        return (v>300 )?true:false;
    }

    @Override
    public boolean swipeStart(int i, float v) {
        return false;
    }

    @Override
    public boolean swipeContinue(int i, float v, float v1) {
        return false;
    }

    @Override
    public void discarded(int i, int i1) {

    }

    @Override
    public void topCardTapped() {

    }
}
