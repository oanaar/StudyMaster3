package com.example.studymaster

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * A simple [Fragment] subclass.
 */
class My_Study_Plan_Fragment : Fragment() {

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle? ): View? {
        //val binding = DataBindingUtil.inflate<My_Study_Plan_Fragment>

        return inflater.inflate(R.layout.mystudyplan, container, false)
    }
}

//}