/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Andre.DAO;
import Andre.Model.BukuAlamat;
import java.util.List;
/**
 *
 * @author user
 */
public interface BukuDao {
    BukuAlamat save(BukuAlamat buku);
    BukuAlamat update(int index,BukuAlamat buku);
    boolean delete(BukuAlamat buku);
    BukuAlamat getBukuAlamat(int index);
    List<BukuAlamat> getAllBukuAlamat();
}
