/**
 *Universidade Federal do Paraná - UFPR
*Lista 8 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
* 6. (Tarefa 8) Crie uma interface gráfica para o exemplo Livro/Autor. Nesta interface deverá
ser possível:
 Incluir um Autor
 Na tela de inclusão de autor deverá ser possível incluir os livros de sua autoria
que já estão previamente cadastrados.
 Incluir um livro
 Na tela de inclusão de livro deverá ser possível indicar quais são os seus
autores.
 Listar livros em uma tabela. No campo autores, deverão ser concatenados os autores
dos livros e separados por ponto e vírgula.
 Listar livros de um autor
 Listar autores em uma tabela. No campo livros, deve-se concatenar os livros do autor,
separado por ponto e vírgula.
 Use AbstractTableModel para criar suas tabelas.
*/
package lista8andre;


import beans.Autor;
import beans.Livro;
import dao.AutorDAO;
import dao.LivroDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import tabelas.TabelaListarAutores;
import tabelas.TabelaLivros;
import tabelas.TabelaLivrosDeAutor;

/**
 *
 * @author andre.silva
 */
public class TelaPrincipal extends javax.swing.JFrame {
    private TabelaLivros tabelaLivros;
    private TabelaLivrosDeAutor tabelaLiLivrosDeAutor;
    private TabelaListarAutores tabelaListarAutores;
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        tabelaLivros = new TabelaLivros();
        tabelaLiLivrosDeAutor = new TabelaLivrosDeAutor();
        tabelaListarAutores = new TabelaListarAutores();
        initComponents();
        setTitle("Livro Autor");
        lresultadoAutor.setText("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bcadastrarAutor.addActionListener(new BotaoCadastrarAutor());
        lverificaLivros.setText("");
        tlivrosAutor.addKeyListener(new VerificaLivro());
        bcadastrarLivro.addActionListener(new BotaoCadastrarLivro());
        lresultadoLivro.setText("");
        tautoresLivro.addKeyListener(new VerificaAutor());
        lverificaAutor.setText("");
        bListarLivros.addActionListener(new BotaoListarLivroComAutor());
        blistarLivrosDeAutor.addActionListener(new BotaoListarLivrosDeAutor());
        blistarAutores.addActionListener(new BotaoListarAutores());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        lnomeAutor = new javax.swing.JLabel();
        tnomeAutor = new javax.swing.JTextField();
        llivrosAutor = new javax.swing.JLabel();
        tlivrosAutor = new javax.swing.JTextField();
        bcadastrarAutor = new javax.swing.JButton();
        lverificaLivros = new javax.swing.JLabel();
        lresultadoAutor = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        ltituloLivro = new javax.swing.JLabel();
        ttituloLivro = new javax.swing.JTextField();
        lautoresLivro = new javax.swing.JLabel();
        tautoresLivro = new javax.swing.JTextField();
        lverificaAutor = new javax.swing.JLabel();
        bcadastrarLivro = new javax.swing.JButton();
        lresultadoLivro = new javax.swing.JLabel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bListarLivros = new javax.swing.JButton();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        blistarLivrosDeAutor = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        lidListarLivrosDeAutor = new javax.swing.JLabel();
        tidListarLivrosDeAutor = new javax.swing.JTextField();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        blistarAutores = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lnomeAutor.setText("Nome : ");

        tnomeAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnomeAutorActionPerformed(evt);
            }
        });

        llivrosAutor.setText("Livros : ");

        tlivrosAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlivrosAutorActionPerformed(evt);
            }
        });

        bcadastrarAutor.setText("Cadastrar");
        bcadastrarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcadastrarAutorActionPerformed(evt);
            }
        });

        lverificaLivros.setText("Cadastrado");

        lresultadoAutor.setText("Cadastro realizado");

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(lnomeAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tnomeAutor))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(llivrosAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tlivrosAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lverificaLivros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lresultadoAutor)
                    .addComponent(bcadastrarAutor))
                .addContainerGap(471, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnomeAutor)
                    .addComponent(tnomeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(llivrosAutor)
                    .addComponent(tlivrosAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lverificaLivros))
                .addGap(32, 32, 32)
                .addComponent(bcadastrarAutor)
                .addGap(18, 18, 18)
                .addComponent(lresultadoAutor)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jLayeredPane1.setLayer(lnomeAutor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(tnomeAutor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(llivrosAutor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(tlivrosAutor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(bcadastrarAutor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lverificaLivros, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lresultadoAutor, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane1.addTab("Autor", jLayeredPane1);

        ltituloLivro.setText("Titulo : ");

        lautoresLivro.setText("Autores : ");

        lverificaAutor.setText("Cadastrado");

        bcadastrarLivro.setText("Cadastrar");

        lresultadoLivro.setText("Cadastro realizado");

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ltituloLivro)
                            .addComponent(lautoresLivro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ttituloLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(tautoresLivro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lverificaAutor))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lresultadoLivro)
                            .addComponent(bcadastrarLivro))))
                .addContainerGap(322, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ttituloLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ltituloLivro))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lautoresLivro)
                    .addComponent(tautoresLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lverificaAutor))
                .addGap(18, 18, 18)
                .addComponent(bcadastrarLivro)
                .addGap(18, 18, 18)
                .addComponent(lresultadoLivro)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jLayeredPane2.setLayer(ltituloLivro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(ttituloLivro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(lautoresLivro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(tautoresLivro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(lverificaAutor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(bcadastrarLivro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(lresultadoLivro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane1.addTab("Livro", jLayeredPane2);

        jTable1.setModel(tabelaLivros);
        jScrollPane1.setViewportView(jTable1);

        bListarLivros.setText("Listar livros");
        bListarLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListarLivrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bListarLivros)
                .addGap(211, 211, 211))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(bListarLivros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jLayeredPane3.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(bListarLivros, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane1.addTab("Listar livros", jLayeredPane3);

        blistarLivrosDeAutor.setText("Listar");

        jTable2.setModel(tabelaLiLivrosDeAutor);
        jScrollPane2.setViewportView(jTable2);

        lidListarLivrosDeAutor.setText("ID : ");

        tidListarLivrosDeAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tidListarLivrosDeAutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane4Layout.createSequentialGroup()
                        .addComponent(lidListarLivrosDeAutor)
                        .addGap(18, 18, 18)
                        .addComponent(tidListarLivrosDeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(blistarLivrosDeAutor)
                        .addGap(165, 165, 165))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blistarLivrosDeAutor)
                    .addComponent(lidListarLivrosDeAutor)
                    .addComponent(tidListarLivrosDeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jLayeredPane4.setLayer(blistarLivrosDeAutor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(lidListarLivrosDeAutor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(tidListarLivrosDeAutor, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane1.addTab("Listar Livros de um autor", jLayeredPane4);

        blistarAutores.setText("Listar Autores");
        blistarAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blistarAutoresActionPerformed(evt);
            }
        });

        jTable3.setModel(tabelaListarAutores);
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jLayeredPane5Layout = new javax.swing.GroupLayout(jLayeredPane5);
        jLayeredPane5.setLayout(jLayeredPane5Layout);
        jLayeredPane5Layout.setHorizontalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane5Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(blistarAutores)
                .addContainerGap(386, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jLayeredPane5Layout.setVerticalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(blistarAutores)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );
        jLayeredPane5.setLayer(blistarAutores, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane1.addTab("Listar Autores", jLayeredPane5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tnomeAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnomeAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnomeAutorActionPerformed

    private void tlivrosAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlivrosAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tlivrosAutorActionPerformed

    private void bcadastrarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcadastrarAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bcadastrarAutorActionPerformed

    private void bListarLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListarLivrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bListarLivrosActionPerformed

    private void tidListarLivrosDeAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tidListarLivrosDeAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tidListarLivrosDeAutorActionPerformed

    private void blistarAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blistarAutoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blistarAutoresActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    
    class BotaoCadastrarAutor implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String nome = tnomeAutor.getText();
            String[] livros = tlivrosAutor.getText().split(",");
            try {
                Autor autor = new Autor(nome);
                AutorDAO autorDAO = new AutorDAO();
                if(livros[0].equals("") == false){
                    int c = 0;
                    while(c < livros.length){
                        Livro livro = new Livro();
                        livro.setId(Integer.parseInt(livros[c]));
                        autor.adicionarLivro(livro);
                        c++;
                    }
                }
                autorDAO.inserirAutor(autor);
                lresultadoAutor.setText("Cadastro realizado");
                tnomeAutor.setText("");
                tlivrosAutor.setText("");
                lverificaLivros.setText("");
            } catch (Exception exc) {
                lresultadoAutor.setText("Erro !!!");
                System.out.println("Erro Classe : TelaPrincipal\nBotao : CadastrarAutor");
            }
        }
    }
    
    class VerificaLivro implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void keyPressed(KeyEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void keyReleased(KeyEvent e) {
            String[] livros = tlivrosAutor.getText().split(",");
            LivroDAO livroDAO = new LivroDAO();
            boolean existe;
            try {
                existe = livroDAO.verificaIdLivro(Integer.parseInt(livros[livros.length - 1]));
                if(existe == true){
                    lverificaLivros.setText("Livro Cadastrado");
                }else{
                    lverificaLivros.setText("Livro não Cadastrado !");
                }
            } catch (SQLException ex) {    
                throw new RuntimeException();
            }
        } 
    }
    
    
   class BotaoCadastrarLivro implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String titulo = ttituloLivro.getText();
            String[] autores = tautoresLivro.getText().split(",");
            try {                
                Livro livro = new Livro(titulo);
                LivroDAO livroDAO = new LivroDAO();
                if(autores[0].equals("") == false){
                    int c = 0;
                    while(c < autores.length){
                        Autor autor = new Autor();
                        autor.setId(Integer.parseInt(autores[c]));
                        livro.adicionarAutor(autor);
                        c++;
                    }
                    System.out.println(livro.getAutores().size());
                }
                livroDAO.inserirLivro(livro);
                lresultadoLivro.setText("Cadastro realizado");
                ttituloLivro.setText("");
                tautoresLivro.setText("");
                lverificaAutor.setText("");
                } catch (Exception exc) {
                    lresultadoLivro.setText("Erro !!!");
                    System.out.println("Erro no botao cadastrar livro");
            }
        }
   }
    
   class VerificaAutor implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void keyPressed(KeyEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void keyReleased(KeyEvent e) {
            String[] autores = tautoresLivro.getText().split(",");
            AutorDAO autorDAO = new AutorDAO();
            boolean existe;
            try {
                existe = autorDAO.verificaAutor(Integer.parseInt(autores[autores.length - 1]));
                if(existe == true){
                    lverificaAutor.setText("Autor Cadastrado");
                }else{
                    lverificaAutor.setText("Autor não Cadastrado");
                }
            } catch (Exception exc) {
                System.out.println("Erro na classe VerificaAutor");
            }
        }
   } 
   
   class BotaoListarLivroComAutor implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                LivroDAO livroDAO = new LivroDAO();
                tabelaLivros.setLinhas(livroDAO.listarLivroComAutores());
            } catch (Exception exc) {
                System.out.println("Erro na listagem Livro com autores");
            }
        }
   }
   
   class BotaoListarLivrosDeAutor implements ActionListener{
       @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int idAutor = Integer.parseInt(tidListarLivrosDeAutor.getText());
                LivroDAO livroDAO = new LivroDAO();
                tabelaLiLivrosDeAutor.setLinhas(livroDAO.listaLivrosDeAutor(idAutor));
            } catch (Exception exc) {
                System.out.println("Erro na listagem de livro de autor");
            }
        }
    }
   
    class BotaoListarAutores implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                AutorDAO autorDAO = new AutorDAO();
                tabelaListarAutores.setLinhas(autorDAO.listarAutoresComLivro());
            } catch (Exception exc) {
                System.out.println("Erro na listagem de livro de autor");
            }
        } 
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bListarLivros;
    private javax.swing.JButton bcadastrarAutor;
    private javax.swing.JButton bcadastrarLivro;
    private javax.swing.JButton blistarAutores;
    private javax.swing.JButton blistarLivrosDeAutor;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lautoresLivro;
    private javax.swing.JLabel lidListarLivrosDeAutor;
    private javax.swing.JLabel llivrosAutor;
    private javax.swing.JLabel lnomeAutor;
    private javax.swing.JLabel lresultadoAutor;
    private javax.swing.JLabel lresultadoLivro;
    private javax.swing.JLabel ltituloLivro;
    private javax.swing.JLabel lverificaAutor;
    private javax.swing.JLabel lverificaLivros;
    private javax.swing.JTextField tautoresLivro;
    private javax.swing.JTextField tidListarLivrosDeAutor;
    private javax.swing.JTextField tlivrosAutor;
    private javax.swing.JTextField tnomeAutor;
    private javax.swing.JTextField ttituloLivro;
    // End of variables declaration//GEN-END:variables
}
