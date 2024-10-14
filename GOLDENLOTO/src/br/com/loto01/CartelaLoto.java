package br.com.loto01;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import util.ValoresAposta;
import javax.swing.border.MatteBorder;
import java.awt.Color;

//--------------------------------------

//-----------------------------------------

public class CartelaLoto extends JFrame {

	
	public int cont = 0;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel lblMoeda = new JLabel("Valor da Aposta: R$");
	ValoresAposta valores = new ValoresAposta(); //INSTANCIANDO OBJETO EM MEMORIA

	
	public void verificaPreco(int x) {

		String[] precos = {
				valores.quinze.toString(),
	            valores.desseseis.toString(),
	            valores.dessete.toString(),
	            valores.dezoito.toString(),
	            valores.desenove.toString(),
	            valores.vinte.toString()
	        };
		
		if (x < 15) {
            lblMoeda.setText("Valor da Aposta: R$ 0.00");
        } else if (x <= 20) {
            lblMoeda.setText("Valor da Aposta: R$ " + precos[x - 15]);
        }
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CartelaLoto frame = new CartelaLoto();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	public CartelaLoto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(435, -37, 824, 588);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JCheckBox num1 = new JCheckBox("01");
		num1.setBounds(250, 60, 40, 20);
		contentPane.add(num1);

		JCheckBox num2 = new JCheckBox("02");
		num2.setBounds(300, 60, 40, 20);
		contentPane.add(num2);

		JCheckBox num3 = new JCheckBox("03");
		num3.setBounds(350, 60, 40, 20);
		contentPane.add(num3);

		JCheckBox num4 = new JCheckBox("04");
		num4.setBounds(400, 60, 40, 20);
		contentPane.add(num4);

		JCheckBox num5 = new JCheckBox("05");
		num5.setBounds(450, 60, 40, 20);
		contentPane.add(num5);

		JCheckBox num6 = new JCheckBox("06");
		num6.setBounds(250, 100, 40, 20);
		contentPane.add(num6);

		JCheckBox num7 = new JCheckBox("07");
		num7.setBounds(300, 100, 40, 20);
		contentPane.add(num7);

		JCheckBox num8 = new JCheckBox("08");
		num8.setBounds(350, 100, 40, 20);
		contentPane.add(num8);

		JCheckBox num9 = new JCheckBox("09");
		num9.setBounds(400, 100, 40, 20);
		contentPane.add(num9);

		JCheckBox num10 = new JCheckBox("10");
		num10.setBounds(450, 100, 40, 20);
		contentPane.add(num10);

		JCheckBox num11 = new JCheckBox("11");
		num11.setBounds(250, 140, 40, 20);
		contentPane.add(num11);

		JCheckBox num12 = new JCheckBox("12");
		num12.setBounds(300, 140, 40, 20);
		contentPane.add(num12);

		JCheckBox num13 = new JCheckBox("13");
		num13.setBounds(350, 140, 40, 20);
		contentPane.add(num13);

		JCheckBox num14 = new JCheckBox("14");
		num14.setBounds(400, 140, 40, 20);
		contentPane.add(num14);

		JCheckBox num15 = new JCheckBox("15");
		num15.setBounds(450, 140, 40, 20);
		contentPane.add(num15);

		JCheckBox num16 = new JCheckBox("16");
		num16.setBounds(250, 180, 40, 20);
		contentPane.add(num16);

		JCheckBox num17 = new JCheckBox("17");
		num17.setBounds(300, 180, 40, 20);
		contentPane.add(num17);

		JCheckBox num18 = new JCheckBox("18");
		num18.setBounds(350, 180, 40, 20);
		contentPane.add(num18);

		JCheckBox num19 = new JCheckBox("19");
		num19.setBounds(400, 180, 40, 20);
		contentPane.add(num19);

		JCheckBox num20 = new JCheckBox("20");
		num20.setBounds(450, 180, 40, 20);
		contentPane.add(num20);

		JCheckBox num21 = new JCheckBox("21");
		num21.setBounds(250, 220, 40, 20);
		contentPane.add(num21);

		JCheckBox num22 = new JCheckBox("22");
		num22.setBounds(300, 220, 40, 20);
		contentPane.add(num22);

		JCheckBox num23 = new JCheckBox("23");
		num23.setBounds(350, 220, 40, 20);
		contentPane.add(num23);

		JCheckBox num24 = new JCheckBox("24");
		num24.setBounds(400, 220, 40, 20);
		contentPane.add(num24);

		JCheckBox num25 = new JCheckBox("25");
		num25.setBounds(450, 220, 40, 20);
		contentPane.add(num25);

		JLabel LabNumeros = new JLabel("0");
		LabNumeros.setBounds(198, 422, 341, 26);
		contentPane.add(LabNumeros);

		// JLabel lblMoeda = new JLabel("R$");
		lblMoeda.setBounds(255, 293, 196, 13);
		contentPane.add(lblMoeda);

		JLabel lblContador = new JLabel("0");
		lblContador.setBounds(489, 339, 182, 13);
		contentPane.add(lblContador);
		
		JButton btnSalvar = new JButton("Salvar aposta");
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSalvar.setBounds(255, 327, 130, 34);
		contentPane.add(btnSalvar);

		// --------------------------------------------------------------------------------------------------------

		List<Integer> coletor = new ArrayList<>();
		RegistraAposta aposta = new RegistraAposta();
		
		
		num1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (num1.isSelected()) {
					coletor.add(1);
					cont++;
				} else {

					coletor.remove(Integer.valueOf(1));
					cont--;
				}
				aposta.setNumerosEscolhidos(coletor);
				aposta.recuperaValorApostado();
				LabNumeros.setText(coletor.toString());
				lblContador.setText(Integer.toString(cont));

				verificaPreco(cont);
			}

		});

		num2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (num2.isSelected()) {
					coletor.add(2);
					cont++;
				} else {

					coletor.remove(Integer.valueOf(2));
					cont--;
				}
				aposta.setNumerosEscolhidos(coletor);
				aposta.recuperaValorApostado();
				LabNumeros.setText(coletor.toString());
				lblContador.setText(Integer.toString(cont));
				verificaPreco(cont);

			}

		});

		num3.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (num3.isSelected()) {
					coletor.add(3);
					cont++;
				} else {

					coletor.remove(Integer.valueOf(3));
					cont--;
				}
				aposta.setNumerosEscolhidos(coletor);
				aposta.recuperaValorApostado();
				LabNumeros.setText(coletor.toString());
				lblContador.setText(Integer.toString(cont));
				verificaPreco(cont);

			}

		});

		num4.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (num4.isSelected()) {
					coletor.add(4);
					cont++;
				} else {

					coletor.remove(Integer.valueOf(4));
					cont--;

				}
				aposta.setNumerosEscolhidos(coletor);
				aposta.recuperaValorApostado();
				LabNumeros.setText(coletor.toString());
				lblContador.setText(Integer.toString(cont));
				verificaPreco(cont);

			}

		});

		num5.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (num5.isSelected()) {
					coletor.add(5);
					cont++;

				} else {

					coletor.remove(Integer.valueOf(5));
					cont--;

				}
				aposta.setNumerosEscolhidos(coletor);
				aposta.recuperaValorApostado();
				LabNumeros.setText(coletor.toString());
				lblContador.setText(Integer.toString(cont));
				verificaPreco(cont);

			}

		});

		num6.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (num6.isSelected()) {
					coletor.add(6);
					cont++;
				} else {

					coletor.remove(Integer.valueOf(6));
					cont--;
				}
				aposta.setNumerosEscolhidos(coletor);
				aposta.recuperaValorApostado();
				LabNumeros.setText(coletor.toString());
				lblContador.setText(Integer.toString(cont));
				verificaPreco(cont);

			}

		});

		num7.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (num7.isSelected()) {
					coletor.add(7);
					cont++;
				} else {

					coletor.remove(Integer.valueOf(7));
					cont--;
				}
				aposta.setNumerosEscolhidos(coletor);
				aposta.recuperaValorApostado();
				LabNumeros.setText(coletor.toString());
				lblContador.setText(Integer.toString(cont));
				verificaPreco(cont);

			}

		});

		num8.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (num8.isSelected()) {
					coletor.add(8);
					cont++;
				} else {

					coletor.remove(Integer.valueOf(8));
					cont--;
				}
				aposta.setNumerosEscolhidos(coletor);
				aposta.recuperaValorApostado();
				LabNumeros.setText(coletor.toString());
				lblContador.setText(Integer.toString(cont));
				verificaPreco(cont);

			}

		});
		num9.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (num9.isSelected()) {
					coletor.add(9);
					cont++;
				} else {

					coletor.remove(Integer.valueOf(9));
					cont--;
				}
				aposta.setNumerosEscolhidos(coletor);
				aposta.recuperaValorApostado();
				LabNumeros.setText(coletor.toString());
				lblContador.setText(Integer.toString(cont));
				verificaPreco(cont);

			}

		});

		num10.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (num10.isSelected()) {
					coletor.add(10);
					cont++;
				} else {

					coletor.remove(Integer.valueOf(10));
					cont--;
				}
				aposta.setNumerosEscolhidos(coletor);
				aposta.recuperaValorApostado();
				LabNumeros.setText(coletor.toString());
				lblContador.setText(Integer.toString(cont));
				verificaPreco(cont);

			}

		});

		num11.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (num11.isSelected()) {
					coletor.add(11);
					cont++;
				} else {

					coletor.remove(Integer.valueOf(11));
					cont--;
				}
				aposta.setNumerosEscolhidos(coletor);
				aposta.recuperaValorApostado();
				LabNumeros.setText(coletor.toString());
				lblContador.setText(Integer.toString(cont));
				verificaPreco(cont);

			}

		});

		num12.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (num12.isSelected()) {
					coletor.add(12);
					cont++;
				} else {

					coletor.remove(Integer.valueOf(12));
					cont--;
				}
				aposta.setNumerosEscolhidos(coletor);
				aposta.recuperaValorApostado();
				LabNumeros.setText(coletor.toString());
				lblContador.setText(Integer.toString(cont));
				verificaPreco(cont);

			}

		});

		num13.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (num13.isSelected()) {
					coletor.add(13);
					cont++;
				} else {

					coletor.remove(Integer.valueOf(13));
					cont++;
				}
				aposta.setNumerosEscolhidos(coletor);
				aposta.recuperaValorApostado();
				LabNumeros.setText(coletor.toString());
				lblContador.setText(Integer.toString(cont));
				verificaPreco(cont);

			}

		});

		num14.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (num14.isSelected()) {
					coletor.add(14);
					cont++;
				} else {

					coletor.remove(Integer.valueOf(14));
					cont--;
				}
				aposta.setNumerosEscolhidos(coletor);
				aposta.recuperaValorApostado();
				LabNumeros.setText(coletor.toString());
				lblContador.setText(Integer.toString(cont));
				verificaPreco(cont);

			}

		});

		num15.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (num15.isSelected()) {
					coletor.add(15);
					cont++;
				} else {

					coletor.remove(Integer.valueOf(15));
					cont--;
				}
				aposta.setNumerosEscolhidos(coletor);
				aposta.recuperaValorApostado();
				LabNumeros.setText(coletor.toString());
				lblContador.setText(Integer.toString(cont));
				verificaPreco(cont);

			}

		});

		num16.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (num16.isSelected()) {
					coletor.add(16);
					cont++;

				} else {

					coletor.remove(Integer.valueOf(16));
					cont--;
				}
				aposta.setNumerosEscolhidos(coletor);
				aposta.recuperaValorApostado();
				LabNumeros.setText(coletor.toString());
				lblContador.setText(Integer.toString(cont));
				verificaPreco(cont);

			}

		});

		num17.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (num17.isSelected()) {
					coletor.add(17);
					cont++;
				} else {

					coletor.remove(Integer.valueOf(17));
					cont--;
				}
				aposta.setNumerosEscolhidos(coletor);
				aposta.recuperaValorApostado();
				LabNumeros.setText(coletor.toString());
				lblContador.setText(Integer.toString(cont));
				verificaPreco(cont);

			}

		});

		num18.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (num18.isSelected()) {
					coletor.add(18);
					cont++;
				} else {

					coletor.remove(Integer.valueOf(18));
					cont--;
				}
				aposta.setNumerosEscolhidos(coletor);
				aposta.recuperaValorApostado();
				LabNumeros.setText(coletor.toString());
				lblContador.setText(Integer.toString(cont));
				verificaPreco(cont);

			}

		});

		num19.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (num19.isSelected()) {
					coletor.add(19);
					cont++;
				} else {

					coletor.remove(Integer.valueOf(19));
					cont--;
				}
				aposta.setNumerosEscolhidos(coletor);
				aposta.recuperaValorApostado();
				LabNumeros.setText(coletor.toString());
				lblContador.setText(Integer.toString(cont));
				verificaPreco(cont);

			}

		});

		num20.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (num20.isSelected()) {
					coletor.add(20);
					cont++;
				} else {

					coletor.remove(Integer.valueOf(20));
					cont--;
				}
				aposta.setNumerosEscolhidos(coletor);
				aposta.recuperaValorApostado();
				LabNumeros.setText(coletor.toString());
				lblContador.setText(Integer.toString(cont));
				verificaPreco(cont);

			}

		});

		num21.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (num21.isSelected()) {
					coletor.add(21);
					cont++;
				} else {

					coletor.remove(Integer.valueOf(21));
					cont--;
				}
				aposta.setNumerosEscolhidos(coletor);
				aposta.recuperaValorApostado();
				LabNumeros.setText(coletor.toString());
				lblContador.setText(Integer.toString(cont));
				verificaPreco(cont);

			}

		});

		num22.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (num22.isSelected()) {
					coletor.add(22);
					cont++;
				} else {

					coletor.remove(Integer.valueOf(22));
					cont--;
				}
				aposta.setNumerosEscolhidos(coletor);
				aposta.recuperaValorApostado();
				LabNumeros.setText(coletor.toString());
				lblContador.setText(Integer.toString(cont));
				verificaPreco(cont);

			}

		});

		num23.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (num23.isSelected()) {
					coletor.add(23);
					cont++;
				} else {

					coletor.remove(Integer.valueOf(23));
					cont--;
				}
				aposta.setNumerosEscolhidos(coletor);
				aposta.recuperaValorApostado();
				LabNumeros.setText(coletor.toString());
				lblContador.setText(Integer.toString(cont));
				verificaPreco(cont);

			}

		});

		num24.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (num24.isSelected()) {
					coletor.add(24);
					cont++;
				} else {

					coletor.remove(Integer.valueOf(24));
					cont--;
				}
				aposta.setNumerosEscolhidos(coletor);
				aposta.recuperaValorApostado();
				LabNumeros.setText(coletor.toString());
				lblContador.setText(Integer.toString(cont));
				verificaPreco(cont);

			}

		});

		num25.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (num25.isSelected()) {
					coletor.add(25);
					cont++;
				} else {

					coletor.remove(Integer.valueOf(25));
					cont--;
				}
				aposta.setNumerosEscolhidos(coletor);
				aposta.recuperaValorApostado();
				LabNumeros.setText(coletor.toString());
				lblContador.setText(Integer.toString(cont));
				verificaPreco(cont);

			}

		});
		
		//--------------------------------------------------------------------------saivin notepad
		
	
		btnSalvar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try (BufferedWriter writer = new BufferedWriter( new FileWriter("saida.txt", true))){
					writer.write("Apostador: João da Silva concurso 241112");
					writer.newLine();
					writer.write("Endereço: Rua Manuel Ribas 381");
					writer.newLine();
					writer.write("Aposta: "+coletor.toString());
					writer.newLine();
					System.out.println("Aposta gravada com sucesso!");
				}catch(IOException ex) {
					ex.printStackTrace();
				}
			}
		});
		//----------------------------------------------------------------------------------
		
		

	}
}





















