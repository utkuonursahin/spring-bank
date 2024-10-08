package me.utku.springbank.transaction;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TransactionRepository extends JpaRepository<Transaction, UUID> {
    Page<Transaction> findAllBySender_IdOrReceiver_Id(UUID senderAccountId, UUID receiverAccountId, Pageable pageable);

    Page<Transaction> findAllBySender_Owner_IdOrReceiver_Owner_Id(UUID ownerId, UUID receiverId, Pageable pageable);

    Page<Transaction> findAllBySender_Owner_Id(UUID id, Pageable pageable);

    Page<Transaction> findAllByReceiverOwner_Id(UUID id, Pageable pageable);
}
