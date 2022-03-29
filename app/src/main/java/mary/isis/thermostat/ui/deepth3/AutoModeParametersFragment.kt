package mary.isis.thermostat.ui.deepth3

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mary.isis.thermostat.R

class AutoModeParametersFragment : Fragment() {

    companion object {
        fun newInstance() = AutoModeParametersFragment()
    }

    private lateinit var viewModel: AutoModeParametersViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.auto_mode_parameters_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AutoModeParametersViewModel::class.java)
        // TODO: Use the ViewModel
    }

}