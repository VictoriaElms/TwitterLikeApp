package com.cst8277.Elms.Victoria;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SubscriptionRepository extends CrudRepository<Subscription,Integer> {

}