package com.Aayat.Contacts.Repository;

import com.Aayat.Contacts.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
