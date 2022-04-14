package com.miausoft.miaups.persistence;

import com.miausoft.miaups.models.Parcel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ParcelsRepository extends JpaRepository<Parcel, UUID> {

}
