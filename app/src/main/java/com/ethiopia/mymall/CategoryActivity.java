package com.ethiopia.mymall;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends AppCompatActivity {

    private RecyclerView categoryRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayShowTitleEnabled(false);
        String title = getIntent().getStringExtra("CategoryName");
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        categoryRecyclerView = findViewById(R.id.category_recyclerview);


        ///////// Banner slider
        List<SliderModel> sliderModelList = new ArrayList<SliderModel>();
        sliderModelList.add(new SliderModel(R.drawable.home_icon, "#077AE4"));
        sliderModelList.add(new SliderModel(R.drawable.custom_error_icon_foreground, "#077AE4"));
        sliderModelList.add(new SliderModel(R.mipmap.green_email, "#077AE4"));

        sliderModelList.add(new SliderModel(R.drawable.red_email, "#077AE4"));
        sliderModelList.add(new SliderModel(R.drawable.home_icon, "#077AE4"));
        sliderModelList.add(new SliderModel(R.mipmap.ic_launcher, "#077AE4"));
        sliderModelList.add(new SliderModel(R.drawable.cart_black, "#077AE4"));
        sliderModelList.add(new SliderModel(R.drawable.profile_placeholder, "#077AE4"));
        sliderModelList.add(new SliderModel(R.drawable.home_icon, "#077AE4"));
//        sliderModelList.add(new SliderModel(R.drawable.banner, "#077AE4"));
        sliderModelList.add(new SliderModel(R.drawable.custom_error_icon_foreground, "#077AE4"));
        sliderModelList.add(new SliderModel(R.mipmap.green_email, "#077AE4"));
        sliderModelList.add(new SliderModel(R.drawable.red_email, "#077AE4"));
        ///////// Banner slider



        //////// Horizontal Product Layout

        List<HorizontalProductScrollModel>horizontalProductScrollModelList = new ArrayList<>();
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.image2,"Samsung galaxy S9","Snap dragon core i5","Birr.14500/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.image2,"Samsung galaxy S8","Snap dragon core i5","Birr.14500/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.image2,"Samsung galaxy S7","Snap dragon core i5","Birr.14500/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.image2,"Samsung galaxy S6","Snap dragon core i5","Birr.14500/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.image2,"Samsung galaxy S5","Snap dragon core i5","Birr.14500/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.image2,"Samsung galaxy S4","Snap dragon core i5","Birr.14500/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.image2,"Samsung galaxy S3","Snap dragon core i5","Birr.14500/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.image2,"Samsung galaxy S2","Snap dragon core i5","Birr.14500/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.image2,"Samsung galaxy S6","Snap dragon core i5","Birr.14500/-"));

        //////// Horizontal Product Layout

        ///////////////////////////////
        LinearLayoutManager testingLayoutManger = new LinearLayoutManager(this);
        testingLayoutManger.setOrientation(LinearLayoutManager.VERTICAL);
        categoryRecyclerView.setLayoutManager(testingLayoutManger);

        List<HomePageModel>homePageModelList = new ArrayList<>();

        homePageModelList.add(new HomePageModel(0,sliderModelList));
        homePageModelList.add(new HomePageModel(1,R.mipmap.stripadd,"#ff0000"));
        homePageModelList.add(new HomePageModel(2,"Deals of the Day",horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(3,"Deals of the Day",horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(1,R.mipmap.stripadd,"#000000"));
        homePageModelList.add(new HomePageModel(3,"Deals of the Day",horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(2,"Deals of the Day",horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(1,R.drawable.banner,"#ffff00"));

        HomePageAdapter adapter = new HomePageAdapter(homePageModelList);
        categoryRecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.search_icon, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.main_search_icon){
            return true;
        }else if (id == android.R.id.home){
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
