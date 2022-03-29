package mary.isis.thermostat.ui.deepth3

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mary.isis.thermostat.R

class JOModeParametersFragment : Fragment() {

    companion object {
        fun newInstance() = JOModeParametersFragment()
    }

    private lateinit var viewModel: JOModeParametersViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.j_o_mode_parameters_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(JOModeParametersViewModel::class.java)
        // TODO: Use the ViewModel
    }

}