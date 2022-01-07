package com.hogwarts.institute.Repository;

import com.hogwarts.institute.Model.NewsletterSubscriber;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SubscriberRepository extends JpaRepository<NewsletterSubscriber, Long> {
}
