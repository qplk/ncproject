package project.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Наиль on 10.11.2016.
 */
@RepositoryRestResource(collectionResourceRel = "owners", path = "owners")
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByPhoneNumber(String phoneNumber);
    Owner findByAddress(String address);
}
