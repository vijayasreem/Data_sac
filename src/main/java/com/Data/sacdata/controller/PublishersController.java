package com.Data.sacdata.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Data.sacdata.entity.Publishers;
import com.Data.sacdata.service.PublishersService;

@RestController
@RequestMapping("/publishers")
public class PublishersController {

    @Autowired
    private PublishersService publishersService;

    @GetMapping
    public List<Publishers> getAllPublishers() {
        return publishersService.getAllPublishers();
    }

    @GetMapping("/{id}")
    public Publishers getPublisher(@PathVariable Long id) {
        return publishersService.getPublisher(id);
    }

    @PostMapping
    public void addPublisher(@RequestBody Publishers publisher) {
        publishersService.addPublisher(publisher);
    }

    @PutMapping
    public void updatePublisher(@RequestBody Publishers publisher) {
        publishersService.updatePublisher(publisher);
    }

    @DeleteMapping("/{id}")
    public void deletePublisher(@PathVariable Long id) {
        publishersService.deletePublisher(id);
    }

    @GetMapping("/name")
    public List<Publishers> findByName(@RequestParam String name) {
        return publishersService.findByName(name);
    }

    @GetMapping("/name/active")
    public List<Publishers> findByNameAndActive(@RequestParam String name, @RequestParam boolean active) {
        return publishersService.findByNameAndActive(name, active);
    }

    @GetMapping("/active")
    public List<Publishers> findByActive(@RequestParam boolean active) {
        return publishersService.findByActive(active);
    }

    @DeleteMapping("/name")
    public void deleteByName(@RequestParam String name) {
        publishersService.deleteByName(name);
    }

    @PutMapping("/edit")
    public void editPublisher(@RequestBody Publishers publisher) {
        publishersService.editPublisher(publisher);
    }

    @GetMapping("/view")
    public void viewPublisher(@RequestBody Publishers publisher) {
        publishersService.viewPublisher(publisher);
    }

    @GetMapping("/download")
    public void downloadPublisher(@RequestBody Publishers publisher) throws IOException {
        publishersService.downloadPublisher(publisher);
    }

    @GetMapping("/download/excel")
    public void downloadPublisherInExcelFormat(@RequestBody Publishers publisher) throws IOException {
        publishersService.downloadPublisherInExcelFormat(publisher);
    }

}