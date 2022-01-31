package io.github.theseeker225.storagerapp.repository;

import io.github.theseeker225.storagerapp.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ItemRepository extends JpaRepository<Item, Integer> {


}
