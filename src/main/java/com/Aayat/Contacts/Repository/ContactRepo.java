package com.Aayat.Contacts.Repository;

import com.Aayat.Contacts.Entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo extends JpaRepository<Contact,Long> {
}
