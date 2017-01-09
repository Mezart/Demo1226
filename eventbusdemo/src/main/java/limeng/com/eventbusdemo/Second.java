package limeng.com.eventbusdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import org.greenrobot.eventbus.EventBus;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Second extends AppCompatActivity {
    @Bind(R.id.send)
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.send)
    void click(){
        MyEvent event = new MyEvent();
        event.setMessage("fasongguolai");
        EventBus.getDefault().post(event);
        finish();
    }

}
