package com.hogwarts.institute.Service;

import com.hogwarts.institute.Model.ContactUs;
import com.hogwarts.institute.Model.NewsletterSubscriber;
import com.hogwarts.institute.Repository.EnquiryRepository;
import com.hogwarts.institute.Repository.SubscriberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContactUsService {

    private final SubscriberRepository subscriberRepository;
    private final EnquiryRepository enquiryRepository;

    public void addSubscriber(NewsletterSubscriber subscriber){
        subscriberRepository.save(subscriber);
    }

    public void addEnquiry(ContactUs contactUs){
        enquiryRepository.save(contactUs);
    }

}
