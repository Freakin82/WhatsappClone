package com.shruti.whatsapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.google.firebase.database.DatabaseReference;
import com.shruti.whatsapp.R;

public class FindFriendsActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private RecyclerView FindFriendsRecyclerList;
    private DatabaseReference UsersRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_friends);

        // getSupportActionBar().hide(); // Hide a Actionbar from Top in our app

        FindFriendsRecyclerList = (RecyclerView) findViewById(R.id.find_friends_recycler_list);
        FindFriendsRecyclerList.setLayoutManager(new LinearLayoutManager(this));

        mToolbar = findViewById(R.id.find_friends_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Find Friends");
    }
}

//    @Override
//    protected void onStart() {
//        super.onStart();
//
//        FirebaseRecyclerAdapter<Contacts, FindFriendViewHolder> adapter=
//                new FirebaseRecyclerAdapter<Contacts, FindFriendViewHolder>(options) {
//                    @Override
//                    protected void onBindViewHolder(@NonNull FindFriendViewHolder holder, final int position, @NonNull Contacts model)
//                    {
//                        holder.userName.setText(model.getName());
//                        holder.userStatus.setText(model.getStatus());
//                        Picasso.get().load(model.getImage()).placeholder(R.drawable.profile_image).into(holder.profileImage);
//
//
//                        holder.itemView.setOnClickListener(new View.OnClickListener() {
//                            @Override
//                            public void onClick(View view)
//                            {
//                                String visit_user_id = getRef(position).getKey();
//
//                                Intent profileIntent = new Intent(FindFriendsActivity.this, ProfileActivity.class);
//                                profileIntent.putExtra("visit_user_id", visit_user_id);
//                                startActivity(profileIntent);
//                            }
//                        });
//                    }
//
//                    @NonNull
//                    @Override
//                    public FindFriendViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
//                    {
//                        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.users_display_layout, viewGroup, false);
//                        FindFriendViewHolder viewHolder = new FindFriendViewHolder(view);
//                        return viewHolder;
//                    }
//                };
//
//        FindFriendsRecyclerList.setAdapter(adapter);
//
//        adapter.startListening();
//    }
//
//    public static class FindFriendViewHolder extends RecyclerView.ViewHolder
//    {
//        TextView userName, status,profilepic;
//        public FindFriendViewHolder(@NonNull View itemView) {
//            super(itemView);
//        }
//    }
//    }