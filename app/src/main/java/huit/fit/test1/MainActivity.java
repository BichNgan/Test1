package huit.fit.test1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText edtSoA, edtSoB;
    Button btnPlus, btnTru;
    TextView tvKq;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //---------------------------
        addControls();
        addEvents();
    }
    //Gắn id cho các views
    void addControls()
    {
        edtSoA = (EditText) findViewById(R.id.edtSoA);
        edtSoB = (EditText)findViewById(R.id.edtSoB);
        btnPlus=(Button) findViewById(R.id.btnPlus);
        tvKq=(TextView) findViewById(R.id.tvKq);
    }
    //Xử lý sự kiện
    void addEvents()
    {
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a= Integer.parseInt(edtSoA.getText().toString());
                int b=Integer.parseInt(edtSoB.getText().toString());
                tvKq.setText("Kết quả là : "+ String.valueOf(a+b));
            }
        });


    }
}