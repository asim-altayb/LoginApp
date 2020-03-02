package sudo.asim.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView register;
    String user="a";
    String pass="123";
    EditText username;
    EditText password;
    Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    username = (EditText) findViewById(R.id.et_username);
    password = (EditText) findViewById(R.id.et_password);
    register = (TextView) findViewById(R.id.tv_reg);
    register.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent registerpage = new Intent(MainActivity.this , Regiser.class);
            startActivity(registerpage);
        }
    });

    login = (Button) findViewById(R.id.btn_login);

    login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            String userinput = username.getText().toString();
            String passinput = password.getText().toString();

            if( user.equals(userinput) && pass.equals(passinput) ) {
                Intent HO = new Intent(MainActivity.this , Home.class);
                startActivity(HO);

            }
            else{
                Toast.makeText(MainActivity.this, "Error in login data", Toast.LENGTH_SHORT).show();
            }
        }
    });



    }
}
