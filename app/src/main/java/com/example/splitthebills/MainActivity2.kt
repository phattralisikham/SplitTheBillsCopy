package com.example.splitthebills

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var listview = findViewById<ListView>(R.id.listView)
        listview.divider = null
        listview.dividerHeight = 50

        var list = mutableListOf<Model>()
        list.add(Model("Hühnchen mit Reis", 50))
        list.add(Model("Rind mit Reis", 50))
        list.add(Model("Schweinefleisch mit Reis", 50))
        list.add(Model("Katze mit Reis", 50))
        list.add(Model("Hühnchen mit Reis", 50))
        list.add(Model("Rind mit Reis", 50))
        list.add(Model("Schweinefleisch mit Reis", 50))
        list.add(Model("Katze mit Reis", 50))
        list.add(Model("Hühnchen mit Reis", 50))
        list.add(Model("Rind mit Reis", 50))
        list.add(Model("Schweinefleisch mit Reis, Kartoffeln und Salat", 50))
        list.add(Model("Katze mit Reis", 50))
        list.add(Model("Hühnchen mit Reis", 50))
        list.add(Model("Rind mit Reis", 50))
        list.add(Model("Schweinefleisch mit Reis", 50))
        list.add(Model("Katze mit Reis", 50))

        listview.adapter = MyAdapter(this, R.layout.row, list)

//        listview.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->
//            if (position == 0) {
//                Toast.makeText(this@MainActivity2, "You click on facebook!", Toast.LENGTH_LONG)
//                    .show()
//            }
//            if (position == 1) {
//                Toast.makeText(this@MainActivity2, "You click on facebook!", Toast.LENGTH_LONG)
//                    .show()
//            }
//            if (position == 2) {
//                Toast.makeText(this@MainActivity2, "You click on facebook!", Toast.LENGTH_LONG)
//                    .show()
//            }
//            if (position == 3) {
//                Toast.makeText(this@MainActivity2, "You click on facebook!", Toast.LENGTH_LONG)
//                    .show()
//            }
//            if (position == 4) {
//                Toast.makeText(this@MainActivity2, "You click on facebook!", Toast.LENGTH_LONG)
//                    .show()
//            }
//            if (position == 5) {
//                Toast.makeText(this@MainActivity2, "You click on facebook!", Toast.LENGTH_LONG)
//                    .show()
//            }
//        }

    }


}