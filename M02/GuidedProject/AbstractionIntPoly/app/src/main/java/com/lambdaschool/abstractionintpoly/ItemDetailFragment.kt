package com.lambdaschool.abstractionintpoly

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.lambdaschool.abstractionintpoly.model.SwApiObject
import kotlinx.android.synthetic.main.activity_item_detail.*
import kotlinx.android.synthetic.main.item_detail.view.*

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a [ItemListActivity]
 * in two-pane mode (on tablets) or a [ItemDetailActivity]
 * on handsets.
 */
class ItemDetailFragment : Fragment() {

    /**
     * The dummy content this fragment is presenting.
     */
    private var item: SwApiObject? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            if (it.containsKey(ARG_ITEM_ID)) {
                // Load the dummy content specified by the fragment
                // arguments. In a real-world scenario, use a Loader
                // to load content from a content provider.

                item = it.getSerializable(ARG_ITEM_ID) as SwApiObject

                val dff = it.getSerializable(ARG_ITEM_ID) as SwApiObject
                activity?.toolbar_layout?.let { layout ->
                    // TODO 11: S05M02-13 set up the item from the object
                }
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.item_detail, container, false)

        // TODO 10: Set up the drawable from the item

        return rootView
    }

    // TODO 13: S05M02-15 Create your own interface to communicate with the Activity

    // TODO 16: Store the Activity in a property in onAttach

    // TODO 17: Null out the property in onDetach

    companion object {
        /**
         * The fragment argument representing the item ID that this fragment
         * represents.
         */
        const val ARG_ITEM_ID = "item_id"
    }
}
