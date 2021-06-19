package com.example.e_commerce;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class home extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ImageSlider imageSlider=findViewById(R.id.image_slider);

        List<SlideModel> slideModels=new ArrayList<>();

        slideModels.add(new SlideModel("https://thumbs.dreamstime.com/b/environment-earth-day-hands-trees-growing-seedlings-bokeh-green-background-female-hand-holding-tree-nature-field-gra-130247647.jpg","Phone"));
        slideModels.add(new SlideModel("https://picsum.photos/id/894/300/200","Com"));
        slideModels.add(new SlideModel("https://picsum.photos/id/892/300/200","Image 3"));
        slideModels.add(new SlideModel("https://picsum.photos/id/891/300/200","Image 4"));
        imageSlider.setImageList(slideModels,true);
    }
}
