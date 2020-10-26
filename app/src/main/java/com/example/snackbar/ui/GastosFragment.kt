package com.example.snackbar.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.snackbar.R
import com.example.snackbar.`interface`.ContractMainActivity
import com.example.snackbar.domain.EntradaValor
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.android.synthetic.main.gasto_body.*
import kotlinx.android.synthetic.main.gasto_body.view.*

class GastosFragment : Fragment() {

    private lateinit var cma: ContractMainActivity

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_gasto, container, false)

        view.btn_cadastrarEntrada.setOnClickListener {
            cma.callActivityValues()
        }

        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is ContractMainActivity) cma = context

    }
    companion object {
        fun newInstance() = GastosFragment()
    }
}
