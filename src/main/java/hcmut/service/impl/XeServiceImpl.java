package hcmut.service.impl;

import hcmut.entity.Xe;
import hcmut.service.XeService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class XeServiceImpl implements XeService {
    @PersistenceContext(name = "thuexe")
    EntityManager entityManager;

    @Override
    public List<Xe> getAllXe() {

        List<Xe> xes = entityManager.createQuery("FROM Xe", Xe.class).getResultList();
        System.out.println(xes.get(0));
        return xes;
    }
}
