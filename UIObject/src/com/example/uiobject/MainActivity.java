package com.example.uiobject;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * 
 * @author Liuwf
 * 
 *         µÎµÎ´ð
 */
public class MainActivity extends Activity implements OnItemClickListener {
	ListView uiindex_listview;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		uiindex_listview = (ListView) this.findViewById(R.id.uiindex_listview);
		uiindex_listview.setAdapter(new ArrayAdapter(this,
				android.R.layout.simple_list_item_1, getData()));
		uiindex_listview.setOnItemClickListener(this);

	}

	private List<String> getData() {
		List<String> list = new ArrayList<String>();
		list.add("HotelActivity");
		list.add("MovieActivity");
		list.add("DietActivity");
		list.add("FoodActivity");
		list.add("PicturesActivity");
		list.add("JokeActivity");
		list.add("StarsignActivity");
		list.add("GameActivity");
		list.add("PersonActivity");
		list.add("TvPlayActivity");
		list.add("MobileStoreActivity");
		list.add("CarStoreActivity");
		return list;
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		switch (position) {
		case 0:
			Intent i0 = new Intent(this, HotelActivity.class);
			startActivity(i0);
			break;
		case 1:
			Intent i1 = new Intent(this, MovieActivity.class);
			startActivity(i1);
			break;
		case 2:
			Intent i2 = new Intent(this, DietActivity.class);
			startActivity(i2);
			break;
		case 3:
			Intent i3 = new Intent(this, FoodActivity.class);
			startActivity(i3);
			break;
		case 4:
			Intent i4 = new Intent(this, PicturesActivity.class);
			startActivity(i4);
			break;
		case 5:
			Intent i5 = new Intent(this, JokeActivity.class);
			startActivity(i5);
			break;
		case 6:
			Intent i6 = new Intent(this, StarsignActivity.class);
			startActivity(i6);
			break;
		case 7:
			Intent i7 = new Intent(this, GameActivity.class);
			startActivity(i7);
			break;
		case 8:
			Intent i8 = new Intent(this, PersonActivity.class);
			startActivity(i8);
			break;
		case 9:
			Intent i9 = new Intent(this, TvPlayActivity.class);
			startActivity(i9);
			break;
		case 10:
			Intent i10 = new Intent(this, MobileStoreActivity.class);
			startActivity(i10);
			break;
		case 11:
			Intent i11= new Intent(this, CarStoreActivity.class);
			startActivity(i11);
			break;
		default:
			break;
		}

	}

}
