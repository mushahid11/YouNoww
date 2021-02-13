package com.eclairiose.younow.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.eclairiose.younow.Model.ModelSearchProduct;
import com.eclairiose.younow.R;
import java.util.List;

public class AdapterSearchProduct extends RecyclerView.Adapter<AdapterSearchProduct.ViewHolder> {

    List<ModelSearchProduct> ProductList;
    Context context;

    public AdapterSearchProduct(List<ModelSearchProduct> productList, Context context) {
        ProductList = productList;
        this.context = context;
    }



    @NonNull
    @Override
    public AdapterSearchProduct.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_search,parent,false);
        AdapterSearchProduct.ViewHolder viewHolder = new AdapterSearchProduct.ViewHolder(view);

        return viewHolder;

    }


    @Override
    public void onBindViewHolder(@NonNull AdapterSearchProduct.ViewHolder holder, int position) {
        holder.productImage.setImageResource(ProductList.get(position).getProductImage());
        holder.productSearch.setImageResource(ProductList.get(position).getSearchImage());
        holder.productName.setText(ProductList.get(position).getProductName());
        holder.SellerName.setText(ProductList.get(position).getSellerName());
        holder.ProductPrice.setText(ProductList.get(position).getProductPrice());

    }


    @Override
    public int getItemCount() {
        return ProductList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView productImage,productSearch;
        TextView productName, SellerName,ProductPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            productImage = itemView.findViewById(R.id.Product_Image);
            productSearch = itemView.findViewById(R.id.product_searchImage);
            productName = itemView.findViewById(R.id.product_Name);
            SellerName = itemView.findViewById(R.id.seller_Name);
            ProductPrice = itemView.findViewById(R.id.product_price);
        }
    }
}
