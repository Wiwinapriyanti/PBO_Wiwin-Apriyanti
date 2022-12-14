/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Andre.DAO;
import Andre.Model.BukuAlamat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class BukuDaoImpl implements BukuDao {
    List<BukuAlamat> data=new ArrayList<>();
    
    public BukuDaoImpl(){
        data.add(new BukuAlamat("B001","Mantap","Andre","2003"));
        data.add(new BukuAlamat("B002","Mantaptu","Andi","2004"));
        data.add(new BukuAlamat("B011","Hahaha","Andrew","2005"));
    }
    
    @Override
    public BukuAlamat save(BukuAlamat buku){
        data.add(buku);
        return buku;
    }
    
    public BukuAlamat update(int index,BukuAlamat buku){
        data.set(index,buku);
        return buku;
    }
    
    public boolean delete(BukuAlamat buku){
        return data.remove(buku);
    }
    
    public BukuAlamat getBukuAlamat(int index){
        return data.get(index);
    }
    
    public List<BukuAlamat> getAllBukuAlamat(){
        return data;
    }
}
