package com.test.mapremiereapplication;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.Dialog;
import android.app.FragmentManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.Html.ImageGetter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LayoutAnimationController;
import android.view.animation.TranslateAnimation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
//    private TextView texte = null;
	
	boolean hidden = false;
	int jaloux = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        //texte = new TextView(this);
        //texte.setText("Bonjour, vous me devez 1 000 000€.");
        //texte.setText(R.string.hello_world);
        //Resources resource = getResources();
        //String str = resource.getString(R.string.hello_world);
        //str += " Nice!";
        //texte.setText(str);
        //setContentView(texte);
        
//        setContentView(R.layout.activity_main);
//        
//        texte = (TextView)findViewById(R.id.textView1);
//        texte.setText("Hello Machin !");

//        setContentView(R.layout.big_button);
//        
//        final Button button = (Button) findViewById(R.id.bouton);
//        final float largeur_du_bouton = (float) button.getWidth();
//        final float hauteur_du_bouton = (float) button.getHeight();
//        
//        button.setOnTouchListener(new View.OnTouchListener() {
//			
//			@Override
//			public boolean onTouch(View v, MotionEvent event) {
//				float coordonnee_x = event.getX();
//				float coordonnee_y = event.getY();
//				button.setTextSize(Math.abs(coordonnee_x - largeur_du_bouton / 2) + Math.abs(coordonnee_y - hauteur_du_bouton / 2));
//				return false;
//			}
//		});
        
//        setContentView(R.layout.imc_calculator);
//        
//        final EditText weightWidget = (EditText) findViewById(R.id.poids);
//        final EditText sizeWidget = (EditText) findViewById(R.id.taille);
//        final CheckBox mega = (CheckBox) findViewById(R.id.mega);
//        final RadioGroup group = (RadioGroup) findViewById(R.id.group);
//        final RadioButton radio2 = (RadioButton) findViewById(R.id.radio2);
//        final TextView result = (TextView) findViewById(R.id.result);
//        Button raz = (Button) findViewById(R.id.raz);
//        Button calculate = (Button) findViewById(R.id.calcul);
//        
//        final Toast toast = Toast.makeText(this, "La taille ne peut pas être nulle", Toast.LENGTH_SHORT);
//        
//        mega.setOnClickListener(new View.OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				boolean isMega = mega.isChecked();
//				if (isMega) {
//					result.setText(R.string.mega_result);
//				} else {
//					result.setText(R.string.default_result);
//				}
//			}
//		});
//        
//        calculate.setOnClickListener(new View.OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				boolean isMega = mega.isChecked();
//				float weight = Float.parseFloat(weightWidget.getText().toString());
//				float size = Float.parseFloat(sizeWidget.getText().toString());
//				if (isMega) {
//					result.setText(R.string.mega_result);
//				} else if (size == 0) {
//					toast.show();
//				} else {
//					if (group.getCheckedRadioButtonId() == R.id.radio2) {
//						size = size / 100;
//					}
//					double imc = calculateIMC(weight, size);
//					result.setText(String.valueOf(imc));
//				}
//			}
//		});
//        
//        raz.setOnClickListener(new View.OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				weightWidget.getText().clear();
//				sizeWidget.getText().clear();
//				weightWidget.setHint(R.string.weight);
//				sizeWidget.setHint(R.string.size);
//				mega.setChecked(false);
//				radio2.setChecked(true);
//				result.setText(R.string.default_result);
//			}
//		});
//        
//        View.OnKeyListener onKeyListener = new View.OnKeyListener() {
//			
//			@Override
//			public boolean onKey(View v, int keyCode, KeyEvent event) {
//				result.setText(R.string.default_result);
//				return false;
//			}
//		};
//		
//		weightWidget.setOnKeyListener(onKeyListener);
//		sizeWidget.setOnKeyListener(onKeyListener);
        
//        setContentView(R.layout.activity_main);
//        
//        Button tomButton = (Button) findViewById(R.id.tom_button);
//        String tomSrc = getResources().getString(R.string.tom);
//        Spanned tomSpnd = Html.fromHtml(tomSrc);
//        tomButton.setText(tomSpnd);
//        
//        TextView view = (TextView) findViewById(R.id.textView1);
//        view.setText(tomSrc);
        
