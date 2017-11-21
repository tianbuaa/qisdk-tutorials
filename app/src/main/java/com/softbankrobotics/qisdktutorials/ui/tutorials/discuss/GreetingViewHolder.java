package com.softbankrobotics.qisdktutorials.ui.tutorials.discuss;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.softbankrobotics.qisdktutorials.R;

/**
 * The view holder to show a greeting.
 */
class GreetingViewHolder extends RecyclerView.ViewHolder {

    private TextView textView;
    private Button button;

    private OnGreetingRemovedListener onGreetingRemovedListener;

    GreetingViewHolder(View itemView, OnGreetingRemovedListener onGreetingRemovedListener) {
        super(itemView);
        this.onGreetingRemovedListener = onGreetingRemovedListener;
        textView = itemView.findViewById(R.id.greeting_textview);
        button = itemView.findViewById(R.id.delete_button);
    }

    /**
     * Binds a tutorial to the views.
     * @param greeting the greeting
     */
    void bind(final String greeting) {
        textView.setText(greeting);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onGreetingRemovedListener != null) {
                    onGreetingRemovedListener.onGreetingRemoved(greeting);
                }
            }
        });
    }
}