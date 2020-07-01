package com.example.studymaster

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.studymaster.databinding.FragmentWeekdaysBinding


/**
 * A simple [Fragment] subclass.
 */
class week_days_Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentWeekdaysBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_weekdays, container, false
        )

        binding.buttonStats.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_week_days_Fragment_to_subject_Statistics_Fragement)
        )
        binding.buttonMo.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_week_days_Fragment_to_monday_fragment)
        )
        binding.buttonDi.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_week_days_Fragment_to_tuesday_fragment)
        )
        binding.buttonMi.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_week_days_Fragment_to_wednesday_fragment)
        )
        binding.buttonDo.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_week_days_Fragment_to_thursday_fragment)
        )
        binding.buttonFr.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_week_days_Fragment_to_friday_fragment)
        )
        binding.buttonSa.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_week_days_Fragment_to_saturday_fragment)
        )
        binding.buttonSo.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_week_days_Fragment_to_sunday_fragment)
        )
        binding.buttonStats.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_week_days_Fragment_to_subject_Statistics_Fragement)
        )

        return binding.root
    }
}