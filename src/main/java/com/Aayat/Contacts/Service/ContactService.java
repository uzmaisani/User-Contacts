package com.Aayat.Contacts.Service;

import com.Aayat.Contacts.Entity.Contact;
import com.Aayat.Contacts.Repository.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {
    @Autowired
    private ContactRepo contactRepo;

    public List<Contact> getAllContacts() {
        return (List<Contact>) contactRepo.findAll();
    }

    public Optional<Contact> getContactById(Long id) {
        return contactRepo.findById(id);
    }

    public Contact saveContact(Contact contact) {
        return contactRepo.save(contact);
    }

    public void deleteContact(Long id) {
        contactRepo.deleteById(id);
    }
}


