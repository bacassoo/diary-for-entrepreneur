package com.spear.diary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // 3가지 항목 추가
    private TextView mTextView;
    private EditText mEditText;
    private Button mButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // onCreate 안에서 findViewByld를 사용해서 id를 통해서 찾겠다(맵핑)
        mTextView = (TextView) findViewById(R.id.textView);
        mEditText = (EditText) findViewById(R.id.editText);
        mButton = (Button) findViewById(R.id.button);

        // 클릭을했을때 처리해야 되는 내용
        View.OnClickListener firstOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = mEditText.getText().toString();
                mTextView.setText(text);
                mEditText.setText("");
            }
        };
        // 위 OnClick 실행버튼 활성화
        mButton.setOnClickListener(firstOnClickListener);
    }
}
