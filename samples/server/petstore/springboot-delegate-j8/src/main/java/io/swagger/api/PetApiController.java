package io.swagger.api;

import io.swagger.model.ModelApiResponse;
import io.swagger.model.Pet;
import org.springframework.core.io.Resource;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Controller
public class PetApiController implements PetApi {
    private final ObjectMapper objectMapper;

    public PetApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    private final PetApiDelegate delegate;

    @org.springframework.beans.factory.annotation.Autowired
    public PetApiController(PetApiDelegate delegate) {
        this.delegate = delegate;
    }

    public ResponseEntity<Void> addPet(@ApiParam(value = "Pet object that needs to be added to the store" ,required=true )  @Valid @RequestBody Pet body,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return delegate.addPet(body);
    }

    public ResponseEntity<Void> deletePet(@ApiParam(value = "Pet id to delete",required=true ) @PathVariable("petId") Long petId,
        @ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return delegate.deletePet(petId, apiKey);
    }

    public ResponseEntity<List<Pet>> findPetsByStatus( @NotNull@ApiParam(value = "Status values that need to be considered for filter", required = true, allowableValues = "available, pending, sold") @Valid @RequestParam(value = "status", required = true) List<String> status,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return delegate.findPetsByStatus(status);
    }

    public ResponseEntity<List<Pet>> findPetsByTags( @NotNull@ApiParam(value = "Tags to filter by", required = true) @Valid @RequestParam(value = "tags", required = true) List<String> tags,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return delegate.findPetsByTags(tags);
    }

    public ResponseEntity<Pet> getPetById(@ApiParam(value = "ID of pet to return",required=true ) @PathVariable("petId") Long petId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return delegate.getPetById(petId);
    }

    public ResponseEntity<Void> updatePet(@ApiParam(value = "Pet object that needs to be added to the store" ,required=true )  @Valid @RequestBody Pet body,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return delegate.updatePet(body);
    }

    public ResponseEntity<Void> updatePetWithForm(@ApiParam(value = "ID of pet that needs to be updated",required=true ) @PathVariable("petId") Long petId,
        @ApiParam(value = "Updated name of the pet") @RequestPart(value="name", required=false)  String name,
        @ApiParam(value = "Updated status of the pet") @RequestPart(value="status", required=false)  String status,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return delegate.updatePetWithForm(petId, name, status);
    }

    public ResponseEntity<ModelApiResponse> uploadFile(@ApiParam(value = "ID of pet to update",required=true ) @PathVariable("petId") Long petId,
        @ApiParam(value = "Additional data to pass to server") @RequestPart(value="additionalMetadata", required=false)  String additionalMetadata,
        @ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile file,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return delegate.uploadFile(petId, additionalMetadata, file);
    }

}
