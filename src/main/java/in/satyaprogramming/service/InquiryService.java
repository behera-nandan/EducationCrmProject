package in.satyaprogramming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.satyaprogramming.entity.Inquiry;
import in.satyaprogramming.repository.InquiryRepository;
@Service
public class InquiryService
{
	@Autowired
	private InquiryRepository inquiryRepository;
	
	public void addNewInquiry(Inquiry inquiry)
	{
		inquiryRepository.save(inquiry);
	}
	public List<Inquiry> findInquiriesUsingPhno(String phoneno)
	{
		return inquiryRepository.findByPhoneno(phoneno);
	}
}

