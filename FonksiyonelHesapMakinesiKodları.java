package HesapMakinesi;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.print.DocFlavor.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

    		public class FonksiyonelHesapMakinesiKodları {


	

			static double s1;
			static double s12;
			static double s2;
			static double sonucc;
			static double islem;
			static String sonString;
			static int son = 0;

				public static void main(String[] args) {
					try {

			JFrame bizimframe = new JFrame("Fonksiyonel Hesap Makinesi");//frame oluşturma
			bizimframe.setSize(234, 375);//frame boyutu
			bizimframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//çıkış yapılmasını sağlar
			bizimframe.setResizable(false);//frame nin sabit ler
			bizimframe.setLocationRelativeTo(null);//ekranın ortasında açma
			Image icon = Toolkit.getDefaultToolkit().getImage("\\images\\hesap.png"); 
			bizimframe.setIconImage(icon);  
		          

			
			
			JButton topla = new JButton("+ ");// buton oluşturma ve üstündeki simge veya yazı
			topla.setBounds(600, 83, 100, 20);//buton boyutu
			
			JButton bir = new JButton("1 ");
			JButton iki = new JButton("2 ");
			JButton uc = new JButton("3 ");
			JButton dort = new JButton("4 ");
			JButton bes = new JButton("5 ");
			JButton altı = new JButton("6 ");
			JButton yedi = new JButton("7 ");
			JButton sekiz = new JButton("8 ");
			JButton dokuz = new JButton("9 ");
			JButton sıfır = new JButton("0 ");
			JButton nokta = new JButton(". ");
			JButton carp = new JButton("* ");
			JButton esittir = new JButton("= ");
			JButton bolme = new JButton("/ ");
			JButton cıkar = new JButton("- ");
			JButton sil = new JButton("C  ");
			JButton teks = new JButton("<-        ");
			JButton yuz = new JButton("%         ");
			JButton pi = new JButton(" π*x   ");
			JButton ikisıfır = new JButton("00");
			JButton ucsıfır = new JButton("000");
			JButton kare = new JButton("x^2    ");
			JButton ustsen = new JButton("x^y   ");
			JButton fak = new JButton("!          ");
			JButton cos = new JButton("cos    ");
			JButton sin = new JButton("sin     ");
			JButton tan = new JButton("tan    ");
			JButton LN = new JButton ("ln       ");
			JButton log10 = new JButton("log10");
			JButton pisayı = new JButton("π        ");
			JButton kokcik= new JButton("√       ");
			JButton kokcikustsen= new JButton("√^x  ");
			JButton cot= new JButton(" cot    ");
			
			
			
			

			final JTextField sonuc = new JTextField(15);//text field oluşturma 
			
			
			kokcikustsen.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mousePressed(MouseEvent e) {
					s1 = Double.parseDouble(sonuc.getText());
					islem = 8;
					sonuc.setText("");

					
							
					
					

				}
			}); 
			
			kokcik.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mousePressed(MouseEvent e) {
					s1 = Double.parseDouble(sonuc.getText());
					double s3=2;

					
					 sonuc.setText(String.valueOf(Math.pow((double) s1 ,(double)(1/s3))));
					
					

				}
			});
			
			pisayı.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mousePressed(MouseEvent e) {

				
					sonuc.setText(String.valueOf(3.1416));
					s1 = Double.parseDouble(sonuc.getText());

				}
			});
	
			log10.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mousePressed(MouseEvent e) {
					s1 = Double.parseDouble(sonuc.getText());
					
					
					
					
					
					sonuc.setText(String.valueOf(Math.log10(s1)));

				}
			});
			
			LN.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mousePressed(MouseEvent e) {
					s1 = Double.parseDouble(sonuc.getText());
					
					
					
					
					
					sonuc.setText(String.valueOf(Math.log(s1)));

				}
			});
	
	
			
			tan.addMouseListener(new MouseAdapter()    
					{
						@Override
						public void mousePressed(MouseEvent e) {
							s1 = Double.parseDouble(sonuc.getText());
							
							
							
							double num=Math.round((s1)*100.0 )/100.0;
							
							sonuc.setText(String.valueOf(Math.tan(Math.toRadians(num))));

						}
					});
			
			cot.addMouseListener(new MouseAdapter() 
			{
				@Override
				public void mousePressed(MouseEvent e) {
					s1 = Double.parseDouble(sonuc.getText());
					double w;
					
					double num=Math.round((s1)*100.0 )/100.0;
					
					sonuc.setText (String.valueOf((Math.cos(Math.toRadians(num)))/(Math.sin(Math.toRadians(num)))));
					
					
					
									}
			});
	
			
			cos.addMouseListener(new MouseAdapter() 
					{
						@Override
						public void mousePressed(MouseEvent e) {
							s1 = Double.parseDouble(sonuc.getText());
							
							
							
							double num=Math.round((s1)*100.0 )/100.0;
							
							sonuc.setText(String.valueOf(Math.cos(Math.toRadians(num))));

						}
					});
			
			sin.addMouseListener(new MouseAdapter() 
					{
						@Override
						public void mousePressed(MouseEvent e) {
							s1 = Double.parseDouble(sonuc.getText());
							
							
							
							double num=Math.round((s1)*100.0 )/100.0;
							
							sonuc.setText(String.valueOf(Math.sin(Math.toRadians(num))));

						}
					});
			
			
			

			ustsen.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					s1 = Double.parseDouble(sonuc.getText());
					islem = 6;
					sonuc.setText("");

				}
			});

			kare.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					double zz = 1;
					double w;
					w = Double.parseDouble(sonuc.getText());

					zz = w * w;

					sonuc.setText(Double.toString(zz));

				}
			});

			pi.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					double zz = 1;
					double w;
					w = Double.parseDouble(sonuc.getText());

					zz = w * 3.1416;

					sonuc.setText(Double.toString(zz));

				}
			});
			
			yuz.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {

					
					s1 = Double.parseDouble(sonuc.getText());
					islem = 5;
					sonuc.setText("");


				}
			});

			fak.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					Double w;

					w = Double.parseDouble(sonuc.getText());
					int x = 1;
					for (int i = 1; i <= w; i++) {
						x = x * i;
					}
					sonuc.setText(Integer.toString(x));
				}
			});

			teks.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {

					try {

						StringBuffer teksil = new StringBuffer();
						
						String dd;
						
						dd = sonuc.getText();
						teksil.append(dd);
						teksil.deleteCharAt(teksil.length()-1);
						teksil.toString();
						sonString = teksil.toString();
						sonuc.setText(sonString);

						sonString = "";
						dd = "";
						
					}

					catch (Exception e2) {

					}
				}
			});

			sil.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {

					s1 = 0;
					s2 = 0;
					sonucc = 0;
					islem = 0;
					sonuc.setText("");

				}
			});

			ucsıfır.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {

					sonuc.setText(sonuc.getText() + "000");

				}
			});

			ikisıfır.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {

					sonuc.setText(sonuc.getText() + "00");

				}
			});

			nokta.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {

					sonuc.setText(sonuc.getText() + ".");

				}
			});

			bir.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {

					sonuc.setText(sonuc.getText() + "1");

				}
			});

			iki.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {

					sonuc.setText(sonuc.getText() + "2");

				}
			});

			uc.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {

					sonuc.setText(sonuc.getText() + "3");

				}
			});

			dort.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {

					sonuc.setText(sonuc.getText() + "4");

				}
			});

			bes.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {

					sonuc.setText(sonuc.getText() + "5");

				}
			});

			altı.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {

					sonuc.setText(sonuc.getText() + "6");

				}
			});

			yedi.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {

					sonuc.setText(sonuc.getText() + "7");

				}
			});

			sekiz.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {

					sonuc.setText(sonuc.getText() + "8");

				}
			});

			dokuz.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {

					sonuc.setText(sonuc.getText() + "9");

				}
			});

			sıfır.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {

					sonuc.setText(sonuc.getText() + "0");

				}
			});

			esittir.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {

					s2 = Double.parseDouble(sonuc.getText());

					if (islem == 1)
					{

						sonucc = s1 / s2;
						sonuc.setText("");
						s1 = 0;
						s2 = 0;
						sonuc.setText(Double.toString(sonucc));

					} else if (islem == 2) {

						sonucc = s1 * s2;
						sonuc.setText("");
						s1 = 0;
						s2 = 0;
						sonuc.setText(Double.toString(sonucc));

					} else if (islem == 3) {

						sonucc = s1 + s2;
						sonuc.setText("");
						s1 = 0;
						s2 = 0;
						sonuc.setText(Double.toString(sonucc));

					} else if (islem == 4) {
						sonucc = s1 - s2;
						sonuc.setText("");
						s1 = 0;
						s2 = 0;
						sonuc.setText(Double.toString(sonucc));

					} else if (islem == 5) {
						sonucc = s1 * s2 / 100;
						sonuc.setText("");
						s1 = 0;
						s2 = 0;
						sonuc.setText(Double.toString(sonucc));

					} else if (islem == 6) {
						double a;
						a = s1;
						double s = 1;
						double w;
						w = s2;
						
						for (int i = 0; i < w; i++) {
							s = s * a;
						}
						sonuc.setText(Double.toString(s));
					}
					
				 else if (islem == 8) {
					 sonuc.setText(String.valueOf(Math.pow((double) s1 ,(double)(1/s2))));
						}
				}
			});

			bolme.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {

					s1 = Double.parseDouble(sonuc.getText());
					islem = 1;
					sonuc.setText("");

				}
			});

			carp.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {

					s1 = Double.parseDouble(sonuc.getText());
					islem = 2;
					sonuc.setText("");

				}
			});

			topla.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {

					s1 = Double.parseDouble(sonuc.getText());
					islem = 3;
					sonuc.setText("");
				}
			});

			cıkar.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {

					s1 = Double.parseDouble(sonuc.getText());
					islem = 4;
					sonuc.setText("");

				}
			});

			bizimframe.getContentPane().setLayout(new FlowLayout());

			bizimframe.getContentPane().add(sonuc); 
			bizimframe.getContentPane().add(sil);
			bizimframe.getContentPane().add(teks);
			bizimframe.getContentPane().add(yuz);
			bizimframe.getContentPane().add(pi);
			bizimframe.getContentPane().add(fak);
			bizimframe.getContentPane().add(kare);
			bizimframe.getContentPane().add(ustsen);
			bizimframe.getContentPane().add(sin);
			bizimframe.getContentPane().add(cos);
			bizimframe.getContentPane().add(tan);
			bizimframe.getContentPane().add(cot);
			bizimframe.getContentPane().add(LN);
			bizimframe.getContentPane().add(log10);
			bizimframe.getContentPane().add(pisayı);
			bizimframe.getContentPane().add(kokcik);
			bizimframe.getContentPane().add(kokcikustsen);
			bizimframe.getContentPane().add(yedi);
			bizimframe.getContentPane().add(sekiz);
			bizimframe.getContentPane().add(dokuz);
			bizimframe.getContentPane().add(bolme);
			bizimframe.getContentPane().add(dort);
			bizimframe.getContentPane().add(bes);
			bizimframe.getContentPane().add(altı);
			bizimframe.getContentPane().add(carp);
			bizimframe.getContentPane().add(bir);
			bizimframe.getContentPane().add(iki);
			bizimframe.getContentPane().add(uc);
			bizimframe.getContentPane().add(cıkar);
			bizimframe.getContentPane().add(sıfır);
			bizimframe.getContentPane().add(ikisıfır);
			bizimframe.getContentPane().add(nokta);
			bizimframe.getContentPane().add(topla);
			bizimframe.getContentPane().add(ucsıfır);
			bizimframe.getContentPane().add(esittir);
		
			

			bizimframe.setVisible(true);

		} catch (Exception e2) {

			final JPanel panel = new JPanel();
			JOptionPane.showMessageDialog(panel, "Hata Oluştu", "Hata", JOptionPane.ERROR_MESSAGE);
			;
		}
	}

	
}
