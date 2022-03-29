package mary.isis.thermostat.ui.deepth3

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mary.isis.thermostat.R

class TemperaturesParametersFragment : Fragment() {

    companion object {
        fun newInstance() = TemperaturesParametersFragment()
    }

    private lateinit var viewModel: TemperaturesParametersViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.temperatures_parameters_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TemperaturesParametersViewModel::class.java)
        // TODO: Use the ViewModel
    }

}