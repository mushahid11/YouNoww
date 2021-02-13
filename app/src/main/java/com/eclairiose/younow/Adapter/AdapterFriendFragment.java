package com.eclairiose.younow.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.eclairiose.younow.Fragments.FriendFragment;
import com.eclairiose.younow.Fragments.MessagesFragment;
import com.eclairiose.younow.Model.ModelFriendFregment;
import com.eclairiose.younow.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class AdapterFriendFragment  extends RecyclerView.Adapter<AdapterFriendFragment.ViewHolder> {

    List<ModelFriendFregment> friendchatList;
    FriendFragment context;

    public AdapterFriendFragment(List<ModelFriendFregment> friendchatList, FriendFragment context) {
        this.friendchatList = friendchatList;
        this.context = context;
    }


    @NonNull
    @Override
    public AdapterFriendFragment.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_friends,parent,false);

        AdapterFriendFragment.ViewHolder viewHolder = new AdapterFriendFragment.ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterFriendFragment.ViewHolder holder, int position) {
        holder.friendImage.setImageResource(friendchatList.get(position).getFriend_image());
        holder.FriendName.setText(friendchatList.get(position).getFriend_name());
        holder.FriendMsgTime.setText(friendchatList.get(position).getFriend_Msgtime());
        holder.FriendMsg.setText(friendchatList.get(position).getFriend_msg());
    }


    @Override
    public int getItemCount() {
        return friendchatList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CircleImageView friendImage;
        TextView FriendName,FriendMsgTime,FriendMsg;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            friendImage = itemView.findViewById(R.id.image_friend);
            FriendName = itemView.findViewById(R.id.friend_Name);
            FriendMsgTime = itemView.findViewById(R.id.Friend_MsgTime);
            FriendMsg = itemView.findViewById(R.id.friend_msg);


        }
    }
}


