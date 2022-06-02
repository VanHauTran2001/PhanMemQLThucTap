/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.DiemTT;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ADMIN
 */
public class DiemTTDAO extends AbstractTableModel{
    private String name[] ={"Mã sinh viên","Điểm","Xếp loại"};
    private Class className[] ={String.class,String.class,String.class,String.class};
    private ArrayList<DiemTT> dsDiem = new ArrayList<>();

    public DiemTTDAO(ArrayList<DiemTT> diem) {
        this.dsDiem = diem;
    }
    
    
    @Override
    public int getRowCount() {
        return dsDiem.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return dsDiem.get(rowIndex).getMaSV();
            case 1:
                return dsDiem.get(rowIndex).getDiem();
            case 2:
                return dsDiem.get(rowIndex).getXepLoai();
            default:
                return null;
        }
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        return className[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return name[column];
    }
    
    
}
