package com.ethiopia.mymall;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyCartFragment extends Fragment {


    public MyCartFragment() {
        // Required empty public constructor
    }

    private RecyclerView cartItemsRecyclerView;
    private Button continueBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_cart, container, false);

        cartItemsRecyclerView = view.findViewById(R.id.cart_items_recyclerview);
        continueBtn = view.findViewById(R.id.cart_continue_btn);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        cartItemsRecyclerView.setLayoutManager(layoutManager);

        List<CartItemModel>cartItemModelList = new ArrayList<>();
        cartItemModelList.add(new CartItemModel(0,R.mipmap.image2,"Samsung Galaxy 9",2,"Birr.4999/-","Birr.5999/-",1,0,0));
        cartItemModelList.add(new CartItemModel(0,R.mipmap.image2,"Samsung Galaxy 9",0,"Birr.4999/-","Birr.5999/-",1,1,0));
        cartItemModelList.add(new CartItemModel(0,R.mipmap.image2,"Samsung Galaxy 9",2,"Birr.4999/-","Birr.5999/-",1,2,0));
        cartItemModelList.add(new CartItemModel(1,"","Birr.14999/-","Free","Birr.14999/-","Price (3 items)"));

        CartAdapter cartAdapter = new CartAdapter(cartItemModelList);
        cartItemsRecyclerView.setAdapter(cartAdapter);
        cartAdapter.notifyDataSetChanged();

        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deliveryIntent = new Intent(getContext(),AddAddressActivity.class);
                getContext().startActivity(deliveryIntent);
            }
        });

        return view;
    }

}
