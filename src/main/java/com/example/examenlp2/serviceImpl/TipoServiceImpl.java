package com.example.examenlp2.serviceImpl;

import com.example.examenlp2.entity.Tipo;
import com.example.examenlp2.repository.TipoRepository;
import com.example.examenlp2.service.TipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TipoServiceImpl implements TipoService {
    @Autowired
    private TipoRepository tipoRepository;
    @Override
    public Tipo create(Tipo tipo) {
        return null;
    }

    @Override
    public Tipo update(Tipo tipo) {
        return null;
    }

    @Override
    public Optional<Tipo> read(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Tipo> readAll() {
        return tipoRepository.findAll();
    }
}
