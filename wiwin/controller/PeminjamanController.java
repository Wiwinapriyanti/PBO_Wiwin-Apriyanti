/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wiwin.controller;
import wiwin.model.Peminjaman;
import wiwin.model.PeminjamanDao;
import wiwin.model.PeminjamanDaoImpl;
import wiwin.view.FormPeminjaman;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author M3400QA
 */
public class PeminjamanController {
    private FormPeminjaman formPeminjaman;
    private Peminjaman peminjaman;
    private PeminjamanDao peminjamanDao;
    
    public PeminjamanController(FormPeminjaman formPeminjaman){
        this.formPeminjaman=formPeminjaman;
        peminjamanDao=new PeminjamanDaoImpl();
    }
    
    public void save(){
        peminjaman=new Peminjaman();
        peminjaman.setNobp(formPeminjaman.getTxtNoBp().getText());
        peminjaman.setKodebuku(formPeminjaman.getTxtKodeBuku().getText());
        peminjaman.setTglpinjam(formPeminjaman.getTxtTanggalPeminjaman().getText());
        peminjaman.setTglkembali(formPeminjaman.getTxtTanggalKembali().getText());
        peminjamanDao.save(peminjaman);
        JOptionPane.showMessageDialog(formPeminjaman,"Entri Data OK");
        
    }
    
    public void bersihForm(){
        formPeminjaman.getTxtNoBp().setText("");
        formPeminjaman.getTxtKodeBuku().setText("");
        formPeminjaman.getTxtTanggalPeminjaman().setText("");
        formPeminjaman.getTxtTanggalKembali().setText("");
    }
    public void getPeminjaman(){
        int index=formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman=peminjamanDao.getPeminjaman(index);
        if(peminjaman!=null){
            formPeminjaman.getTxtNoBp().setText(peminjaman.getNobp());
            formPeminjaman.getTxtKodeBuku().setText(peminjaman.getKodebuku());
            formPeminjaman.getTxtTanggalPeminjaman().setText(peminjaman.getTglkembali());
            formPeminjaman.getTxtTanggalKembali().setText(peminjaman.getTglpinjam());
        }
    }
        
    public void update(){
        int index=formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman.setNobp(formPeminjaman.getTxtNoBp().getText());
        peminjaman.setKodebuku(formPeminjaman.getTxtKodeBuku().getText());
        peminjaman.setTglpinjam(formPeminjaman.getTxtTanggalPeminjaman().getText());
        peminjaman.setTglkembali(formPeminjaman.getTxtTanggalKembali().getText());
        JOptionPane.showMessageDialog(formPeminjaman,"Update Data OK");
    } 
    
    public void delete(){
        int index=formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjamanDao.delete(index);
        JOptionPane.showMessageDialog(formPeminjaman, "Delete Data Ok");
    }
    
    public void tampilData(){
        DefaultTableModel tableModel=
                (DefaultTableModel) formPeminjaman.getTblPeminjaman().getModel();
        tableModel.setRowCount(0);
        java.util.List<Peminjaman>listPeminjaman=peminjamanDao.getAllPeminjaman();
        for (Peminjaman peminjaman : listPeminjaman){
            Object[] data={
                 peminjaman.getNobp(),
                peminjaman.getKodebuku(),
                peminjaman.getTglpinjam(),
                peminjaman.getTglkembali()
            };
            tableModel.addRow(data);
        }
    }

}


























