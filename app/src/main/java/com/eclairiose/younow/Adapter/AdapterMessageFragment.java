package com.eclairiose.younow.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.eclairiose.younow.Fragments.MessagesFragment;
import com.eclairiose.younow.Model.ModelMessagesFragment;
import com.eclairiose.younow.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class AdapterMessageFragment extends RecyclerView.Adapter<AdapterMessageFragment.ViewHolder> {

        List<ModelMessagesFragment> messageChatList;
        MessagesFragment context;

public AdapterMessageFragment(List<ModelMessagesFragment> friendchatList, MessagesFragment context) {
        this.messageChatList = friendchatList;
        this.context = context;
        }


@NonNull
@Override
public AdapterMessageFragment.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_friends,parent,false);

     ViewHolder viewHolder = new AdapterMessageFragment.ViewHolder(view);

        return viewHolder;
        }



    @Override
public void onBindViewHolder(@NonNull AdapterMessageFragment.ViewHolder holder, int position) {
        holder.Image.setImageResource(messageChatList.get(position).getImage());
        holder.Name.setText(messageChatList.get(position).getName());
        holder.MsgTime.setText(messageChatList.get(position).getMsgtime());
        holder.Msg.setText(messageChatList.get(position).getMsg());
        }


@Override
public int getItemCount() {
        return messageChatList.size();
        }

public class ViewHolder extends RecyclerView.ViewHolder {

    CircleImageView Image;
    TextView Name,MsgTime,Msg;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        Image = itemView.findViewById(R.id.image_friend);
        Name = itemView.findViewById(R.id.friend_Name);
        MsgTime = itemView.findViewById(R.id.Friend_MsgTime);
        Msg = itemView.findViewById(R.id.friend_msg);


    }
}
}


