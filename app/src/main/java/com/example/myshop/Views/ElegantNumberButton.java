package com.example.myshop.Views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.myshop.R;

public class ElegantNumberButton extends RelativeLayout {

    Button btnLeft, btnRight;
    TextView txtview;
    private ClickListener clickListener = null;

    public ElegantNumberButton(Context context) {
        super(context);
        inflate(context, R.layout.button_elegant_number, this);

        btnLeft = findViewById(R.id.elegant_button_left);
        btnRight = findViewById(R.id.elegant_button_right);
        txtview = findViewById(R.id.elegant_num);
        initClickListener();
    }

    public ElegantNumberButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        inflate(context, R.layout.button_elegant_number, this);

        btnLeft = findViewById(R.id.elegant_button_left);
        btnRight = findViewById(R.id.elegant_button_right);
        txtview = findViewById(R.id.elegant_num);
        initClickListener();
    }

    public ElegantNumberButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inflate(context, R.layout.button_elegant_number, this);

        btnLeft = findViewById(R.id.elegant_button_left);
        btnRight = findViewById(R.id.elegant_button_right);
        txtview = findViewById(R.id.elegant_num);
        initClickListener();
    }

    public ElegantNumberButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        inflate(context, R.layout.button_elegant_number, this);

        btnLeft = findViewById(R.id.elegant_button_left);
        btnRight = findViewById(R.id.elegant_button_right);
        txtview = findViewById(R.id.elegant_num);
        initClickListener();
    }

    private void initClickListener(){
        btnLeft.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.parseInt(txtview.getText().toString());
                num -= 1;
                txtview.setText(String.valueOf(num));

                if (clickListener != null){
                    clickListener.OnClick(num);
                }
            }
        });

        btnRight.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.parseInt(txtview.getText().toString());
                num += 1;
                txtview.setText(String.valueOf(num));

                if (clickListener != null){
                    clickListener.OnClick(num);
                }
            }
        });
    }

    public int getNumber() {
        return Integer.parseInt(txtview.getText().toString());
    }

    public void setOnClickListener(ClickListener clickListener){
        this.clickListener = clickListener;
    }

    public interface ClickListener{
        public void OnClick(int num);

    }
}

