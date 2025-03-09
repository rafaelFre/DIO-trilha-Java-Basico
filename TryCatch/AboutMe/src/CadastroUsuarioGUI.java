import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroUsuarioGUI extends JFrame {
    private JTextField campoNome, campoSobrenome, campoIdade, campoAltura;
    private JButton botaoEnviar, botaoLimpar;
    private JTextArea areaResultado;

    public CadastroUsuarioGUI() {
        setTitle("Cadastro de Usuário");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2, 10, 10));

        // Criando os rótulos e campos de entrada
        add(new JLabel("Nome:"));
        campoNome = new JTextField();
        add(campoNome);

        add(new JLabel("Sobrenome:"));
        campoSobrenome = new JTextField();
        add(campoSobrenome);

        add(new JLabel("Idade:"));
        campoIdade = new JTextField();
        add(campoIdade);

        add(new JLabel("Altura (cm):"));
        campoAltura = new JTextField();
        add(campoAltura);

        // Área de exibição do resultado
        areaResultado = new JTextArea();
        areaResultado.setEditable(false);
        add(new JScrollPane(areaResultado));

        // Criando botões
        botaoEnviar = new JButton("Enviar");
        botaoLimpar = new JButton("Limpar");
        add(botaoEnviar);
        add(botaoLimpar);

        // Ação do botão "Enviar"
        botaoEnviar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exibirMensagem();
            }
        });

        // Ação do botão "Limpar"
        botaoLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                limparCampos();
            }
        });

        setVisible(true);
    }

    private void exibirMensagem() {
        String nome = campoNome.getText();
        String sobrenome = campoSobrenome.getText();
        String idade = campoIdade.getText();
        String altura = campoAltura.getText();

        if (nome.isEmpty() || sobrenome.isEmpty() || idade.isEmpty() || altura.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String mensagem = "Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase() + ".\n"
                + "Tenho " + idade + " anos.\n"
                + "Minha altura é: " + altura + " cm.";

        areaResultado.setText(mensagem);
    }

    private void limparCampos() {
        campoNome.setText("");
        campoSobrenome.setText("");
        campoIdade.setText("");
        campoAltura.setText("");
        areaResultado.setText("");
    }

    public static void main(String[] args) {
        new CadastroUsuarioGUI();
    }
}
