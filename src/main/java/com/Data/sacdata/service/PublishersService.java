package com.Data.sacdata.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Data.sacdata.entity.Publishers;
import com.Data.sacdata.repository.PublishersRepository;

@Service
public class PublishersService {

    @Autowired
    private PublishersRepository publishersRepository;

    public List<Publishers> getAllPublishers() {
        return publishersRepository.findAll();
    }

    public Publishers getPublisher(Long id) {
        return publishersRepository.findById(id).get();
    }

    public void addPublisher(Publishers publisher) {
        publishersRepository.save(publisher);
    }

    public void updatePublisher(Publishers publisher) {
        publishersRepository.save(publisher);
    }

    public void deletePublisher(Long id) {
        publishersRepository.deleteById(id);
    }

    public List<Publishers> findByName(String name) {
        return publishersRepository.findByName(name);
    }

    public List<Publishers> findByNameAndActive(String name, boolean active) {
        return publishersRepository.findByNameAndActive(name, active);
    }

    public List<Publishers> findByActive(boolean active) {
        return publishersRepository.findByActive(active);
    }

    public void deleteByName(String name) {
        publishersRepository.deleteByName(name);
    }

    public void editPublisher(Publishers publisher) {
        publishersRepository.updatePublisher(publisher);
    }

    public void viewPublisher(Publishers publisher) {
        publishersRepository.getPublisher(publisher.getId());
    }

    public void downloadPublisher(Publishers publisher) throws IOException {
        InputStream in = publishersRepository.getPublisher(publisher.getId());
        // Code to download the data in .csv format.
    }

    public void downloadPublisherInExcelFormat(Publishers publisher) throws IOException {
        InputStream in = publishersRepository.getPublisher(publisher.getId());
        // Code to download the data in excel format.
    }

}