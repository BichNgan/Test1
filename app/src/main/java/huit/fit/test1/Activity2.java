package huit.fit.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        //--------------------------
        addControl();
        addEvents();
    }

    void addControl()
    {
        btn1=(Button) findViewById(R.id.btn1);
    }

    void addEvents()
    {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Mở activity mới
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);

                //Hiển thị thông báo nhanh
                Toast.makeText(getApplicationContext(),"Mở activity mới thành công!",Toast.LENGTH_LONG).show();
            }
        });

    }
}