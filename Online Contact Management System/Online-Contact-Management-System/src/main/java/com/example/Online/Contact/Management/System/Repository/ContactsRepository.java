package com.example.Online.Contact.Management.System.Repository;

import com.example.Online.Contact.Management.System.Models.Contacts;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ContactsRepository extends JpaRepository<Contacts,Long> {

    @Query(value = "SELECT * FROM `Contacts` WHERE user_id= ?1",nativeQuery = true)
    List<Contacts> searchUser(String user_id);


    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `Contacts` WHERE user_id=?1",nativeQuery = true)
    public void deleteUser(String user_id);

    @Modifying
    @Transactional
    @Query(value ="UPDATE `Contacts` SET `name`='kahani' WHERE user_id=?1",nativeQuery = true )
    public void updateUser(String phono);




}
