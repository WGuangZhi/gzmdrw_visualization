package cn.gzmdrw.vz.service;

import cn.gzmdrw.vz.entity.Financia;

import java.util.List;

public interface FinanciaService {
    List<Financia> list();
    Financia load(int year);
}
