package com.londonappbrewery.xylophonepm;

import android.app.Application;
import android.content.Context;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import static android.media.AudioManager.STREAM_MUSIC;

public class MainActivity extends AppCompatActivity{

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 14;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private SoundPool mSoundPool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    private int m1SoundId;
    private int m2SoundId;
    private int m3SoundId;
    private int m4SoundId;
    private int m5SoundId;
    private int m6SoundId;
    private int m7SoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Create a new SoundPool
        mSoundPool=new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS,STREAM_MUSIC,0);

        // TODO: Load and get the IDs to identify the sounds
        Context mContext;
        mContext=getApplicationContext();
        mCSoundId=mSoundPool.load(mContext,R.raw.note1_c,1);
        mDSoundId=mSoundPool.load(mContext,R.raw.note2_d,1);
        mESoundId=mSoundPool.load(mContext,R.raw.note3_e,1);
        mFSoundId=mSoundPool.load(mContext,R.raw.note4_f,1);
        mGSoundId=mSoundPool.load(mContext,R.raw.note5_g,1);
        mASoundId=mSoundPool.load(mContext,R.raw.note6_a,1);
        mBSoundId=mSoundPool.load(mContext,R.raw.note7_b,1);

        m1SoundId=mSoundPool.load(mContext,R.raw.beat_1,1);
        m2SoundId=mSoundPool.load(mContext,R.raw.beat_2,1);
        m3SoundId=mSoundPool.load(mContext,R.raw.beat_3,1);
        m4SoundId=mSoundPool.load(mContext,R.raw.beat_4,1);
        m5SoundId=mSoundPool.load(mContext,R.raw.beat_5,1);
        m6SoundId=mSoundPool.load(mContext,R.raw.beat_6,1);
        m7SoundId=mSoundPool.load(mContext,R.raw.beat_7,1);



    }

    // TODO: Add the play methods triggered by the buttons
        public void playC(View v)
        {
            Log.d("Xulophone","Red button clicked");
            mSoundPool.play(mCSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
        }
        public void playD(View v)
        {
            mSoundPool.play(mDSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
        }
        public void playE(View v)
        {
            mSoundPool.play(mESoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
        }
        public void playF(View v)
        {
            mSoundPool.play(mFSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
        }
        public void playG(View v)
        {
            mSoundPool.play(mGSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
        }
        public void playA(View v)
        {
            mSoundPool.play(mASoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
        }
        public void playB(View v)
        {
            mSoundPool.play(mBSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
        }

        public void play1(View v)
        {
            mSoundPool.play(m1SoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
        }

        public void play2(View v)
        {
            mSoundPool.play(m2SoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
        }
        public void play3(View v)
        {
            mSoundPool.play(m3SoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
        }
        public void play4(View v)
        {
            mSoundPool.play(m4SoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
        }

        public void play5(View v)
        {
            mSoundPool.play(m5SoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
        }
        public void play6(View v)
        {
            mSoundPool.play(m6SoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
        }
        public void play7(View v)
        {
            mSoundPool.play(m7SoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
        }
}
