package be.claimed.api.members;

import be.claimed.api.addresses.AddressDto;
import be.claimed.api.members.emails.EmailDto;
import be.claimed.api.members.licensePlates.LicensePlateDto;
import be.claimed.api.members.phoneNumbers.PhoneNumberDto;

import java.time.LocalDate;
import java.util.List;

public class MemberDto {

    public String id;
    public String firstName;
    public String lastName;
    public AddressDto addressDto;
    public EmailDto emailDto;
    public List<PhoneNumberDto> phoneNumbers;
    public List<LicensePlateDto> licensePlates;
    public String registrationDate;
    public String membershipLevel;

    public MemberDto() {
    }

}
