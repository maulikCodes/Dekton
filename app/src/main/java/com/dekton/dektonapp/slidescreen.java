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
                "RESISTENCIA AL", "RESISTENCIA", "ESTABILIDAD", "ESTABILIDAD", "RESISTENCIA A", "NULA ABSORCIÓN"};

        title_2 = new String[]{"LOS RAYOS UV", "AL FUEGO Y AL CALOR", "RESISTENTE AL RAYADO", "LAS MANCHAS", "INCOMBUSTIBLE", "A LA HIDRÓLISIS",
                "HIELO Y DESHIELO", "MECÁNICA", "DIMENSIONAL", "DEL COLOR", "LA ABRASIÓN", "DEL AGUA"};

        description = new String[]{"Dekton es altamente resistente a\n" + "los rayos ultravioleta (UV) y su color\n" +
                "no degrada con el tiempo, lo que\n" + "hace que sea un material perfecto\n" + "tanto para interiores como para\n" +
                "exteriores.",
                "Dekton presenta una muy buena\n" + "resistencia a las altas temperaturas sin\n" + "que se vea afectada su estética ni su\n" +
                        "propiedades. Los utensilios calientes,\n" + "electrodomésticos, ollas y sartenes, se\n" + "pueden colocar directamente sobre la\n" +
                        "superficie sin peligro ni daño alguno.",
                "Dekton es una superficie con alta\n" + "resistencia al rayado. No se raya\n" + "con los utensilios de uso doméstico.\n" +
                        "No obstante, recomendamos el uso\n" + "de tablas de corte para asi proteger\n" + "los utensilios domésticos.",
                "Debido a su baja porosidad, la nueva\n" + "superficie Dekton, es una superficie\n" + "altamente resistente , tanto a las manchas\n" +
                        "ocasionales en el uso domestico como a\n" + "los agentes químicos. Incluso las manchas\n" + "más difíciles como las de vino, café, tinta y\n" +
                        "óxido se pueden limpiar fácilmente. Las\n" + "salpicaduras o gotas de productos de\n" + "limpieza cotidianos como lejía, limpia\n" +
                        "tuberías o desengrasantes para hornos no\n" + "producen daño alguno al material.",
                "Text Text Text Text Text Text Text Text Text\n" + "Text Text Text Text Text Text Text Text Text\n" +
                        "Text Text Text Text Text Text Text Text Text\n" + "Text Text Text Text Text Text Text Text Text\n" +
                        "Text Text Text Text Text Text Text Text Text\n" + "Text Text Text Text Text Text Text Text Text\n" +
                        "Text Text Text Text Text Text Text",
                "Text Text Text Text Text Text Text Text\n" + "Text Text Text Text Text Text Text Text\n" +
                        "Text Text Text Text Text Text Text Text\n" + "Text Text Text Text Text Text Text Text\n" +
                        "Text Text Text Text Text Text Text Text\n" + "Text Text Text Text Text Text Text",
                "El bajo coeficiente de expansión térmico\n" + "de Dekton hace que sea resistente al\n" +
                        "choque térmico, del paso del calor al frío\n" + "extremo. Su resistencia natural al hielo y al\n" +
                        "deshielo hacen que sea un material\n" + "perfecto incluso en los entornos más fríos\n" + "y extremos.",
                "Con una resistencia a la flexión 3 veces\n" + "mayor de la que ofrece el granito, Dekton\n" +
                        "puede instalarse en espesores mas finos,\n" + "permitiendo un voladizo sin soporte de\n" +
                        "hasta 30cm en encimeras, islas y barras\n" + "de bar (dependiendo del espesor).",
                "Dekton es un material donde se controla\n" + "de forma exhaustiva tanto la dimensión\n" +
                        "como el grosor en toda la tabla, lo cual\n" + "reduce la necesidad de correcciones sobre\n" +
                        "la superficie y facilita asi su instalación.",
                "El proceso de fabricación de Dekton nos\n" + "permite controlar la pigmentación y la\n" +
                        "estética del material, dotándolo de una\n" + "mejor consistencia del color en todas las\n" +
                        "tablas. El resultado es un producto que no\n" + "decolora con el tiempo. Una vez instalada,\n" +
                        "la superficie mantendrá su aspecto\n" + "durante toda la vida útil del producto.",
                "Dekton es incluso más resistente a la\n" + "abrasión que el granito, lo cual lo convierte\n" +
                        "en la superficie ideal para aplicaciones\n" + "comerciales y áreas de alto tránsito como\n" +
                        "solerías y fachadas. Mientras que otras\n" + "superficies muestran desgaste con el paso\n" +
                        "del tiempo, el acabado de Dekton\n" + "perdurará durante toda la vida del\n" +
                        "producto y no necesitará ser reemplazado\n" + "o retocado en ningún momento.",
                "Dekton es un material no poroso y no\n" + "necesita ser sellado en ningún momento.\n" +
                        "Por naturaleza, es capaz del repeler\n" + "líquidos y gases para que no penetren en\n" +
                        "la superficie. De este modo, el\n" + "mantenimiento de la superficie es mínimo\n" +
                        "y más fácil de limpiar."};

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



