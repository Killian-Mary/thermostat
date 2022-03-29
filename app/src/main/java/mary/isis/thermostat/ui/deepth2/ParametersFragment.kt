package mary.isis.thermostat.ui.deepth2

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mary.isis.thermostat.R

class ParametersFragment : Fragment() {

    companion object {
        fun newInstance() = ParametersFragment()
    }

    private lateinit var viewModel: ParametersViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.parameters_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ParametersViewModel::class.java)
        // TODO: Use the ViewModel
    }

}