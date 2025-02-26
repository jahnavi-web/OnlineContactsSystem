package com.example.Online.Contact.Management.System.Repository;

import com.example.Online.Contact.Management.System.Models.Contacts;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ContactsRepository extends JpaRepository<Contacts,Long> {

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `Contacts` WHERE email=?1",nativeQuery = true)
    public void deleteUser(String email);

    @Modifying
    @Transactional
    @Query(value ="UPDATE `Contacts` SET `name`='kahani' WHERE phono=?1",nativeQuery = true )
    public void updateUser(String phono);




}
