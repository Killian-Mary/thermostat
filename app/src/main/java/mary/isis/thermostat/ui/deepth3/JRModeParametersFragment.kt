package mary.isis.thermostat.ui.deepth3

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mary.isis.thermostat.R

class JRModeParametersFragment : Fragment() {

    companion object {
        fun newInstance() = JRModeParametersFragment()
    }

    private lateinit var viewModel: JRModeParametersViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.j_r_mode_parameters_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(JRModeParametersViewModel::class.java)
        // TODO: Use the ViewModel
    }

}