package kumar.sumoftwonumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    EditText e2;
TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.editText);
        e2=(EditText) findViewById(R.id.editText2);
        t1=(TextView) findViewById(R.id.textView);





    }

    public void btn(View view) {
        int num1=Integer.parseInt(e1.getText().toString());
        int num2= Integer.parseInt(e2.getText().toString());

        int sum = num1 + num2;
t1.setText(Integer.toString(sum));
    }
}
