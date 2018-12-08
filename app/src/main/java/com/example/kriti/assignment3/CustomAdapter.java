package com.example.kriti.assignment3;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;

public class CustomAdapter extends BaseAdapter{

    String[] settingName; // Creating a variable array to store the names
    Context context; // Adapter context when user reacts
    LayoutInflater textInflater; // Inflates the adapter as per the text entered

    public CustomAdapter(Context context, String[] settingName) {
        this.context = context;
        this.settingName = settingName;
        textInflater = (LayoutInflater.from(context));

    }

    @Override
    public int getCount() {
        return settingName.length; //length in bytes
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view = textInflater.inflate(R.layout.list_view_items, null);//Brings up the view to the screen
        final CheckedTextView CheckedTextViewAll = (CheckedTextView) view.findViewById(R.id.CheckedTextView); //Get ViewById
        CheckedTextViewAll.setText(settingName[position]); //setText to it's position

 /*The button listener might seem the opposite but this is how it works:
It first checks if a selection/checked is already there when the user selects a choice
If selection is checked, do nothing
Else display the check-mark. */

        CheckedTextViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
    public void onClick(View v) {
                if (CheckedTextViewAll.isChecked()) { // to determine if already checked
                    CheckedTextViewAll.setCheckMarkDrawable(0); // if checked, set drawable to 0/do nothing
                    CheckedTextViewAll.setChecked(false); // set checked to false/do nothing
                } else { //else if selection is not checked then display check
                    CheckedTextViewAll.setCheckMarkDrawable(R.drawable.checkmark); // display checked image
                    CheckedTextViewAll.setChecked(true); // set to checked
                }
            }
        }); // End of listener
        return view; // return view
    }
}

