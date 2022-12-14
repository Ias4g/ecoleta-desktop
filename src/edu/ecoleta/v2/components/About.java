package edu.ecoleta.v2.components;

import br.com.ecoleta.alert.Alert;
import br.com.ecoleta.scrollCustom.ScrollBarCustomUI;
import br.com.ecoleta.types.AlertType;
import edu.ecoleta.v2.services.Utils;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class About extends javax.swing.JDialog {

    private final JFrame frm;
    private Animator animator;
    private Glass glass;
    private boolean show;
    private MessageType messageType = MessageType.CANCEL;

    public About(JFrame frm) {
        super(frm, true);
        this.frm = frm;
        initComponents();
        init();

        jspMain.getVerticalScrollBar().setUI(new ScrollBarCustomUI());
        jspLicence.getVerticalScrollBar().setUI(new ScrollBarCustomUI());
    }

    private void init() {
        setBackground(new Color(0, 0, 0, 0));
        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                closeMessage();
            }

        });

        animator = new Animator(350, new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                float f = show ? fraction : 1f - fraction;
                glass.setAlpha(f - f * 0.2f);
                setOpacity(f);
            }

            @Override
            public void end() {
                if (show == false) {
                    dispose();
                    glass.setVisible(false);
                }
            }

        });

        animator.setResolution(0);
        animator.setAcceleration(.5f);
        animator.setDeceleration(.5f);
        setOpacity(0f);
        glass = new Glass();
    }

    private void startAnimator(boolean show) {
        if (animator.isRunning()) {
            float f = animator.getTimingFraction();
            animator.stop();
            animator.setStartFraction(1f - f);
        } else {
            animator.setStartFraction(0f);
        }

        this.show = show;
        animator.start();
    }

    public void showMessage() {
        frm.setGlassPane(glass);
        glass.setVisible(true);
//        jtaMessage.setText(message);
        setLocationRelativeTo(frm);
        startAnimator(true);
        setVisible(true);
    }

    public void closeMessage() {
        startAnimator(false);
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background1 = new edu.ecoleta.v2.components.AboutBackground();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jspMain = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextArea3 = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lblDeise = new javax.swing.JLabel();
        lblGabriel = new javax.swing.JLabel();
        lblHeberson = new javax.swing.JLabel();
        lblIzael = new javax.swing.JLabel();
        lblVitor = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        lblMySQL = new javax.swing.JLabel();
        lblAtxy2k = new javax.swing.JLabel();
        lblDom4j = new javax.swing.JLabel();
        lblGson = new javax.swing.JLabel();
        lblHttpClient = new javax.swing.JLabel();
        lblEclipse = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        lblViaCep = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jspLicence = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        btnClose = new edu.ecoleta.v2.components.JButtonDefault();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 401));
        setUndecorated(true);
        getContentPane().setLayout(null);

        background1.setMaximumSize(new java.awt.Dimension(600, 401));
        background1.setMinimumSize(new java.awt.Dimension(600, 401));
        background1.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/logo-icon-blue.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(16, 21, 74, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/GNU.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(552, 16, 32, 32);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Termos Condi????es e Licen??a");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 600, 64);

        jSeparator1.setBackground(new java.awt.Color(207, 207, 207));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 62, 600, 2);

        background1.add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 64);

        jspMain.setBackground(new java.awt.Color(255, 255, 255));
        jspMain.setBorder(null);
        jspMain.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jspMain.setMaximumSize(new java.awt.Dimension(600, 273));
        jspMain.setMinimumSize(new java.awt.Dimension(600, 273));
        jspMain.setPreferredSize(new java.awt.Dimension(600, 273));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(600, 2020));
        jPanel3.setMinimumSize(new java.awt.Dimension(600, 2020));
        jPanel3.setPreferredSize(new java.awt.Dimension(600, 2020));
        jPanel3.setLayout(null);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMaximumSize(new java.awt.Dimension(568, 210));
        jPanel6.setMinimumSize(new java.awt.Dimension(568, 210));
        jPanel6.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel11.setText("SOBRE");
        jPanel6.add(jLabel11);
        jLabel11.setBounds(0, 0, 568, 30);

        jTextArea3.setEditable(false);
        jTextArea3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextArea3.setLineWrap(true);
        jTextArea3.setTabSize(0);
        jTextArea3.setText("ECOLETA DESKTOP ?? uma aplica????o desenvolvida durante o segundo semestre do curso de CI??NCIA DA COMPUTA????O na UNIVERSIDADE NOVE DE JULHO (UNINOVE), como trabalho de conclus??o de semestre. A ideia deste projeto ?? divulgar ponto de coletas de res??duos, como bat??rias, ??leo entre outros. Limitado somenta ?? gest??o e manuten????o do ponto, como cadastrar, deletar, alterar. Como o objetivo do trabalho ?? o CRUD - CREATE, READ, UPDATE E DELETE no banco de dados, limitamos a isso, mas nada impede que n??s desenvolvemos posteriormente uma aplica????o web para listar e procurar pontos pertos de voc??.");
        jTextArea3.setWrapStyleWord(true);
        jTextArea3.setBorder(null);
        jTextArea3.setCaretPosition(0);
        jPanel6.add(jTextArea3);
        jTextArea3.setBounds(0, 48, 568, 180);

        jPanel3.add(jPanel6);
        jPanel6.setBounds(16, 16, 568, 230);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel12.setText("DESENVOLVEDORES");
        jPanel7.add(jLabel12);
        jLabel12.setBounds(0, 0, 568, 30);

        lblDeise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/deyzy.png"))); // NOI18N
        lblDeise.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDeise.setName("https://github.com/deyzy"); // NOI18N
        lblDeise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDeiseMouseClicked(evt);
            }
        });
        jPanel7.add(lblDeise);
        lblDeise.setBounds(0, 48, 568, 96);

        lblGabriel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/ratasba.png"))); // NOI18N
        lblGabriel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGabriel.setName("https://github.com/ratasba"); // NOI18N
        lblGabriel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGabrielMouseClicked(evt);
            }
        });
        jPanel7.add(lblGabriel);
        lblGabriel.setBounds(0, 148, 568, 96);

        lblHeberson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/bielhgsr.png"))); // NOI18N
        lblHeberson.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHeberson.setName("https://github.com/bielhgsr"); // NOI18N
        lblHeberson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHebersonMouseClicked(evt);
            }
        });
        jPanel7.add(lblHeberson);
        lblHeberson.setBounds(0, 248, 568, 96);

        lblIzael.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/ias4g.png"))); // NOI18N
        lblIzael.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIzael.setName("https://github.com/ias4g"); // NOI18N
        lblIzael.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIzaelMouseClicked(evt);
            }
        });
        jPanel7.add(lblIzael);
        lblIzael.setBounds(0, 348, 568, 96);

        lblVitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/vitorguim2.png"))); // NOI18N
        lblVitor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVitor.setName("https://github.com/vitorguim2"); // NOI18N
        lblVitor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVitorMouseClicked(evt);
            }
        });
        jPanel7.add(lblVitor);
        lblVitor.setBounds(0, 448, 568, 96);

        jPanel3.add(jPanel7);
        jPanel7.setBounds(16, 258, 568, 550);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(null);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel18.setText("BIBLIOTECAS UTILIZADAS");
        jPanel8.add(jLabel18);
        jLabel18.setBounds(0, 0, 568, 30);

        lblMySQL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/mysql.png"))); // NOI18N
        lblMySQL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMySQL.setName("https://www.mysql.com/products/connector/"); // NOI18N
        lblMySQL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMySQLMouseClicked(evt);
            }
        });
        jPanel8.add(lblMySQL);
        lblMySQL.setBounds(0, 48, 568, 96);

        lblAtxy2k.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/atxy2k.png"))); // NOI18N
        lblAtxy2k.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAtxy2k.setName("http://atxy2k.github.io/RestrictedTextField/"); // NOI18N
        lblAtxy2k.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAtxy2kMouseClicked(evt);
            }
        });
        jPanel8.add(lblAtxy2k);
        lblAtxy2k.setBounds(0, 148, 568, 96);

        lblDom4j.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/dom4j.png"))); // NOI18N
        lblDom4j.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDom4j.setName("https://dom4j.github.io/"); // NOI18N
        lblDom4j.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDom4jMouseClicked(evt);
            }
        });
        jPanel8.add(lblDom4j);
        lblDom4j.setBounds(0, 248, 568, 96);

        lblGson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/gson.png"))); // NOI18N
        lblGson.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGson.setName("https://github.com/google/gson"); // NOI18N
        lblGson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGsonMouseClicked(evt);
            }
        });
        jPanel8.add(lblGson);
        lblGson.setBounds(0, 348, 568, 96);

        lblHttpClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/httpclient.png"))); // NOI18N
        lblHttpClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHttpClient.setName("https://hc.apache.org/httpcomponents-client-4.5.x/"); // NOI18N
        lblHttpClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHttpClientMouseClicked(evt);
            }
        });
        jPanel8.add(lblHttpClient);
        lblHttpClient.setBounds(0, 448, 568, 96);

        lblEclipse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/eclipse.png"))); // NOI18N
        lblEclipse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEclipse.setName("https://adoptopenjdk.net/"); // NOI18N
        lblEclipse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEclipseMouseClicked(evt);
            }
        });
        jPanel8.add(lblEclipse);
        lblEclipse.setBounds(0, 548, 568, 96);

        jPanel3.add(jPanel8);
        jPanel8.setBounds(16, 858, 568, 650);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(null);

        jLabel26.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel26.setText("WEBSERVICES");
        jPanel9.add(jLabel26);
        jLabel26.setBounds(0, 0, 568, 30);

        lblViaCep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/viacep.png"))); // NOI18N
        lblViaCep.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblViaCep.setName("https://viacep.com.br/"); // NOI18N
        lblViaCep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViaCepMouseClicked(evt);
            }
        });
        jPanel9.add(lblViaCep);
        lblViaCep.setBounds(0, 48, 568, 97);

        jPanel3.add(jPanel9);
        jPanel9.setBounds(16, 1550, 568, 150);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jLabel25.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel25.setText("GNU LICEN??A");
        jPanel4.add(jLabel25);
        jLabel25.setBounds(0, 0, 568, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/GNU.png"))); // NOI18N
        jPanel4.add(jLabel4);
        jLabel4.setBounds(536, 0, 32, 32);

        jspLicence.setBorder(null);

        jTextArea1.setEditable(false);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setTabSize(0);
        jTextArea1.setText("LICEN??A P??BLICA GERAL GNU - Vers??o 3, 29 de junho de 2007\n\n Copyright (C) 2007 Free Software Foundation, Inc. <https://fsf.org/>\n Todos est??o autorizados a copiar e distribuir c??pias literais\n deste documento de licen??a, mas n??o ?? permitido alter??-lo.\n\n                            Pre??mbulo\n\n  A GNU General Public License ?? uma licen??a copyleft gratuita para\nsoftware e outros tipos de trabalhos.\n\n  As licen??as para a maioria dos softwares e outros trabalhos pr??ticos s??o\npara tirar sua liberdade de compartilhar e mudar as obras. Por contraste,\na GNU General Public License destina-se a garantir sua liberdade de\ncompartilhar e alterar todas as vers??es de um programa - para garantir que ele permane??a livre\nsoftware para todos os seus usu??rios. N??s, a Free Software Foundation, usamos o\nLicen??a P??blica Geral GNU para a maioria de nossos softwares; aplica-se tamb??m a\nqualquer outro trabalho lan??ado desta forma por seus autores. Voc?? pode aplic??-lo para\nseus programas tamb??m.\n\n  Quando falamos de software livre, estamos nos referindo ?? liberdade, n??o\npre??o. Nossas Licen??as P??blicas Gerais s??o projetadas para garantir que voc??\nt??m a liberdade de distribuir c??pias de software livre (e cobrar por\nse desejar), que voc?? recebe o c??digo-fonte ou pode obt??-lo se\nquiser, que voc?? pode alterar o software ou usar partes dele em novos\nprogramas gratuitos, e que voc?? sabe que pode fazer essas coisas.\n\n  Para proteger seus direitos, precisamos impedir que outros neguem a voc??\nesses direitos ou pedindo que voc?? abra m??o dos direitos. Portanto, voc?? tem\ncertas responsabilidades se voc?? distribuir c??pias do software ou se\nvoc?? o modifica: responsabilidades de respeitar a liberdade dos outros.\n\n  Por exemplo, se voc?? distribuir c??pias de tal programa, seja\ngratuitamente ou mediante pagamento de uma taxa, voc?? deve repassar aos destinat??rios o mesmo\nliberdades que voc?? recebeu. Voc?? deve certificar-se de que eles tamb??m recebam\nou pode obter o c??digo-fonte. E voc?? deve mostrar a eles esses termos para que eles\nconhecer seus direitos.\n\n  Os desenvolvedores que usam a GNU GPL protegem seus direitos com duas etapas:\n(1) reivindicar direitos autorais sobre o software e (2) oferecer a voc?? esta Licen??a\ndando a voc?? permiss??o legal para copi??-lo, distribu??-lo e/ou modific??-lo.\n\n  Para a prote????o dos desenvolvedores e autores, a GPL explica claramente\nque n??o h?? garantia para este software livre. Tanto para usu??rios quanto para\npelos autores, a GPL exige que as vers??es modificadas sejam marcadas como\nalterados, para que seus problemas n??o sejam atribu??dos erroneamente a\nautores de vers??es anteriores.\n\n  Alguns dispositivos s??o projetados para negar aos usu??rios o acesso para instalar ou executar\nvers??es modificadas do software dentro deles, embora o fabricante\npode faz??-lo. Isso ?? fundamentalmente incompat??vel com o objetivo de\nprotegendo a liberdade dos usu??rios de alterar o software. A sistem??tica\npadr??o de tal abuso ocorre na ??rea de produtos para indiv??duos\nutiliza????o, que ?? precisamente onde ?? mais inaceit??vel. Portanto, n??s\nprojetaram esta vers??o da GPL para proibir a pr??tica para aqueles\nprodutos. Se tais problemas surgirem substancialmente em outros dom??nios, n??s\nestamos prontos para estender esta provis??o a esses dom??nios em vers??es futuras\nda GPL, conforme necess??rio para proteger a liberdade dos usu??rios.\n\n  Finalmente, todo programa ?? constantemente amea??ado por patentes de software.\nOs Estados n??o devem permitir que as patentes restrinjam o desenvolvimento e uso de\nsoftware em computadores de uso geral, mas naqueles que o fazem, desejamos\nevitar o perigo especial de que as patentes aplicadas a um programa livre possam\ntorn??-lo efetivamente propriet??rio. Para evitar isso, a GPL garante que\npatentes n??o podem ser usadas para tornar o programa n??o-livre.\n\n  Os termos e condi????es precisos para c??pia, distribui????o e\nmodifica????o segue.\n\n                       TERMOS E CONDI????ES\n\n  0. Defini????es.\n\n  \"Esta Licen??a\" refere-se ?? vers??o 3 da GNU General Public License.\n\n  \"Direitos autorais\" tamb??m significa leis semelhantes a direitos autorais que se aplicam a outros tipos de\nobras, como m??scaras semicondutoras.\n\n  \"O Programa\" refere-se a qualquer trabalho protegido por direitos autorais licenciado sob este\nLicen??a. Cada licenciado ?? endere??ado como \"voc??\". \"Licenciados\" e\n\"destinat??rios\" podem ser indiv??duos ou organiza????es.\n\n  \"Modificar\" uma obra significa copiar ou adaptar toda ou parte da obra\nde uma forma que exija permiss??o de direitos autorais, al??m da cria????o de um\nc??pia exata. O trabalho resultante ?? chamado de \"vers??o modificada\" do\ntrabalho anterior ou um trabalho \"baseado\" no trabalho anterior.\n\n  Um \"trabalho coberto\" significa o Programa n??o modificado ou um trabalho baseado\nno Programa.\n\n  \"Propagar\" uma obra significa fazer com ela qualquer coisa que, sem\npermiss??o, o tornaria direta ou secundariamente respons??vel por\nviola????o de acordo com a lei de direitos autorais aplic??vel, exceto execut??-la em um\ncomputador ou modificar uma c??pia privada. A propaga????o inclui a c??pia,\ndistribui????o (com ou sem modifica????o), disponibilizando ao\np??blico e, em alguns pa??ses, outras atividades tamb??m.\n\n  \"Transmitir\" uma obra significa qualquer tipo de propaga????o que possibilite outras\npartes para fazer ou receber c??pias. Mera intera????o com um usu??rio atrav??s de\numa rede de computadores, sem transfer??ncia de uma c??pia, n??o est?? transmitindo.\n\n  Uma interface de usu??rio interativa exibe \"Avisos Legais Apropriados\"\nna medida em que inclui um conveniente e bem vis??vel\nrecurso que (1) exibe um aviso de direitos autorais apropriado e (2)\ninforma ao usu??rio que n??o h?? garantia para o trabalho (exceto para o\nmedida em que as garantias s??o fornecidas), que os licenciados podem transmitir a\ntrabalhar sob esta Licen??a e como visualizar uma c??pia desta Licen??a. Se\na interface apresenta uma lista de comandos ou op????es do usu??rio, como um\nmenu, um item proeminente na lista atende a esse crit??rio.\n\n  1. C??digo Fonte.\n\n  O \"c??digo-fonte\" de uma obra significa a forma preferida da obra\npara fazer modifica????es nele. \"C??digo objeto\" significa qualquer c??digo n??o-fonte\nforma de uma obra.\n\n  Uma \"Interface Padr??o\" significa uma interface que ?? uma interface oficial\nnorma definida por um organismo de normaliza????o reconhecido, ou, no caso de\ninterfaces especificadas para uma determinada linguagem de programa????o, que\n?? amplamente utilizado entre os desenvolvedores que trabalham nessa linguagem.\n\n  As \"Bibliotecas do Sistema\" de um trabalho execut??vel incluem qualquer coisa,\ndo que a obra como um todo, que (a) est?? inclu??do na forma normal de\nempacotar um Componente Principal, mas que n??o faz parte desse Componente Principal\nComponente, e (b) serve apenas para permitir o uso do trabalho com esse\nComponente Principal, ou para implementar uma Interface Padr??o para a qual um\nimplementa????o est?? dispon??vel ao p??blico em forma de c??digo-fonte. UMA\n\"Componente Principal\", neste contexto, significa um componente essencial principal\n(kernel, sistema de janelas e assim por diante) do sistema operacional espec??fico\n(se houver) no qual o trabalho execut??vel ?? executado, ou um compilador usado para\nproduzir o trabalho, ou um interpretador de c??digo de objeto usado para execut??-lo.\n\n  A \"Fonte Correspondente\" para um trabalho em forma de c??digo objeto significa todos os\no c??digo-fonte necess??rio para gerar, instalar e (para um execut??vel\nwork) executar o c??digo objeto e modificar o trabalho, incluindo scripts para\ncontrolar essas atividades. No entanto, n??o inclui o trabalho\nBibliotecas do sistema, ou ferramentas de uso geral ou geralmente dispon??veis gratuitamente\nprogramas que s??o usados ??????sem modifica????es na execu????o dessas atividades, mas\nque n??o fazem parte do trabalho. Por exemplo, Fonte correspondente\ninclui arquivos de defini????o de interface associados a arquivos de origem para\no trabalho e o c??digo-fonte para bibliotecas compartilhadas e dinamicamente\nsubprogramas vinculados que o trabalho ?? projetado especificamente para exigir,\ncomo por comunica????o ??ntima de dados ou fluxo de controle entre esses\nsubprogramas e outras partes do trabalho.\n\n  A Fonte Correspondente n??o precisa incluir nada que os usu??rios\npode regenerar automaticamente a partir de outras partes do correspondente\nFonte.\n\n  A Fonte Correspondente para uma obra em forma de c??digo fonte ?? aquela\nmesmo trabalho.\n\n  2. Permiss??es b??sicas.\n\n  Todos os direitos concedidos sob esta Licen??a s??o concedidos pelo prazo de\ndireitos autorais sobre o Programa, e s??o irrevog??veis, desde que\ncondi????es s??o atendidas. Esta Licen??a afirma explicitamente seu ilimitado\npermiss??o para executar o Programa n??o modificado. A sa??da da execu????o de um\ntrabalho coberto ?? coberto por esta Licen??a somente se a sa??da, dada sua\nconte??do, constitui uma obra coberta. Esta Licen??a reconhece a sua\ndireitos de uso justo ou outro equivalente, conforme previsto pela lei de direitos autorais.\n\n  Voc?? pode fazer, executar e propagar trabalhos cobertos que voc?? n??o\ntransmitir, sem condi????es, desde que sua licen??a permane??a\n?? for??a. Voc?? pode transmitir obras cobertas a outras pessoas com o ??nico prop??sito\nde t??-los fazer modifica????es exclusivamente para voc??, ou fornecer-lhe\ncom facilidades para a execu????o dessas obras, desde que cumpra\nos termos desta Licen??a ao transmitir todo o material para o qual voc??\nn??o controla os direitos autorais. Aqueles que assim fazem ou executam as obras cobertas\npois voc?? deve faz??-lo exclusivamente em seu nome, sob sua dire????o\ne controle, em termos que os pro??bem de fazer quaisquer c??pias de\nseu material protegido por direitos autorais fora de seu relacionamento com voc??.\n\n  O transporte sob quaisquer outras circunst??ncias ?? permitido somente sob\nas condi????es indicadas abaixo. O sublicenciamento n??o ?? permitido; se????o 10\ntorna desnecess??rio.\n\n  3. Protegendo os direitos legais dos usu??rios da lei antievas??o.\n\n  Nenhum trabalho coberto deve ser considerado parte de um efetivo\nmedida de acordo com qualquer lei aplic??vel, cumprindo as obriga????es nos termos do artigo\n11 do tratado de direitos autorais da OMPI adotado em 20 de dezembro de 1996, ou\nleis semelhantes que pro??bem ou restringem a evas??o de tais\nmedidas.\n\n  Ao transmitir uma obra coberta, voc?? renuncia a qualquer poder legal de proibir\nevas??o de medidas tecnol??gicas na medida em que tal evas??o\n?? efetuado pelo exerc??cio de direitos sob esta Licen??a com rela????o a\no trabalho coberto, e voc?? se isenta de qualquer inten????o de limitar a opera????o ou\nmodifica????o da obra como meio de fazer cumprir, contra a\nusu??rios, seus direitos legais ou de terceiros para proibir a evas??o de\nmedidas tecnol??gicas.\n\n  4. Envio de c??pias literais.\n\n  Voc?? pode transmitir c??pias literais do c??digo-fonte do Programa conforme\nreceb??-lo, em qualquer meio, desde que voc?? de forma consp??cua e\npublicar adequadamente em cada c??pia um aviso de direitos autorais apropriado;\nmanter intactos todos os avisos informando que esta Licen??a e qualquer\ntermos n??o permissivos adicionados de acordo com a se????o 7 aplicam-se ao c??digo;\nmanter intactos todos os avisos de aus??ncia de qualquer garantia; e dar tudo\ndestinat??rios uma c??pia desta Licen??a junto com o Programa.\n\n  Voc?? pode cobrar qualquer pre??o ou nenhum pre??o por cada c??pia que voc?? transmitir,\ne voc?? pode oferecer suporte ou prote????o de garantia mediante o pagamento de uma taxa.\n\n  5. Transmitindo Vers??es de Origem Modificadas.\n\n  Voc?? pode transmitir um trabalho baseado no Programa, ou as modifica????es\nproduzi-lo a partir do Programa, na forma de c??digo-fonte sob a\ntermos da se????o 4, desde que voc?? tamb??m atenda a todas estas condi????es:\n\n    a) O trabalho deve conter avisos proeminentes informando que voc?? modificou\n    e dando uma data relevante.\n\n    b) O trabalho deve conter avisos proeminentes informando que ??\n    lan??ado sob esta Licen??a e quaisquer condi????es adicionadas na se????o\n    7. Este requisito modifica o requisito da se????o 4 para\n    \"manter intactos todos os avisos\".\n\n    c) Voc?? deve licenciar a obra inteira, como um todo, sob este\n    Licen??a para qualquer pessoa que venha a possuir uma c??pia. este\n    A licen??a ser??, portanto, aplicada, juntamente com qualquer se????o 7 aplic??vel\n    termos adicionais, ao todo da obra, e todas as suas partes,\n    independentemente da forma como s??o embalados. Esta Licen??a n??o d??\n    permiss??o para licenciar o trabalho de qualquer outra forma, mas n??o\n    invalidar tal permiss??o se voc?? a recebeu separadamente.\n\n    d) Se a obra tiver interfaces interativas com o usu??rio, cada uma deve exibir\n    Avisos Legais Apropriados; no entanto, se o Programa tiver interativo\n    interfaces que n??o exibem Avisos Legais Apropriados, seu\n    trabalho n??o precisa obrig??-los a faz??-lo.\n\n  Uma compila????o de uma obra coberta com outras obras separadas e independentes\nobras, que n??o s??o, por sua natureza, extens??es da obra coberta,\ne que n??o s??o combinados com ele de modo a formar um programa maior,\ndentro ou em um volume de um meio de armazenamento ou distribui????o, ?? chamado de\n\"agregado\" se a compila????o e seus direitos autorais resultantes n??o forem\nusado para limitar o acesso ou direitos legais dos usu??rios da compila????o\nal??m do que as obras individuais permitem. Inclus??o de uma obra coberta\nem um agregado n??o faz com que esta Licen??a se aplique a outros\npartes do agregado.\n\n  6. Envio de Formul??rios N??o Originais.\n\n  Voc?? pode transmitir uma obra coberta na forma de c??digo de objeto sob os termos\ndas se????es 4 e 5, desde que voc?? tamb??m transmita a\nFonte Correspondente leg??vel por m??quina sob os termos desta Licen??a,\nde uma dessas maneiras:\n\n    a) Transmitir o c??digo do objeto ou incorporado em um produto f??sico\n    (incluindo um meio de distribui????o f??sico), acompanhado do\n    Fonte correspondente fixada em um meio f??sico dur??vel\n    normalmente usado para interc??mbio de software.\n\n    b) Transmitir o c??digo do objeto ou incorporado em um produto f??sico\n    (incluindo um meio de distribui????o f??sico), acompanhado por um\n    oferta por escrito, v??lida por pelo menos tr??s anos e v??lida por\n    desde que voc?? ofere??a pe??as de reposi????o ou suporte ao cliente para esse produto\n    model, para dar a qualquer um que possua o c??digo objeto (1) um\n    c??pia da Fonte Correspondente para todo o software no\n    produto que ?? coberto por esta Licen??a, em um suporte f??sico dur??vel\n    meio habitualmente usado para interc??mbio de software, por um pre??o n??o\n    mais do que seu custo razo??vel de realizar fisicamente este\n    transmiss??o da fonte, ou (2) acesso para copiar o\n    Fonte correspondente de um servidor de rede sem custo.\n\n    c) Transmitir c??pias individuais do c??digo objeto com uma c??pia do\n    oferta por escrito para fornecer a Fonte Correspondente. este\n    alternativa ?? permitida apenas ocasionalmente e n??o comercialmente, e\n    somente se voc?? recebeu o c??digo do objeto com tal oferta, de acordo\n    com a subse????o 6b.\n\n    d) Transmitir o c??digo objeto oferecendo acesso a partir de um\n    local (gratuito ou pago) e oferecem acesso equivalente ao\n    Fonte correspondente da mesma maneira atrav??s do mesmo lugar em nenhum\n    carga adicional. Voc?? n??o precisa exigir que os destinat??rios copiem o\n    Origem correspondente junto com o c??digo do objeto. Se o lugar para\n    copiar o c??digo do objeto ?? um servidor de rede, a Fonte Correspondente\n    pode estar em um servidor diferente (operado por voc?? ou por terceiros)\n    que suporta recursos de c??pia equivalentes, desde que voc?? mantenha\n    instru????es claras ao lado do c??digo do objeto dizendo onde encontrar o\n    Fonte correspondente. Independentemente de qual servidor hospeda o\n    Fonte Correspondente, voc?? permanece obrigado a garantir que seja\n    dispon??vel pelo tempo que for necess??rio para satisfazer esses requisitos.\n\n    e) Transmitir o c??digo objeto usando transmiss??o ponto a ponto, desde que\n    voc?? informa a outros peers onde o c??digo do objeto e o correspondente\n    As fontes do trabalho est??o sendo oferecidas ao p??blico em geral sem\n    cobran??a de acordo com a subse????o 6d.\n\n  Uma parte separ??vel do c??digo-objeto, cujo c??digo-fonte ?? exclu??do\nda Fonte Correspondente como uma Biblioteca do Sistema, n??o precisam ser\ninclu??do na transmiss??o do trabalho de c??digo de objeto.\n\n  Um \"Produto de usu??rio\" ?? (1) um \"produto de consumo\", o que significa qualquer\npropriedade pessoal tang??vel que normalmente ?? usada para fins pessoais, familiares,\nou uso dom??stico, ou (2) qualquer coisa projetada ou vendida para incorpora????o\nem uma moradia. Ao determinar se um produto ?? um produto de consumo,\nos casos duvidosos ser??o resolvidos a favor da cobertura. Para um determinado\nproduto recebido por um determinado usu??rio, \"normalmente usado\" refere-se a um\nuso t??pico ou comum dessa classe de produto, independentemente do status\ndo usu??rio em particular ou da maneira pela qual o usu??rio em particular\nrealmente usa, espera ou espera usar o produto. Um produto\n?? um produto de consumo, independentemente de o produto ter\nusos comerciais, industriais ou n??o de consumo, a menos que tais usos representem\no ??nico modo significativo de uso do produto.\n\n  \"Informa????es de Instala????o\" para um Produto do Usu??rio significa quaisquer m??todos,\nprocedimentos, chaves de autoriza????o ou outras informa????es necess??rias para instalar\ne executar vers??es modificadas de um trabalho coberto nesse Produto do Usu??rio a partir de\numa vers??o modificada de sua Fonte Correspondente. A informa????o deve\nsuficiente para garantir que o funcionamento cont??nuo do objeto modificado\nc??digo n??o ??, em nenhum caso, impedido ou interferido apenas porque\nmodifica????o foi feita.\n\n  Se voc?? transmitir um trabalho de c??digo de objeto sob esta se????o em, ou com, ou\nespecificamente para uso em um Produto do Usu??rio, e o transporte ocorre conforme\nparte de uma transa????o em que o direito de posse e uso do\nO Produto do Usu??rio ?? transferido para o destinat??rio em perpetuidade ou por um\nprazo fixo (independentemente de como a opera????o seja caracterizada), o\nA Fonte Correspondente transmitida nesta se????o deve ser acompanhada\npelas Informa????es de Instala????o. Mas este requisito n??o se aplica\nse nem voc?? nem qualquer terceiro mantiver a capacidade de instalar\nc??digo de objeto modificado no Produto do Usu??rio (por exemplo, o trabalho foi\nfoi instalado na ROM).\n\n  O requisito de fornecer informa????es de instala????o n??o inclui um\nrequisito para continuar a fornecer servi??o de suporte, garantia ou atualiza????es\npor uma obra que tenha sido modificada ou instalada pelo destinat??rio, ou por\no Produto do Usu??rio no qual foi modificado ou instalado. Acesso a um\nrede pode ser negada quando a modifica????o em si materialmente e\nafeta negativamente a opera????o da rede ou viola as regras e\nprotocolos de comunica????o na rede.\n\n  Fonte correspondente transmitida e informa????es de instala????o fornecidas,\nde acordo com esta se????o deve estar em um formato que ?? publicamente\ndocumentado (e com uma implementa????o dispon??vel ao p??blico em\nc??digo-fonte) e n??o deve exigir senha ou chave especial para\ndesembalar, ler ou copiar.\n\n  7. Termos Adicionais.\n\n  \"Permiss??es adicionais\" s??o termos que complementam os termos deste\nLicencie fazendo exce????es de uma ou mais de suas condi????es.\nPermiss??es adicionais aplic??veis ??????a todo o Programa devem\nser tratados como se estivessem inclu??dos nesta Licen??a, na medida\nque eles s??o v??lidos sob a lei aplic??vel. Se permiss??es adicionais\nse aplicam apenas a parte do Programa, essa parte pode ser usada separadamente\nsob essas permiss??es, mas todo o Programa permanece regido por\nesta Licen??a sem considerar as permiss??es adicionais.\n\n  Ao transmitir uma c??pia de uma obra coberta, voc?? pode, a seu crit??rio,\nremover quaisquer permiss??es adicionais dessa c??pia ou de qualquer parte\nisto. (Permiss??es adicionais podem ser escritas para exigir seus pr??prios\nremo????o em certos casos quando voc?? modifica o trabalho.) Voc?? pode colocar\npermiss??es adicionais sobre o material, adicionadas por voc?? a um trabalho coberto,\npara os quais voc?? tem ou pode dar permiss??o de direitos autorais apropriada.\n\n  N??o obstante qualquer outra disposi????o desta Licen??a, para o material que voc??\nadicionar a um trabalho coberto, voc?? pode (se autorizado pelos detentores dos direitos autorais de\nesse material) complementam os termos desta Licen??a com os termos:\n\n    a) Isen????o de garantia ou limita????o de responsabilidade de forma diferente da\n    termos das se????es 15 e 16 desta Licen??a; ou\n\n    b) Exigir a preserva????o de avisos legais razo??veis ??????especificados ou\n    atribui????es de autor nesse material ou no Legal Apropriado\n    Avisos exibidos por obras que o contenham; ou\n\n    c) Proibir a deturpa????o da origem desse material, ou\n    exigindo que as vers??es modificadas de tal material sejam marcadas em\n    formas razo??veis ??????como diferentes da vers??o original; ou\n\n    d) Limitar o uso para fins publicit??rios de nomes de licenciantes ou\n    autores do material; ou\n\n    e) Recusar-se a conceder direitos sob a lei de marcas registradas para uso de alguns\n    nomes comerciais, marcas registradas ou marcas de servi??o; ou\n\n    f) Exigir indeniza????o dos licenciantes e autores daquele\n    material por qualquer pessoa que transmita o material (ou vers??es modificadas de\n    it) com pressupostos contratuais de responsabilidade para com o destinat??rio, por\n    qualquer responsabilidade que essas premissas contratuais imponham diretamente sobre\n    esses licenciadores e autores.\n\n  Todos os outros termos adicionais n??o permissivos s??o considerados \"mais\nrestri????es\" dentro do significado da se????o 10. Se o Programa como voc??\nrecebido, ou qualquer parte dele, cont??m um aviso informando que ??\nregida por esta Licen??a juntamente com um termo que ?? uma\nrestri????o, voc?? pode remover esse termo. Se um documento de licen??a contiver\numa restri????o adicional, mas permite relicenciar ou transmitir sob este\nLicen??a, voc?? pode adicionar a um material de trabalho coberto regido pelos termos\ndesse documento de licen??a, desde que a restri????o adicional n??o\nn??o sobreviver a tal relicenciamento ou transmiss??o.\n\n  Se voc?? adicionar termos a um trabalho coberto de acordo com esta se????o, voc??\ndeve colocar, nos arquivos de origem relevantes, uma declara????o do\ntermos adicionais que se aplicam a esses arquivos, ou um aviso indicando\nonde encontrar os termos aplic??veis.\n\n  Termos adicionais, permissivos ou n??o permissivos, podem ser indicados no\nforma de uma licen??a escrita separadamente, ou declarada como exce????es;\nos requisitos acima se aplicam de qualquer maneira.\n\n  8. Rescis??o.\n\n  Voc?? n??o pode propagar ou modificar um trabalho coberto, exceto conforme expressamente\nfornecidos sob esta Licen??a. Qualquer tentativa de outra forma de propagar ou\nmodific??-lo ?? nulo e encerrar?? automaticamente seus direitos sob\nesta Licen??a (incluindo quaisquer licen??as de patentes concedidas sob o terceiro\npar??grafo da se????o 11).\n\n  No entanto, se voc?? cessar todas as viola????es desta Licen??a, seu\na licen??a de um detentor de direitos autorais em particular ?? restabelecida (a)\nprovisoriamente, a menos e at?? que o detentor dos direitos autorais explicitamente e\nfinalmente rescindir sua licen??a, e (b) permanentemente, se os direitos autorais\ntitular n??o notificar voc?? sobre a viola????o por alguns meios razo??veis\nantes de 60 dias ap??s a cessa????o.\n\n  Al??m disso, sua licen??a de um detentor de direitos autorais espec??fico ??\nrestabelecido permanentemente se o detentor dos direitos autorais o notificar da\nviola????o por alguns meios razo??veis, esta ?? a primeira vez que voc??\nrecebeu notifica????o de viola????o desta Licen??a (para qualquer trabalho) daquele\ndetentor dos direitos autorais, e voc?? corrige a viola????o antes de 30 dias ap??s\nseu recebimento do aviso.\n\n  A rescis??o de seus direitos sob esta se????o n??o encerra a\nlicen??as de terceiros que receberam c??pias ou direitos de voc?? sob\nesta Licen??a. Se seus direitos foram rescindidos e n??o permanentemente\nrestabelecido, voc?? n??o se qualifica para receber novas licen??as para o mesmo\nmaterial na se????o 10.\n\n  9. Aceita????o n??o necess??ria para ter c??pias.\n\n  Voc?? n??o ?? obrigado a aceitar esta Licen??a para receber ou\nexecutar uma c??pia do Programa. Propaga????o auxiliar de uma obra coberta\nocorrendo apenas como consequ??ncia do uso de transmiss??o ponto a ponto\nreceber uma c??pia tamb??m n??o requer aceita????o. No entanto,\nnada al??m desta Licen??a concede a voc?? permiss??o para propagar ou\nmodificar qualquer trabalho coberto. Essas a????es infringem os direitos autorais se voc??\nn??o aceita esta Licen??a. Portanto, ao modificar ou propagar um\ntrabalho coberto, voc?? indica sua aceita????o desta Licen??a para faz??-lo.\n\n  10. Licenciamento Autom??tico de Destinat??rios a Jusante.\n\n  Cada vez que voc?? transmite uma obra coberta, o destinat??rio automaticamente\nrecebe uma licen??a dos licenciadores originais, para executar, modificar e\npropagar esse trabalho, sujeito a esta Licen??a. Voc?? n??o ?? respons??vel\npara impor a conformidade de terceiros com esta Licen??a.\n\n  Uma \"transa????o de entidade\" ?? uma transa????o que transfere o controle de um\norganiza????o, ou substancialmente todos os ativos de uma, ou subdividindo uma\norganiza????o, ou organiza????es de fus??o. Se a propaga????o de uma cobertura\ntrabalho resulta de uma transa????o da entidade, cada parte\ntransa????o quem recebe uma c??pia da obra tamb??m recebe o que quer que seja\nlicen??as para o trabalho que o antecessor do partido tinha ou poderia\ndar nos termos do n??mero anterior, acrescido do direito de posse do\nFonte correspondente do trabalho do antecessor em interesse, se\no antecessor o possui ou pode obt??-lo com esfor??os razo??veis.\n\n  Voc?? n??o pode impor quaisquer outras restri????es ao exerc??cio do\ndireitos concedidos ou afirmados sob esta Licen??a. Por exemplo, voc?? pode\nn??o impor uma taxa de licen??a, royalties ou outro encargo para o exerc??cio de\ndireitos concedidos sob esta Licen??a, e voc?? n??o pode iniciar lit??gio\n(incluindo uma reclama????o cruzada ou reconven????o em uma a????o judicial) alegando que\nqualquer reivindica????o de patente ?? infringida fazendo, usando, vendendo, oferecendo para\nvenda, ou importar o Programa ou qualquer parte dele.\n\n  11. Patentes.\n\n  Um \"colaborador\" ?? um detentor de direitos autorais que autoriza o uso sob este\nLicen??a do Programa ou um trabalho no qual o Programa ?? baseado. o\ntrabalho assim licenciado ?? chamado de \"vers??o do contribuidor\" do contribuidor.\n\n  As \"reivindica????es de patentes essenciais\" de um colaborador s??o todas as reivindica????es de patentes\nde propriedade ou controlada pelo contribuinte, j?? adquirido ou\nadquiridos, que seriam infringidos de alguma forma, permitidos\npor esta Licen??a, de fazer, usar ou vender sua vers??o de contribuidor,\nmas n??o inclua reivindica????es que seriam infringidas apenas como\nconsequ??ncia de modifica????o adicional da vers??o do contribuidor. Por\nfins desta defini????o, \"controle\" inclui o direito de conceder\nsublicen??as de patentes de forma consistente com os requisitos de\nesta Licen??a.\n\n  Cada colaborador concede a voc?? um pr??mio n??o exclusivo, mundial e isento de royalties.\nlicen??a de patente sob as reivindica????es de patentes essenciais do colaborador, para\nfazer, usar, vender, colocar ?? venda, importar e executar, modificar e\npropagar o conte??do de sua vers??o de contribuidor.\n\n  Nos tr??s par??grafos seguintes, uma \"licen??a de patente\" ?? qualquer\nacordo ou compromisso, qualquer que seja a denomina????o, de n??o fazer valer uma patente\n(como uma permiss??o expressa para praticar uma patente ou compromisso de n??o\nprocessar por viola????o de patente). Para \"conceder\" tal licen??a de patente a um\nparte significa fazer tal acordo ou compromisso de n??o fazer cumprir uma\npatente contra a parte.\n\n  Se voc?? transmitir um trabalho coberto, confiando conscientemente em uma licen??a de patente,\ne a Fonte Correspondente da obra n??o est?? dispon??vel para ningu??m\ncopiar, gratuitamente e nos termos desta Licen??a, por meio de um\nservidor de rede publicamente dispon??vel ou outro meio facilmente acess??vel,\nent??o voc?? deve (1) fazer com que a Fonte Correspondente seja t??o\ndispon??vel, ou (2) providenciar para se privar do benef??cio do\nlicen??a de patente para este trabalho em particular, ou (3) providenciar, de forma\nconsistente com os requisitos desta Licen??a, para estender a patente\nlicen??a para destinat??rios a jusante. \"Confiar conscientemente\" significa que voc??\nconhecimento real de que, exceto pela licen??a de patente, voc?? est?? transmitindo a\ntrabalho coberto em um pa??s ou o uso do trabalho coberto por seu destinat??rio\nem um pa??s, infringiria uma ou mais patentes identific??veis ??????nesse\npa??s que voc?? tem motivos para acreditar que s??o v??lidos.\n\n  Se, de acordo com ou em conex??o com uma ??nica transa????o ou\narranjo, voc?? transmite ou propaga adquirindo o transporte de um\ntrabalho coberto e conceder uma licen??a de patente a algumas das partes\nreceber a obra coberta autorizando-os a usar, propagar, modificar\nou transmitir uma c??pia espec??fica da obra coberta, ent??o a licen??a de patente\nque voc?? concede ?? automaticamente estendido a todos os destinat??rios da cobertura\ntrabalho e trabalha com base nele.\n\n  Uma licen??a de patente ?? \"discriminat??ria\" se n??o incluir\nalcance de sua cobertura, pro??be o exerc??cio de, ou ??\ncondicionado ao n??o exerc??cio de um ou mais dos direitos que lhe s??o\nespecificamente concedido sob esta Licen??a. Voc?? n??o pode transmitir uma cobertura\ntrabalhar se voc?? for parte de um acordo com um terceiro que ??\nno neg??cio de distribui????o de software, sob o qual voc?? faz o pagamento\na terceiros com base na extens??o de sua atividade de transmiss??o\na obra, e sob a qual o terceiro concede, a qualquer uma das\npartes que receberiam o trabalho coberto de voc??, uma discrimina????o\nlicen??a de patente (a) em conex??o com c??pias da obra coberta\ntransmitida por voc?? (ou c??pias feitas dessas c??pias), ou (b) principalmente\npara e em conex??o com produtos espec??ficos ou compila????es que\nconter o trabalho coberto, a menos que voc?? tenha celebrado esse acordo,\nou que a licen??a de patente foi concedida, antes de 28 de mar??o de 2007.\n\n  Nada nesta Licen??a deve ser interpretado como excluindo ou limitando\nqualquer licen??a impl??cita ou outras defesas contra infra????es que possam\ncaso contr??rio, estar?? dispon??vel para voc?? de acordo com a lei de patentes aplic??vel.\n\n  12. Nenhuma rendi????o da liberdade dos outros.\n\n  Se lhe forem impostas condi????es (seja por ordem judicial, acordo ou\ncaso contr??rio) que contrariem as condi????es desta Licen??a, eles n??o\nisent??-lo das condi????es desta Licen??a. Se voc?? n??o pode transmitir uma\ntrabalho coberto de modo a satisfazer simultaneamente suas obriga????es sob este\nLicen??a e quaisquer outras obriga????es pertinentes, ent??o, como consequ??ncia, voc?? pode\nn??o transmiti-lo de forma alguma. Por exemplo, se voc?? concordar com os termos que o obrigam\npara coletar um royalty para transmiss??o adicional daqueles a quem voc?? transmite\no Programa, a ??nica maneira de satisfazer tanto esses termos como este\nLicen??a seria abster-se inteiramente de transmitir o Programa.\n\n  13. Use com a Licen??a P??blica Geral GNU Affero.\n\n  N??o obstante qualquer outra disposi????o desta Licen??a, voc?? tem\npermiss??o para vincular ou combinar qualquer trabalho coberto com um trabalho licenciado\nsob a vers??o 3 da GNU Affero General Public License em um ??nico\ntrabalho combinado, e para transmitir o trabalho resultante. Os termos deste\nA licen??a continuar?? a ser aplicada ?? parte que ?? a obra coberta,\nmas os requisitos especiais da GNU Affero General Public License,\nA se????o 13, relativa ?? intera????o por meio de uma rede, se aplicar?? ao\ncombina????o como tal.\n\n  14. Vers??es Revisadas desta Licen??a.\n\n  A Free Software Foundation pode publicar vers??es revisadas e/ou novas de\na GNU General Public License de tempos em tempos. Essas novas vers??es ir??o\nser semelhante em esp??rito ?? vers??o atual, mas pode diferir em detalhes para\nresolver novos problemas ou preocupa????es.\n\n  Cada vers??o recebe um n??mero de vers??o distinto. Se o\nO programa especifica que uma certa vers??o numerada do GNU General\nLicen??a P??blica \"ou qualquer vers??o posterior\" se aplica a ela, voc?? tem a\nop????o de seguir os termos e condi????es de qualquer um dos numerados\nvers??o ou de qualquer vers??o posterior publicada pelo Software Livre\nFunda????o. Se o Programa n??o especificar um n??mero de vers??o do\nGNU General Public License, voc?? pode escolher qualquer vers??o j?? publicada\npela Free Software Foundation.\n\n  Se o Programa especificar que um proxy pode decidir qual futuro\nvers??es da GNU General Public License podem ser usadas, o proxy desse\ndeclara????o p??blica de aceita????o de uma vers??o autoriza voc?? permanentemente\npara escolher essa vers??o para o Programa.\n\n  Vers??es de licen??as posteriores podem fornecer\npermiss??es. No entanto, n??o s??o impostas obriga????es adicionais a qualquer\nautor ou detentor de direitos autorais como resultado de sua escolha em seguir um\nvers??o posterior.\n\n  15. Ren??ncia de Garantia.\n\n  N??O H?? GARANTIA PARA O PROGRAMA, NA MEDIDA PERMITIDA POR\nLEI APLIC??VEL. EXCETO QUANDO INDICADO DE OUTRA FORMA POR ESCRITO OS DIREITOS AUTORAIS\nTITULARES E/OU OUTRAS PARTES FORNECEM O PROGRAMA \"COMO EST??\" SEM GARANTIA\nDE QUALQUER TIPO, EXPRESSA OU IMPL??CITA, INCLUINDO, MAS N??O SE LIMITANDO A,\nAS GARANTIAS IMPL??CITAS DE COMERCIALIZA????O E ADEQUA????O A UM PARTICULAR\nPROP??SITO. TODO O RISCO QUANTO ?? QUALIDADE E DESEMPENHO DO PROGRAMA\n?? COM VOC??. CASO O PROGRAMA ESTEJA DEFEITUOSO, VOC?? ASSUME O CUSTO DE\nTODA A MANUTEN????O, REPARO OU CORRE????O NECESS??RIA.\n\n  16. Limita????o de Responsabilidade.\n\n  EM NENHUMA HIP??TESE, A MENOS QUE EXIGIDO PELA LEI APLIC??VEL OU ACORDADO POR ESCRITO\nQUALQUER TITULAR DOS DIREITOS AUTORAIS OU QUALQUER OUTRA PARTE QUE MODIFICA E/OU TRANSMITA\nO PROGRAMA CONFORME PERMITIDO ACIMA, SER?? RESPONS??VEL PERANTE VOC?? POR DANOS, INCLUINDO QUAISQUER\nDANOS GERAIS, ESPECIAIS, INCIDENTAIS OU CONSEQUENTES DECORRENTES DO\nUSO OU INCAPACIDADE DE USAR O PROGRAMA (INCLUINDO, MAS N??O SE LIMITANDO ?? PERDA DE\nDADOS OU DADOS QUE EST??O SENDO PRECISOS OU PERDAS SUSTENTADAS POR VOC?? OU POR TERCEIROS\nPARTES OU FALHA DO PROGRAMA PARA OPERAR COM QUAISQUER OUTROS PROGRAMAS),\nMESMO QUE TAL TITULAR OU OUTRA PARTE TENHA SIDO AVISADA DA POSSIBILIDADE DE\nTAIS DANOS.\n\n  17. Interpreta????o das Se????es 15 e 16.\n\n  Se a isen????o de garantia e limita????o de responsabilidade fornecida\nacima n??o pode ter efeito legal local de acordo com seus termos,\ntribunais revisores devem aplicar a lei local que mais se aproxime\numa ren??ncia absoluta de qualquer responsabilidade civil em rela????o ao\nPrograma, a menos que uma garantia ou assun????o de responsabilidade acompanhe um\nc??pia do Programa em troca de uma taxa.\n\n                     FIM DOS TERMOS E CONDI????ES\n\n            Como aplicar estes termos aos seus novos programas\n\n  Se voc?? desenvolve um novo programa e quer que ele seja da maior\nposs??vel ao p??blico, a melhor maneira de conseguir isso ?? torn??-lo\nsoftware livre que todos podem redistribuir e alterar sob estes termos.\n\n  Para isso, anexe os seguintes avisos ao programa. ?? mais seguro\npara anex??-los ao in??cio de cada arquivo de origem para\ndeclarar a exclus??o da garantia; e cada arquivo deve ter pelo menos\na linha \"copyright\" e um ponteiro para onde se encontra o aviso completo.\n\n    <uma linha para dar o nome do programa e uma breve ideia do que ele faz.>\n    Direitos autorais (C) <ano> <nome do autor>\n\n    Este programa ?? um software livre: voc?? pode redistribu??-lo e/ou modific??-lo\n    sob os termos da GNU General Public License conforme publicada por\n    a Free Software Foundation, seja a vers??o 3 da Licen??a, ou\n    (a seu crit??rio) qualquer vers??o posterior.\n\n    Este programa ?? distribu??do na esperan??a de que seja ??til,\n    mas SEM QUALQUER GARANTIA; sem mesmo a garantia impl??cita de\n    COMERCIALIZA????O ou ADEQUA????O A UM DETERMINADO FIM. Veja o\n    Licen??a P??blica Geral GNU para mais detalhes.\n\n    Voc?? deve ter recebido uma c??pia da Licen??a P??blica Geral GNU\n    junto com este programa. Caso contr??rio, consulte <https://www.gnu.org/licenses/>.\n\nAdicione tamb??m informa????es sobre como entrar em contato com voc?? por correio eletr??nico e em papel.\n\n  Se o programa faz intera????o de terminal, fa??a com que ele produza um curto\nobserve assim quando ele iniciar em um modo interativo:\n\n    <programa> Copyright (C) <ano> <nome do autor>\n    Este programa vem com ABSOLUTAMENTE NENHUMA GARANTIA; para detalhes digite `show w'.\n    Este ?? um software livre, e voc?? pode redistribu??-lo\n    sob certas condi????es; digite `show c' para detalhes.\n\nOs comandos hipot??ticos `show w' e `show c' devem mostrar o\npartes da Licen??a P??blica Geral. Claro, os comandos do seu programa\npode ser diferente; para uma interface GUI, voc?? usaria uma \"caixa sobre\".\n\n  Voc?? tamb??m deve obter seu empregador (se voc?? trabalha como programador) ou escola,\nse houver, para assinar uma \"ren??ncia de direitos autorais\" para o programa, se necess??rio.\nPara obter mais informa????es sobre isso e como aplicar e seguir a GNU GPL, consulte\n<https://www.gnu.org/licenses/>.\n\n  A GNU General Public License n??o permite incorporar seu programa\nem programas propriet??rios. Se o seu programa ?? uma biblioteca de sub-rotinas, voc??\npode considerar mais ??til permitir a vincula????o de aplicativos propriet??rios com\na biblioteca. Se ?? isso que voc?? quer fazer, use o GNU Lesser General\nLicen??a P??blica em vez desta Licen??a. Mas antes leia\n<https://www.gnu.org/licenses/why-not-lgpl.html>.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(null);
        jTextArea1.setCaretPosition(0);
        jspLicence.setViewportView(jTextArea1);

        jPanel4.add(jspLicence);
        jspLicence.setBounds(0, 48, 568, 220);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(16, 1750, 568, 273);

        jspMain.setViewportView(jPanel3);

        background1.add(jspMain);
        jspMain.setBounds(0, 64, 600, 273);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jSeparator2.setBackground(new java.awt.Color(207, 207, 207));
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(0, 0, 600, 2);

        btnClose.setBackground(new java.awt.Color(207, 207, 207));
        btnClose.setForeground(new java.awt.Color(80, 80, 80));
        btnClose.setText("Fechar");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel2.add(btnClose);
        btnClose.setBounds(264, 16, 72, 32);

        background1.add(jPanel2);
        jPanel2.setBounds(0, 337, 600, 64);

        getContentPane().add(background1);
        background1.setBounds(0, 0, 600, 401);

        setSize(new java.awt.Dimension(600, 401));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        closeMessage();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void lblDeiseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeiseMouseClicked

        try {
            Utils.openUrl(lblDeise.getName(), lblDeise);
        } catch (URISyntaxException | IOException ex) {
            new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
        }

    }//GEN-LAST:event_lblDeiseMouseClicked

    private void lblGabrielMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGabrielMouseClicked

        try {
            Utils.openUrl(lblGabriel.getName(), lblGabriel);
        } catch (URISyntaxException | IOException ex) {
            new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
        }

    }//GEN-LAST:event_lblGabrielMouseClicked

    private void lblHebersonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHebersonMouseClicked

        try {
            Utils.openUrl(lblHeberson.getName(), lblHeberson);
        } catch (URISyntaxException | IOException ex) {
            new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
        }

    }//GEN-LAST:event_lblHebersonMouseClicked

    private void lblIzaelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIzaelMouseClicked

        try {
            Utils.openUrl(lblIzael.getName(), lblIzael);
        } catch (URISyntaxException | IOException ex) {
            new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
        }

    }//GEN-LAST:event_lblIzaelMouseClicked

    private void lblVitorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVitorMouseClicked

        try {
            Utils.openUrl(lblVitor.getName(), lblVitor);
        } catch (URISyntaxException | IOException ex) {
            new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
        }

    }//GEN-LAST:event_lblVitorMouseClicked

    private void lblMySQLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMySQLMouseClicked

        try {
            Utils.openUrl(lblMySQL.getName(), lblMySQL);
        } catch (URISyntaxException | IOException ex) {
            new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
        }

    }//GEN-LAST:event_lblMySQLMouseClicked

    private void lblAtxy2kMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtxy2kMouseClicked

        try {
            Utils.openUrl(lblAtxy2k.getName(), lblAtxy2k);
        } catch (URISyntaxException | IOException ex) {
            new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
        }

    }//GEN-LAST:event_lblAtxy2kMouseClicked

    private void lblDom4jMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDom4jMouseClicked

        try {
            Utils.openUrl(lblDom4j.getName(), lblDom4j);
        } catch (URISyntaxException | IOException ex) {
            new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
        }

    }//GEN-LAST:event_lblDom4jMouseClicked

    private void lblGsonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGsonMouseClicked

        try {
            Utils.openUrl(lblGson.getName(), lblGson);
        } catch (URISyntaxException | IOException ex) {
            new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
        }

    }//GEN-LAST:event_lblGsonMouseClicked

    private void lblHttpClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHttpClientMouseClicked

        try {
            Utils.openUrl(lblHttpClient.getName(), lblHttpClient);
        } catch (URISyntaxException | IOException ex) {
            new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
        }

    }//GEN-LAST:event_lblHttpClientMouseClicked

    private void lblEclipseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEclipseMouseClicked

        try {
            Utils.openUrl(lblEclipse.getName(), lblEclipse);
        } catch (URISyntaxException | IOException ex) {
            new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
        }

    }//GEN-LAST:event_lblEclipseMouseClicked

    private void lblViaCepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViaCepMouseClicked

        try {
            Utils.openUrl(lblViaCep.getName(), lblViaCep);
        } catch (URISyntaxException | IOException ex) {
            new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
        }

    }//GEN-LAST:event_lblViaCepMouseClicked

    public static enum MessageType {
        CANCEL, OK
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private edu.ecoleta.v2.components.AboutBackground background1;
    private edu.ecoleta.v2.components.JButtonDefault btnClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JScrollPane jspLicence;
    private javax.swing.JScrollPane jspMain;
    private javax.swing.JLabel lblAtxy2k;
    private javax.swing.JLabel lblDeise;
    private javax.swing.JLabel lblDom4j;
    private javax.swing.JLabel lblEclipse;
    private javax.swing.JLabel lblGabriel;
    private javax.swing.JLabel lblGson;
    private javax.swing.JLabel lblHeberson;
    private javax.swing.JLabel lblHttpClient;
    private javax.swing.JLabel lblIzael;
    private javax.swing.JLabel lblMySQL;
    private javax.swing.JLabel lblViaCep;
    private javax.swing.JLabel lblVitor;
    // End of variables declaration//GEN-END:variables

    private class Glass extends JComponent {

        private float alpha = 0f;

        public Glass() {

        }

        public float getAlpha() {
            return alpha;
        }

        public void setAlpha(float alpha) {
            this.alpha = alpha;
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
            g2.setColor(Color.GRAY);
            g2.fillRect(0, 0, getWidth(), getHeight());
            g2.dispose();
            super.paintComponent(g);
        }

    }

}
