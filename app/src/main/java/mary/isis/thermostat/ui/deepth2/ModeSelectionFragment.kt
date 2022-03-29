package mary.isis.thermostat.ui.deepth2

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mary.isis.thermostat.R

class ModeSelectionFragment : Fragment() {

    companion object {
        fun newInstance() = ModeSelectionFragment()
    }

    private lateinit var viewModel: ModeSelectionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.mode_selection_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ModeSelectionViewModel::class.java)
        // TODO: Use the ViewModel
    }

}