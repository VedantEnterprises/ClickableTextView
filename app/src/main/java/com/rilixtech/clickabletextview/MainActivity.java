package com.rilixtech.clickabletextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.text.method.LinkMovementMethod;

public class MainActivity extends AppCompatActivity {

  private AppCompatTextView mTextOneTv;
  private AppCompatTextView mTextTwoTv;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mTextOneTv = (AppCompatTextView) this.findViewById(R.id.text_one);
    mTextTwoTv = (AppCompatTextView) this.findViewById(R.id.text_two);

    mTextOneTv.setMovementMethod(LinkMovementMethod.getInstance());
    mTextTwoTv.setMovementMethod(LinkMovementMethod.getInstance());
  }


}