//        setContentView(R.layout.activity_main);
//        TextView view = (TextView) findViewById(R.id.textView1);
//        String anais = getResources().getString(R.string.anais, "Anaïs", 22);
//        view.setText(anais);
        
        jaloux();
        
    }
    
    public void jaloux() {
    	setContentView(R.layout.jaloux);
    	Button btnJaloux = (Button) findViewById(R.id.btn_jaloux);
    	
    	btnJaloux.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (jaloux < 5) {
					jaloux ++;
					Dialog dialog = new Dialog(v.getContext());
					dialog.setTitle(getResources().getString(R.string.hello));
					dialog.show();
				} else {
					jaloux = 0;
					Dialog dialog = new Dialog(v.getContext());
					dialog.setTitle(getResources().getString(R.string.jaloux));
					dialog.show();
				}
			}
		});
    }

	public void sondage() {
    	Resources resources = getResources();
    	setContentView(R.layout.sondage);
    	
    	List<String> genreList = new ArrayList<String>();
    	genreList.add(resources.getString(R.string.masculin));
    	genreList.add(resources.getString(R.string.feminin));
    	ArrayAdapter<String> genreAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice, genreList);
    	final ListView genreView = (ListView) findViewById(R.id.genreView);
    	genreView.setAdapter(genreAdapter);
    	genreView.setItemChecked(0, true);
    	
    	ArrayAdapter<String> langageAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice);
    	langageAdapter.add(resources.getString(R.string.langageC));
    	langageAdapter.add(resources.getString(R.string.java));
    	langageAdapter.add(resources.getString(R.string.cobol));
    	langageAdapter.add(resources.getString(R.string.perl));
    	final ListView langageView = (ListView) findViewById(R.id.langageView);
    	langageView.setAdapter(langageAdapter);
    	langageView.setItemChecked(1, true);
    	
    	Button button = (Button) findViewById(R.id.envoyer);
    	button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast toast = Toast.makeText(v.getContext(), getResources().getString(R.string.merci), Toast.LENGTH_LONG);
				toast.show();
				v.setEnabled(false);
				genreView.setEnabled(false);
				langageView.setEnabled(false);
			}
		});
    }

    public void blocNote() {
    	setContentView(R.layout.bloc_note);

    	Button boutonGras = (Button) findViewById(R.id.btn_gras);
    	Button boutonItal = (Button) findViewById(R.id.btn_ital);
    	Button boutonSoul = (Button) findViewById(R.id.btn_soul);
    	ImageButton smiley1 = (ImageButton) findViewById(R.id.smiley1);
    	ImageButton smiley2 = (ImageButton) findViewById(R.id.smiley2);
    	ImageButton smiley3 = (ImageButton) findViewById(R.id.smiley3);
    	RadioButton radioNoir = (RadioButton) findViewById(R.id.btn1);
    	RadioButton radioBleu = (RadioButton) findViewById(R.id.btn2);
    	RadioButton radioRouge = (RadioButton) findViewById(R.id.btn3);

    	// Listener 
        boutonGras.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				addTag("b");
			}
		});
        
        boutonItal.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				addTag("i");
			}
		});
        
        boutonSoul.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				addTag("u");
			}
		});
        
        smiley1.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				addSmiley("smiley1");
			}
		});
        
        smiley2.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				addSmiley("smiley2");
			}
		});
        
        smiley3.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				addSmiley("smiley3");
			}
		});
        
        radioNoir.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				setFont("#000000");
			}
		});
        
        radioBleu.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				setFont("#0000FF");
			}
		});
        
        radioRouge.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				setFont("#FF0000");
			}
		});
        
        // Animation
        final Button hide = (Button) findViewById(R.id.btn_hide);
        final BlocNoteLayout layout = (BlocNoteLayout) findViewById(R.id.layout);
        final RelativeLayout menu = (RelativeLayout) findViewById(R.id.menuLayout);
        int tailleDuMenu = menu.getHeight();
        final Animation animationRetracte = new TranslateAnimation(0, 0, 0, -tailleDuMenu);
        final Animation animationOuvre = new TranslateAnimation(0, -tailleDuMenu, 0, 0);
        animationRetracte.setDuration(5000);
        animationOuvre.setDuration(5000);
        
        animationRetracte.setAnimationListener(new Animation.AnimationListener() {
			
			@Override
			public void onAnimationStart(Animation animation) {
			}
			
			@Override
			public void onAnimationRepeat(Animation animation) {
			}
			
			@Override
			public void onAnimationEnd(Animation animation) {
				menu.setVisibility(View.GONE);
				hide.setText(R.string.aff);
			}
		});
        
        final LayoutAnimationController layoutRetracte = new LayoutAnimationController(animationRetracte);
        final LayoutAnimationController layoutOuvre = new LayoutAnimationController(animationOuvre);
        layoutRetracte.setDelay(0);
        layoutOuvre.setDelay(0);
        layoutRetracte.setOrder(LayoutAnimationController.ORDER_NORMAL);
        layoutOuvre.setOrder(LayoutAnimationController.ORDER_NORMAL);
        
        animationOuvre.setAnimationListener(new Animation.AnimationListener() {
			
			@Override
			public void onAnimationStart(Animation animation) {
			}
			
			@Override
			public void onAnimationRepeat(Animation animation) {
			}
			
			@Override
			public void onAnimationEnd(Animation animation) {
				menu.setVisibility(View.VISIBLE);
				hide.setText(R.string.cacher);
			}
		});
        
        hide.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				if (hidden) {
					layout.setLayoutAnimation(layoutOuvre);
					//layout.startAnimation(animationOuvre);
					hidden = false;
				} else {
					layout.setLayoutAnimation(layoutRetracte);
					//layout.startAnimation(animationRetracte);
					animationRetracte.start();
					hidden = true;
				}
			}
		});
        
        // Prévisualisation
        final EditText editText = (EditText) findViewById(R.id.edition);
        final TextView prevtext = (TextView) findViewById(R.id.prev);
        editText.addTextChangedListener(new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				Spanned spannedText = Html.fromHtml(editText.getText().toString(), new SmileyGetter(), null);
				prevtext.setText(spannedText);
			}
			
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
			}
			
			@Override
			public void afterTextChanged(Editable s) {
			}
		});
        editText.setOnKeyListener(new View.OnKeyListener() {
			
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				if (keyCode == 66 && event.getAction() == KeyEvent.ACTION_DOWN) {
					int deb = editText.getSelectionStart();
			    	Editable textEdit = editText.getText();
			    	textEdit.insert(deb, "<br />");
				}
				return false;
			}
		});
    }
    
    private void addTag(String tagToAdd) {
    	EditText editText = (EditText) findViewById(R.id.edition);
    	int deb = editText.getSelectionStart();
    	int fin = editText.getSelectionEnd();
    	Editable textEdit = editText.getText();
    	textEdit.insert(fin, "</" + tagToAdd + ">");
    	textEdit.insert(deb, "<" + tagToAdd + ">");
    }
    
    private void addSmiley(String imgSrc) {
    	EditText editText = (EditText) findViewById(R.id.edition);
    	int deb = editText.getSelectionStart();
    	int fin = editText.getSelectionEnd();
    	Editable textEdit = editText.getText();
    	textEdit.replace(deb, fin, "<img src=\"" + imgSrc + "\"/>");
    }
    
    private void setFont(String font) {
    	EditText editText = (EditText) findViewById(R.id.edition);
    	Editable textEdit = editText.getText();
    	if (textEdit.toString().startsWith("<font")) {
    		textEdit.replace(13, 20, font);
    	} else {
    		textEdit.insert(0, "<font color=\"" + font + "\">");
    		textEdit.insert(textEdit.length(), "</font>");
    	}
    }
    
    private class SmileyGetter implements ImageGetter {

		@Override
		public Drawable getDrawable(String source) {
			Drawable retour = null;
			
		    Resources resources = getResources();
			
		    if (source.equals("smiley1")) {
		    	retour = resources.getDrawable(R.drawable.smiley1);
		    } else if(source.equals("smiley2")) {
		    	retour = resources.getDrawable(R.drawable.smiley2);
		    } else {
		    	retour = resources.getDrawable(R.drawable.smiley3);
		    }
				
		    // On délimite l'image (elle va de son coin en haut à gauche à son coin en bas à droite)
		    retour.setBounds(0, 0, retour.getIntrinsicWidth(), retour.getIntrinsicHeight());
		    return retour;
		}
    	
    }
    
//    private double calculateIMC(float weight, float size) {
//    	if (size != 0) {
//    		return weight / Math.pow(size, 2);
//    	} else {
//    		return 0;
//    	}
//    }
}
