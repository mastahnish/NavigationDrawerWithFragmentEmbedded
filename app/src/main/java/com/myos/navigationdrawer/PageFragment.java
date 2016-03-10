package com.myos.navigationdrawer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link PageFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link PageFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PageFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";

    private int mParam1;


    private OnFragmentInteractionListener mListener;

    public PageFragment() {
        // Required empty public constructor
    }


    private int mPage;


    public static PageFragment newInstance(int param1) {
        PageFragment fragment = new PageFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, param1);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getInt(ARG_PARAM1);
            mPage = mParam1;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        View v = inflater.inflate(R.layout.fragment_page, container, false);
      /*  TextView textView = (TextView) v.findViewById(R.id.tv_page_fragment);
        textView.setText("Fragment #" + mPage);*/


        RecyclerView recyclerView = new RecyclerView(getActivity());
        recyclerView.setAdapter(new YourRecyclerAdapter(getActivity(), mPage));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return recyclerView;
    }



    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }


    class YourRecyclerAdapter extends RecyclerView.Adapter<YourRecyclerAdapter.YourRecyclerViewHolder> {
        private ArrayList<String> list = new ArrayList<>();
        private LayoutInflater inflater;
        private int mPage;


        public YourRecyclerAdapter(Context context, int mpage) {
            inflater = LayoutInflater.from(context);
            this.mPage = mpage;
            String currentTab = null;
            switch (mPage-1) {
                case 0:

                   currentTab = "MODUŁY!!";
                    break;
                case 1:
                    currentTab = "HISTORIA!!";
                    break;
                case 2:
                    currentTab = "USTAWIENIA!!";
                    break;
            }
            list.add(currentTab);
            list.add("A-Bomb (HAS)");
            list.add("A.I.M.");
            list.add("Abe");
            list.add("Abin");
            list.add("Abomination");
            list.add("Abraxas");
            list.add("Absorbing");
            list.add("Adam");
            list.add("Agent Bob");
            list.add("Agent Zero");
            list.add("Air Walker");
            list.add("Ajax");
            list.add("Alan Scott");
            list.add("Alex Mercer");
            list.add("Alex Woolsly");
            list.add("Alfred Pennyworth");
            list.add("Allan Quartermain");
            list.add("Amazo");
            list.add("Ammo Ando");
            list.add("Masahashi Angel");
            list.add("Angel Dust");
            list.add("Angel Salvadore");
            list.add("A-Bomb");
            list.add("Abe");
            list.add("Abin");
            list.add("Abomination");
            list.add("Abraxas");
            list.add("Absorbing");
            list.add("Adam");
            list.add("Agent Bob");
            list.add("Agent Zero");
            list.add("Air Walker");
            list.add("Ajax");
            list.add("Alan Scott");
            list.add("Alex Mercer");
            list.add("Alex Woolsly");
            list.add("Alfred Pennyworth");
            list.add("Allan Quartermain");
            list.add("Amazo");
            list.add("Ammo Ando");
            list.add("Masahashi Angel");
            list.add("Angel Dust");
            list.add("Angel Salvadore");


        }


        @Override
        public YourRecyclerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View root = inflater.inflate(R.layout.custom_row, viewGroup, false);
            YourRecyclerViewHolder holder = new YourRecyclerViewHolder(root);
            return holder;
        }


        @Override
        public void onBindViewHolder(YourRecyclerViewHolder yourRecyclerViewHolder, int i) {
            yourRecyclerViewHolder.textView.setText(list.get(i));
        }


        @Override
        public int getItemCount() {
            return list.size();
        }


        class YourRecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


            TextView textView;


            public YourRecyclerViewHolder(View itemView) {
                super(itemView);
                textView = (TextView) itemView.findViewById(R.id.text_superhero);
            }

            @Override
            public void onClick(View v) {

            }
        }
    }
}
