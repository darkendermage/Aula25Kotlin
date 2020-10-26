package com.example.snackbar.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.snackbar.R
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.android.synthetic.main.gasto_body.*
import kotlinx.android.synthetic.main.gasto_body.view.*

class GastosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_gasto, container, false)
//
      var msg = "Olá Mundo"
//        view.edDescricao.setText(msg)
//        btn_cadastrarEntrada.setOnClickListener{
//
//
//        }
        btn_cadastrarEntrada.setOnClickListener {
            println("Olá Android!")
            val intent = Intent( msg, ProfileActivity::class.java)
            intent.putExtra("bundle", Bundle().apply {
                putString("desc", "valor")
                putString("categoria", "valor")
                putString("datahora", "valor")
                putDouble("Valores", 0.0)
            })
            startActivity(intent)
        }

        return view


        fun getInfo() {
            var desc = edDescricao.text.toString()
            var categoria = edCategoria.text.toString()
            var dataHora = edData_Hora.text.toString()
            var valores = edValor.text.toString()

        }

//    fun callActivity(){
//        var intent = Intent(this, ProfileActivity::class.java)
//        intent.putExtra("key", )
//        startActivity(intent)
//    }


        companion object {
            fun newInstance() = GastosFragment()

        }
    }
}