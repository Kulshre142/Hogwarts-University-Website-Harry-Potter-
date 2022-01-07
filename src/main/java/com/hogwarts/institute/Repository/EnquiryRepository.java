package com.hogwarts.institute.Repository;

import com.hogwarts.institute.Model.ContactUs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnquiryRepository extends JpaRepository<ContactUs, Long> {
}
