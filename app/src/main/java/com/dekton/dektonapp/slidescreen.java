package com.dekton.dektonapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class slidescreen extends ActionBarActivity {

    //Declare variables
    ViewPager viewPager;
    PagerAdapter adapter;
    int[] background;
    int[] icon;
    String[] title;
    String[] title_2;
    String[] description;


    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt("current_item", viewPager.getCurrentItem());
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slidescreenmain);

        //Generate sample data
        background = new int[]{R.mipmap.bg1, R.mipmap.bg2, R.mipmap.bg3, R.mipmap.bg4, R.mipmap.bg5, R.mipmap.bg6,
                R.mipmap.bg7, R.mipmap.bg8, R.mipmap.bg9, R.mipmap.bg10, R.mipmap.bg11, R.mipmap.bg12};

        icon = new int[]{R.mipmap.im1, R.mipmap.im2, R.mipmap.im3, R.mipmap.im4, R.mipmap.im5,
                R.mipmap.im6, R.mipmap.im7, R.mipmap.im8, R.mipmap.im9, R.mipmap.im10, R.mipmap.im11, R.mipmap.im12};

        title = new String[]{"ALTA RESISTENCIA A", "ALTA RESISTENCIA", "ALTAMENTE", "RESISTENCIA A", "MATERIAL", "ALTA RESISTENCIA",
                "RESISTENCIA AL", "RESISTENCIA", "ESTABILIDAD", "ESTABILIDAD", "RESISTENCIA A", "NULA ABSORCI�N"};

        title_2 = new String[]{"LOS RAYOS UV", "AL FUEGO Y AL CALOR", "RESISTENTE AL RAYADO", "LAS MANCHAS", "INCOMBUSTIBLE", "A LA HIDR�LISIS",
                "HIELO Y DESHIELO", "MEC�NICA", "DIMENSIONAL", "DEL COLOR", "LA ABRASI�N", "DEL AGUA"};

        description = new String[]{"Dekton es altamente resistente a\n" + "los rayos ultravioleta (UV) y su color\n" +
                "no degrada con el tiempo, lo que\n" + "hace que sea un material perfecto\n" + "tanto para interiores como para\n" +
                "exteriores.",
                "Dekton presenta una muy buena\n" + "resistencia a las altas temperaturas sin\n" + "que se vea afectada su est�tica ni su\n" +
                        "propiedades. Los utensilios calientes,\n" + "electrodom�sticos, ollas y sartenes, se\n" + "pueden colocar directamente sobre la\n" +
                        "superficie sin peligro ni da�o alguno.",
                "Dekton es una superficie con alta\n" + "resistencia al rayado. No se raya\n" + "con los utensilios de uso dom�stico.\n" +
                        "No obstante, recomendamos el uso\n" + "de tablas de corte para asi proteger\n" + "los utensilios dom�sticos.",
                "Debido a su baja porosidad, la nueva\n" + "superficie Dekton, es una superficie\n" + "altamente resistente , tanto a las manchas\n" +
                        "ocasionales en el uso domestico como a\n" + "los agentes qu�micos. Incluso las manchas\n" + "m�s dif�ciles como las de vino, caf�, tinta y\n" +
                        "�xido se pueden limpiar f�cilmente. Las\n" + "salpicaduras o gotas de productos de\n" + "limpieza cotidianos como lej�a, limpia\n" +
                        "tuber�as o desengrasantes para hornos no\n" + "producen da�o alguno al material.",
                "Text Text Text Text Text Text Text Text Text\n" + "Text Text Text Text Text Text Text Text Text\n" +
                        "Text Text Text Text Text Text Text Text Text\n" + "Text Text Text Text Text Text Text Text Text\n" +
                        "Text Text Text Text Text Text Text Text Text\n" + "Text Text Text Text Text Text Text Text Text\n" +
                        "Text Text Text Text Text Text Text",
                "Text Text Text Text Text Text Text Text\n" + "Text Text Text Text Text Text Text Text\n" +
                        "Text Text Text Text Text Text Text Text\n" + "Text Text Text Text Text Text Text Text\n" +
                        "Text Text Text Text Text Text Text Text\n" + "Text Text Text Text Text Text Text",
                "El bajo coeficiente de expansi�n t�rmico\n" + "de Dekton hace que sea resistente al\n" +
                        "choque t�rmico, del paso del calor al fr�o\n" + "extremo. Su resistencia natural al hielo y al\n" +
                        "deshielo hacen que sea un material\n" + "perfecto incluso en los entornos m�s fr�os\n" + "y extremos.",
                "Con una resistencia a la flexi�n 3 veces\n" + "mayor de la que ofrece el granito, Dekton\n" +
                        "puede instalarse en espesores mas finos,\n" + "permitiendo un voladizo sin soporte de\n" +
                        "hasta 30cm en encimeras, islas y barras\n" + "de bar (dependiendo del espesor).",
                "Dekton es un material donde se controla\n" + "de forma exhaustiva tanto la dimensi�n\n" +
                        "como el grosor en toda la tabla, lo cual\n" + "reduce la necesidad de correcciones sobre\n" +
                        "la superficie y facilita asi su instalaci�n.",
                "El proceso de fabricaci�n de Dekton nos\n" + "permite controlar la pigmentaci�n y la\n" +
                        "est�tica del material, dot�ndolo de una\n" + "mejor consistencia del color en todas las\n" +
                        "tablas. El resultado es un producto que no\n" + "decolora con el tiempo. Una vez instalada,\n" +
                        "la superficie mantendr� su aspecto\n" + "durante toda la vida �til del producto.",
                "Dekton es incluso m�s resistente a la\n" + "abrasi�n que el granito, lo cual lo convierte\n" +
                        "en la superficie ideal para aplicaciones\n" + "comerciales y �reas de alto tr�nsito como\n" +
                        "soler�as y fachadas. Mientras que otras\n" + "superficies muestran desgaste con el paso\n" +
                        "del tiempo, el acabado de Dekton\n" + "perdurar� durante toda la vida del\n" +
                        "producto y no necesitar� ser reemplazado\n" + "o retocado en ning�n momento.",
                "Dekton es un material no poroso y no\n" + "necesita ser sellado en ning�n momento.\n" +
                        "Por naturaleza, es capaz del repeler\n" + "l�quidos y gases para que no penetren en\n" +
                        "la superficie. De este modo, el\n" + "mantenimiento de la superficie es m�nimo\n" +
                        "y m�s f�cil de limpiar."};

        if (savedInstanceState != null) {
            int mCurrentItem = savedInstanceState.getInt("current_item");
            viewPager.setCurrentItem(mCurrentItem);
        }
        // Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(slidescreen.this, background, icon, title, title_2, description);

        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);

        getSupportActionBar().hide();
    }


    public void onClickSlideDown(View view) {

        viewPager.setPageTransformer(true, new ViewPager.PageTransformer() {
            @Override
            public void transformPage(View view, float position) {
                int pageWidth = view.getWidth();
                if (position < -1) {
                    view.setAlpha(1);
                } else if (position <= 1) {
                    ImageView iconimage, whitebox;
                    TextView titletext, title_2text, descriptiontext;
                    titletext = (TextView) findViewById(R.id.title);
                    title_2text = (TextView) findViewById(R.id.title_2);
                    descriptiontext = (TextView) findViewById(R.id.description);
                    iconimage = (ImageView) findViewById(R.id.icon);
                    whitebox = (ImageView) findViewById(R.id.whitebox);
                    iconimage.setTranslationX((float) (-(1 - position) * 0.8 * pageWidth));
                    whitebox.setTranslationX((float) (-(1 - position) * 0.8 * pageWidth));
                    titletext.setTranslationX((float) (-(1 - position) * 0.8 * pageWidth));
                    title_2text.setTranslationX((float) (-(1 - position) * 0.8 * pageWidth));
                    descriptiontext.setTranslationX((float) (-(1 - position) * 0.8 * pageWidth));


                } else {

                    view.setAlpha(1);
                }
            }
        });
        if (viewPager.getCurrentItem() < viewPager.getAdapter().getCount()) {
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1, true);
        } else {
            Intent i1 = new Intent(slidescreen.this, glass_3.class);
            startActivity(i1);
        }

    }

    public void onClickCloseButton(View view) {
        Intent i = new Intent(this, glass_3.class);
        startActivity(i);
    }

}



