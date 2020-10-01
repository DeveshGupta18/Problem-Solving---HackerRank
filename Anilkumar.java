public class Adater  extends  RecyclerView.Adapter<Adater.GithubHolder>{


    private Context context;
    private User[] data;
    public Adater(Context context,User []data) {
        this.context=context;
        this.data=data;
    }

    @NonNull
    @Override
    public GithubHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new GithubHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GithubHolder holder, int position) {
        final User user=data[position];
        holder.textView.setText(user.getLogin());
        Glide.with(holder.imageView.getContext()).load(user.getAvatarUrl()).into(holder.imageView);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, user.getLogin()+" Clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class GithubHolder extends RecyclerView.ViewHolder
    {
        ImageView imageView;
        TextView textView;

        public GithubHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.userImage);
            textView=itemView.findViewById(R.id.userName);

        }

    }
}
