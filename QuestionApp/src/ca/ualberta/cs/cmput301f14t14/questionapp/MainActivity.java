package ca.ualberta.cs.cmput301f14t14.questionapp;

import android.app.ActionBar;
import android.app.ActionBar.OnNavigationListener;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Toast;


public class MainActivity extends Activity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       	setContentView(R.layout.activity_main);
       
        //Create a spinner adapter for sorting choices
        ArrayAdapter<CharSequence> sortAdapter = 
        		ArrayAdapter.createFromResource(
        					getActionBar().getThemedContext(),
        					R.array.sort_spinner_data, 
        					android.R.layout.simple_spinner_item
        				);
        // Specify the layout to use when the list of choices appears
        sortAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        
        getActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);
        getActionBar().setListNavigationCallbacks(sortAdapter, changeSort());
        
        //This is test that the welcome screen works!!!
        Intent intent = new Intent(this.getBaseContext(), WelcomeScreenActivity.class);
        startActivityForResult(intent, Activity.RESULT_FIRST_USER);
    }
    
    public OnNavigationListener changeSort() {
    	//This is the callback that is called when the user chooses 
    	//a sorting order from the spinner in the action bar.
    	return new OnNavigationListener() {
			@Override
			public boolean onNavigationItemSelected(int itemposition, long itemid) {
				// Auto-generated method stub
				return false;
			}
		};
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    public void onActivityResult(int requestCode, int resultCode,Intent intent){
    	
    	if (requestCode == Activity.RESULT_FIRST_USER || resultCode == Activity.RESULT_OK){
    		String username = intent.getStringExtra("username");
    		Toast.makeText(this, "Welcome " + username + " to Qasper", Toast.LENGTH_SHORT).show();
    		
    	}
    	
    }
}
