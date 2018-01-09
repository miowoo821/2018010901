package com.example.student.a2018010901;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);//弄一個menu的解壓器,把剛剛寫的menu丟進去(TIPS:res
       // menu.add(0,1,0,"ADD");
       // menu.add(0,2,0,"EDIT");
        //四個參數(第一個參數是group的id,第二個參數是此group裡面的id,第三個參數，第四個參數是這個選項的名稱
//        第一个int类型的groupID参数，代表的是组概念，你可以将几个菜单项归为一组，以便更好的以组的方式管理你的菜单按钮。
//        第二个int类型的item ID参数，代表的是项目编号。这个参数非常重要，一个itemID对应一个menu中的选项。在后面使用菜单的时候，就靠这个item ID来判断你使用的是哪个选项。
//        第三个int类型的orderID参数，代表的是菜单项的显示顺序。默认是0，表示菜单的显示顺序就是按照add的显示顺序来显示。
//        第四个String类型的title参数，表示选项中显示的文字。
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_add:
                Toast.makeText(MainActivity.this, "使用者按下 ADD", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_edit:
                Toast.makeText(MainActivity.this, "使用者按下 EDIT", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
