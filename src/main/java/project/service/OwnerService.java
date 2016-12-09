package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import project.model.Owner;
import project.model.OwnerRepository;

/**
 * Created by Наиль on 07.12.2016.
 */
@Controller
public class OwnerService {
    private OwnerRepository ownerRepository;
    @Autowired
    public OwnerService(OwnerRepository ownerRepository){
        this.ownerRepository = ownerRepository;
    }

    public Owner createOwner(String firstName, String lastName, String address, String number){
        Owner owner = new Owner(firstName, lastName, address, number);
        ownerRepository.save(owner);
        return owner;
    }

    public Owner findOwnerById(Long id){
        Owner owner = ownerRepository.findOne(id);
        return owner;
    }

    public Owner updateOwner(Long id, String firstName, String lastName, String address, String phoneNumber){
        Owner owner = findOwnerById(id);
        owner.setFirstName(firstName);
        owner.setLastName(lastName);
        owner.setAddress(address);
        owner.setPhoneNumber(phoneNumber);
        ownerRepository.save(owner);
        return owner;
    }

    public void removeOwner(Long id){
        Owner owner = ownerRepository.findOne(id);
        ownerRepository.delete(owner);
    }


}
