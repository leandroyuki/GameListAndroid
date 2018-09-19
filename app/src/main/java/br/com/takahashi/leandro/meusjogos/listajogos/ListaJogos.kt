package br.com.takahashi.leandro.meusjogos.listajogos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import android.widget.Toast
import br.com.takahashi.leandro.meusjogos.R
import br.com.takahashi.leandro.meusjogos.model.Jogo
import kotlinx.android.synthetic.main.activity_lista_jogos.*

class ListaJogos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_jogos)

        rvJogos.adapter = JogosAdapter(this, getjogos(),{
            Toast.makeText(this,it.titulo, Toast.LENGTH_LONG).show()
        })

        rvJogos.layoutManager = LinearLayoutManager(this)
    }

    private fun getjogos(): List<Jogo> {

        return listOf(
                Jogo(R.drawable.lastofus, "Last of us", 2003, "Não informada"),
                Jogo(R.drawable.smash, "Smash Bros", 2018, "Não informada"),
                Jogo(R.drawable.fifa, "Fifa 19", 2018, "Não informada"),
                Jogo(R.drawable.spider, "Spiderman", 2018, "Não informada"),
                Jogo(R.drawable.tachovendo, "Ta Chovendo Hamburguer", 2003, "Não informada")
        )
    }
}
