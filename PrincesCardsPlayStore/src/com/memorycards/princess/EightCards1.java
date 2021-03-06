
package com.memorycards.princess;

import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.AdView;


import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation.AnimationListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class EightCards1 extends Activity implements OnClickListener {
 RelativeLayout rr;
	 SharedPreferences myPrefs;
	    private AdView ad; 
	private MediaPlayer mediaPlayer1, mediaPlayer2, mediaPlayer3;
	private TextView tv;
	private int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,success1=0;
	private Bitmap bm, bm1, bm2, bm3, bm4, bm5, bm6, bm7, bm8, bm9, bm10, bm11,
			bm12,star_1,star_2;
	private ImageView i, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12,
			i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25,
			i26;
			Button myim;
	private Intent in;
	//private static int j = 1;    
	private static int k = 1;
	private int match=0,match1=0;
	int count=0,match3=0;
	Handler hRefresh;
	private boolean isFirstImage = true;                                               
	private boolean isSecondImage = true;                      
	private boolean isThirdImage = true;
	private boolean isFourthImage = true;                      
	private boolean isFifthImage = true;
	private boolean isSixthImage = true;
	private boolean isSeventhImage = true;
	private boolean isEigthImage = true;
	private boolean isNinthImage = true;
	private boolean isTenthImage = true;
	private boolean isEleventhImage = true;
	private boolean isTwelvethImage = true;
	private boolean isFourteenthImage = true;
	private Handler handler;        
	private int temp = 0;
	private int m;
	private RelativeLayout rl, rl1, rl2, rl3, rl4, rl5, rl6, rl7, rl8, rl9,
			rl10, rl11;
	private String g, h;
	public Object s, s1, ro, ro1, no, no1;
	private int success = 0;
	
  private Button button_next;
  
  
	@Override
	public void onCreate(Bundle savedInstanceState) {
		System.gc();
		super.onCreate(savedInstanceState);
		setContentView(R.layout.eight_cards1);
		 
          tv=(TextView)findViewById(R.id.textView1);
      	bm3 = BitmapFactory.decodeResource(getResources(), R.drawable.mem);//Meldoy
		bm4 = BitmapFactory.decodeResource(getResources(), R.drawable.mem2);//Baby-belle
		bm5 = BitmapFactory.decodeResource(getResources(), R.drawable.mem3);//Belle
		bm6 = BitmapFactory.decodeResource(getResources(), R.drawable.mem4);//Aurora
		bm7 = BitmapFactory.decodeResource(getResources(), R.drawable.mem5);//Zelda
		bm8 = BitmapFactory.decodeResource(getResources(), R.drawable.mem6);     //Eilonway
		
		star_1 = BitmapFactory.decodeResource(getResources(), R.drawable.star);
		star_2 = BitmapFactory.decodeResource(getResources(), R.drawable.star2);
		i14 = (ImageView) findViewById(R.id.imageView4);
		i15 = (ImageView) findViewById(R.id.imageView6);
		i16 = (ImageView) findViewById(R.id.imageView8);
		i17 = (ImageView) findViewById(R.id.imageView10);
		i18 = (ImageView) findViewById(R.id.imageView12);
		i19 = (ImageView) findViewById(R.id.imageView14);
		i20 = (ImageView) findViewById(R.id.imageView16);
		i21 = (ImageView) findViewById(R.id.imageView18);
		myim=(Button)findViewById(R.id.imageView29);
	
//		mediaPlayer1=MediaPlayer.create(EightCards1.this, R.raw.pop);    
//	    mediaPlayer2=MediaPlayer.create(EightCards1.this, R.raw.trumpet);  
//		mediaPlayer3=MediaPlayer.create(EightCards1.this, R.raw.correct); 
		
		rr = (RelativeLayout) findViewById(R.id.relative_home); 
		
	
		
		 String id = "a1500d017994319";
			ad = new AdView(this, AdSize.SMART_BANNER, id);      
		 rr.addView(ad);
		 ad.loadAd(new AdRequest());  
		
		 int j=0 + (int)(Math.random() * ((5 -0) + 1));       
		 System.out.println("random no is  "+j);
		if (j == 0) {
			i14.setImageBitmap(bm6);                  
			i14.setTag("Aurora");
			i15.setImageBitmap(bm5);     
			i15.setTag("Belle");
			i16.setImageBitmap(bm4);
			i16.setTag("Baby-belle");
			i17.setImageBitmap(bm3);    
			i17.setTag("Meldoy");
			i18.setImageBitmap(bm3);
			i18.setTag("Meldoy");
			i19.setImageBitmap(bm4);
			i19.setTag("Baby-belle");
			i20.setImageBitmap(bm5);
			i20.setTag("Belle");
			i21.setImageBitmap(bm6);
			i21.setTag("Aurora");
			//yellow- rabit
			//blue hair- ni
			//green-bird
			//purple sit- deer
		}
		if (j == 1) {
			i14.setImageBitmap(bm5);
			i14.setTag("Belle");
			i15.setImageBitmap(bm6);
			i15.setTag("Aurora");
			i16.setImageBitmap(bm7);
			i16.setTag("Zelda");
			i17.setImageBitmap(bm8);
			i17.setTag("Eilonway");
			i18.setImageBitmap(bm6);
			i18.setTag("Aurora");
			i19.setImageBitmap(bm5);
			i19.setTag("Belle");
			i20.setImageBitmap(bm7);
			i20.setTag("Zelda");
			i21.setImageBitmap(bm8);
			i21.setTag("Eilonway");
			
		}
		if (j == 2) {
			i14.setImageBitmap(bm6);
			i14.setTag("Aurora");
			i15.setImageBitmap(bm7);
			i15.setTag("Zelda");
			i16.setImageBitmap(bm8);
			i16.setTag("Eilonway");
			i17.setImageBitmap(bm3);
			i17.setTag("Meldoy");
			i18.setImageBitmap(bm8);
			i18.setTag("Eilonway");
			i19.setImageBitmap(bm3);
			i19.setTag("Meldoy");
			i20.setImageBitmap(bm7);
			i20.setTag("Zelda");
			i21.setImageBitmap(bm6);
			i21.setTag("Aurora");
			
			
			
			
		}
		if (j == 3) {
			i14.setImageBitmap(bm3);
			i14.setTag("Meldoy");
			i15.setImageBitmap(bm5);
			i15.setTag("Belle");
			i16.setImageBitmap(bm7);
			i16.setTag("Zelda");
			i17.setImageBitmap(bm4);
			i17.setTag("Baby-belle");
			i18.setImageBitmap(bm5);
			i18.setTag("Belle");
			i19.setImageBitmap(bm3);
			i19.setTag("Meldoy");
			i20.setImageBitmap(bm4);
			i20.setTag("Baby-belle");
			i21.setImageBitmap(bm7);
			i21.setTag("Zelda");
			
		}
		if (j == 4) {
			i14.setImageBitmap(bm4); 
			i14.setTag("Baby-belle");
			i15.setImageBitmap(bm5);
			i15.setTag("Belle");
			i16.setImageBitmap(bm8);
			i16.setTag("Eilonway");
			i17.setImageBitmap(bm6);
			i17.setTag("Aurora");
			i18.setImageBitmap(bm8);
			i18.setTag("Eilonway");
			i19.setImageBitmap(bm4);
			i19.setTag("Baby-belle");
			i20.setImageBitmap(bm5);
			i20.setTag("Belle");
			i21.setImageBitmap(bm6);
			i21.setTag("Aurora");
			
		}
		if (j == 5) {
			i14.setImageBitmap(bm5);
			i14.setTag("Belle");
			i15.setImageBitmap(bm8);
			i15.setTag("Eilonway");
			i16.setImageBitmap(bm7);
			i16.setTag("Zelda");
			i17.setImageBitmap(bm3);
			i17.setTag("Meldoy");
			i18.setImageBitmap(bm5);    
			i18.setTag("Belle");
			i19.setImageBitmap(bm3);
			i19.setTag("Meldoy");
			i20.setImageBitmap(bm7);
			i20.setTag("Zelda");
			i21.setImageBitmap(bm8);
			i21.setTag("Eilonway");
			
		}
		

		
		
		
		
				i = (ImageView) findViewById(R.id.imageView1);

		bm1 = BitmapFactory.decodeResource(getResources(),               
				R.drawable.ic_memory_frnt);
		i1 = (ImageView) findViewById(R.id.imageView5);
		i1.setImageBitmap(bm1);
		i1.setTag("isFirstImage");
		i14.setVisibility(View.GONE);                 
		
		i2 = (ImageView) findViewById(R.id.imageView7);
		i2.setImageBitmap(bm1);
		i2.setTag("isSecondImage");
		i15.setVisibility(View.GONE);      
		
		i3 = (ImageView) findViewById(R.id.imageView9);
		i3.setImageBitmap(bm1);
		i3.setTag("isThirdImage");
		i16.setVisibility(View.GONE);
		
		i4 = (ImageView) findViewById(R.id.imageView11);
		i4.setImageBitmap(bm1);
		i4.setTag("isFourthImage");
		i17.setVisibility(View.GONE);
		
		i5 = (ImageView) findViewById(R.id.imageView13);
		i5.setImageBitmap(bm1);
		i5.setTag("isFifthImage");
		i18.setVisibility(View.GONE);
		
		i6 = (ImageView) findViewById(R.id.imageView15);
		i6.setImageBitmap(bm1);
		i6.setTag("isSixthImage");
		i19.setVisibility(View.GONE);
		
		i7 = (ImageView) findViewById(R.id.imageView17);
		i7.setImageBitmap(bm1);
		i7.setTag("isSeventhImage");
		i20.setVisibility(View.GONE);
		
		i8 = (ImageView) findViewById(R.id.imageView19);
		i8.setImageBitmap(bm1);
		i8.setTag("isEigthImage");
		i21.setVisibility(View.GONE);
		
		
		
		i13 = (ImageView) findViewById(R.id.imageView2);
		bm2 = BitmapFactory.decodeResource(getResources(), R.drawable.home_lable);
		i13.setImageBitmap(bm2);
		//i13.setPadding(10, 10, 10, 10);
		
		i.setOnClickListener(this);
		i1.setOnClickListener(this);
		i2.setOnClickListener(this);
		i3.setOnClickListener(this);
		i4.setOnClickListener(this);
		i5.setOnClickListener(this);
		i6.setOnClickListener(this);
		i7.setOnClickListener(this);
		i8.setOnClickListener(this);
		
		
		
		i13.setOnClickListener(new OnClickListener() {

			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				EightCards1.this.startActivity(new Intent(EightCards1.this,Splash.class));
				EightCards1.this.finish();
				
			}

		});
		if(count==1){
			
		}
	}

	

	

	private void applyRotation(float start, float end) {                            
		// Find the center of image
		final float centerX = i1.getWidth() / 2.0f;
		final float centerY = i14.getHeight() / 2.0f;
		// Create a new 3D rotation with the supplied parameter
		// The animation listener is used to trigger the next animation
		final Flip3dAnimation rotation = new Flip3dAnimation(start, end,                        
				centerX, centerY);
		rotation.setDuration(250);
		rotation.setFillAfter(true);
		rotation.setInterpolator(new AccelerateInterpolator());
		rotation.setAnimationListener(new DisplayNextView(isFirstImage, i1, i14));
		if (isFirstImage) {
			
			if (mediaPlayer1 != null) {
				mediaPlayer1.start();
			} else {
				initiallizeMediaPlayer(1);
				mediaPlayer1.start();
			}                     
				i1.startAnimation(rotation);
			   i1.setClickable(false);
		} else {
			i14.startAnimation(rotation);
		}
	}

	private void applyRotation1(float start, float end) {
		// Find the center of image
		final float centerX = i2.getWidth() / 2.0f;
		final float centerY = i15.getHeight() / 2.0f;
		// Create a new 3D rotation with the supplied parameter
		// The animation listener is used to trigger the next animation
		final Flip3dAnimation rotation = new Flip3dAnimation(start, end,
				centerX, centerY);
		rotation.setDuration(250);
		rotation.setFillAfter(true);
		rotation.setInterpolator(new AccelerateInterpolator());
		rotation.setAnimationListener(new DisplayNextView(isSecondImage, i2,
				i15));
		if (isSecondImage) {
			if (mediaPlayer1 != null) {
				mediaPlayer1.start();
			} else {
				initiallizeMediaPlayer(1);
				mediaPlayer1.start();
			}
			i2.startAnimation(rotation);
			i2.setClickable(false);
		} else {
			i15.startAnimation(rotation);
		}
	}

	private void applyRotation2(float start, float end) {
		// Find the center of image
		final float centerX = i3.getWidth() / 2.0f;
		final float centerY = i16.getHeight() / 2.0f;
		// Create a new 3D rotation with the supplied parameter
		// The animation listener is used to trigger the next animation
		final Flip3dAnimation rotation = new Flip3dAnimation(start, end,
				centerX, centerY);
		rotation.setDuration(250);
		rotation.setFillAfter(true);
		rotation.setInterpolator(new AccelerateInterpolator());
		rotation.setAnimationListener(new DisplayNextView(isThirdImage, i3, i16));
		if (isThirdImage) {
			if (mediaPlayer1 != null) {
				mediaPlayer1.start();
			} else {
				initiallizeMediaPlayer(1);
				mediaPlayer1.start();
			} 
			i3.setClickable(false);
			i3.startAnimation(rotation);         
		} else {
			i16.startAnimation(rotation);                  
		}
	}

	private void applyRotation3(float start, float end) {
		// Find the center of image
		final float centerX = i4.getWidth() / 2.0f;
		final float centerY = i17.getHeight() / 2.0f;
		// Create a new 3D rotation with the supplied parameter
		// The animation listener is used to trigger the next animation
		final Flip3dAnimation rotation = new Flip3dAnimation(start, end,
				centerX, centerY);
		rotation.setDuration(250);
		rotation.setFillAfter(true);
		rotation.setInterpolator(new AccelerateInterpolator());
		rotation.setAnimationListener(new DisplayNextView(isFourthImage, i4,
				i17));
		if (isFourthImage) {
			if (mediaPlayer1 != null) {
				mediaPlayer1.start();
			} else {
				initiallizeMediaPlayer(1);
				mediaPlayer1.start();
			}
			i4.setClickable(false);
			i4.startAnimation(rotation);
		} else {
			i17.startAnimation(rotation);
		}
	}

	private void applyRotation4(float start, float end) {
		// Find the center of image
		final float centerX = i5.getWidth() / 2.0f;
		final float centerY = i18.getHeight() / 2.0f;
		// Create a new 3D rotation with the supplied parameter
		// The animation listener is used to trigger the next animation
		final Flip3dAnimation rotation = new Flip3dAnimation(start, end,
				centerX, centerY);
		rotation.setDuration(250);
		rotation.setFillAfter(true);
		rotation.setInterpolator(new AccelerateInterpolator());
		rotation.setAnimationListener(new DisplayNextView(isFifthImage, i5, i18));
		if (isFifthImage) {
			if (mediaPlayer1 != null) {
				mediaPlayer1.start();
			} else {
				initiallizeMediaPlayer(1);
				mediaPlayer1.start();
			}
			i5.setClickable(false);
			i5.startAnimation(rotation);            
		} else {
			i18.startAnimation(rotation);            
		}
	}

	private void applyRotation6(float start, float end) {
	
		final float centerX = i6.getWidth() / 2.0f;
		final float centerY = i19.getHeight() / 2.0f;
		// Create a new 3D rotation with the supplied parameter
		// The animation listener is used to trigger the next animation
		final Flip3dAnimation rotation = new Flip3dAnimation(start, end,
				centerX, centerY);
		rotation.setDuration(250);
		rotation.setFillAfter(true);
		rotation.setInterpolator(new AccelerateInterpolator());
		rotation.setAnimationListener(new DisplayNextView(isSixthImage, i6, i19));
		if (isSixthImage) {
			if (mediaPlayer1 != null) {
				mediaPlayer1.start();
			} else {
				initiallizeMediaPlayer(1);
				mediaPlayer1.start();
			}
			i6.setClickable(false);
			i6.startAnimation(rotation);
		} else {
			i19.startAnimation(rotation);
		}
	}

	private void applyRotation7(float start, float end) {
		// Find the center of image
		final float centerX = i7.getWidth() / 2.0f;
		final float centerY = i20.getHeight() / 2.0f;
	
		final Flip3dAnimation rotation = new Flip3dAnimation(start, end,
				centerX, centerY);
		rotation.setDuration(250);
		rotation.setFillAfter(true);
		rotation.setInterpolator(new AccelerateInterpolator());
		rotation.setAnimationListener(new DisplayNextView(isSeventhImage, i7,
				i20));
		if (isSeventhImage) {
			if (mediaPlayer1 != null) {
				mediaPlayer1.start();
			} else {
				initiallizeMediaPlayer(1);
				mediaPlayer1.start();
			}
			i7.setClickable(false);
			i7.startAnimation(rotation);
		} else {
			i20.startAnimation(rotation);
		}
	}

	private void applyRotation8(float start, float end) {
		// Find the center of image
		final float centerX = i8.getWidth() / 2.0f;
		final float centerY = i21.getHeight() / 2.0f;
		// Create a new 3D rotation with the supplied parameter
		// The animation listener is used to trigger the next animation
		final Flip3dAnimation rotation = new Flip3dAnimation(start, end,
				centerX, centerY);
		rotation.setDuration(250);
		rotation.setFillAfter(true);
		rotation.setInterpolator(new AccelerateInterpolator());
		rotation.setAnimationListener(new DisplayNextView(isEigthImage, i8, i21));
		if (isEigthImage) {
			if (mediaPlayer1 != null) {
				mediaPlayer1.start();
			} else {
				initiallizeMediaPlayer(1);
				mediaPlayer1.start();
			}
			i8.setClickable(false);
			i8.startAnimation(rotation);
		} else {                                                                    
			i21.startAnimation(rotation);
		}
	}

	private void applyRotation9(float start, float end) {
		// Find the center of image
		final float centerX = i9.getWidth() / 2.0f;
		final float centerY = i22.getHeight() / 2.0f;
		// Create a new 3D rotation with the supplied parameter
		// The animation listener is used to trigger the next animation
		final Flip3dAnimation rotation = new Flip3dAnimation(start, end,
				centerX, centerY);
		rotation.setDuration(250);
		rotation.setFillAfter(true);
		rotation.setInterpolator(new AccelerateInterpolator());
		rotation.setAnimationListener(new DisplayNextView(isNinthImage, i9, i22));
		if (isNinthImage) {
			if (mediaPlayer1 != null) {
				mediaPlayer1.start();
			} else {
				initiallizeMediaPlayer(1);
				mediaPlayer1.start();
			}
			i9.setClickable(false);
			i9.startAnimation(rotation);
		} else {
			i22.startAnimation(rotation);
		}
	}

	private void applyRotation10(float start, float end) {
		// Find the center of image
		final float centerX = i10.getWidth() / 2.0f;
		final float centerY = i23.getHeight() / 2.0f;
		// Create a new 3D rotation with the supplied parameter
		// The animation listener is used to trigger the next animation
		final Flip3dAnimation rotation = new Flip3dAnimation(start, end,
				centerX, centerY);
		rotation.setDuration(250);
		rotation.setFillAfter(true);
		rotation.setInterpolator(new AccelerateInterpolator());
		rotation.setAnimationListener(new DisplayNextView(isTenthImage, i10,i23));
		if (isTenthImage) {
			if (mediaPlayer1 != null) {
				mediaPlayer1.start();
			} else {
				initiallizeMediaPlayer(1);
				mediaPlayer1.start();
			}
			i10.setClickable(false);
			i10.startAnimation(rotation);
		} else {
			i23.startAnimation(rotation);
		}
	}                              

	private void applyRotation11(float start, float end) {
		// Find the center of image
		final float centerX = i11.getWidth() / 2.0f;
		final float centerY = i24.getHeight() / 2.0f;
		// Create a new 3D rotation with the supplied parameter
		// The animation listener is used to trigger the next animation
		final Flip3dAnimation rotation = new Flip3dAnimation(start, end,
				centerX, centerY);
		rotation.setDuration(250);
		rotation.setFillAfter(true);
		rotation.setInterpolator(new AccelerateInterpolator());
		rotation.setAnimationListener(new DisplayNextView(isEleventhImage, i11,
				i24));
		if (isEleventhImage) {
			if (mediaPlayer1 != null) {
				mediaPlayer1.start();
			} else {
				initiallizeMediaPlayer(1);
				mediaPlayer1.start();
			}
			i11.setClickable(false);
			i11.startAnimation(rotation);
		} else {
			i24.startAnimation(rotation);
		}
	}

	private void applyRotation12(float start, float end) {
		// Find the center of image
		final float centerX = i12.getWidth() / 2.0f;
		final float centerY = i25.getHeight() / 2.0f;
		// Create a new 3D rotation with the supplied parameter
		// The animation listener is used to trigger the next animation
		final Flip3dAnimation rotation = new Flip3dAnimation(start, end,
				centerX, centerY);
		rotation.setDuration(250);
		rotation.setFillAfter(true);
		rotation.setInterpolator(new AccelerateInterpolator());
		rotation.setAnimationListener(new DisplayNextView(isTwelvethImage, i12,
				i25));
		if (isTwelvethImage) {
			if (mediaPlayer1 != null) {
				mediaPlayer1.start();
			} else {
				initiallizeMediaPlayer(1);
				mediaPlayer1.start();
			}
			i12.setClickable(false);
			i12.startAnimation(rotation);
		} else {
			i25.startAnimation(rotation);
		}
	}

	public int value() {        
		return temp;
	}
	
	
	
	public void compare(Object a, Object b, Object c, Object d) {
		
		String e = a.toString();
		String f = b.toString();
		g = c.toString();
		h = d.toString();
		temp = 0;
		if (a == b) {
			if (e == "Eilonway" && b == "Eilonway") {
				System.out.println("bird");
				Toast toast = Toast.makeText(getApplicationContext(),
						"Eilonway", Toast.LENGTH_SHORT);
				toast.show();
                 count=1;

                 new Thread() {
						public void run() {
							try {
								hRefresh.sendEmptyMessage(8);
								Thread.sleep(1000); 
								
								System.out.println("in the thread"); 
								hRefresh.sendEmptyMessage(2);
							} catch (Exception e) {                       
							}
						}
					}.start();
				
     			System.out.println("count is executed");
				success++;

			}
			if (e == "Zelda" && b == "Zelda") {
				System.out.println("ni");
				Toast toast = Toast.makeText(getApplicationContext(),
						"Zelda", Toast.LENGTH_SHORT);
				toast.show();
                   temp=0;
                  
        			  new Thread() {
  						public void run() {
  							try {
  								hRefresh.sendEmptyMessage(8);
  								Thread.sleep(1000); 
  								
  								System.out.println("in the thread"); 
  								hRefresh.sendEmptyMessage(3);
  							} catch (Exception e) {                       
  							}
  						}
  					}.start();
  					
				success++;

			}
			if (e == "Aurora" && b == "Aurora") {
				System.out.println("rabit");
				Toast toast = Toast.makeText(getApplicationContext(),
						"Aurora", Toast.LENGTH_SHORT);
				toast.show();
                  temp=0;
                
      			
      			new Thread() {
						public void run() {
							try {
								hRefresh.sendEmptyMessage(8);
								Thread.sleep(1000);        
								
								System.out.println("in the thread"); 
								hRefresh.sendEmptyMessage(6);
							} catch (Exception e) {                       
							}
						}
					}.start();
					
				success++;

			}
			if (e == "Belle" && b == "Belle") {
				System.out.println("deer");
				Toast toast = Toast.makeText(getApplicationContext(),
						"Belle", Toast.LENGTH_SHORT);
				toast.show();
                     temp=0;
               
           		 new Thread() {
						public void run() {
							try {
								hRefresh.sendEmptyMessage(8);
								Thread.sleep(1000); 
							
								System.out.println("in the thread"); 
								hRefresh.sendEmptyMessage(4);
							} catch (Exception e) {                       
							}
						}
					}.start();
					
				success++;

			}
			if (e == "Meldoy" && b == "Meldoy") {
				System.out.println("squirel");
				Toast toast = Toast.makeText(getApplicationContext(),
						"Meldoy", Toast.LENGTH_SHORT);
				toast.show();
                  temp=0;
  
         			 new Thread() {
   						public void run() {
   							try {
   								hRefresh.sendEmptyMessage(8);
   								Thread.sleep(1000);  
   							
   								System.out.println("in the thread"); 
   								hRefresh.sendEmptyMessage(5);
   							} catch (Exception e) {                       
   							}
   						}
   					}.start();
   					
				success++;

			}
			if (e == "Baby-belle" && b == "Baby-belle") {
				System.out.println("one");
				Toast toast = Toast.makeText(getApplicationContext(),
						"Baby-belle", Toast.LENGTH_SHORT);
				toast.show();
                   temp=0;
                 
          			 new Thread() {
    						public void run() {
    							try {
    								hRefresh.sendEmptyMessage(8);
    								Thread.sleep(1000); 
    								System.out.println("in the thread"); 
    								hRefresh.sendEmptyMessage(7);
    							} catch (Exception e) {                       
    							}
    						}
    					}.start();
    					
				success++;
     
			}
			if (e == "two" && b == "two") {                    
				System.out.println("two");
                   temp=0;
				success++;
				
			}
			if (e == "three" && b == "three") {  
				System.out.println("three");
                   temp=0;
				success++;
				
			}
			if (e == "thank" && b == "thank") {
				System.out.println("thank");
                temp=0;
				success++;
				
			}
			if (e == "zaijan" && b == "zaijan") {        
				System.out.println("zaijan");    
                   temp=0;
				success++;
				
			}
		}
		
		if (a != b) {                        
			hRefresh.sendEmptyMessage(8);
			System.out.println("Failure" + a + b + c + d);                                       
			match=0;
			match1=0;
			
			shake();           
		}
		
	}
       public void win(){
    	   System.out.println("win is called");     
    	
    	 rotate();
			
    	    i14.setVisibility(View.VISIBLE);    
			i15.setVisibility(View.VISIBLE); 
			i16.setVisibility(View.VISIBLE);
			i17.setVisibility(View.VISIBLE);
			i18.setVisibility(View.VISIBLE);
			i19.setVisibility(View.VISIBLE); 
			i20.setVisibility(View.VISIBLE);
			i21.setVisibility(View.VISIBLE);               

			
			
			 new Thread() {
					public void run() {
						try {
							
							Thread.sleep(2000); 
							hRefresh.sendEmptyMessage(9);                      
						} catch (Exception e) {                       
						}
					}
				}.start();

       }
	public void rotate() {
		System.out.println("rotate is called");      
		rl = (RelativeLayout) findViewById(R.id.m);
		rl1 = (RelativeLayout) findViewById(R.id.m1);
		rl2 = (RelativeLayout) findViewById(R.id.m2);
		rl3 = (RelativeLayout) findViewById(R.id.m4);
		rl4 = (RelativeLayout) findViewById(R.id.m5);
		rl5 = (RelativeLayout) findViewById(R.id.m6);
		rl6 = (RelativeLayout) findViewById(R.id.m7);
		rl7 = (RelativeLayout) findViewById(R.id.m3);
		
	     
		final Animation a = AnimationUtils.loadAnimation(EightCards1.this,
				R.anim.rotate);
		a.setDuration(2000);
		a.setAnimationListener(new AnimationListener() {
			public void onAnimationEnd(Animation animation) {
				// TODO Auto-generated method stub
				
				 rl.setVisibility(View.VISIBLE);                           
			      rl1.setVisibility(View.VISIBLE);                      
			      rl2.setVisibility(View.VISIBLE);                  
			      rl3.setVisibility(View.VISIBLE);                            
			      rl4.setVisibility(View.VISIBLE);                     
			      rl5.setVisibility(View.VISIBLE);                 
			      rl6.setVisibility(View.VISIBLE);               
			      rl7.setVisibility(View.VISIBLE);              
			                
				setButtonClicableState(false);                
				
				System.out.println("in end");              
			}                                 

			public void onAnimationRepeat(Animation animation) {                          
				// TODO Auto-generated method stub

			}

			public void onAnimationStart(Animation animation) {   
				
				if (mediaPlayer2 != null) {
					mediaPlayer2.start();
				} else {
					initiallizeMediaPlayer(2);
					mediaPlayer2.start();
				}
				// TODO Auto-generated method stub                                 
     System.out.println("in start");
			}
		});
		
		rl.startAnimation(a);
		rl1.startAnimation(a);
		rl2.startAnimation(a);
		rl3.startAnimation(a);
		rl4.startAnimation(a);
		rl5.startAnimation(a);
		rl6.startAnimation(a);
		rl7.startAnimation(a);
		
	}

	
	public void shake() {
		
		Animation a = AnimationUtils.loadAnimation(EightCards1.this,
				R.anim.shake);
		a.setDuration(500);
		ImageView iv = (ImageView) findViewById(R.id.imageView28);
		a.setAnimationListener(new AnimationListener() {
			public void onAnimationEnd(Animation animation) {
				// TODO Auto-generated method stub
				// TODO Auto-generated method stub
				if (g == "isFirstImage" || h == "isFirstImage") {
					applyRotation(0, -90);
					isFirstImage = !isFirstImage;
				}
				if (g == "isSecondImage" || h == "isSecondImage") {
					applyRotation1(0, -90);
					isSecondImage = !isSecondImage;
				}
				if (g == "isThirdImage" || h == "isThirdImage") {
					applyRotation2(0, -90);
					isThirdImage = !isThirdImage;
				}
				if (g == "isFourthImage" || h == "isFourthImage") {
					applyRotation3(0, -90);
					isFourthImage = !isFourthImage;
				}
				if (g == "isFifthImage" || h == "isFifthImage") {
					applyRotation4(0, -90);
					isFifthImage = !isFifthImage;
				}
				if (g == "isSixthImage" || h == "isSixthImage") {
					applyRotation6(0, -90);
					isSixthImage = !isSixthImage;
				}
				if (g == "isSeventhImage" || h == "isSeventhImage") {
					applyRotation7(0, -90);
					isSeventhImage = !isSeventhImage;
				}
				if (g == "isEigthImage" || h == "isEigthImage") {
					applyRotation8(0, -90);
					isEigthImage = !isEigthImage;
				}
				if (g == "isNinthImage" || h == "isNinthImage") {
					applyRotation9(0, -90);
					isNinthImage = !isNinthImage;
				}
				if (g == "isTenthImage" || h == "isTenthImage") {
					applyRotation10(0, -90);
					isTenthImage = !isTenthImage;
				}
				if (g == "isEleventhImage" || h == "isEleventhImage") {
					applyRotation11(0, -90);
					isEleventhImage = !isEleventhImage;
				}
				if (g == "isTwelvethImage" || h == "isTwelvethImage") {
					applyRotation12(0, -90);
					isTwelvethImage = !isTwelvethImage;
				}
				i13.setVisibility(View.VISIBLE);    
				
				System.out.println("end of shake");
			}    

			public void onAnimationRepeat(Animation animation) {
				// TODO Auto-generated method stub

			}

			public void onAnimationStart(Animation animation) {
				// TODO Auto-generated method stub
			}
			
		});
		iv.startAnimation(a);     
		
		System.out.println("check out");       
	}
   
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		
		case R.id.imageView5:
			
				
			System.out.println("first one image");
			if( match==0 && match1==0)
			{
			match=R.id.m;
			}
			if(temp==1)	
			{
				match1=R.id.m;
			}
			
			if (temp == 0 || temp == 1) {
				if (isFirstImage) {
					applyRotation(0, 90);
					isFirstImage = !isFirstImage;               
				}
				if (temp == 0) {
					s = i14.getTag();
					no = i1.getTag();
				}
				if (temp == 1) {
					s1 = i14.getTag();
					no1 = i1.getTag();
				}
				temp++;
				if (temp == 2) {
					hRefresh.sendEmptyMessage(1);
				}
			}
			System.out.println(value());
			
			break;
		case R.id.imageView7:
          
			if( match==0 && match1==0)
			{
			match=R.id.m1;
			}
			if(temp==1)	
			{
				match1=R.id.m1;
			}
			
			
			
			
			if (temp == 0 || temp == 1) {
				if (isSecondImage) {
					applyRotation1(0, 90);
					isSecondImage = !isSecondImage;
				}
				if (temp == 0) {
					s = i15.getTag();
					no = i2.getTag();
				}
				if (temp == 1) {
					s1 = i15.getTag();
					no1 = i2.getTag();
				}
				temp++;
				if (temp == 2) {
					hRefresh.sendEmptyMessage(1);
				}
			}
			System.out.println(value());
			
			break;
		case R.id.imageView9:
			
			if( match==0 && match1==0)
			{
			match=R.id.m2;
			}
			if(temp==1)	
			{
				match1=R.id.m2;
			}
			
			if (temp == 0 || temp == 1) {
				if (isThirdImage) {
					applyRotation2(0, 90);
					isThirdImage = !isThirdImage;

				}
				if (temp == 0) {
					s = i16.getTag();
					no = i3.getTag();
				}
				if (temp == 1) {
					s1 = i16.getTag();
					no1 = i3.getTag();
				}
				temp++;

				if (temp == 2) {
					hRefresh.sendEmptyMessage(1);
				}

			}
			System.out.println(value());
			break;
		case R.id.imageView11 :
			
			if( match==0 && match1==0)
			{
			match=R.id.m3;
			}
			if(temp==1)	
			{
				match1=R.id.m3;
			}
			
			
			if (temp == 0 || temp == 1) {
				if (isFourthImage) {
					applyRotation3(0, 90);
					isFourthImage = !isFourthImage;

				}
				if (temp == 0) {
					s = i17.getTag();
					no = i4.getTag();
				}
				if (temp == 1) {
					s1 = i17.getTag();
					no1 = i4.getTag();
				}
				temp++;

				if (temp == 2) {
					hRefresh.sendEmptyMessage(1);
				}

			}
			System.out.println(value());
			
			break;
		case R.id.imageView13:
			
			if( match==0 && match1==0)
			{
			match=R.id.m4;
			}
			if(temp==1)	
			{
				match1=R.id.m4;
			}
			
			if (temp == 0 || temp == 1) {
				if (isFifthImage) {
					applyRotation4(0, 90);
					isFifthImage = !isFifthImage;
          
				}
				if (temp == 0) {
					s = i18.getTag();
					no = i5.getTag();
				}
				if (temp == 1) {
					s1 = i18.getTag();
					no1 = i5.getTag();
				}
				temp++;

				if (temp == 2) {
					hRefresh.sendEmptyMessage(1);         
				}
			}
			System.out.println(value());
			break;
			
		case R.id.imageView15:
              
			
			if( match==0 && match1==0)
			{
			match=R.id.m5;
			}
			if(temp==1)	
			{
				match1=R.id.m5;
			}
			
			if (temp == 0 || temp == 1) {
				if (isSixthImage) {
					applyRotation6(0, 90);
					isSixthImage = !isSixthImage;

				}
				if (temp == 0) {
					s = i19.getTag();
					no = i6.getTag();
				}
				if (temp == 1) {
					s1 = i19.getTag();
					no1 = i6.getTag();
				}
				temp++;

				if (temp == 2) {
					hRefresh.sendEmptyMessage(1);
				}
			}
			System.out.println(value());
			break;
		case R.id.imageView17 :

			if( match==0 && match1==0)
			{
			match=R.id.m6;
			}
			if(temp==1)	
			{
				match1=R.id.m6;
			}
			
			if (temp == 0 || temp == 1) {
				if (isSeventhImage) {
					applyRotation7(0, 90);
					isSeventhImage = !isSeventhImage;

				}
				if (temp == 0) {
					s = i20.getTag();
					no = i7.getTag();
				}
				if (temp == 1) {
					s1 = i20.getTag();
					no1 = i7.getTag();
				}
				temp++;

				if (temp == 2) {
					hRefresh.sendEmptyMessage(1);
				}
			}
			System.out.println(value());
			break;
		case R.id.imageView19:

			if( match==0 && match1==0)
			{
			match=R.id.m7;
			}
			if(temp==1)	
			{
				match1=R.id.m7;
			}
			
			
			if (temp == 0 || temp == 1) {
				if (isEigthImage) {
					applyRotation8(0, 90);
					isEigthImage = !isEigthImage;
				}
				if (temp == 0) {
					s = i21.getTag();
					no = i8.getTag();
				}
				if (temp == 1) {
					s1 = i21.getTag();
					no1 = i8.getTag();
				}
				temp++;
				if (temp == 2) {
					hRefresh.sendEmptyMessage(1);
				}
			}
			System.out.println(value());
			break;
		
		
		
		
		default:
			break;
		}
		if(temp==2){
			setButtonClicableState(false);
			new Handler().postDelayed(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					setButtonClicableState(true);
				}
			}, 600);                
		}
		 hRefresh = new Handler() {
			public void handleMessage(Message msg) { 
				switch (msg.what) {
				case 1:

					compare(s, s1, no, no1);                 
								break;      
							
				case 2:
					if(count1==0){
						if(match!=0&&match1!=0){
							if (mediaPlayer3 != null) {
								mediaPlayer3.start();
							} else {
								initiallizeMediaPlayer(3);
								mediaPlayer3.start();
							}
							setButtonClicableState(false);
						System.out.println(match+"   "+match1);
					System.out.println("in handler1");
					RelativeLayout l1=(RelativeLayout)findViewById(match); 
		     		RelativeLayout l2=(RelativeLayout)findViewById(match1);
		     			l1.setVisibility(View.INVISIBLE);
		     			l2.setVisibility(View.INVISIBLE);
		     			success1++;
		     			count1++;
		     			match=0;
    					match1=0;
    					setButtonClicableState(true);
		     			if(success1==4){win();}                  
		     			}}
					break;
					
				case 3:
					if(count2==0){
						if(match!=0&&match1!=0){
							if (mediaPlayer3 != null) {
								mediaPlayer3.start();
							} else {
								initiallizeMediaPlayer(3);
								mediaPlayer3.start();
							}
							setButtonClicableState(false);
						System.out.println(match+"   "+match1);
					System.out.println("in handler2");
					RelativeLayout l3=(RelativeLayout)findViewById(match);
		     		RelativeLayout l4=(RelativeLayout)findViewById(match1);
		     			l3.setVisibility(View.INVISIBLE);
		     			l4.setVisibility(View.INVISIBLE);
		     			count2++;
		     			success1++;
		     			match=0;
    					match1=0;
    					setButtonClicableState(true);
		     			if(success1==4){win();} 
					}}
					break;
				case 4:
					if(count3==0){
						if(match!=0&&match1!=0){
							if (mediaPlayer3 != null) {
								mediaPlayer3.start();
							} else {
								initiallizeMediaPlayer(3);
								mediaPlayer3.start();
							}
							setButtonClicableState(false);
						System.out.println(match+"   "+match1);
					System.out.println("in handler3");
					RelativeLayout l5=(RelativeLayout)findViewById(match);
		     		RelativeLayout l6=(RelativeLayout)findViewById(match1);
		     			l5.setVisibility(View.INVISIBLE);
		     			l6.setVisibility(View.INVISIBLE);
		     			success1++;
		     			count3++;
		     			match=0;
    					match1=0;
    					setButtonClicableState(true);
		     			if(success1==4){win();} 
					}}
					break;
				case 5:
					if(count4==0){
						if(match!=0&&match1!=0){
							if (mediaPlayer3 != null) {
								mediaPlayer3.start();
							} else {
								initiallizeMediaPlayer(3);
								mediaPlayer3.start();
							}
							setButtonClicableState(false);
						System.out.println(match+"   "+match1);
					System.out.println("in handler4");
					RelativeLayout l7=(RelativeLayout)findViewById(match);
		     		RelativeLayout l8=(RelativeLayout)findViewById(match1);
		     			l7.setVisibility(View.INVISIBLE);
		     			l8.setVisibility(View.INVISIBLE);
		     			success1++;
		     			count4++;
		     			match=0;
    					match1=0;
    					setButtonClicableState(true);
		     			if(success1==4){win();} 
					}}
					break;
				case 6:
					if(count5==0){
						if(match!=0&&match1!=0){
							if (mediaPlayer3 != null) {
								mediaPlayer3.start();
							} else {
								initiallizeMediaPlayer(3);
								mediaPlayer3.start();
							}
							setButtonClicableState(false);
						System.out.println(match+"   "+match1);                  
					System.out.println("in handler5");                      
					RelativeLayout l9=(RelativeLayout)findViewById(match);                      
		     		RelativeLayout l10=(RelativeLayout)findViewById(match1);             
		     			l9.setVisibility(View.INVISIBLE);
		     			l10.setVisibility(View.INVISIBLE);
		     			success1++;
		     			count5++;
		     			match=0;
    					match1=0;
    					setButtonClicableState(true);
		     			if(success1==4){win();} 
		     			
					}}
					break;
				case 7:
					if(count6==0){
						if(match!=0&&match1!=0){
							if (mediaPlayer3 != null) {
								mediaPlayer3.start();
							} else {
								initiallizeMediaPlayer(3);
								mediaPlayer3.start();
							}
							setButtonClicableState(false);
						System.out.println(match+"   "+match1);
					System.out.println("in handler6");
					RelativeLayout l11=(RelativeLayout)findViewById(match);
		     		RelativeLayout l12=(RelativeLayout)findViewById(match1);
		     			l11.setVisibility(View.INVISIBLE);
		     			l12.setVisibility(View.INVISIBLE);
		     			success1++;
		     			count6++;
		     			match=0;
    					match1=0;
    					setButtonClicableState(true);
		     			if(success1==4){win();} 
					}}
					break;  
				case 8:
					int a=Integer.parseInt(tv.getText().toString());                              
					a=a+1;
					tv.setText(Integer.toString(a));
					break;
				case 9:
					final Dialog dialog = new Dialog(EightCards1.this);
			        dialog.setContentView(R.layout.custom);
					dialog.setTitle("Level Cleared");
					 TextView tv1=(TextView)dialog.findViewById(R.id.textView1);     
			        ImageView iv1=(ImageView)dialog.findViewById(R.id.imageView2);            
			        ImageView iv2=(ImageView)dialog.findViewById(R.id.imageView1);     
			        ImageView iv3=(ImageView)dialog.findViewById(R.id.imageView3); 
			        Button next=(Button)dialog.findViewById(R.id.button1);
			        Button restart=(Button)dialog.findViewById(R.id.button2);
			        
			        next.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							EightCards1.this.finish();
							EightCards1.this.startActivity(new Intent(EightCards1.this,TenCard.class));
						}
					});
			        restart.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							EightCards1.this.finish();
							EightCards1.this.startActivity(new Intent(EightCards1.this,EightCards1.class));   
						}
					});
			        
			        tv1.setText("No of moves is :"+tv.getText().toString());
					iv1.setImageBitmap(star_2);
					iv2.setImageBitmap(star_2);                   
					iv3.setImageBitmap(star_2);
					int b = Integer.parseInt(tv.getText().toString());
					if(b==4){
						iv1.setImageBitmap(star_1);
						iv2.setImageBitmap(star_1);                   
						iv3.setImageBitmap(star_1);
					}
					if(b>4 && b<=8){
						iv1.setImageBitmap(star_1);
						iv2.setImageBitmap(star_1);                   
						
					}
					if(b>8){  
						iv1.setImageBitmap(star_1);       
						                   
						
					}
					dialog.show();
					myPrefs = EightCards1.this.getSharedPreferences("hello", MODE_WORLD_READABLE);
			           SharedPreferences.Editor prefsEditor = myPrefs.edit();
			           prefsEditor.putString("level6",tv.getText().toString());
			           prefsEditor.commit();
					break;
				
				default:             
					break;                   
				}
			}
			};     
	}

	private void setButtonClicableState(Boolean state){                                          
		i1.setClickable(state);      
		i2.setClickable(state);      
		i3.setClickable(state);       
		i4.setClickable(state);      
		i5.setClickable(state);                
		i6.setClickable(state);    
		i7.setClickable(state);     
		i8.setClickable(state);                                 
  }

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {                                 
		// TODO Auto-generated method stub
		 if ((keyCode == KeyEvent.KEYCODE_BACK)) {
			 EightCards1.this.finish();
		    }
		
		return super.onKeyDown(keyCode, event);
	}
	
	private void initiallizeMediaPlayer(int which) {
		switch (which) {
		case 1:
			mediaPlayer1 = MediaPlayer.create(EightCards1.this, R.raw.pop);
			break;
		case 2:
			mediaPlayer2 = MediaPlayer.create(EightCards1.this, R.raw.trumpet);
			break;
		case 3:
			mediaPlayer3 = MediaPlayer.create(EightCards1.this, R.raw.correct);
			break;
		default:
			break;
		}
	}
	
	
}