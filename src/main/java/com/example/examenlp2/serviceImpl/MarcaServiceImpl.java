package com.example.examenlp2.serviceImpl;

import com.example.examenlp2.entity.Marca;
import com.example.examenlp2.repository.MarcaRepository;
import com.example.examenlp2.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MarcaServiceImpl implements MarcaService {

    @Autowired
    private MarcaRepository marcaRepository;
    @Override
    public Marca create(Marca marca) {
        return null;
    }

    @Override
    public Marca update(Marca marca) {
        return null;
    }

    @Override
    public Optional<Marca> read(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Marca> readAll() {
        return marcaRepository.findAll();
    }
}
