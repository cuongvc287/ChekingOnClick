package cuongvc.com.chekingonclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnResult;
    private EditText edtA;
    private EditText edtB;
    private int numberA,numberB,sumAB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnResult = (Button) findViewById(R.id.btn_Result);
        edtA = (EditText) findViewById(R.id.edt_A);
        edtB = (EditText) findViewById(R.id.edt_B);

        btnResult.setOnClickListener(this);
//        btnResult.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(!edtA.getText().toString().isEmpty() && !edtB.getText().toString().isEmpty()) {
//                    numberA = Integer.parseInt(edtA.getText().toString());
//                    numberB = Integer.parseInt(edtB.getText().toString());
//                    sumAB= numberA + numberB;
////              Toast.makeText(MainActivity.this, "Sum of "+numberA+" + "+numberB+" is : "+(numberA+numberB), Toast.LENGTH_SHORT).show();
//                    Toast.makeText(MainActivity.this, "Sum of "+numberA+" + "+numberB+" is : "+sumAB, Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(MainActivity.this, "Please access Inputs", Toast.LENGTH_SHORT).show();
//                }
//
//            }
//        });
        btnResult.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "This is LongClickListener", Toast.LENGTH_SHORT).show();
                return false;

            }
        });
    }

    @Override
    public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_Result:
                    if(!edtA.getText().toString().isEmpty() && !edtB.getText().toString().isEmpty()) {
                        numberA = Integer.parseInt(edtA.getText().toString());
                        numberB = Integer.parseInt(edtB.getText().toString());
                        sumAB= numberA + numberB;
//                      Toast.makeText(MainActivity.this, "Sum of "+numberA+" + "+numberB+" is : "+(numberA+numberB), Toast.LENGTH_SHORT).show();
                        Toast.makeText(MainActivity.this, "Sum of "+numberA+" + "+numberB+" is : "+sumAB, Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Please access Inputs", Toast.LENGTH_SHORT).show();
                    }
                    break;
                default:
                    break;
            }
        }
}
