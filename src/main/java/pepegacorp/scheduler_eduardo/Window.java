/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pepegacorp.scheduler_eduardo;

import pepegacorp.scheduler_eduardo.cpu.CPU;
import pepegacorp.scheduler_eduardo.task.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eduardo
 */
public class Window extends javax.swing.JFrame {

    static final int QUANTUM_LENGTH = 2;
    static int QUANTUM_CURRENT = 0;
    static final CPU cpu = new CPU();
    static FileInputStream in;
    static InputStreamReader inputStreamReader;
    static BufferedReader reader;
    static private Queue<Task> tasks;
    static int c;
    static int seconds = 0;
    static JFileChooser j = new JFileChooser();
    static File file;
    static FileWriter fileWriter;
    static StringBuilder taskResults = new StringBuilder();

    /**
     * Creates new form Window
     */
    public Window() throws FileNotFoundException, IOException {
        JOptionPane.showMessageDialog(null, "Choose the text file with the tasks to be executed");
        fileWriter = new FileWriter("taskResults.txt");
        taskResults.append("Quantum Length: 2s \n\n");
        tasks = new LinkedList<>();
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OS Scheduler Simulator - Eduardo");

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel1.setText("0");

        jLabel2.setText("Ready tasks:");

        jLabel3.setText("empty");

        jLabel4.setText("Active task:");

        jLabel5.setText("active");

        jLabel6.setText("Current quantum: ");

        jLabel7.setText("0");

        jLabel8.setText("Timer:");

        jLabel9.setText("(Quantum = 2s)");

        jLabel10.setText("(Task Name - Task Duration)");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Task Name", "Total Duration"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel11.setText("Finished tasks:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(82, 82, 82)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(188, 188, 188)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 92, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FileNotFoundException {

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
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Window().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
            
        
        j.showOpenDialog(null);
        file = j.getSelectedFile();
        in = new FileInputStream(file);
        inputStreamReader = new InputStreamReader(in);
        reader = new BufferedReader(inputStreamReader);

        int interval = 1000;

        // Wait until the form is initialized
        Timer waitTimer = new Timer();
        waitTimer.schedule(new TimerTask() {
            @Override
            public void run() {

                jLabel1.setText("" + seconds);

                try {

                    if (seconds % 5 == 0) {
                        readTask();
                    }

                    updateCPU();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                updateReadyTasks();
                tasks.forEach(task -> task.setTotalDuration(task.getTotalDuration() + 1));

                seconds++;

                if (c == -1 && tasks.isEmpty() && cpu.getActiveTask() == null) {
                    try {
                        fileWriter.write(taskResults.toString());
                        fileWriter.close();
                        JOptionPane.showMessageDialog(null, "Execution saved to taskResults.txt");
                        System.exit(0);
                    } catch (IOException ex) {
                        Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
         ;
        
        }, 2000, interval);
    }

    private static void readTask() throws FileNotFoundException, IOException {
        if ((c = reader.read()) != -1) {
            char character = (char) c;
            while (!Character.isAlphabetic(character)) {
                c = reader.read();
                if (c == -1) {
                    return;
                }
                character = (char) c;
            }

            switch (character) {
                case 'A' ->
                    tasks.add(new A());
                case 'B' ->
                    tasks.add(new B());
                case 'C' ->
                    tasks.add(new C());
                case 'D' ->
                    tasks.add(new D());
            }

        }
    }

    private static void updateReadyTasks() {
        StringBuilder sb = new StringBuilder();
        tasks.forEach(task -> {
            sb.append("(" + task.getName() + " - " + task.getDuration() + ") ");
        }
        );
        jLabel3.setText(sb.toString());
    }

    private static void updateCPU() throws IOException {

        if (cpu.getActiveTask() == null && !tasks.isEmpty()) {
            cpu.setActiveTask(tasks.remove());
        } else if (cpu.getActiveTask() != null) {

            if (cpu.getActiveTask().getDuration() == 0) {
                DefaultTableModel jTable = (DefaultTableModel) jTable2.getModel();
                jTable.addRow(new String[] {cpu.getActiveTask().getName().toString(), ""+cpu.getActiveTask().getTotalDuration()});
                taskResults.append(cpu.getActiveTask().getName() + " - Total Time: " + cpu.getActiveTask().getTotalDuration() + "\n");
                cpu.setActiveTask(null);
                QUANTUM_CURRENT = 0;

            } else if (QUANTUM_CURRENT >= QUANTUM_LENGTH) {
                cpu.getActiveTask().setTotalDuration(cpu.getActiveTask().getTotalDuration() + 1);
                tasks.add(cpu.getActiveTask());
                cpu.setActiveTask(null);
                QUANTUM_CURRENT = 0;

            }

            if (cpu.executeInstructions()) {
                cpu.getActiveTask().setTotalDuration(cpu.getActiveTask().getTotalDuration() + 1);
                QUANTUM_CURRENT += 1;
            }

        }

        updateLabels();

    }

    public static void updateLabels() {
        if (cpu.getActiveTask() != null) {
            jLabel5.setText("(" + cpu.getActiveTask().getName() + " - " + cpu.getActiveTask().getDuration() + ") ");
        } else {
            jLabel5.setText(null);
        }
        jLabel7.setText("" + QUANTUM_CURRENT);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private static javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private static javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private static javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private static javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
